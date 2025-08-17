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

    /**
     * Registers all weathering and waxable block pairs for the mod.
     *
     * This function sets up how copper vertical slabs oxidize and can be waxed.
     */
    fun registerWeatheringBlocks() {
        // Register weathering (oxidation) pairs
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
            ModBlocks.CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB
        )
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
            ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB
        )
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
            ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB
        )

        // Register waxable pairs
        OxidizableBlocksRegistry.registerWaxableBlockPair(
            ModBlocks.CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB
        )
        OxidizableBlocksRegistry.registerWaxableBlockPair(
            ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB
        )
        OxidizableBlocksRegistry.registerWaxableBlockPair(
            ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB
        )
        OxidizableBlocksRegistry.registerWaxableBlockPair(
            ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
            ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB
        )
    }
}