package net.pearadise.pearexpansion.client.datagen.langprovider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides Esperanto language translations for the Pear Expansion mod.
 *
 * <p>
 * Generates the {@code eo_uy} language file for the mod, adding translations for
 * item group names and all custom items and blocks. Integrates with the Fabric
 * data generation system to automate language file creation.
 * </p>
 *
 * @author RobiPoire
 * @see FabricLanguageProvider
 * @see ModLangProvider
 */
public class EsperantoLangProvider extends FabricLanguageProvider {

    /**
     * Constructs a new Esperanto language provider for Pear Expansion.
     *
     * <p>
     * Sets up the provider to output {@code eo_uy} translations during data generation.
     * </p>
     *
     * @param dataOutput     the output destination for generated language data (must not be null)
     * @param registryLookup a future providing access to the registry lookup (must not be null)
     */
    protected EsperantoLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "eo_uy", registryLookup);
    }

    /**
     * Generates Esperanto translations for all custom items and blocks.
     *
     * <p>
     * Adds translation entries for the item group and all custom pear items and vertical slab blocks.
     * Called automatically by the Fabric data generator during the data generation phase.
     * </p>
     *
     * @param wrapperLookup      the registry lookup used for translation (provided by Fabric)
     * @param translationBuilder the builder used to add translation entries (must not be null)
     */
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Add translation for the custom item group
        translationBuilder.add("itemGroup.pear_expansion", "Pear Expansion");

        // Add translations for custom pear items
        translationBuilder.add(ModItems.PEAR, "Piro");
        translationBuilder.add(ModItems.GOLDEN_PEAR, "Ora Piro");
        translationBuilder.add(ModItems.ENCHANTED_GOLDEN_PEAR, "Sorĉita Ora Piro");

        // Add translations for all custom vertical slab blocks and their item forms
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB, "Vertikala Akacia ŝtupo");
        translationBuilder.add(ModBlocks.ACACIA_VERTICAL_SLAB.asItem(), "Vertikala Akacia ŝtupo");

        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB, "Vertikala Andezita ŝtupo");
        translationBuilder.add(ModBlocks.ANDESITE_VERTICAL_SLAB.asItem(), "Vertikala Andezita ŝtupo");

        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB, "Vertikala Bambumozaika ŝtupo");
        translationBuilder.add(ModBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.asItem(), "Vertikala Bambumozaika ŝtupo");

        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB, "Vertikala Bambua ŝtupo");
        translationBuilder.add(ModBlocks.BAMBOO_VERTICAL_SLAB.asItem(), "Vertikala Bambua ŝtupo");

        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB, "Vertikala Betula ŝtupo");
        translationBuilder.add(ModBlocks.BIRCH_VERTICAL_SLAB.asItem(), "Vertikala Betula ŝtupo");

        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "Vertikala Nigroŝtona ŝtupo");
        translationBuilder.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB.asItem(), "Vertikala Nigroŝtona ŝtupo");

        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB, "Vertikala Brika ŝtupo");
        translationBuilder.add(ModBlocks.BRICK_VERTICAL_SLAB.asItem(), "Vertikala Brika ŝtupo");

        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB, "Vertikala Sakura ŝtupo");
        translationBuilder.add(ModBlocks.CHERRY_VERTICAL_SLAB.asItem(), "Vertikala Sakura ŝtupo");

        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "Vertikala Pavimardeza ŝtupo");
        translationBuilder.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Vertikala Pavimardeza ŝtupo");

        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "Vertikala Pavimŝtona ŝtupo");
        translationBuilder.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB.asItem(), "Vertikala Pavimŝtona ŝtupo");

        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB, "Vertikala Skarlata ŝtupo");
        translationBuilder.add(ModBlocks.CRIMSON_VERTICAL_SLAB.asItem(), "Vertikala Skarlata ŝtupo");

        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "Vertikala Tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "Vertikala Tranĉita ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Tranĉita ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "Vertikala Tranĉita sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Tranĉita sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB, "Vertikala Malhelkverka ŝtupo");
        translationBuilder.add(ModBlocks.DARK_OAK_VERTICAL_SLAB.asItem(), "Vertikala Malhelkverka ŝtupo");

        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "Vertikala Malhelprismarina ŝtupo");
        translationBuilder.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB.asItem(), "Vertikala Malhelprismarina ŝtupo");

        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "Vertikala Ardezbrika ŝtupo");
        translationBuilder.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Ardezbrika ŝtupo");

        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "Vertikala Ardeza briketa ŝtupo");
        translationBuilder.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.asItem(), "Vertikala Ardeza briketa ŝtupo");

        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB, "Vertikala Diorita ŝtupo");
        translationBuilder.add(ModBlocks.DIORITE_VERTICAL_SLAB.asItem(), "Vertikala Diorita ŝtupo");

        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "Vertikala Endŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Endŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Verdigreta tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Verdigreta tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB, "Vertikala Granita ŝtupo");
        translationBuilder.add(ModBlocks.GRANITE_VERTICAL_SLAB.asItem(), "Vertikala Granita ŝtupo");

        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB, "Vertikala Ĝangalarba ŝtupo");
        translationBuilder.add(ModBlocks.JUNGLE_VERTICAL_SLAB.asItem(), "Vertikala Ĝangalarba ŝtupo");

        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB, "Vertikala Mangla ŝtupo");
        translationBuilder.add(ModBlocks.MANGROVE_VERTICAL_SLAB.asItem(), "Vertikala Mangla ŝtupo");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "Vertikala Muska pavimŝtona ŝtupo");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.asItem(), "Vertikala Muska pavimŝtona ŝtupo");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "Vertikala Muska ŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Muska ŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB, "Vertikala Fangobrika ŝtupo");
        translationBuilder.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Fangobrika ŝtupo");

        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "Vertikala Netherbrika ŝtupo");
        translationBuilder.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Netherbrika ŝtupo");

        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB, "Vertikala Kverka ŝtupo");
        translationBuilder.add(ModBlocks.OAK_VERTICAL_SLAB.asItem(), "Vertikala Kverka ŝtupo");

        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Verdigrega tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Verdigrega tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB, "Vertikala Helkverka ŝtupo");
        translationBuilder.add(ModBlocks.PALE_OAK_VERTICAL_SLAB.asItem(), "Vertikala Helkverka ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "Vertikala Polurita andezita ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.asItem(), "Vertikala Polurita andezita ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "Vertikala Polurita nigroŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Polurita nigroŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "Vertikala Polurita nigroŝtona ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.asItem(), "Vertikala Polurita nigroŝtona ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "Vertikala Polurita ardeza ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.asItem(), "Vertikala Polurita ardeza ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "Vertikala Polurita diorita ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB.asItem(), "Vertikala Polurita diorita ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "Vertikala Polurita granita ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB.asItem(), "Vertikala Polurita granita ŝtupo");

        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB, "Vertikala Polurita tofa ŝtupo");
        translationBuilder.add(ModBlocks.POLISHED_TUFF_VERTICAL_SLAB.asItem(), "Vertikala Polurita tofa ŝtupo");

        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "Vertikala Prismarinbrika ŝtupo");
        translationBuilder.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Prismarinbrika ŝtupo");

        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB, "Vertikala Prismarina ŝtupo");
        translationBuilder.add(ModBlocks.PRISMARINE_VERTICAL_SLAB.asItem(), "Vertikala Prismarina ŝtupo");

        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB, "Vertikala Purpura ŝtupo");
        translationBuilder.add(ModBlocks.PURPUR_VERTICAL_SLAB.asItem(), "Vertikala Purpura ŝtupo");

        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB, "Vertikala Kvarca ŝtupo");
        translationBuilder.add(ModBlocks.QUARTZ_VERTICAL_SLAB.asItem(), "Vertikala Kvarca ŝtupo");

        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "Vertikala Ruĝa Netherbrika ŝtupo");
        translationBuilder.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Ruĝa Netherbrika ŝtupo");

        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB, "Vertikala Ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB, "Vertikala Rezinbrika ŝtupo");
        translationBuilder.add(ModBlocks.RESIN_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Rezinbrika ŝtupo");

        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB, "Vertikala Sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "Vertikala Glata kvarca ŝtupo");
        translationBuilder.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.asItem(), "Vertikala Glata kvarca ŝtupo");

        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "Vertikala Glata ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Glata ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB, "Vertikala Glata sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.asItem(), "Vertikala Glata sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "Vertikala Glata ŝtona ŝtupo");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB.asItem(), "Vertikala Glata ŝtona ŝtupo");

        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB, "Vertikala Picea ŝtupo");
        translationBuilder.add(ModBlocks.SPRUCE_VERTICAL_SLAB.asItem(), "Vertikala Picea ŝtupo");

        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "Vertikala Ŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Ŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB, "Vertikala Ŝtona ŝtupo");
        translationBuilder.add(ModBlocks.STONE_VERTICAL_SLAB.asItem(), "Vertikala Ŝtona ŝtupo");

        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB, "Vertikala Tofbrika ŝtupo");
        translationBuilder.add(ModBlocks.TUFF_BRICK_VERTICAL_SLAB.asItem(), "Vertikala Tofbrika ŝtupo");

        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB, "Vertikala Tofa ŝtupo");
        translationBuilder.add(ModBlocks.TUFF_VERTICAL_SLAB.asItem(), "Vertikala Tofa ŝtupo");

        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB, "Vertikala Torda ŝtupo");
        translationBuilder.add(ModBlocks.WARPED_VERTICAL_SLAB.asItem(), "Vertikala Torda ŝtupo");

        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Vaksita tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Vaksita tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Vaksita verdigreta tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Vaksita verdigreta tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Vaksita verdigrega tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Vaksita verdigrega tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Vaksita verdigra tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Vaksita verdigra tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "Vertikala Verdigra tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.asItem(), "Vertikala Verdigra tranĉita kupra ŝtupo");

    }
}