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

    /** Oak vertical slab block. */
    val OAK_VERTICAL_SLAB: Block =
        register(
            "oak_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB)
        )

    /** Spruce vertical slab block. */
    val SPRUCE_VERTICAL_SLAB: Block =
        register(
            "spruce_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB)
        )

    /** Birch vertical slab block. */
    val BIRCH_VERTICAL_SLAB: Block =
        register(
            "birch_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB)
        )

    /** Jungle vertical slab block. */
    val JUNGLE_VERTICAL_SLAB: Block =
        register(
            "jungle_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB)
        )

    /** Acacia vertical slab block. */
    val ACACIA_VERTICAL_SLAB: Block =
        register(
            "acacia_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB)
        )

    /** Dark oak vertical slab block. */
    val DARK_OAK_VERTICAL_SLAB: Block =
        register(
            "dark_oak_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB)
        )

    /** Mangrove vertical slab block. */
    val MANGROVE_VERTICAL_SLAB: Block =
        register(
            "mangrove_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB)
        )

    /** Cherry vertical slab block. */
    val CHERRY_VERTICAL_SLAB: Block =
        register(
            "cherry_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB)
        )

    /** Crimson vertical slab block. */
    val CRIMSON_VERTICAL_SLAB: Block =
        register(
            "crimson_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)
        )

    /** Warped vertical slab block. */
    val WARPED_VERTICAL_SLAB: Block =
        register(
            "warped_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.WARPED_SLAB)
        )

    /** Bamboo vertical slab block. */
    val BAMBOO_VERTICAL_SLAB: Block =
        register(
            "bamboo_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB)
        )

    /** Bamboo mosaic vertical slab block. */
    val BAMBOO_MOSAIC_VERTICAL_SLAB: Block =
        register(
            "bamboo_mosaic_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB)
        )

    /** Pale oak vertical slab block. */
    val PALE_OAK_VERTICAL_SLAB: Block =
        register(
            "pale_oak_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_SLAB)
        )

    /** Cut copper vertical slab block (unaffected, can oxidize). */
    val CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "cut_copper_vertical_slab",
            { settings -> OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings) },
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB)
        )

    /** Exposed cut copper vertical slab block. */
    val EXPOSED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "exposed_cut_copper_vertical_slab",
            { settings -> OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings) },
            AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB)
        )

    /** Weathered cut copper vertical slab block. */
    val WEATHERED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "weathered_cut_copper_vertical_slab",
            { settings -> OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings) },
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB)
        )

    /** Oxidized cut copper vertical slab block. */
    val OXIDIZED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "oxidized_cut_copper_vertical_slab",
            { settings -> OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings) },
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB)
        )

    /** Waxed cut copper vertical slab block. */
    val WAXED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "waxed_cut_copper_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB)
        )

    /** Waxed exposed cut copper vertical slab block. */
    val WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "waxed_exposed_cut_copper_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)
        )

    /** Waxed weathered cut copper vertical slab block. */
    val WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "waxed_weathered_cut_copper_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)
        )

    /** Waxed oxidized cut copper vertical slab block. */
    val WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB: Block =
        register(
            "waxed_oxidized_cut_copper_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)
        )

    /** Stone vertical slab block. */
    val STONE_VERTICAL_SLAB: Block =
        register(
            "stone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.STONE_SLAB)
        )

    /** Smooth stone vertical slab block. */
    val SMOOTH_STONE_VERTICAL_SLAB: Block =
        register(
            "smooth_stone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB)
        )

    /** Sandstone vertical slab block. */
    val SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)
        )

    /** Cut sandstone vertical slab block. */
    val CUT_SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "cut_sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB)
        )

    /** Cobblestone vertical slab block. */
    val COBBLESTONE_VERTICAL_SLAB: Block =
        register(
            "cobblestone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB)
        )

    /** Brick vertical slab block. */
    val BRICK_VERTICAL_SLAB: Block =
        register(
            "brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)
        )

    /** Stone brick vertical slab block. */
    val STONE_BRICK_VERTICAL_SLAB: Block =
        register(
            "stone_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)
        )

    /** Quartz vertical slab block. */
    val QUARTZ_VERTICAL_SLAB: Block =
        register(
            "quartz_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB)
        )

    /** Smooth quartz vertical slab block. */
    val SMOOTH_QUARTZ_VERTICAL_SLAB: Block =
        register(
            "smooth_quartz_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB)
        )

    /** Red sandstone vertical slab block. */
    val RED_SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "red_sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB)
        )

    /** Cut red sandstone vertical slab block. */
    val CUT_RED_SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "cut_red_sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB)
        )

    /** Purpur vertical slab block. */
    val PURPUR_VERTICAL_SLAB: Block =
        register(
            "purpur_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB)
        )

    /** Prismarine vertical slab block. */
    val PRISMARINE_VERTICAL_SLAB: Block =
        register(
            "prismarine_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB)
        )

    /** Prismarine brick vertical slab block. */
    val PRISMARINE_BRICK_VERTICAL_SLAB: Block =
        register(
            "prismarine_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB)
        )

    /** Dark prismarine vertical slab block. */
    val DARK_PRISMARINE_VERTICAL_SLAB: Block =
        register(
            "dark_prismarine_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB)
        )

    /** Polished granite vertical slab block. */
    val POLISHED_GRANITE_VERTICAL_SLAB: Block =
        register(
            "polished_granite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB)
        )

    /** Smooth red sandstone vertical slab block. */
    val SMOOTH_RED_SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "smooth_red_sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)
        )

    /** Mossy stone brick vertical slab block. */
    val MOSSY_STONE_BRICK_VERTICAL_SLAB: Block =
        register(
            "mossy_stone_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB)
        )

    /** Polished diorite vertical slab block. */
    val POLISHED_DIORITE_VERTICAL_SLAB: Block =
        register(
            "polished_diorite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB)
        )

    /** Mossy cobblestone vertical slab block. */
    val MOSSY_COBBLESTONE_VERTICAL_SLAB: Block =
        register(
            "mossy_cobblestone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB)
        )

    /** Smooth sandstone vertical slab block. */
    val SMOOTH_SANDSTONE_VERTICAL_SLAB: Block =
        register(
            "smooth_sandstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)
        )

    /** Granite vertical slab block. */
    val GRANITE_VERTICAL_SLAB: Block =
        register(
            "granite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)
        )

    /** Andesite vertical slab block. */
    val ANDESITE_VERTICAL_SLAB: Block =
        register(
            "andesite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB)
        )

    /** Polished andesite vertical slab block. */
    val POLISHED_ANDESITE_VERTICAL_SLAB: Block =
        register(
            "polished_andesite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB)
        )

    /** Diorite vertical slab block. */
    val DIORITE_VERTICAL_SLAB: Block =
        register(
            "diorite_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)
        )

    /** Red nether brick vertical slab block. */
    val RED_NETHER_BRICK_VERTICAL_SLAB: Block =
        register(
            "red_nether_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)
        )

    /** Nether brick vertical slab block. */
    val NETHER_BRICK_VERTICAL_SLAB: Block =
        register(
            "nether_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB)
        )

    /** Cobbled deepslate vertical slab block. */
    val COBBLED_DEEPSLATE_VERTICAL_SLAB: Block =
        register(
            "cobbled_deepslate_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)
        )

    /** Polished deepslate vertical slab block. */
    val POLISHED_DEEPSLATE_VERTICAL_SLAB: Block =
        register(
            "polished_deepslate_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)
        )

    /** Deepslate brick vertical slab block. */
    val DEEPSLATE_BRICK_VERTICAL_SLAB: Block =
        register(
            "deepslate_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)
        )

    /** Deepslate tile vertical slab block. */
    val DEEPSLATE_TILE_VERTICAL_SLAB: Block =
        register(
            "deepslate_tile_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB)
        )

    /** Blackstone vertical slab block. */
    val BLACKSTONE_VERTICAL_SLAB: Block =
        register(
            "blackstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB)
        )

    /** Polished blackstone vertical slab block. */
    val POLISHED_BLACKSTONE_VERTICAL_SLAB: Block =
        register(
            "polished_blackstone_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB)
        )

    /** Polished blackstone brick vertical slab block. */
    val POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB: Block =
        register(
            "polished_blackstone_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
        )

    /** Mud brick vertical slab block. */
    val MUD_BRICK_VERTICAL_SLAB: Block =
        register(
            "mud_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB)
        )

    /** Resin brick vertical slab block. */
    val RESIN_BRICK_VERTICAL_SLAB: Block =
        register(
            "resin_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.RESIN_BRICK_SLAB)
        )

    /** Tuff vertical slab block. */
    val TUFF_VERTICAL_SLAB: Block =
        register(
            "tuff_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.TUFF_SLAB)
        )

    /** Polished tuff vertical slab block. */
    val POLISHED_TUFF_VERTICAL_SLAB: Block =
        register(
            "polished_tuff_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB)
        )

    /** Tuff brick vertical slab block. */
    val TUFF_BRICK_VERTICAL_SLAB: Block =
        register(
            "tuff_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB)
        )

    /** End stone brick vertical slab block. */
    val END_STONE_BRICK_VERTICAL_SLAB: Block =
        register(
            "end_stone_brick_vertical_slab",
            ::VerticalSlabBlock,
            AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)
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
        return register(keyOf(id), factory, settings)
    }

    /**
     * Registers a block and its BlockItem with the given registry key, factory, and settings.
     *
     * @param key The registry key for the block.
     * @param factory The function to create the block.
     * @param settings The block settings.
     * @return The registered [Block].
     */
    private fun register(
        key: RegistryKey<Block>,
        factory: (AbstractBlock.Settings) -> Block,
        settings: AbstractBlock.Settings
    ): Block {
        // 1) Create and register the block
        val block = factory(settings.registryKey(key))
        val registered = Registry.register(Registries.BLOCK, key, block)

        // 2) Create and register the BlockItem with the same ID
        val itemKey: RegistryKey<Item> = RegistryKey.of(RegistryKeys.ITEM, key.value)
        Registry.register(
            Registries.ITEM,
            itemKey,
            BlockItem(registered, Item.Settings().registryKey(itemKey))
        )

        return registered
    }

    /**
     * Creates a registry key for a block using its ID.
     *
     * @param id The string ID for the block.
     * @return The [RegistryKey] for the block.
     */
    private fun keyOf(id: String): RegistryKey<Block> =
        RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, id))

    /**
     * Initializes all mod blocks.
     *
     * Should be called during mod setup.
     */
    fun initialize() {
        PearExpansion.LOGGER.info("ModBlocks initialized.")
    }
}