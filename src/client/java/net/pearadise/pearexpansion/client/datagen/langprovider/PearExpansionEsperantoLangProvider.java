package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Esperanto language translations for the Pear Expansion mod.
 * <p>
 * This class generates the eo_uy language file, adding translations for
 * item group names and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionEsperantoLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionEsperantoLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionEsperantoLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "eo_uy", registryLookup);
    }

    /**
     * Generates Esperanto translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "Piro");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Ora Piro");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Sorĉita Ora Piro");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikala kverka duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikala picea duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikala betula duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikala ĝangala ligno duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikala akacia duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikala malhela kverka duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikala mangrova duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikala ĉeriza duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikala kverka duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikala picea duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikala betula duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikala ĝangala ligno duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikala akacia duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikala malhela kverka duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikala mangrova duonsloko");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikala ĉeriza duonsloko");


    }
}