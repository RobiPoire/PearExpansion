package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.pearadise.pearexpansion.client.datagen.internal.PearExpansionInternalModelProvider;
import net.pearadise.pearexpansion.client.datagen.langprovider.PearExpansionLangProvider;

/**
 * Main data generator entry point for the Pear Expansion mod.
 * <p>
 * This class registers all data providers needed for generating
 * resources such as loot tables, models, and language files.
 * It is called automatically by the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionDataGenerator implements DataGeneratorEntrypoint {

    /**
     * Initializes the data generator and registers all required data providers.
     * <p>
     * This method creates a new data pack and adds providers for block loot tables,
     * internal models, and language files. It is called by Fabric during the
     * data generation process.
     * </p>
     *
     * @param fabricDataGenerator The Fabric data generator instance used to create and manage data packs.
     */
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // Register the block loot table provider
        pack.addProvider(PearExpansionBlockLootTableProvider::new);

        // Register the internal model provider
        pack.addProvider(PearExpansionInternalModelProvider::new);
        pack.addProvider(PearExpansionModelProvider::new);


        // Register the language providers
        PearExpansionLangProvider.addLangProviders(pack);
    }

}