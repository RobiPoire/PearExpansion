package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FuelItems {
    private static final int DEFAULT_WOOD_BURN_TIME = 300;
    private static final int BAMBOO_BURN_TIME = 150;

    public static void registerFuelItems() {


        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.VERTICAL_OAK_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_BIRCH_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_ACACIA_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_CHERRY_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, DEFAULT_WOOD_BURN_TIME);

            builder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, BAMBOO_BURN_TIME);
            builder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, BAMBOO_BURN_TIME);
        });
    }
}