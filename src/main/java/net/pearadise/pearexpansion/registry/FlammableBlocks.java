package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FlammableBlocks {
    private static final int FLAME_ODDS = 5;
    private static final int BURN_ODDS = 20;

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.VERTICAL_OAK_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_SPRUCE_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_BIRCH_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_JUNGLE_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_ACACIA_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_MANGROVE_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_CHERRY_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_BAMBOO_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, FLAME_ODDS, BURN_ODDS);
    }
}