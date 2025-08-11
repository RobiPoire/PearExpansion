package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.pearadise.pearexpansion.client.datagen.langprovider.ModLangProvider;

/**
 * Main data generator entry point for the Pear Expansion mod.
 *
 * <p>
 * Registers all data providers needed for generating resources such as loot tables, models, and language files.
 * Called automatically by the Fabric data generation system during the data generation phase.
 * </p>
 *
 * @author RobiPoire
 * @see net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
 * @see ModLangProvider
 */
public class ModDataGenerator implements DataGeneratorEntrypoint {

    /**
     * Initializes the data generator and registers all required data providers.
     *
     * <p>
     * This method creates a new data pack and adds providers for block loot tables,
     * internal models, and language files. It is called by Fabric during the
     * data generation process on the main thread.
     * </p>
     *
     * @param fabricDataGenerator the Fabric data generator instance used to create and manage data packs
     */
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // Create a new data pack for this mod
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // Register the block loot table provider for custom block drops
        pack.addProvider(ModBlockLootTableProvider::new);

        // Register the model provider for block and item models
        pack.addProvider(ModModelProvider::new);

        pack.addProvider(ModTagProvider::new);

        // Register all language providers for supported languages
        ModLangProvider.addLangProviders(pack);
    }

}