package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * Registers all language providers for the Pear Expansion mod.
 * <p>
 * This class adds each language provider to the Fabric data generator pack,
 * enabling the generation of language files for multiple languages.
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
 * @version 0.2
 */
public class PearExpansionLangProvider {

    /**
     * Adds all language providers to the given data generator pack.
     * <p>
     * This method registers each language provider, so that language files
     * for all supported languages are generated during the data generation process.
     * </p>
     *
     * @param pack The Fabric data generator pack to which language providers are added.
     */
    public static void addLangProviders(FabricDataGenerator.Pack pack) {
        pack.addProvider(PearExpansionEnglishLangProvider::new); // en_us

        pack.addProvider(PearExpansionEsperantoLangProvider::new); // eo_uy

        pack.addProvider(PearExpansionFrenchLangProvider::new); // fr_fr

        pack.addProvider(PearExpansionGermanLangProvider::new); // de_de

        pack.addProvider(PearExpansionItalianLangProvider::new); // it_it

        pack.addProvider(PearExpansionSpanishLangProvider::new); // es_es

        pack.addProvider(PearExpansionTokiPonaLangProvider::new); // tok
    }
}