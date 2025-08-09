package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides German language translations for the Pear Expansion mod.
 * <p>
 * This class generates the de_de language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionGermanLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionGermanLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionGermanLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    /**
     * Generates German translations for the mod.
     * <p>
     * Adds translation entries for the item group and all custom pear items.
     * This method is called during data generation.
     * </p>
     *
     * @param wrapperLookup      The registry lookup used for translation.
     * @param translationBuilder The builder used to add translation entries.
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        translationBuilder.add(ModItems.PEAR, "Birne");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Goldene Birne");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Verzauberte Goldene Birne");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikale Eichenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikale Fichtenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikale Birkenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikale Tropenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikale Akazienstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikale Schwarzeichenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikale Mangrovenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikale Kirschholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikale Eichenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikale Fichtenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikale Birkenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikale Tropenholzstufe");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikale Akazienstufe");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikale Schwarzeichenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikale Mangrovenstufe");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikale Kirschholzstufe");


    }

}