package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * Registers all language providers for the Pear Expansion mod.
 *
 * <p>
 * This class adds each language provider to the Fabric data generator pack,
 * enabling the generation of language files for multiple languages.
 * Call {@link #addLangProviders(FabricDataGenerator.Pack)} during data generation setup.
 * </p>
 *
 * <p>
 * Supported languages:
 * <ul>
 *     <li>English (en_us)</li>
 *     <li>Esperanto (eo_uy)</li>
 *     <li>French (fr_fr)</li>
 *     <li>German (de_de)</li>
 *     <li>Italian (it_it)</li>
 *     <li>Spanish (es_es)</li>
 *     <li>Toki Pona (tok)</li>
 * </ul>
 * </p>
 *
 * @author RobiPoire
 * @see FabricDataGenerator.Pack
 * @see PearExpansionEnglishLangProvider
 * @see PearExpansionEsperantoLangProvider
 * @see PearExpansionFrenchLangProvider
 * @see PearExpansionGermanLangProvider
 * @see PearExpansionItalianLangProvider
 * @see PearExpansionSpanishLangProvider
 * @see PearExpansionTokiPonaLangProvider
 */
public class PearExpansionLangProvider {

    /**
     * Adds all language providers to the given data generator pack.
     *
     * <p>
     * Registers each language provider so that language files for all supported
     * languages are generated during the data generation process.
     * </p>
     *
     * @param pack the Fabric data generator pack to which language providers are added
     */
    public static void addLangProviders(FabricDataGenerator.Pack pack) {
        // Register English language provider (en_us)
        pack.addProvider(PearExpansionEnglishLangProvider::new);

        // Register Esperanto language provider (eo_uy)
        pack.addProvider(PearExpansionEsperantoLangProvider::new);

        // Register French language provider (fr_fr)
        pack.addProvider(PearExpansionFrenchLangProvider::new);

        // Register German language provider (de_de)
        pack.addProvider(PearExpansionGermanLangProvider::new);

        // Register Italian language provider (it_it)
        pack.addProvider(PearExpansionItalianLangProvider::new);

        // Register Spanish language provider (es_es)
        pack.addProvider(PearExpansionSpanishLangProvider::new);

        // Register Toki Pona language provider (tok)
        pack.addProvider(PearExpansionTokiPonaLangProvider::new);
    }
}