package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class OxidizableBlocks {
    public static void registerOxidizableBlocks() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsWithOxidation()) {
            OxidizableBlocksRegistry.registerOxidizableBlockPair(
                    verticalSlab.getBlock(),
                    verticalSlab.getOxidizesTo()
            );
        }
    }
}