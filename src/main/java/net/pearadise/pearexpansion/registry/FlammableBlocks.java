package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class FlammableBlocks {
    public static void registerFlammableBlocks() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsFlammable()) {
            int[] flammability = verticalSlab.getFlammability();
            FlammableBlockRegistry.getDefaultInstance().add(
                    verticalSlab.getBlock(),
                    flammability[0],
                    flammability[1]
            );
        }
    }
}
