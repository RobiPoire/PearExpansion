package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Italian language translations for the Pear Expansion mod.
 * <p>
 * This class generates the it_it language file, adding translations for
 * the item group and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionItalianLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionItalianLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionItalianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    /**
     * Generates Italian translations for the mod.
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
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Pera Dorata");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Pera Dorata Incantata");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Lastra di quercia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Lastra di abete verticale");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Lastra di betulla verticale");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Lastra di legno della giungla verticale");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Lastra di acacia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Lastra di quercia scura verticale");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Lastra di mangrovia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Lastra di ciliegio verticale");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Lastra di quercia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Lastra di abete verticale");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Lastra di betulla verticale");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Lastra di legno della giungla verticale");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Lastra di acacia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Lastra di quercia scura verticale");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Lastra di mangrovia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Lastra di ciliegio verticale");

    }

}