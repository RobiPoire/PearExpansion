package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class WeatheringBlocks {

    public static void registerWeatheringBlocks() {
        // Weathering pairs
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        // Waxable pairs
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB,
                ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }
}
