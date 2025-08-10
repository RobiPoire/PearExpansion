package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlock;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 *
 * <p>This class maps each mod vertical slab to a vanilla source block. It then
 * generates model files and blockstate variants for each slab using Fabric's
 * data generation helpers.</p>
 *
 * <p>Use this provider with Fabric datagen (for example: {@code gradlew genData}).
 * The provider only creates block models and blockstates; you still need other
 * providers (loot tables, tags, recipes) for a complete dataset.</p>
 *
 * <p>Author: RobiPoire
 * Version: 0.2</p>
 */
public class PearExpansionModelProvider extends FabricModelProvider {

    /**
     * Map of mod vertical slab -> vanilla source block used for textures.
     *
     * <p>Key: the block added by the mod (vertical slab).
     * Value: the vanilla block to reuse textures from.</p>
     *
     * <p>We use LinkedHashMap to keep a stable order when generating files.</p>
     */
    private static final Map<Block, Block> VERTICAL_SLAB_SOURCES = new LinkedHashMap<>();

    static {
        // Add mappings here. Keep order stable for consistent generated outputs.
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_BAMBOO_SLAB, Blocks.BAMBOO_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_BRICK_SLAB, Blocks.BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_CHERRY_SLAB, Blocks.CHERRY_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_COBBLESTONE_SLAB, Blocks.COBBLESTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_DIORITE_SLAB, Blocks.DIORITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_GRANITE_SLAB, Blocks.GRANITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_MUD_BRICK_SLAB, Blocks.MUD_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_PALE_OAK_SLAB, Blocks.PALE_OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, Blocks.POLISHED_TUFF);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_PURPUR_SLAB, Blocks.PURPUR_BLOCK);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, Blocks.RESIN_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_STONE_SLAB, Blocks.STONE);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, Blocks.TUFF_BRICKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_TUFF_SLAB, Blocks.TUFF);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, Blocks.CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
    }

    /**
     * Create a new provider.
     *
     * @param output Fabric's data output helper for writing generated files.
     */
    public PearExpansionModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * Generate block models and blockstates for every mapped vertical slab.
     *
     * @param blockStateModelGenerator Fabric helper that collects models and blockstates.
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Objects.requireNonNull(blockStateModelGenerator, "blockStateModelGenerator must not be null");

        PearExpansion.LOGGER.info("Generating blockstate models for {} vertical slabs...", VERTICAL_SLAB_SOURCES.size());

        for (Map.Entry<Block, Block> e : VERTICAL_SLAB_SOURCES.entrySet()) {
            Block modSlab = e.getKey();
            Block source = e.getValue();

            // Skip invalid entries just in case
            if (modSlab == null || source == null) {
                PearExpansion.LOGGER.warn("Skipping null mapping for vertical slab: {} -> {}", modSlab, source);
                continue;
            }

            // Register model, blockstate and item model for this slab
            CustomBlockStateModelGenerator.registerVerticalSlab(
                    blockStateModelGenerator,
                    modSlab,
                    source,
                    CustomBlockStateModelGenerator.blockAndTopForEnds(source)
            );
        }

        PearExpansion.LOGGER.info("Blockstate model generation complete.");
    }

    /**
     * Generate item models. Left empty because parented item models are registered
     * in the slab helper. Use this for standalone items if needed.
     *
     * @param itemModelGenerator Fabric helper for item models.
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(ModItems.ENCHANTED_GOLDEN_PEAR, ModItems.GOLDEN_PEAR, Models.GENERATED);

    }

    /**
     * A short name for this provider used in logs.
     *
     * @return provider name
     */
    @Override
    public String getName() {
        return "Pear Expansion Model Provider";
    }

    /**
     * Helper class that contains model and blockstate helpers for vertical slabs.
     *
     * <p>It builds a base model definition, a texture helper and creates blockstate
     * variants for every facing + single/double state.</p>
     */
    public static class CustomBlockStateModelGenerator {

        /**
         * Base model definition used for vertical slabs.
         * The model requires three textures: bottom, top and side.
         */
        public static final Model VERTICAL_SLAB = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

        /**
         * Helper to build a Model instance pointing to mod's block models.
         *
         * @param parent              parent model file name (without path)
         * @param requiredTextureKeys texture keys that the model needs
         * @return a Model object used for uploading
         */
        private static Model block(String parent, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
        }

        /**
         * Internal overload that also accepts a variant string (not used currently).
         */
        @SuppressWarnings("unused")
        private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
        }

        /**
         * Build a TextureMap for slabs that use the block's "_top" texture for both top and bottom,
         * and the regular block model for the side.
         *
         * @param block vanilla source block used to derive texture ids
         * @return TextureMap containing TOP, BOTTOM and SIDE keys
         */
        public static TextureMap blockAndTopForEnds(Block block) {
            return new TextureMap()
                    .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.SIDE, ModelIds.getBlockModelId(block));
        }

        /**
         * Create blockstate variants for the vertical slab.
         *
         * <p>Each facing (N/E/S/W) has a model for single slab state. The double state
         * uses the full-block model.</p>
         *
         * @param vertSlabBlock mod slab block
         * @param vertSlabId    model id for the vertical slab model
         * @param fullBlockId   model id for the full (double) block
         * @return BlockModelDefinitionCreator that will be collected by the generator
         */
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

        /**
         * Register the vertical slab model, the full-block model and blockstate variants.
         * Also register a parented item model so the item uses the same textures as the block.
         *
         * @param generator     Fabric blockstate/model generator
         * @param vertSlabBlock the mod's vertical slab block
         * @param fullBlock     the vanilla/full block used for the double state model
         * @param textures      textures to use for the slab model
         */
        public static void registerVerticalSlab(BlockStateModelGenerator generator, Block vertSlabBlock, Block fullBlock, TextureMap textures) {
            Identifier slabModel = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector);
            Identifier fullBlockModel = ModelIds.getBlockModelId(fullBlock);
            generator.blockStateCollector.accept(createVerticalSlabBlockStates(vertSlabBlock, slabModel, fullBlockModel));
            generator.registerParentedItemModel(vertSlabBlock, slabModel);
        }
    }
}
