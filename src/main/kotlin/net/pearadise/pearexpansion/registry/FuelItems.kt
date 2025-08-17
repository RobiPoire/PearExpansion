package net.pearadise.pearexpansion.registry

import net.fabricmc.fabric.api.registry.FuelRegistryEvents
import net.pearadise.pearexpansion.block.ModBlocks

/**
 * Registers custom fuel items for the mod.
 *
 * This object adds custom blocks as valid fuel sources in furnaces and other fuel-using blocks.
 */
object FuelItems {

    /** Burn time for standard wood vertical slabs (in ticks). */
    private const val DEFAULT_WOOD_BURN_TIME = 300

    /** Burn time for bamboo vertical slabs (in ticks). */
    private const val BAMBOO_BURN_TIME = 150

    /**
     * Registers all custom fuel items with the fuel registry.
     *
     * Adds each block with its specific burn time.
     */
    fun registerFuelItems() {
        FuelRegistryEvents.BUILD.register { builder, _ ->
            // Register wood vertical slabs as fuel
            listOf(
                ModBlocks.OAK_VERTICAL_SLAB,
                ModBlocks.SPRUCE_VERTICAL_SLAB,
                ModBlocks.BIRCH_VERTICAL_SLAB,
                ModBlocks.JUNGLE_VERTICAL_SLAB,
                ModBlocks.ACACIA_VERTICAL_SLAB,
                ModBlocks.DARK_OAK_VERTICAL_SLAB,
                ModBlocks.MANGROVE_VERTICAL_SLAB,
                ModBlocks.CHERRY_VERTICAL_SLAB,
                ModBlocks.PALE_OAK_VERTICAL_SLAB
            ).forEach { block ->
                builder.add(block, DEFAULT_WOOD_BURN_TIME)
            }

            // Register bamboo vertical slabs as fuel
            listOf(
                ModBlocks.BAMBOO_VERTICAL_SLAB,
                ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB
            ).forEach { block ->
                builder.add(block, BAMBOO_BURN_TIME)
            }
        }
    }
}