package net.pearadise.pearexpansion.registry

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry
import net.pearadise.pearexpansion.block.ModBlocks

/**
 * Registers weathering and waxing behavior for custom copper slab blocks.
 *
 * This object links vertical copper slab blocks to their oxidized and waxed forms,
 * allowing them to change state in the game like vanilla copper blocks.
 */
object WeatheringBlocks {

    private val OXIDIZABLE_PAIRS = listOf(
        ModBlocks.CUT_COPPER_VERTICAL_SLAB to ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB
    )

    private val WAXABLE_PAIRS = listOf(
        ModBlocks.CUT_COPPER_VERTICAL_SLAB to ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB to ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB to ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB,
        ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB to ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB
    )

    /**
     * Registers all weathering and waxable block pairs for the mod.
     *
     * Sets up how copper vertical slabs oxidize and can be waxed.
     */
    fun registerWeatheringBlocks() {
        OXIDIZABLE_PAIRS.forEach { (from, to) ->
            OxidizableBlocksRegistry.registerOxidizableBlockPair(from, to)
        }

        WAXABLE_PAIRS.forEach { (from, to) ->
            OxidizableBlocksRegistry.registerWaxableBlockPair(from, to)
        }
    }
}
