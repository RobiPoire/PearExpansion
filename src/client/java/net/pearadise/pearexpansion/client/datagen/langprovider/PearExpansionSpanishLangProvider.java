package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Spanish language translations for the Pear Expansion mod.
 * <p>
 * This class generates the es_es language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionSpanishLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionSpanishLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionSpanishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "es_es", registryLookup);
    }

    /**
     * Generates Spanish translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "Pera");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Pera Dorada");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorada Encantada");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Losa de roble vertical");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Losa de abeto vertical");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Losa de abedul vertical");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Losa de madera de jungla vertical");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Losa de acacia vertical");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Losa de roble oscuro vertical");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Losa de mangle vertical");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Losa de cerezo vertical");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Losa de roble vertical");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Losa de abeto vertical");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Losa de abedul vertical");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Losa de madera de jungla vertical");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Losa de acacia vertical");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Losa de roble oscuro vertical");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Losa de mangle vertical");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Losa de cerezo vertical");

    }

}