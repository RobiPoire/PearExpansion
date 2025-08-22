package net.pearadise.pearexpansion.client

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.pearadise.pearexpansion.client.datagen.*

/**
 * Main data generator entry point for the Pear Expansion mod.
 *
 * Registers all data providers needed for generating mod assets such as
 * loot tables, models, tags, recipes, and language files.
 */
object PearExpansionDataGenerator : DataGeneratorEntrypoint {

    /**
     * Called by Fabric to initialize the data generator.
     *
     * @param fabricDataGenerator The Fabric data generator instance.
     */
    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        // Create a new data pack for generated resources
        val pack = fabricDataGenerator.createPack()

        // Register block loot table provider
        pack.addProvider(::ModBlockLootTableProvider)
        // Register model provider for block and item models
        pack.addProvider(::ModModelProvider)
        // Register item tag provider
        pack.addProvider(::ModItemTagProvider)
        // Register block tag provider
        pack.addProvider(::ModBlockTagProvider)
        // Register recipe provider
        pack.addProvider(::ModRecipeProvider)

        // Register language providers for localization
        ModLangProvider.addLangProviders(pack)
    }
}