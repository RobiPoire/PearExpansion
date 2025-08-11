package net.pearadise.pearexpansion.block;

import net.fabricmc.api.ModInitializer;
import net.pearadise.pearexpansion.registry.FlammableBlocks;
import net.pearadise.pearexpansion.registry.WeatheringBlocks;

/**
 * Initializes all custom blocks for the Pear Expansion mod.
 *
 * <p>
 * This class registers and initializes all custom blocks when the mod is loaded.
 * It implements the {@link ModInitializer} interface to hook into the Fabric mod loading process.
 * Call this class from your mod initializer to ensure all blocks are available.
 * </p>
 *
 * @author RobiPoire
 * @see ModBlocks
 */
public class PearExpansionBlocks implements ModInitializer {

    /**
     * Initializes all custom blocks for the mod.
     *
     * <p>
     * Called by the Fabric loader during the mod initialization phase.
     * Registers all custom blocks by calling {@link ModBlocks#initialize()}.
     * </p>
     */
    @Override
    public void onInitialize() {
        // Register all custom blocks and add them to the creative item group
        ModBlocks.initialize();
        // Register weathering blocks
        WeatheringBlocks.registerWeatheringBlocks();
        // Register flammable blocks
        FlammableBlocks.registerFlammableBlocks();
    }
}