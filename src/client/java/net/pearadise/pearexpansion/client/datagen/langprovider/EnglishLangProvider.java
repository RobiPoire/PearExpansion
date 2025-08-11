package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * Provides English language translations for the Pear Expansion mod.
 *
 * <p>
 * This class generates the {@code en_us} language file for the mod, adding translations for
 * all custom items and blocks. It integrates with the Fabric data generation system to automate
 * language file creation. All block and item names are generated in a human-readable format.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModBlocks
 * @see ModItems
 */
public class EnglishLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new English language provider for Pear Expansion.
     *
     * <p>
     * Sets up the provider to output {@code en_us} translations during data generation.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data (must not be null)
     * @param registryLookup a future providing access to the registry lookup (must not be null)
     */
    public EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    /**
     * Generates English translations for all custom items and blocks.
     *
     * <p>
     * Adds translation entries for the item group and all mod blocks and items.
     * Block and item names are generated from their registry path in a human-readable format.
     * Called automatically by the Fabric data generator during the data generation phase.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (provided by Fabric)
     * @param translationBuilder the builder used to add translation entries (must not be null)
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        Objects.requireNonNull(translationBuilder, "translationBuilder must not be null");

        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Pear");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Golden Pear");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Enchanted Golden Pear");

        // Add translations for all blocks and their item forms
        for (Block block : ModBlocks.ALL_BLOCKS) {
            if (block == null) continue;

            Identifier id = Registries.BLOCK.getId(block);

            String path = id.getPath();
            String pretty = prettyNameFromPath(path);

            translationBuilder.add(block, pretty);
            translationBuilder.add(block.asItem(), pretty);
        }
    }

    /**
     * Returns the name of this language provider for logging and debugging.
     *
     * @return the provider name as a string
     */
    @Override
    public String getName() {
        return "Pear Expansion English Lang Provider";
    }

    /**
     * Converts a registry path to a human-readable name.
     *
     * <p>
     * Splits the path by underscores and capitalizes each word.
     * For example, {@code "vertical_acacia_slab"} becomes {@code "Vertical Acacia Slab"}.
     * </p>
     *
     * @param path the registry path (must not be null or empty)
     * @return the pretty-printed name, or an empty string if the path is null or empty
     */
    private static String prettyNameFromPath(String path) {
        if (path == null || path.isEmpty()) return "";
        String[] parts = path.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String p = parts[i];
            if (p.isEmpty()) continue;
            sb.append(Character.toUpperCase(p.charAt(0)));
            if (p.length() > 1) sb.append(p.substring(1));
            if (i < parts.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
}