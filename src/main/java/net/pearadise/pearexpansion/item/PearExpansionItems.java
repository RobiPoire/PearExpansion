package net.pearadise.pearexpansion.item;

import net.fabricmc.api.ModInitializer;

/**
 * Initializes all custom items and item groups for the Pear Expansion mod.
 *
 * <p>
 * This class implements {@link ModInitializer} and is responsible for registering
 * and initializing all custom items and item groups defined in {@link ModItems}.
 * It is called automatically during the mod's startup phase by the Fabric loader.
 * </p>
 *
 * @author RobiPoire
 * @see ModItems
 */
public class PearExpansionItems implements ModInitializer {

    /**
     * Initializes all custom items and item groups for the Pear Expansion mod.
     *
     * <p>
     * Called by Fabric during the mod's initialization phase. Delegates the registration
     * and setup of items and item groups to {@link ModItems#initialize()}.
     * </p>
     */
    @Override
    public void onInitialize() {
        // Register all custom items and item groups for the mod
        ModItems.initialize();
    }
}