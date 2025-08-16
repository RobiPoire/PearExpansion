package net.pearadise.pearexpansion.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.pearadise.pearexpansion.block.ModBlocks;

public class FlammableBlocks {
    private static final int FLAME_ODDS = 5;
    private static final int BURN_ODDS = 20;

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.OAK_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.SPRUCE_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.BIRCH_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.JUNGLE_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.ACACIA_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.MANGROVE_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.CHERRY_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.BAMBOO_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
        registry.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, FLAME_ODDS, BURN_ODDS);
    }
}