package net.pearadise.pearexpansion.util

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.Item
import net.minecraft.item.ItemConvertible
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.block.VerticalSlabBlock
import net.pearadise.pearexpansion.item.ModItems

/**
 * Holds lists and maps of mod content for easy access and registration.
 *
 * This object helps organize blocks, items, and their relationships for the mod.
 */
object ModContentLists {

    /**
     * Maps each vertical slab block to its base block.
     *
     * Used for recipes, tooltips, or block logic.
     */
    val VERTICAL_TO_BASE_BLOCK: Map<Block, Block> = buildMap {
        put(ModBlocks.ACACIA_VERTICAL_SLAB, Blocks.ACACIA_PLANKS)
        put(ModBlocks.ANDESITE_VERTICAL_SLAB, Blocks.ANDESITE)
        put(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, Blocks.BAMBOO_MOSAIC)
        put(ModBlocks.BAMBOO_VERTICAL_SLAB, Blocks.BAMBOO_PLANKS)
        put(ModBlocks.BIRCH_VERTICAL_SLAB, Blocks.BIRCH_PLANKS)
        put(ModBlocks.BLACKSTONE_VERTICAL_SLAB, Blocks.BLACKSTONE)
        put(ModBlocks.BRICK_VERTICAL_SLAB, Blocks.BRICKS)
        put(ModBlocks.CHERRY_VERTICAL_SLAB, Blocks.CHERRY_PLANKS)
        put(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, Blocks.COBBLED_DEEPSLATE)
        put(ModBlocks.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE)
        put(ModBlocks.CRIMSON_VERTICAL_SLAB, Blocks.CRIMSON_PLANKS)
        put(ModBlocks.CUT_COPPER_VERTICAL_SLAB, Blocks.CUT_COPPER)
        put(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_RED_SANDSTONE)
        put(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, Blocks.CUT_SANDSTONE)
        put(ModBlocks.DARK_OAK_VERTICAL_SLAB, Blocks.DARK_OAK_PLANKS)
        put(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, Blocks.DARK_PRISMARINE)
        put(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, Blocks.DEEPSLATE_BRICKS)
        put(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, Blocks.DEEPSLATE_TILES)
        put(ModBlocks.DIORITE_VERTICAL_SLAB, Blocks.DIORITE)
        put(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, Blocks.END_STONE_BRICKS)
        put(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.EXPOSED_CUT_COPPER)
        put(ModBlocks.GRANITE_VERTICAL_SLAB, Blocks.GRANITE)
        put(ModBlocks.JUNGLE_VERTICAL_SLAB, Blocks.JUNGLE_PLANKS)
        put(ModBlocks.MANGROVE_VERTICAL_SLAB, Blocks.MANGROVE_PLANKS)
        put(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, Blocks.MOSSY_COBBLESTONE)
        put(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, Blocks.MOSSY_STONE_BRICKS)
        put(ModBlocks.MUD_BRICK_VERTICAL_SLAB, Blocks.MUD_BRICKS)
        put(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, Blocks.NETHER_BRICKS)
        put(ModBlocks.OAK_VERTICAL_SLAB, Blocks.OAK_PLANKS)
        put(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_CUT_COPPER)
        put(ModBlocks.PALE_OAK_VERTICAL_SLAB, Blocks.PALE_OAK_PLANKS)
        put(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, Blocks.POLISHED_ANDESITE)
        put(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS)
        put(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, Blocks.POLISHED_BLACKSTONE)
        put(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, Blocks.POLISHED_DEEPSLATE)
        put(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, Blocks.POLISHED_DIORITE)
        put(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, Blocks.POLISHED_GRANITE)
        put(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, Blocks.POLISHED_TUFF)
        put(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, Blocks.PRISMARINE_BRICKS)
        put(ModBlocks.PRISMARINE_VERTICAL_SLAB, Blocks.PRISMARINE)
        put(ModBlocks.PURPUR_VERTICAL_SLAB, Blocks.PURPUR_BLOCK)
        put(ModBlocks.QUARTZ_VERTICAL_SLAB, Blocks.QUARTZ_BLOCK)
        put(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, Blocks.RED_NETHER_BRICKS)
        put(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, Blocks.RED_SANDSTONE)
        put(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, Blocks.RESIN_BRICKS)
        put(ModBlocks.SANDSTONE_VERTICAL_SLAB, Blocks.SANDSTONE)
        put(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, Blocks.SMOOTH_QUARTZ)
        put(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_RED_SANDSTONE)
        put(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, Blocks.SMOOTH_SANDSTONE)
        put(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, Blocks.SMOOTH_STONE)
        put(ModBlocks.SPRUCE_VERTICAL_SLAB, Blocks.SPRUCE_PLANKS)
        put(ModBlocks.STONE_BRICK_VERTICAL_SLAB, Blocks.STONE_BRICKS)
        put(ModBlocks.STONE_VERTICAL_SLAB, Blocks.STONE)
        put(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, Blocks.TUFF_BRICKS)
        put(ModBlocks.TUFF_VERTICAL_SLAB, Blocks.TUFF)
        put(ModBlocks.WARPED_VERTICAL_SLAB, Blocks.WARPED_PLANKS)
        put(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, Blocks.CUT_COPPER)
        put(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, Blocks.EXPOSED_CUT_COPPER)
        put(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, Blocks.OXIDIZED_CUT_COPPER)
        put(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_CUT_COPPER)
        put(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, Blocks.WEATHERED_CUT_COPPER)
    }

    /**
     * All custom items added by the mod.
     */
    val ALL_ITEMS: List<Item> = listOf(
        ModItems.PEAR,
        ModItems.GOLDEN_PEAR,
        ModItems.ENCHANTED_GOLDEN_PEAR,
        ModItems.COPPER_CRAB_CLAW,
        ModItems.DIAMOND_CRAB_CLAW,
        ModItems.NETHERITE_CRAB_CLAW
    )

    /**
     * All custom blocks added by the mod.
     */
    val ALL_BLOCKS: List<Block> = listOf(
        ModBlocks.OAK_VERTICAL_SLAB,
        ModBlocks.SPRUCE_VERTICAL_SLAB,
        ModBlocks.BIRCH_VERTICAL_SLAB,
        ModBlocks.JUNGLE_VERTICAL_SLAB,
        ModBlocks.ACACIA_VERTICAL_SLAB,
        ModBlocks.DARK_OAK_VERTICAL_SLAB,
        ModBlocks.MANGROVE_VERTICAL_SLAB,
        ModBlocks.PALE_OAK_VERTICAL_SLAB,
        ModBlocks.CHERRY_VERTICAL_SLAB,
        ModBlocks.BAMBOO_VERTICAL_SLAB,
        ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB,
        ModBlocks.CRIMSON_VERTICAL_SLAB,
        ModBlocks.WARPED_VERTICAL_SLAB,
        ModBlocks.STONE_VERTICAL_SLAB,
        ModBlocks.SMOOTH_STONE_VERTICAL_SLAB,
        ModBlocks.SANDSTONE_VERTICAL_SLAB,
        ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.COBBLESTONE_VERTICAL_SLAB,
        ModBlocks.BRICK_VERTICAL_SLAB,
        ModBlocks.STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.NETHER_BRICK_VERTICAL_SLAB,
        ModBlocks.QUARTZ_VERTICAL_SLAB,
        ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
        ModBlocks.RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.PURPUR_VERTICAL_SLAB,
        ModBlocks.PRISMARINE_VERTICAL_SLAB,
        ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB,
        ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB,
        ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB,
        ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB,
        ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB,
        ModBlocks.END_STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.GRANITE_VERTICAL_SLAB,
        ModBlocks.ANDESITE_VERTICAL_SLAB,
        ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB,
        ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB,
        ModBlocks.DIORITE_VERTICAL_SLAB,
        ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB,
        ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB,
        ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB,
        ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB,
        ModBlocks.BLACKSTONE_VERTICAL_SLAB,
        ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB,
        ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB,
        ModBlocks.CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.MUD_BRICK_VERTICAL_SLAB,
        ModBlocks.RESIN_BRICK_VERTICAL_SLAB,
        ModBlocks.TUFF_VERTICAL_SLAB,
        ModBlocks.POLISHED_TUFF_VERTICAL_SLAB,
        ModBlocks.TUFF_BRICK_VERTICAL_SLAB
    )

    /**
     * Blocks that can be mined with an axe.
     */
    val AXE_MINEABLE_BLOCKS: List<Block> = listOf(
        ModBlocks.ACACIA_VERTICAL_SLAB,
        ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB,
        ModBlocks.BAMBOO_VERTICAL_SLAB,
        ModBlocks.BIRCH_VERTICAL_SLAB,
        ModBlocks.CHERRY_VERTICAL_SLAB,
        ModBlocks.CRIMSON_VERTICAL_SLAB,
        ModBlocks.DARK_OAK_VERTICAL_SLAB,
        ModBlocks.JUNGLE_VERTICAL_SLAB,
        ModBlocks.MANGROVE_VERTICAL_SLAB,
        ModBlocks.OAK_VERTICAL_SLAB,
        ModBlocks.PALE_OAK_VERTICAL_SLAB,
        ModBlocks.SPRUCE_VERTICAL_SLAB,
        ModBlocks.WARPED_VERTICAL_SLAB
    )

    /**
     * Blocks that can be mined with a pickaxe.
     */
    val PICKAXE_MINEABLE_BLOCKS: List<Block> = listOf(
        ModBlocks.STONE_VERTICAL_SLAB,
        ModBlocks.SMOOTH_STONE_VERTICAL_SLAB,
        ModBlocks.SANDSTONE_VERTICAL_SLAB,
        ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.COBBLESTONE_VERTICAL_SLAB,
        ModBlocks.BRICK_VERTICAL_SLAB,
        ModBlocks.STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.NETHER_BRICK_VERTICAL_SLAB,
        ModBlocks.QUARTZ_VERTICAL_SLAB,
        ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB,
        ModBlocks.RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.PURPUR_VERTICAL_SLAB,
        ModBlocks.PRISMARINE_VERTICAL_SLAB,
        ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB,
        ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB,
        ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB,
        ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB,
        ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB,
        ModBlocks.END_STONE_BRICK_VERTICAL_SLAB,
        ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB,
        ModBlocks.GRANITE_VERTICAL_SLAB,
        ModBlocks.ANDESITE_VERTICAL_SLAB,
        ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB,
        ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB,
        ModBlocks.DIORITE_VERTICAL_SLAB,
        ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB,
        ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB,
        ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB,
        ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB,
        ModBlocks.BLACKSTONE_VERTICAL_SLAB,
        ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB,
        ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB,
        ModBlocks.CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.MUD_BRICK_VERTICAL_SLAB,
        ModBlocks.RESIN_BRICK_VERTICAL_SLAB,
        ModBlocks.TUFF_VERTICAL_SLAB,
        ModBlocks.POLISHED_TUFF_VERTICAL_SLAB,
        ModBlocks.TUFF_BRICK_VERTICAL_SLAB
    )

    /**
     * All items and blocks that can be used as an [ItemConvertible].
     */
    val ALL_ITEMS_CONVERTIBLE: List<ItemConvertible> =
        (ALL_ITEMS + ALL_BLOCKS).map { it as ItemConvertible }

    /**
     * All vertical slab blocks in the mod.
     */
    val ALL_VERTICAL_SLABS: List<VerticalSlabBlock> =
        ALL_BLOCKS.filterIsInstance<VerticalSlabBlock>()
}