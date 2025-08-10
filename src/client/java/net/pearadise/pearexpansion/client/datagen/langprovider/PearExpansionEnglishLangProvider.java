package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.block.Block;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * English language provider for the Pear Expansion mod.
 * Auto-generates display names for the mod's slabs by taking the registry path
 * and making it human-friendly (e.g. "vertical_acacia_slab" -> "Vertical Acacia Slab").
 */
public class PearExpansionEnglishLangProvider extends FabricLanguageProvider {

    public PearExpansionEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        Objects.requireNonNull(translationBuilder, "translationBuilder must not be null");

        // Item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Explicit non-block items
        translationBuilder.add(ModItems.PEAR, "Pear");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Golden Pear");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Enchanted Golden Pear");

        // Auto-generate translations ONLY for the slabs (dalles)
        // We use the consolidated list from ModBlocks (ALL_BLOCKS) which contains exactly
        // the vertical slab blocks. If you prefer not to expose ALL_BLOCKS, replace this
        // loop with a registry scan (see note below).
        for (Block slab : ModBlocks.ALL_BLOCKS) {
            if (slab == null) continue;

            Identifier id = Registries.BLOCK.getId(slab);

            String path = id.getPath();
            // Ensure we only handle "slab" entries (safety check)
            if (!path.contains("slab")) continue;

            String pretty = prettyNameFromPath(path);

            // Add both block and item translations for consistency
            translationBuilder.add(slab, pretty);
            translationBuilder.add(slab.asItem(), pretty);
        }
    }

    @Override
    public String getName() {
        return "Pear Expansion English Lang Provider (improved)";
    }

    /**
     * Convert a registry path into a human friendly title.
     * e.g. "vertical_acacia_slab" -> "Vertical Acacia Slab"
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
