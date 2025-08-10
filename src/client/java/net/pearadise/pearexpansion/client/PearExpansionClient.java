package net.pearadise.pearexpansion.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * Initializes client-side features for the Pear Expansion mod.
 *
 * <p>
 * This class is called by Fabric when the Minecraft client starts. Use this class to register
 * client-only logic, such as renderers, key bindings, or client event handlers. It is not called on the server.
 * </p>
 *
 * @author RobiPoire
 * @see net.fabricmc.api.ClientModInitializer
 */
public class PearExpansionClient implements ClientModInitializer {

    /**
     * Initializes client-specific logic for the Pear Expansion mod.
     *
     * <p>
     * Called by Fabric during the client initialization phase. Add all client-side setup code in this method.
     * This method runs on the client thread.
     * </p>
     */
    @Override
    public void onInitializeClient() {
        // Add client-side initialization logic here (e.g., renderers, key bindings).
    }
}