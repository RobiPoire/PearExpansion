package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.block.Block
import net.minecraft.client.data.*
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.client.datagen.modelgnerator.VerticalSlabModelGenerator
import net.pearadise.pearexpansion.item.ModItems
import net.pearadise.pearexpansion.util.ModContentLists

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
        private val MANUAL_TEXTURE_OVERRIDES: Map<Block, TextureMap> = buildMap {
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
        LOGGER.info("Generating blockstate models for vertical slabs...")

        ModContentLists.ALL_VERTICAL_SLABS.forEach { modSlab ->
            val source = ModContentLists.VERTICAL_TO_BASE_BLOCK[modSlab]
            if (source == null) {
                LOGGER.warn("Skipping vertical slab with null block or source: {} -> {}", modSlab, source)
                return@forEach
            }

            val textures =
                MANUAL_TEXTURE_OVERRIDES[modSlab] ?: VerticalSlabModelGenerator.blockAndTopForEnds(source)

            VerticalSlabModelGenerator.registerVerticalSlab(
                blockStateModelGenerator,
                modSlab,
                source,
                textures
            )
        }

        LOGGER.info("Blockstate model generation complete.")
    }

    /**
     * Generates item models for custom items.
     *
     * @param itemModelGenerator The generator for item models.
     */
    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        LOGGER.info("Generating blockstate models for items...")
        ModContentLists.ALL_ITEMS.forEach {
            if (it == ModItems.ENCHANTED_GOLDEN_PEAR) {
                itemModelGenerator.registerWithTextureSource(
                    ModItems.ENCHANTED_GOLDEN_PEAR,
                    ModItems.GOLDEN_PEAR,
                    Models.GENERATED
                )
                return@forEach
            }
            itemModelGenerator.register(it, Models.GENERATED)
        }
    }

    /**
     * Returns the name of this model provider for logging and display.
     *
     * @return The provider name.
     */
    override fun getName(): String = "Pear Expansion Model Provider"

}