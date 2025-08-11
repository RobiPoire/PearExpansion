package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class OxidizableBlocks {
    public static void registerOxidizableBlocks() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.VERTICAL_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB
        );
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB
        );
        OxidizableBlocksRegistry.registerOxidizableBlockPair(
                ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB
        );
    }

}