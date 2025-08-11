package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class FuelItems {
    public static void registerFuelItems() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsWithFuelValue()) {
            int fuelValue = verticalSlab.getFuelValue();
            if (fuelValue > 0) {
                FuelRegistryEvents.BUILD.register((builder, context) -> {
                    builder.add(verticalSlab.getBlock(), fuelValue);
                });
            }
        }
    }
}