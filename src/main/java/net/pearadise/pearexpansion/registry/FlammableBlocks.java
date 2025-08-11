package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_CHERRY_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_PALE_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, 5, 20);
    }
}