package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.block.Block
import net.minecraft.client.data.*
import net.minecraft.client.render.model.json.ModelVariantOperator
import net.minecraft.client.render.model.json.WeightedVariant
import net.minecraft.util.Identifier
import net.minecraft.util.math.AxisRotation
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.PearExpansion
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.block.VerticalSlabBlock
import net.pearadise.pearexpansion.block.enums.VerticalSlabType
import net.pearadise.pearexpansion.item.ModItems
import net.pearadise.pearexpansion.util.ModContentLists
import java.util.*

/**
 * Provides and generates block and item models for the mod.
 *
 * Handles model generation for vertical slabs and custom items.
 *
 * @constructor Creates a new model provider.
 * @param output The data output for generated files.
 */
class ModModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {

    companion object {
        /**
         * Manual texture overrides for specific blocks.
         *
         * Used when default texture mapping is not correct.
         */
        private val MANUAL_TEXTURE_OVERRIDES: MutableMap<Block, TextureMap> = linkedMapOf<Block, TextureMap>().apply {
            put(
                ModBlocks.QUARTZ_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
            )
            put(
                ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/quartz_block_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/quartz_block_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/quartz_block_side"))
            )
            put(
                ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/red_sandstone_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/red_sandstone_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/red_sandstone_top"))
            )
            put(
                ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/sandstone_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/sandstone_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/sandstone_top"))
            )
            put(
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/cut_copper_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/cut_copper_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/cut_copper"))
            )
            put(
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/exposed_cut_copper_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/exposed_cut_copper_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/exposed_cut_copper"))
            )
            put(
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/weathered_cut_copper_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/weathered_cut_copper_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/weathered_cut_copper"))
            )
            put(
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
                TextureMap()
                    .put(TextureKey.TOP, Identifier.of("minecraft", "block/oxidized_cut_copper_top"))
                    .put(TextureKey.BOTTOM, Identifier.of("minecraft", "block/oxidized_cut_copper_top"))
                    .put(TextureKey.SIDE, Identifier.of("minecraft", "block/oxidized_cut_copper"))
            )
        }
    }

    /**
     * Generates blockstate models for all vertical slab blocks.
     *
     * @param blockStateModelGenerator The generator for blockstate models.
     */
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
        PearExpansion.LOGGER.info("Generating blockstate models for vertical slabs...")

        for (modSlab in ModContentLists.ALL_VERTICAL_SLABS) {
            val source = ModContentLists.VERTICAL_TO_BASE_BLOCK[modSlab]

            if (source == null) {
                PearExpansion.LOGGER.warn("Skipping vertical slab with null block or source: {} -> {}", modSlab, source)
                continue
            }

            val textures = MANUAL_TEXTURE_OVERRIDES.getOrDefault(
                modSlab,
                CustomBlockStateModelGenerator.blockAndTopForEnds(source)
            )

            CustomBlockStateModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                modSlab,
                source,
                textures
            )
        }

        PearExpansion.LOGGER.info("Blockstate model generation complete.")
    }

    /**
     * Generates item models for custom items.
     *
     * @param itemModelGenerator The generator for item models.
     */
    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED)
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED)
        itemModelGenerator.registerWithTextureSource(
            ModItems.ENCHANTED_GOLDEN_PEAR,
            ModItems.GOLDEN_PEAR,
            Models.GENERATED
        )
    }

    /**
     * Returns the name of this model provider for logging and display.
     *
     * @return The provider name.
     */
    override fun getName(): String = "Pear Expansion Model Provider"

    /**
     * Helper object for generating custom blockstate models for vertical slabs.
     */
    object CustomBlockStateModelGenerator {

        /** Model template for vertical slabs. */
        val VERTICAL_SLAB: Model = block("vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE)

        /**
         * Creates a model with the given parent and required textures.
         *
         * @param parent The parent model name.
         * @param requiredTextureKeys The required texture keys.
         * @return The [Model] instance.
         */
        private fun block(parent: String, vararg requiredTextureKeys: TextureKey): Model {
            return Model(
                Optional.of(Identifier.of(MOD_ID, "block/$parent")),
                Optional.empty(),
                *requiredTextureKeys
            )
        }

        /**
         * Creates a model with a parent, variant, and required textures.
         *
         * @param parent The parent model name.
         * @param variant The variant name.
         * @param requiredTextureKeys The required texture keys.
         * @return The [Model] instance.
         */
        @Suppress("unused")
        private fun block(parent: String, variant: String, vararg requiredTextureKeys: TextureKey): Model {
            return Model(
                Optional.of(Identifier.of(MOD_ID, "block/$parent")),
                Optional.of(variant),
                *requiredTextureKeys
            )
        }

        /**
         * Creates a texture map for blocks with top and side textures.
         *
         * @param block The base block.
         * @return The [TextureMap] for the block.
         */
        fun blockAndTopForEnds(block: Block): TextureMap {
            return TextureMap()
                .put(TextureKey.TOP, ModelIds.getBlockSubModelId(block, "_top"))
                .put(TextureKey.BOTTOM, ModelIds.getBlockSubModelId(block, "_top"))
                .put(TextureKey.SIDE, ModelIds.getBlockModelId(block))
        }

        /**
         * Creates blockstate variants for a vertical slab using the TYPE property.
         *
         * NORTH/EAST/SOUTH/WEST use the vertical slab model with rotation.
         * DOUBLE uses the full block model.
         *
         * @param vertSlabBlock The vertical slab block.
         * @param vertSlabId The model ID for the slab.
         * @param fullBlockId The model ID for the full block.
         * @return The [BlockModelDefinitionCreator] for the blockstate.
         */
        private fun createVerticalSlabBlockStates(
            vertSlabBlock: Block,
            vertSlabId: Identifier,
            fullBlockId: Identifier
        ): BlockModelDefinitionCreator {
            val fullBlockModel: WeightedVariant = BlockStateModelGenerator.createWeightedVariant(fullBlockId)

            val northOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                .then(ModelVariantOperator.UV_LOCK.withValue(true))

            val eastOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90))
                .then(ModelVariantOperator.UV_LOCK.withValue(true))

            val southOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180))
                .then(ModelVariantOperator.UV_LOCK.withValue(true))

            val westOp = ModelVariantOperator.MODEL.withValue(vertSlabId)
                .then(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270))
                .then(ModelVariantOperator.UV_LOCK.withValue(true))

            val doubleOp = ModelVariantOperator.MODEL.withValue(fullBlockId)
                .then(ModelVariantOperator.UV_LOCK.withValue(true))

            return VariantsBlockModelDefinitionCreator.of(vertSlabBlock, fullBlockModel)
                .coordinate(
                    BlockStateVariantMap.operations(VerticalSlabBlock.TYPE)
                        .register(VerticalSlabType.NORTH, northOp)
                        .register(VerticalSlabType.EAST, eastOp)
                        .register(VerticalSlabType.SOUTH, southOp)
                        .register(VerticalSlabType.WEST, westOp)
                        .register(VerticalSlabType.DOUBLE, doubleOp)
                )
        }

        /**
         * Registers blockstate and item models for a vertical slab block.
         *
         * @param generator The blockstate model generator.
         * @param vertSlabBlock The vertical slab block.
         * @param fullBlock The full block for the double slab.
         * @param textures The texture map for the slab.
         */
        fun registerVerticalSlab(
            generator: BlockStateModelGenerator,
            vertSlabBlock: Block,
            fullBlock: Block,
            textures: TextureMap
        ) {
            val slabModel: Identifier = VERTICAL_SLAB.upload(vertSlabBlock, textures, generator.modelCollector)
            val fullBlockModel: Identifier = ModelIds.getBlockModelId(fullBlock)
            generator.blockStateCollector.accept(
                createVerticalSlabBlockStates(
                    vertSlabBlock,
                    slabModel,
                    fullBlockModel
                )
            )
            generator.registerParentedItemModel(vertSlabBlock, slabModel)
        }
    }
}