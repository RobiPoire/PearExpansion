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

import java.util.Optional;

/**
 * Provides model data for the Pear Expansion mod.
 * <p>
 * This class is responsible for generating block state and item models
 * for custom blocks and items in the mod. It extends {@link FabricModelProvider}
 * to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionModelProvider extends FabricModelProvider {

    /**
     * Constructs a new PearExpansionModelProvider.
     *
     * @param output The output destination for generated model data.
     */
    public PearExpansionModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * Generates block state models for the mod.
     * <p>
     * Registers all vertical slab blocks with their respective textures and models.
     * </p>
     *
     * @param blockStateModelGenerator The generator used to create block state models.
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_OAK_SLAB,
                Blocks.OAK_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.OAK_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_SPRUCE_SLAB,
                Blocks.SPRUCE_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.SPRUCE_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_BIRCH_SLAB,
                Blocks.BIRCH_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.BIRCH_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_JUNGLE_SLAB,
                Blocks.JUNGLE_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.JUNGLE_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_ACACIA_SLAB,
                Blocks.ACACIA_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.ACACIA_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_DARK_OAK_SLAB,
                Blocks.DARK_OAK_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.DARK_OAK_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_MANGROVE_SLAB,
                Blocks.MANGROVE_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.MANGROVE_PLANKS)
        );

        CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                ModBlocks.VERTICAL_CHERRY_SLAB,
                Blocks.CHERRY_PLANKS,
                CustomBlockStateModelGenerator.blockAndTopForEnds(Blocks.CHERRY_PLANKS)
        );
    }

    /**
     * Generates item models for the mod.
     * <p>
     * This method is currently empty as item models are not generated here.
     * </p>
     *
     * @param itemModelGenerator The generator used to create item models.
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    /**
     * Returns the name of this model provider.
     *
     * @return A string representing the name of the provider.
     */
    @Override
    public String getName() {
        return "Pear Expansion Model Provider";
    }

    /**
     * Utility class for generating custom block state models for the mod.
     * <p>
     * Contains methods and constants to help register vertical slab models
     * and define their texture mappings and block state variants.
     * </p>
     *
     * @author RobiPoire
     * @version 0.2
     */
    public static class CustomBlockStateModelGenerator {

        /**
         * Model definition for a vertical slab block.
         */
        public static final Model VERTICAL_SLAB = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

        /**
         * Creates a model for a block with the given parent and required texture keys.
         *
         * @param parent              The parent model name.
         * @param requiredTextureKeys The required texture keys.
         * @return The model definition.
         */
        private static Model block(String parent, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
        }

        /**
         * Creates a model for a block with the given parent, variant, and required texture keys.
         *
         * @param parent              The parent model name.
         * @param variant             The variant name.
         * @param requiredTextureKeys The required texture keys.
         * @return The model definition.
         */
        private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
            return new Model(Optional.of(Identifier.of(PearExpansion.MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
        }

        /**
         * Creates a texture map for a block, mapping top and bottom to the block's top texture,
         * and side to the block's side texture.
         *
         * @param block The block to generate the texture map for.
         * @return The texture map.
         */
        public static TextureMap blockAndTopForEnds(Block block) {
            return new TextureMap()
                    .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                    .put(TextureKey.SIDE, ModelIds.getBlockModelId(block));
        }

        /**
         * Creates a block model definition creator for vertical slab block states.
         * <p>
         * Registers the model variants for each facing direction and single/double state.
         * </p>
         *
         * @param vertSlabBlock The vertical slab block.
         * @param vertSlabId    The model identifier for the vertical slab.
         * @param fullBlockId   The model identifier for the full block.
         * @return The block model definition creator.
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
         * Registers a vertical slab block with the block state model generator.
         * <p>
         * Uploads the model, creates the block state variants, and registers the item model.
         * </p>
         *
         * @param generator     The block state model generator.
         * @param vertSlabBlock The vertical slab block.
         * @param fullBlock     The full block used for the double slab state.
         * @param textures      The texture map for the slab.
         */
        public static void registerVerticalSlab(BlockStateModelGenerator generator, Block vertSlabBlock, Block fullBlock, TextureMap textures) {
            Identifier slabModel = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector);
            Identifier fullBlockModel = ModelIds.getBlockModelId(fullBlock);
            generator.blockStateCollector.accept(createVerticalSlabBlockStates(vertSlabBlock, slabModel, fullBlockModel));
            generator.registerParentedItemModel(vertSlabBlock, slabModel);
        }

    }
}