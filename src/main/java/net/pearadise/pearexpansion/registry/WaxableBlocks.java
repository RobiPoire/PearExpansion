package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class WaxableBlocks {
    public static void registerWaxableBlocks() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsWithWaxed()) {
            OxidizableBlocksRegistry.registerWaxableBlockPair(
                    verticalSlab.getBlock(),
                    verticalSlab.getWaxedVariant()
            );
        }
    }
}
