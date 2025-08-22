package net.pearadise.pearexpansion

import net.fabricmc.api.ModInitializer
import net.pearadise.pearexpansion.block.ModBlocks
import net.pearadise.pearexpansion.entity.effect.ModStatusEffects
import net.pearadise.pearexpansion.item.ModItemGroups
import net.pearadise.pearexpansion.item.ModItems
import net.pearadise.pearexpansion.registry.FlammableBlocks
import net.pearadise.pearexpansion.registry.FuelItems
import net.pearadise.pearexpansion.registry.WeatheringBlocks
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * The mod ID for Pear Expansion.
 */
const val MOD_ID = "pear_expansion"

/**
 * Logger for Pear Expansion mod messages.
 */
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

/**
 * Main entry point for the Pear Expansion mod.
 *
 * Handles registration of items, blocks, item groups, and custom block behaviors.
 */
object PearExpansion : ModInitializer {
    /**
     * Called by Fabric to initialize the mod.
     *
     * Registers items, blocks, item groups, and custom block behaviors.
     */
    override fun onInitialize() {
        // Register mod items
        ModItems.initialize()
        // Register mod blocks
        ModBlocks.initialize()
        // Register item groups for creative inventory
        ModItemGroups.initialize()
        // Register blocks with weathering behavior
        WeatheringBlocks.registerWeatheringBlocks()
        // Register flammable blocks
        FlammableBlocks.registerFlammableBlocks()
        // Register items that can be used as fuel
        FuelItems.registerFuelItems()
        // Register custom effects
        ModStatusEffects.initialize()
        // Log mod initialization
        LOGGER.info("Pear Expansion initialisé")
    }
}