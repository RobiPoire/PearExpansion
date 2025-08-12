package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class WaxableBlocks {
    public static void registerWaxableBlocks() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.allWithWaxedVariant()) {
            OxidizableBlocksRegistry.registerWaxableBlockPair(
                    verticalSlab.getBlock(),
                    verticalSlab.getWaxedVariant()
                            .orElseThrow(() -> new IllegalStateException("Waxed variant is missing for " + verticalSlab)).getBlock()
            );
        }
    }
}