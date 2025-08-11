package net.pearadise.pearexpansion;

import net.fabricmc.api.ModInitializer;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;
import net.pearadise.pearexpansion.registry.FlammableBlocks;
import net.pearadise.pearexpansion.registry.FuelItems;
import net.pearadise.pearexpansion.registry.OxidizableBlocks;
import net.pearadise.pearexpansion.registry.WaxableBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the Pear Expansion mod.
 *
 * <p>
 * This class is loaded by the Fabric mod loader and is responsible for initializing
 * the core features of the Pear Expansion mod. Use this class to register item groups,
 * items, blocks, and other mod components during the mod's startup phase.
 * </p>
 *
 * @author RobiPoire
 * @see net.fabricmc.api.ModInitializer
 */
public class PearExpansion implements ModInitializer {

    /**
     * The mod identifier used for registration and logging.
     *
     * <p>
     * This string is used as the namespace for all resources and registry entries
     * belonging to the Pear Expansion mod.
     * </p>
     */
    public static final String MOD_ID = "pear_expansion";

    /**
     * SLF4J logger for the Pear Expansion mod.
     *
     * <p>
     * Use this logger to output informational, warning, and error messages
     * to the log during mod initialization and runtime.
     * </p>
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Initializes the Pear Expansion mod.
     *
     * <p>
     * Called by the Fabric loader during the mod's initialization phase.
     * Use this method to register item groups, items, blocks, and other
     * mod components. This method runs on the main server thread.
     * </p>
     */
    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
        OxidizableBlocks.registerOxidizableBlocks();
        WaxableBlocks.registerWaxableBlocks();
        FlammableBlocks.registerFlammableBlocks();
        FuelItems.registerFuelItems();
    }
}