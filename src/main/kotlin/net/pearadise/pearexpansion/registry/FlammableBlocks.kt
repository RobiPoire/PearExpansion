package net.pearadise.pearexpansion.registry

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry
import net.pearadise.pearexpansion.block.ModBlocks

/**
 * Registers flammable blocks for the mod.
 *
 * This object adds custom blocks to the flammable block registry,
 * allowing them to catch fire and burn in the game.
 */
object FlammableBlocks {

    /** Odds that fire will spread to the block. */
    private const val FLAME_ODDS = 5

    /** Odds that the block will burn once on fire. */
    private const val BURN_ODDS = 20

    /**
     * Registers all custom flammable blocks with the registry.
     *
     * Adds each block with defined flame and burn odds.
     */
    fun registerFlammableBlocks() {
        val registry = FlammableBlockRegistry.getDefaultInstance()

        // Add each vertical slab block to the flammable registry
        listOf(
            ModBlocks.OAK_VERTICAL_SLAB,
            ModBlocks.SPRUCE_VERTICAL_SLAB,
            ModBlocks.BIRCH_VERTICAL_SLAB,
            ModBlocks.JUNGLE_VERTICAL_SLAB,
            ModBlocks.ACACIA_VERTICAL_SLAB,
            ModBlocks.DARK_OAK_VERTICAL_SLAB,
            ModBlocks.MANGROVE_VERTICAL_SLAB,
            ModBlocks.CHERRY_VERTICAL_SLAB,
            ModBlocks.PALE_OAK_VERTICAL_SLAB,
            ModBlocks.BAMBOO_VERTICAL_SLAB,
            ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB
        ).forEach { block ->
            registry.add(block, FLAME_ODDS, BURN_ODDS)
        }
    }
}