package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.util.ModContentLists
import java.util.concurrent.CompletableFuture

/**
 * Provides English (`en_us`) language translations for the Pear Expansion mod.
 *
 * Generates translation entries for all custom items, blocks, and the item group.
 * Integrates with Fabric data generation to automate language file creation.
 *
 * @constructor Creates a new English language provider.
 * @param dataOutput The data output for generated files.
 * @param registryLookup Future for registry lookup.
 */
class EnUsLangProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricLanguageProvider(dataOutput, "en_us", registryLookup) {

    /**
     * Converts a registry path to a readable name.
     *
     * Example: "golden_pear" -> "Golden Pear"
     *
     * @param path The registry path string.
     * @return The formatted name, or an empty string if the path is null or empty.
     */
    private fun prettyNameFromPath(path: String?): String {
        if (path.isNullOrEmpty()) return ""
        return path.split("_").joinToString(" ") { part ->
            part.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
        }
    }

    /**
     * Generates English translations for all custom items and blocks.
     *
     * Adds translations for the item group, all blocks (and their item forms), and all items.
     *
     * @param wrapperLookup The registry lookup.
     * @param translationBuilder The builder for adding translations.
     */
    override fun generateTranslations(
        wrapperLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion")

        // Add translations for all blocks and their item forms
        for (block in ModContentLists.ALL_BLOCKS) {
            val id: Identifier = Registries.BLOCK.getId(block)
            val pretty = prettyNameFromPath(id.path)

            translationBuilder.add(block, pretty)
            translationBuilder.add(block.asItem(), pretty)
        }

        // Add translations for all items
        for (item in ModContentLists.ALL_ITEMS) {
            val id: Identifier = Registries.ITEM.getId(item)
            val pretty = prettyNameFromPath(id.path)

            translationBuilder.add(item, pretty)
        }
    }

    /**
     * Returns the name of this language provider for logging and display.
     *
     * @return The provider name.
     */
    override fun getName(): String = "Pear Expansion English Lang Provider"
}