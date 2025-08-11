package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class WaxableBlocks {
    public static void registerWaxableBlocks() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.VERTICAL_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB
        );
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB
        );
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB
        );
        OxidizableBlocksRegistry.registerWaxableBlockPair(
                ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB,
                ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB
        );
    }
}
