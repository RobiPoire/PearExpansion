package net.pearadise.pearexpansion.block

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.Oxidizable
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.PearExpansion

/**
 * Registers and stores all custom vertical slab blocks for the mod.
 *
 * This object defines each vertical slab block and handles their registration,
 * including copper variants with weathering and waxing support.
 */
object ModBlocks {

    // ---------------------------
    // Wood-based vertical slabs
    // ---------------------------
    val OAK_VERTICAL_SLAB = registerVerticalslab("oak_vertical_slab", Blocks.OAK_SLAB)
    val SPRUCE_VERTICAL_SLAB = registerVerticalslab("spruce_vertical_slab", Blocks.SPRUCE_SLAB)
    val BIRCH_VERTICAL_SLAB = registerVerticalslab("birch_vertical_slab", Blocks.BIRCH_SLAB)
    val JUNGLE_VERTICAL_SLAB = registerVerticalslab("jungle_vertical_slab", Blocks.JUNGLE_SLAB)
    val ACACIA_VERTICAL_SLAB = registerVerticalslab("acacia_vertical_slab", Blocks.ACACIA_SLAB)
    val DARK_OAK_VERTICAL_SLAB = registerVerticalslab("dark_oak_vertical_slab", Blocks.DARK_OAK_SLAB)
    val MANGROVE_VERTICAL_SLAB = registerVerticalslab("mangrove_vertical_slab", Blocks.MANGROVE_SLAB)
    val CHERRY_VERTICAL_SLAB = registerVerticalslab("cherry_vertical_slab", Blocks.CHERRY_SLAB)
    val CRIMSON_VERTICAL_SLAB = registerVerticalslab("crimson_vertical_slab", Blocks.CRIMSON_SLAB)
    val WARPED_VERTICAL_SLAB = registerVerticalslab("warped_vertical_slab", Blocks.WARPED_SLAB)
    val BAMBOO_VERTICAL_SLAB = registerVerticalslab("bamboo_vertical_slab", Blocks.BAMBOO_SLAB)
    val BAMBOO_MOSAIC_VERTICAL_SLAB = registerVerticalslab("bamboo_mosaic_vertical_slab", Blocks.BAMBOO_MOSAIC_SLAB)
    val PALE_OAK_VERTICAL_SLAB = registerVerticalslab("pale_oak_vertical_slab", Blocks.PALE_OAK_SLAB)

    // ---------------------------
    // Copper / Waxed copper slabs (oxidizable)
    // ---------------------------
    val CUT_COPPER_VERTICAL_SLAB = registerOxidizableVerticalSlab(
        "cut_copper_vertical_slab",
        Oxidizable.OxidationLevel.UNAFFECTED,
        Blocks.CUT_COPPER_SLAB
    )

    val EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerOxidizableVerticalSlab(
        "exposed_cut_copper_vertical_slab",
        Oxidizable.OxidationLevel.EXPOSED,
        Blocks.EXPOSED_CUT_COPPER_SLAB
    )

    val WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerOxidizableVerticalSlab(
        "weathered_cut_copper_vertical_slab",
        Oxidizable.OxidationLevel.WEATHERED,
        Blocks.WEATHERED_CUT_COPPER_SLAB
    )

    val OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerOxidizableVerticalSlab(
        "oxidized_cut_copper_vertical_slab",
        Oxidizable.OxidationLevel.OXIDIZED,
        Blocks.OXIDIZED_CUT_COPPER_SLAB
    )

    val WAXED_CUT_COPPER_VERTICAL_SLAB = registerVerticalslab("waxed_cut_copper_vertical_slab", Blocks.WAXED_CUT_COPPER_SLAB)
    val WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerVerticalslab("waxed_exposed_cut_copper_vertical_slab", Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)
    val WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerVerticalslab("waxed_weathered_cut_copper_vertical_slab", Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)
    val WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerVerticalslab("waxed_oxidized_cut_copper_vertical_slab", Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)

    // ---------------------------
    // Stone / building material slabs
    // ---------------------------
    val STONE_VERTICAL_SLAB = registerVerticalslab("stone_vertical_slab", Blocks.STONE_SLAB)
    val SMOOTH_STONE_VERTICAL_SLAB = registerVerticalslab("smooth_stone_vertical_slab", Blocks.SMOOTH_STONE_SLAB)
    val SANDSTONE_VERTICAL_SLAB = registerVerticalslab("sandstone_vertical_slab", Blocks.SANDSTONE_SLAB)
    val CUT_SANDSTONE_VERTICAL_SLAB = registerVerticalslab("cut_sandstone_vertical_slab", Blocks.CUT_SANDSTONE_SLAB)
    val COBBLESTONE_VERTICAL_SLAB = registerVerticalslab("cobblestone_vertical_slab", Blocks.COBBLESTONE_SLAB)
    val BRICK_VERTICAL_SLAB = registerVerticalslab("brick_vertical_slab", Blocks.BRICK_SLAB)
    val STONE_BRICK_VERTICAL_SLAB = registerVerticalslab("stone_brick_vertical_slab", Blocks.STONE_BRICK_SLAB)
    val QUARTZ_VERTICAL_SLAB = registerVerticalslab("quartz_vertical_slab", Blocks.QUARTZ_SLAB)
    val SMOOTH_QUARTZ_VERTICAL_SLAB = registerVerticalslab("smooth_quartz_vertical_slab", Blocks.SMOOTH_QUARTZ_SLAB)
    val RED_SANDSTONE_VERTICAL_SLAB = registerVerticalslab("red_sandstone_vertical_slab", Blocks.RED_SANDSTONE_SLAB)
    val CUT_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalslab("cut_red_sandstone_vertical_slab", Blocks.CUT_RED_SANDSTONE_SLAB)
    val PURPUR_VERTICAL_SLAB = registerVerticalslab("purpur_vertical_slab", Blocks.PURPUR_SLAB)
    val PRISMARINE_VERTICAL_SLAB = registerVerticalslab("prismarine_vertical_slab", Blocks.PRISMARINE_SLAB)
    val PRISMARINE_BRICK_VERTICAL_SLAB = registerVerticalslab("prismarine_brick_vertical_slab", Blocks.PRISMARINE_BRICK_SLAB)
    val DARK_PRISMARINE_VERTICAL_SLAB = registerVerticalslab("dark_prismarine_vertical_slab", Blocks.DARK_PRISMARINE_SLAB)
    val POLISHED_GRANITE_VERTICAL_SLAB = registerVerticalslab("polished_granite_vertical_slab", Blocks.POLISHED_GRANITE_SLAB)
    val SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalslab("smooth_red_sandstone_vertical_slab", Blocks.SMOOTH_RED_SANDSTONE_SLAB)
    val MOSSY_STONE_BRICK_VERTICAL_SLAB = registerVerticalslab("mossy_stone_brick_vertical_slab", Blocks.MOSSY_STONE_BRICK_SLAB)
    val POLISHED_DIORITE_VERTICAL_SLAB = registerVerticalslab("polished_diorite_vertical_slab", Blocks.POLISHED_DIORITE_SLAB)
    val MOSSY_COBBLESTONE_VERTICAL_SLAB = registerVerticalslab("mossy_cobblestone_vertical_slab", Blocks.MOSSY_COBBLESTONE_SLAB)
    val END_STONE_BRICK_VERTICAL_SLAB = registerVerticalslab("end_stone_brick_vertical_slab", Blocks.END_STONE_BRICK_SLAB)
    val SMOOTH_SANDSTONE_VERTICAL_SLAB = registerVerticalslab("smooth_sandstone_vertical_slab", Blocks.SMOOTH_SANDSTONE_SLAB)
    val GRANITE_VERTICAL_SLAB = registerVerticalslab("granite_vertical_slab", Blocks.GRANITE_SLAB)
    val ANDESITE_VERTICAL_SLAB = registerVerticalslab("andesite_vertical_slab", Blocks.ANDESITE_SLAB)
    val POLISHED_ANDESITE_VERTICAL_SLAB = registerVerticalslab("polished_andesite_vertical_slab", Blocks.POLISHED_ANDESITE_SLAB)
    val DIORITE_VERTICAL_SLAB = registerVerticalslab("diorite_vertical_slab", Blocks.DIORITE_SLAB)
    val RED_NETHER_BRICK_VERTICAL_SLAB = registerVerticalslab("red_nether_brick_vertical_slab", Blocks.RED_NETHER_BRICK_SLAB)
    val NETHER_BRICK_VERTICAL_SLAB = registerVerticalslab("nether_brick_vertical_slab", Blocks.NETHER_BRICK_SLAB)
    val COBBLED_DEEPSLATE_VERTICAL_SLAB = registerVerticalslab("cobbled_deepslate_vertical_slab", Blocks.COBBLED_DEEPSLATE_SLAB)
    val POLISHED_DEEPSLATE_VERTICAL_SLAB = registerVerticalslab("polished_deepslate_vertical_slab", Blocks.POLISHED_DEEPSLATE_SLAB)
    val DEEPSLATE_BRICK_VERTICAL_SLAB = registerVerticalslab("deepslate_brick_vertical_slab", Blocks.DEEPSLATE_BRICK_SLAB)
    val DEEPSLATE_TILE_VERTICAL_SLAB = registerVerticalslab("deepslate_tile_vertical_slab", Blocks.DEEPSLATE_TILE_SLAB)
    val BLACKSTONE_VERTICAL_SLAB = registerVerticalslab("blackstone_vertical_slab", Blocks.BLACKSTONE_SLAB)
    val POLISHED_BLACKSTONE_VERTICAL_SLAB = registerVerticalslab("polished_blackstone_vertical_slab", Blocks.POLISHED_BLACKSTONE_SLAB)
    val POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerVerticalslab("polished_blackstone_brick_vertical_slab", Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)

    // ---------------------------
    // Misc building slabs
    // ---------------------------
    val MUD_BRICK_VERTICAL_SLAB = registerVerticalslab("mud_brick_vertical_slab", Blocks.MUD_BRICK_SLAB)
    val RESIN_BRICK_VERTICAL_SLAB = registerVerticalslab("resin_brick_vertical_slab", Blocks.RESIN_BRICK_SLAB)
    val TUFF_VERTICAL_SLAB = registerVerticalslab("tuff_vertical_slab", Blocks.TUFF_SLAB)
    val POLISHED_TUFF_VERTICAL_SLAB = registerVerticalslab("polished_tuff_vertical_slab", Blocks.POLISHED_TUFF_SLAB)
    val TUFF_BRICK_VERTICAL_SLAB = registerVerticalslab("tuff_brick_vertical_slab", Blocks.TUFF_BRICK_SLAB)

    // ---------------------------
    // Utility helpers
    // ---------------------------
    private fun registerVerticalslab(
        id: String,
        template: Block,
        factory: (AbstractBlock.Settings) -> Block = ::VerticalSlabBlock
    ): Block =
        register(id, factory, AbstractBlock.Settings.copy(template))

    private fun registerOxidizableVerticalSlab(
        id: String,
        level: Oxidizable.OxidationLevel,
        template: Block
    ): Block = register(
        id,
        { settings -> OxidizableVerticalSlabBlock(level, settings) },
        AbstractBlock.Settings.copy(template)
    )

    /**
     * Registers a block and its BlockItem with the given ID, factory, and settings.
     *
     * @param id The string ID for the block.
     * @param factory The function to create the block.
     * @param settings The block settings.
     * @return The registered [Block].
     */
    private fun register(
        id: String,
        factory: (AbstractBlock.Settings) -> Block,
        settings: AbstractBlock.Settings
    ): Block {
        val identifier = Identifier.of(MOD_ID, id)

        val blockKey: RegistryKey<Block> = RegistryKey.of(RegistryKeys.BLOCK, identifier)
        val settingsWithKey = settings.registryKey(blockKey)

        val block = factory(settingsWithKey)

        val registered = Registry.register(Registries.BLOCK, blockKey, block)

        val itemKey: RegistryKey<Item> = RegistryKey.of(RegistryKeys.ITEM, identifier)
        val itemSettings = Item.Settings()
            .useBlockPrefixedTranslationKey()
            .registryKey(itemKey)

        val item = BlockItem(registered, itemSettings)
        Registry.register(Registries.ITEM, itemKey, item)

        return registered
    }

    /**
     * Initializes all mod blocks.
     *
     * Should be called during mod setup.
     */
    fun initialize() {
        PearExpansion.LOGGER.info("ModBlocks initialized.")
    }
}