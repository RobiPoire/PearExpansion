package net.pearadise.pearexpansion.block;

import net.fabricmc.api.ModInitializer;

/**
 * Initializes all custom blocks for the Pear Expansion mod.
 * <p>
 * This class is responsible for registering and initializing all blocks
 * when the mod is loaded. It implements the {@link ModInitializer} interface
 * to hook into the Fabric mod loading process.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionBlocks implements ModInitializer {

    /**
     * Called by the Fabric loader to initialize the mod.
     * <p>
     * This method registers all custom blocks by calling {@link ModBlocks#initialize()}.
     * </p>
     */
    @Override
    public void onInitialize() {
        ModBlocks.initialize();
    }
}