package net.pearadise.pearexpansion;

import net.fabricmc.api.ModInitializer;
import net.pearadise.pearexpansion.item.ModItemGroups;
import net.pearadise.pearexpansion.item.ModItems;
import net.pearadise.pearexpansion.loot.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PearExpansion implements ModInitializer {


    /**
     * The mod identifier used for registration and logging.
     */
    public static final String MOD_ID = "pearexpansion";

    /**
     * SLF4J logger for the mod.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Called by the Fabric loader to initialize the mod.
     * <p>
     * Registers item groups, items, and loot table modifiers.
     * </p>
     */
    @Override
    public void onInitialize() {
        ModItemGroups.init();
        LOGGER.info("Initialized item groups");

        ModItems.init();
        LOGGER.info("Registered mod items");

        ModLootTableModifiers.init();
        LOGGER.info("Injected pear loot tables");
    }
}

