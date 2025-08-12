package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

public class FuelItems {
    public static void registerFuelItems() {
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.allWithFuelValue()) {
            int fuelValue = verticalSlab.getFuelValue()
                    .orElseThrow(() -> new IllegalStateException("Fuel value is missing for " + verticalSlab));
            if (fuelValue > 0) {
                FuelRegistryEvents.BUILD.register((builder, context) ->
                        builder.add(verticalSlab.getBlock(), fuelValue));
            }
        }
    }
}