package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FuelItems {
    private static final int DEFAULT_WOOD_BURN_TIME = 300;
    private static final int BAMBOO_BURN_TIME = 150;

    public static void registerFuelItems() {


        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.OAK_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.BIRCH_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.ACACIA_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.CHERRY_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);
            builder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, DEFAULT_WOOD_BURN_TIME);

            builder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, BAMBOO_BURN_TIME);
            builder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, BAMBOO_BURN_TIME);
        });
    }
}