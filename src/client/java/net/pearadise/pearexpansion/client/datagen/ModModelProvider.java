package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.AxisRotation;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.VerticalSlabBlock;
import net.pearadise.pearexpansion.block.enums.VerticalSlabType;
import net.pearadise.pearexpansion.item.ModItems;
import net.pearadise.pearexpansion.util.ModContentLists;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Provides Fabric data generation for block and item models for Pear Expansion.
 * Adapted to the 1.21.x data-gen API (VariantsBlockModelDefinitionCreator.of(block, model) + BlockStateVariantMap.operations(...)).
 */
public class ModModelProvider extends FabricModelProvider {

    private static final Map<Block, TextureMap> MANUAL_TEXTURE_OVERRIDES = new LinkedHashMap<>();

    static {
        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_QUARTZ_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/red_sandstone_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/red_sandstone_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/red_sandstone_top"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/sandstone_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/sandstone_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/sandstone_top"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/cut_copper_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/cut_copper_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/cut_copper"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/exposed_cut_copper_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/exposed_cut_copper_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/exposed_cut_copper"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/weathered_cut_copper_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/weathered_cut_copper_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/weathered_cut_copper"))
        );

        MANUAL_TEXTURE_OVERRIDES.put(
                ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB,
                new TextureMap()
                        .put(TextureKey.TOP, Identifier.of("minecraft", "block/oxidized_cut_copper_top"))
                        .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/oxidized_cut_copper_top"))
                        .put(TextureKey.SIDE, Identifier.of("minecraft", "block/oxidized_cut_copper"))
        );
    }

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        PearExpansion.LOGGER.info("Generating blockstate models for vertical slabs...");

        for (Block modSlab : ModContentLists.ALL_VERTICAL_SLABS) {
            Block source = ModContentLists.VERTICAL_TO_BASE_BLOCK.get(modSlab);

            if (modSlab == null || source == null) {
                PearExpansion.LOGGER.warn("Skipping vertical slab with null block or source: {} -> {}", modSlab, source);
                continue;
            }

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

        public static TextureMap blockAndTopForEnds(Block block) {
            return new TextureMap()
                    .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.SIDE, ModelIds.getBlockModelId(block));
        }

        /**
         * Create blockstate variants for the vertical slab using the TYPE enum (VerticalSlabType).
         * NORTH/EAST/SOUTH/WEST -> use the vertical slab model with rotation
         * DOUBLE -> use the full block model
         */
        private static BlockModelDefinitionCreator createVerticalSlabBlockStates(Block vertSlabBlock, Identifier vertSlabId, Identifier fullBlockId) {
            WeightedVariant vertSlabModel = BlockStateModelGenerator.createWeightedVariant(vertSlabId);
            WeightedVariant fullBlockModel = BlockStateModelGenerator.createWeightedVariant(fullBlockId);

            // Build ModelVariantOperator for each orientation/value using ModelVariantOperator.Settings.withValue(...)
            ModelVariantOperator northOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                    .then(ModelVariantOperator.UV_LOCK.withValue(true));

            ModelVariantOperator eastOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                    .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90))
                    .then(ModelVariantOperator.UV_LOCK.withValue(true));

            ModelVariantOperator southOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                    .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180))
                    .then(ModelVariantOperator.UV_LOCK.withValue(true));

            ModelVariantOperator westOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                    .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270))
                    .then(ModelVariantOperator.UV_LOCK.withValue(true));

            ModelVariantOperator doubleOp = ModelVariantOperator.MODEL.withValue(fullBlockId)
                    .then(ModelVariantOperator.UV_LOCK.withValue(true)); // full block: uvlock true is fine (keeps textures consistent)

            // Use operations(...) because coordinate(...) expects a BlockStateVariantMap<ModelVariantOperator>
            return VariantsBlockModelDefinitionCreator.of(vertSlabBlock, fullBlockModel)
                    .coordinate(
                            BlockStateVariantMap.operations(VerticalSlabBlock.TYPE)
                                    .register(VerticalSlabType.NORTH, northOp)
                                    .register(VerticalSlabType.EAST, eastOp)
                                    .register(VerticalSlabType.SOUTH, southOp)
                                    .register(VerticalSlabType.WEST, westOp)
                                    .register(VerticalSlabType.DOUBLE, doubleOp)
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
