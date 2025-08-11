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
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlock;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Provides Fabric data generation for block and item models for Pear Expansion.
 *
 * <p>
 * This class maps each mod vertical slab to a vanilla source block, then generates
 * model files and blockstate variants for each slab using Fabric's data generation helpers.
 * Use this provider with Fabric datagen to automate model and blockstate creation.
 * </p>
 *
 * @author RobiPoire
 * @see net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
 * @see net.pearadise.pearexpansion.block.ModBlocks
 */
public class ModModelProvider extends FabricModelProvider {

    /**
     * Maps each mod vertical slab block to its vanilla source block for texture reuse.
     *
     * <p>
     * Key: the mod's vertical slab block.
     * Value: the vanilla block to use for textures.
     * </p>
     */
    private static final Map<Block, Block> VERTICAL_SLAB_SOURCES = new LinkedHashMap<>();

    static {
        // Populate the mapping of mod vertical slabs to vanilla source blocks for texture reference.
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_ACACIA_SLAB.getBlock(), Blocks.ACACIA_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_ANDESITE_SLAB.getBlock(), Blocks.ANDESITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_BAMBOO_MOSAIC_SLAB.getBlock(), Blocks.BAMBOO_MOSAIC);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_BAMBOO_SLAB.getBlock(), Blocks.BAMBOO_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_BIRCH_SLAB.getBlock(), Blocks.BIRCH_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_BLACKSTONE_SLAB.getBlock(), Blocks.BLACKSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_BRICK_SLAB.getBlock(), Blocks.BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_CHERRY_SLAB.getBlock(), Blocks.CHERRY_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_COBBLED_DEEPSLATE_SLAB.getBlock(), Blocks.COBBLED_DEEPSLATE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_COBBLESTONE_SLAB.getBlock(), Blocks.COBBLESTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_CRIMSON_SLAB.getBlock(), Blocks.CRIMSON_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_CUT_COPPER_SLAB.getBlock(), Blocks.CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_CUT_RED_SANDSTONE_SLAB.getBlock(), Blocks.CUT_RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_CUT_SANDSTONE_SLAB.getBlock(), Blocks.CUT_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_DARK_OAK_SLAB.getBlock(), Blocks.DARK_OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_DARK_PRISMARINE_SLAB.getBlock(), Blocks.DARK_PRISMARINE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_BRICK_SLAB.getBlock(), Blocks.DEEPSLATE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_DEEPSLATE_TILE_SLAB.getBlock(), Blocks.DEEPSLATE_TILES);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_DIORITE_SLAB.getBlock(), Blocks.DIORITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_END_STONE_BRICK_SLAB.getBlock(), Blocks.END_STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_EXPOSED_CUT_COPPER_SLAB.getBlock(), Blocks.EXPOSED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_GRANITE_SLAB.getBlock(), Blocks.GRANITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_JUNGLE_SLAB.getBlock(), Blocks.JUNGLE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_MANGROVE_SLAB.getBlock(), Blocks.MANGROVE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_MOSSY_COBBLESTONE_SLAB.getBlock(), Blocks.MOSSY_COBBLESTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_MOSSY_STONE_BRICK_SLAB.getBlock(), Blocks.MOSSY_STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_MUD_BRICK_SLAB.getBlock(), Blocks.MUD_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_NETHER_BRICK_SLAB.getBlock(), Blocks.NETHER_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_OAK_SLAB.getBlock(), Blocks.OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.getBlock(), Blocks.OXIDIZED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_PALE_OAK_SLAB.getBlock(), Blocks.PALE_OAK_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_ANDESITE_SLAB.getBlock(), Blocks.POLISHED_ANDESITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.getBlock(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_BLACKSTONE_SLAB.getBlock(), Blocks.POLISHED_BLACKSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_DIORITE_SLAB.getBlock(), Blocks.POLISHED_DIORITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_GRANITE_SLAB.getBlock(), Blocks.POLISHED_GRANITE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_DEEPSLATE_SLAB.getBlock(), Blocks.POLISHED_DEEPSLATE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_POLISHED_TUFF_SLAB.getBlock(), Blocks.POLISHED_TUFF);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_BRICK_SLAB.getBlock(), Blocks.PRISMARINE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_PRISMARINE_SLAB.getBlock(), Blocks.PRISMARINE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_PURPUR_SLAB.getBlock(), Blocks.PURPUR_BLOCK);
        // TODO: Texture for vertical quartz slab not working actually
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_QUARTZ_SLAB.getBlock(), Blocks.QUARTZ_BLOCK);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_RED_NETHER_BRICK_SLAB.getBlock(), Blocks.RED_NETHER_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_RED_SANDSTONE_SLAB.getBlock(), Blocks.RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_RESIN_BRICK_SLAB.getBlock(), Blocks.RESIN_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SANDSTONE_SLAB.getBlock(), Blocks.SANDSTONE);
        // TODO: Texture for vertical smooth_quartz/smooth_red_sandstone/smooth_sandstone  slabs not working actually
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SMOOTH_QUARTZ_SLAB.getBlock(), Blocks.SMOOTH_QUARTZ);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.getBlock(), Blocks.SMOOTH_RED_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SMOOTH_SANDSTONE_SLAB.getBlock(), Blocks.SMOOTH_SANDSTONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SMOOTH_STONE_SLAB.getBlock(), Blocks.SMOOTH_STONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_SPRUCE_SLAB.getBlock(), Blocks.SPRUCE_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_STONE_BRICK_SLAB.getBlock(), Blocks.STONE_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_STONE_SLAB.getBlock(), Blocks.STONE);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_TUFF_BRICK_SLAB.getBlock(), Blocks.TUFF_BRICKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_TUFF_SLAB.getBlock(), Blocks.TUFF);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WARPED_SLAB.getBlock(), Blocks.WARPED_PLANKS);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WAXED_CUT_COPPER_SLAB.getBlock(), Blocks.CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.getBlock(), Blocks.EXPOSED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.getBlock(), Blocks.OXIDIZED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.getBlock(), Blocks.WEATHERED_CUT_COPPER);
        VERTICAL_SLAB_SOURCES.put(VerticalSlabBlockEnum.VERTICAL_WEATHERED_CUT_COPPER_SLAB.getBlock(), Blocks.WEATHERED_CUT_COPPER);
    }

    /**
     * Constructs a new model provider for Pear Expansion.
     *
     * <p>
     * Called by Fabric's datagen system to initialize the provider.
     * </p>
     *
     * @param output the Fabric data output helper for writing generated files
     */
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * Generates block models and blockstate variants for all mapped vertical slabs.
     *
     * <p>
     * Iterates over all vertical slab mappings and registers models and blockstates
     * using Fabric's {@link BlockStateModelGenerator}. Logs progress to the mod logger.
     * </p>
     *
     * @param blockStateModelGenerator the Fabric helper for collecting models and blockstates
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Objects.requireNonNull(blockStateModelGenerator, "blockStateModelGenerator must not be null");

        PearExpansion.LOGGER.info("Generating blockstate models for {} vertical slabs...", VERTICAL_SLAB_SOURCES.size());

        for (Map.Entry<Block, Block> e : VERTICAL_SLAB_SOURCES.entrySet()) {
            Block modSlab = e.getKey();
            Block source = e.getValue();

            // Skip mappings with null values to avoid errors
            if (modSlab == null || source == null) {
                PearExpansion.LOGGER.warn("Skipping null mapping for vertical slab: {} -> {}", modSlab, source);
                continue;
            }

            // Register model, blockstate, and item model for this vertical slab
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
     * Generates item models for custom items.
     *
     * <p>
     * Registers item models for the Pear Expansion items. For vertical slabs,
     * item models are parented to the block models in the slab helper.
     * </p>
     *
     * @param itemModelGenerator the Fabric helper for item model generation
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Register simple generated item models for custom items
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(ModItems.ENCHANTED_GOLDEN_PEAR, ModItems.GOLDEN_PEAR, Models.GENERATED);
    }

    /**
     * Returns a short name for this provider for logging purposes.
     *
     * @return the provider name
     */
    @Override
    public String getName() {
        return "Pear Expansion Model Provider";
    }

    /**
     * Helper class for registering models and blockstates for vertical slabs.
     *
     * <p>
     * Contains static methods to build model definitions, texture maps, and blockstate
     * variants for all vertical slab blocks in the mod.
     * </p>
     *
     * @author RobiPoire
     * @see net.pearadise.pearexpansion.block.custom.VerticalSlabBlock
     */
    public static class CustomBlockStateModelGenerator {

        /**
         * Base model definition for vertical slabs.
         *
         * <p>
         * Requires three textures: bottom, top, and side.
         * </p>
         */
        public static final Model VERTICAL_SLAB = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

        /**
         * Builds a Model instance referencing a mod block model.
         *
         * @param parent              the parent model file name (without path)
         * @param requiredTextureKeys the texture keys required by the model
         * @return a Model object for uploading
         */
        private static Model block(String parent, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
        }

        /**
         * Builds a Model instance referencing a mod block model with a variant.
         *
         * @param parent              the parent model file name (without path)
         * @param variant             the variant string (not currently used)
         * @param requiredTextureKeys the texture keys required by the model
         * @return a Model object for uploading
         */
        @SuppressWarnings("unused")
        private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
        }

        /**
         * Builds a TextureMap for slabs using the block's "_top" texture for both top and bottom,
         * and the regular block model for the side.
         *
         * @param block the vanilla source block to derive texture IDs from
         * @return a TextureMap containing TOP, BOTTOM, and SIDE keys
         */
        public static TextureMap blockAndTopForEnds(Block block) {
            // Use the "_top" texture for both ends and the side texture for the slab's side
            return new TextureMap()
                    .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.SIDE, ModelIds.getBlockModelId(block));
        }

        /**
         * Creates blockstate variants for a vertical slab block.
         *
         * <p>
         * Each facing (N/E/S/W) has a model for the single slab state. The double state
         * uses the full-block model. Rotations are applied for correct orientation.
         * </p>
         *
         * @param vertSlabBlock the mod's vertical slab block
         * @param vertSlabId    the model ID for the vertical slab model
         * @param fullBlockId   the model ID for the full (double) block
         * @return a BlockModelDefinitionCreator for the blockstate generator
         */
        private static BlockModelDefinitionCreator createVerticalSlabBlockStates(Block vertSlabBlock, Identifier vertSlabId, Identifier fullBlockId) {
            WeightedVariant vertSlabModel = BlockStateModelGenerator.createWeightedVariant(vertSlabId);
            WeightedVariant fullBlockModel = BlockStateModelGenerator.createWeightedVariant(fullBlockId);
            // Register blockstate variants for each facing and single/double state
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
         * Registers the vertical slab model, full-block model, blockstate variants, and item model.
         *
         * <p>
         * Uploads the slab and full-block models, creates blockstate variants for all states,
         * and registers a parented item model so the item uses the same textures as the block.
         * </p>
         *
         * @param generator     the Fabric blockstate/model generator
         * @param vertSlabBlock the mod's vertical slab block
         * @param fullBlock     the vanilla or full block used for the double state model
         * @param textures      the textures to use for the slab model
         */
        public static void registerVerticalSlab(BlockStateModelGenerator generator, Block vertSlabBlock, Block fullBlock, TextureMap textures) {
            // Upload the vertical slab model and get its identifier
            Identifier slabModel = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector);
            // Get the model identifier for the full block (double slab)
            Identifier fullBlockModel = ModelIds.getBlockModelId(fullBlock);
            // Register blockstate variants for all facing and single/double states
            generator.blockStateCollector.accept(createVerticalSlabBlockStates(vertSlabBlock, slabModel, fullBlockModel));
            // Register a parented item model for the vertical slab
            generator.registerParentedItemModel(vertSlabBlock, slabModel);
        }
    }
}