package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides English language translations for the Pear Expansion mod.
 * <p>
 * This class generates the en_us language file, adding translations for
 * item group names and custom items introduced by the mod. It extends
 * FabricLanguageProvider to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionEnglishLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new PearExpansionEnglishLangProvider.
     *
     * @param dataOutput     The output destination for generated language data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    /**
     * Generates English translations for the mod.
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

        translationBuilder.add(ModItems.PEAR, "Pear");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Golden Pear");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Enchanted Golden Pear");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Dalle de chêne verticale");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Dalle d’épicéa verticale");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Dalle de bouleau verticale");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Dalle d’acajou tropical verticale");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Dalle d’acacia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Dalle de chêne noir verticale");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Dalle de palétuvier verticale");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Dalle de cerisier verticale");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Dalle de chêne verticale");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Dalle d’épicéa verticale");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Dalle de bouleau verticale");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Dalle d’acajou tropical verticale");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Dalle d’acacia verticale");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Dalle de chêne noir verticale");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Dalle de palétuvier verticale");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Dalle de cerisier verticale");

    }

}