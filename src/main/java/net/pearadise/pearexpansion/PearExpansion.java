package net.pearadise.pearexpansion;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Pear Expansion mod.
 * <p>
 * This class implements the {@link ModInitializer} interface and is called by the Fabric loader
 * when the mod is initialized. It is responsible for setting up the mod's core features,
 * such as registering item groups, items, and loot table modifiers.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansion implements ModInitializer {

    /**
     * The mod identifier used for registration and logging.
     */
    public static final String MOD_ID = "pear_expansion";

    /**
     * SLF4J logger for the Pear Expansion mod.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Called by the Fabric loader to initialize the mod.
     * <p>
     * Use this method to register item groups, items, and loot table modifiers.
     * </p>
     */
    @Override
    public void onInitialize() {
    }
}