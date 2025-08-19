package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.pearadise.pearexpansion.client.datagen.ModLangProvider.addLangProviders
import net.pearadise.pearexpansion.client.datagen.language.*

/**
 * Registers all language providers for the Pear Expansion mod.
 *
 * Use [addLangProviders] during data generation setup to add all supported language file providers.
 */
object ModLangProvider {

    /**
     * Adds all language providers to the given Fabric data generator pack.
     *
     * Registers providers for each supported language.
     *
     * @param pack The Fabric data generator pack to register providers in.
     */
    fun addLangProviders(pack: FabricDataGenerator.Pack) {
        // English (en_us)
        pack.addProvider(::EnUsLangProvider)

        // Esperanto (eo_uy)
        pack.addProvider(::EoUyLangProvider)

        // French (fr_fr)
        pack.addProvider(::FrFrLangProvider)

        // German (de_de)
        pack.addProvider(::DeDeLangProvider)

        // Italian (it_it)
        pack.addProvider(::ItItLangProvider)

        // Spanish (es_es)
        pack.addProvider(::EsEsLangProvider)

        // Toki Pona (tok)
        pack.addProvider(::TokLangProvider)
    }
}