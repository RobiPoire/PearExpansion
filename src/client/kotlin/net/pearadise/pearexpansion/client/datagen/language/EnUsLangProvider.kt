package net.pearadise.pearexpansion.client.datagen.language

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.PearExpansion
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
    private fun prettyNameFromPath(path: String?): String =
        path
            ?.takeIf { it.isNotEmpty() }
            ?.split('_')
            ?.joinToString(" ") { part -> part.replaceFirstChar { c -> c.uppercaseChar() } }
            ?: ""

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
        translationBuilder.apply {
            // Item group
            add("itemGroup.pear_expansion", "Pear Expansion")

            // Blocks and their item forms
            ModContentLists.ALL_BLOCKS.forEach { block ->
                val id: Identifier = Registries.BLOCK.getId(block)
                val pretty = prettyNameFromPath(id.path)
                add(block, pretty)
            }

            // Items
            ModContentLists.ALL_ITEMS.forEach { item ->
                val id: Identifier = Registries.ITEM.getId(item)
                add(item, prettyNameFromPath(id.path))
            }
        }
    }

    /**
     * Returns the name of this language provider for logging and display.
     *
     * @return The provider name.
     */
    override fun getName(): String = "Pear Expansion English Lang Provider"
}
