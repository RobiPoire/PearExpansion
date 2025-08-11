package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FuelItems {
    public static void registerFuelItems() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.VERTICAL_OAK_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_BIRCH_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_ACACIA_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_CHERRY_SLAB, 300);
            builder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, 300);

            builder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, 150);
            builder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, 150);
        });
    }
}
