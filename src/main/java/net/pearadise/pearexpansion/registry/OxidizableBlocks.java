package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class OxidizableBlocks {
    public static void registerOxidizableBlocks() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.allWithOxidation()) {
            verticalSlab.getOxidizesTo().ifPresent(oxidizedBlock ->
                    OxidizableBlocksRegistry.registerOxidizableBlockPair(
                            verticalSlab.getBlock(),
                            oxidizedBlock.getBlock()
                    )
            );
        }
    }
}