package net.pearadise.pearexpansion.item;

import net.fabricmc.api.ModInitializer;

/**
 * Main initializer for the Pear Expansion mod's items.
 * <p>
 * This class implements the {@link ModInitializer} interface and is responsible
 * for registering and initializing all custom items and item groups defined in
 * {@link ModItems}. It is called automatically during the mod's startup phase.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionItems implements ModInitializer {

    /**
     * Initializes all custom items and item groups for the Pear Expansion mod.
     * <p>
     * This method is called by Fabric during the mod's initialization phase.
     * It delegates the registration and setup of items and item groups to
     * {@link ModItems#initialize()}.
     * </p>
     */
    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}