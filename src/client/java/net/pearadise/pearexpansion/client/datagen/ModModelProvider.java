package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlock;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Provides Fabric data generation for block and item models for Pear Expansion.
 * <p>
 * This class iterates over VerticalSlabBlockEnum.values() and uses the
 * enum's textureSource to generate slab models. Includes manual texture
 * overrides for vanilla texture names that don't match the simple heuristics.
 */
public class ModModelProvider extends FabricModelProvider {

    /**
     * Manual texture overrides for problematic vanilla blocks whose texture names
     * don't match ModelIds.getBlockModelId/getBlockSubModelId heuristics.
     * <p>
     * Add more entries if you see "Missing textures" for other slabs.
     */
    private static final Map<Block, TextureMap> MANUAL_TEXTURE_OVERRIDES = new LinkedHashMap<>();

    static {
        // quartz: side/top explicit
        MANUAL_TEXTURE_OVERRIDES.put(
                VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(),
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
        );

        // smooth quartz -> use quartz top/side
        MANUAL_TEXTURE_OVERRIDES.put(
                VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(),
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
        );

        // smooth red sandstone uses red_sandstone_top for all faces
        MANUAL_TEXTURE_OVERRIDES.put(
                VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(),
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/red_sandstone_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/red_sandstone_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/red_sandstone_top"))
        );

        // smooth sandstone uses sandstone_top for all faces
        MANUAL_TEXTURE_OVERRIDES.put(
                VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(),
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/sandstone_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/sandstone_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/sandstone_top"))
        );
    }

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        PearExpansion.LOGGER.info("Generating blockstate models for vertical slabs...");

        for (VerticalSlabBlockEnum slabEnum : VerticalSlabBlockEnum.values()) {
            Block modSlab = slabEnum.getBlock();
            Block source = slabEnum.getTextureSourceBlock();

            if (modSlab == null || source == null) {
                PearExpansion.LOGGER.warn("Skipping vertical slab with null block or source: {} -> {}", slabEnum, source);
                continue;
            }

            // use manual override if present, otherwise use default heuristic
            TextureMap textures = MANUAL_TEXTURE_OVERRIDES.getOrDefault(
                    modSlab,
                    CustomBlockStateModelGenerator.blockAndTopForEnds(source)
            );

            CustomBlockStateModelGenerator.registerVerticalSlab(
                    blockStateModelGenerator,
                    modSlab,
                    source,
                    textures
            );
        }

        PearExpansion.LOGGER.info("Blockstate model generation complete.");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(ModItems.ENCHANTED_GOLDEN_PEAR, ModItems.GOLDEN_PEAR, Models.GENERATED);
    }

    @Override
    public String getName() {
        return "Pear Expansion Model Provider";
    }

    public static class CustomBlockStateModelGenerator {

        public static final Model VERTICAL_SLAB = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

        private static Model block(String parent, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
        }

        @SuppressWarnings("unused")
        private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
        }

        /**
         * Default heuristic: use the block's "_top" submodel for both ends, and the block model for the side.
         */
        public static TextureMap blockAndTopForEnds(Block block) {
            return new TextureMap()
                    .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.SIDE, ModelIds.getBlockModelId(block));
        }

        private static BlockModelDefinitionCreator createVerticalSlabBlockStates(Block vertSlabBlock, Identifier vertSlabId, Identifier fullBlockId) {
            WeightedVariant vertSlabModel = BlockStateModelGenerator.createWeightedVariant(vertSlabId);
            WeightedVariant fullBlockModel = BlockStateModelGenerator.createWeightedVariant(fullBlockId);

            return VariantsBlockModelDefinitionCreator.of(vertSlabBlock)
                    .with(BlockStateVariantMap.models(VerticalSlabBlock.FACING, VerticalSlabBlock.SINGLE)
                            .register(Direction.NORTH, true, vertSlabModel.apply(BlockStateModelGenerator.UV_LOCK))
                            .register(Direction.EAST, true, vertSlabModel.apply(BlockStateModelGenerator.UV_LOCK).apply(BlockStateModelGenerator.ROTATE_Y_90))
                            .register(Direction.SOUTH, true, vertSlabModel.apply(BlockStateModelGenerator.UV_LOCK).apply(BlockStateModelGenerator.ROTATE_Y_180))
                            .register(Direction.WEST, true, vertSlabModel.apply(BlockStateModelGenerator.UV_LOCK).apply(BlockStateModelGenerator.ROTATE_Y_270))
                            .register(Direction.NORTH, false, fullBlockModel.apply(BlockStateModelGenerator.UV_LOCK))
                            .register(Direction.EAST, false, fullBlockModel.apply(BlockStateModelGenerator.UV_LOCK))
                            .register(Direction.SOUTH, false, fullBlockModel.apply(BlockStateModelGenerator.UV_LOCK))
                            .register(Direction.WEST, false, fullBlockModel.apply(BlockStateModelGenerator.UV_LOCK))
                    );
        }

        public static void registerVerticalSlab(BlockStateModelGenerator generator, Block vertSlabBlock, Block fullBlock, TextureMap textures) {
            Identifier slabModel = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector);
            Identifier fullBlockModel = ModelIds.getBlockModelId(fullBlock);
            generator.blockStateCollector.accept(createVerticalSlabBlockStates(vertSlabBlock, slabModel, fullBlockModel));
            generator.registerParentedItemModel(vertSlabBlock, slabModel);
        }
    }
}
