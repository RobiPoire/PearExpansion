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
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB, "Vertikala Akacia ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_ACACIA_SLAB.asItem(), "Vertikala Akacia ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB, "Vertikala Andezita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asItem(), "Vertikala Andezita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB, "Vertikala Bambumozaika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asItem(), "Vertikala Bambumozaika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB, "Vertikala Bambua ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asItem(), "Vertikala Bambua ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB, "Vertikala Betula ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_BIRCH_SLAB.asItem(), "Vertikala Betula ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB, "Vertikala Nigroŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asItem(), "Vertikala Nigroŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB, "Vertikala Brika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_BRICK_SLAB.asItem(), "Vertikala Brika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB, "Vertikala Sakura ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_CHERRY_SLAB.asItem(), "Vertikala Sakura ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB, "Vertikala Pavimardeza ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asItem(), "Vertikala Pavimardeza ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB, "Vertikala Pavimŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asItem(), "Vertikala Pavimŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB, "Vertikala Skarlata ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asItem(), "Vertikala Skarlata ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB, "Vertikala Tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asItem(), "Vertikala Tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB, "Vertikala Tranĉita ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asItem(), "Vertikala Tranĉita ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB, "Vertikala Tranĉita sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asItem(), "Vertikala Tranĉita sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB, "Vertikala Malhelkverka ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asItem(), "Vertikala Malhelkverka ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB, "Vertikala Malhelprismarina ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asItem(), "Vertikala Malhelprismarina ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB, "Vertikala Ardezbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asItem(), "Vertikala Ardezbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB, "Vertikala Ardeza briketa ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asItem(), "Vertikala Ardeza briketa ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB, "Vertikala Diorita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_DIORITE_SLAB.asItem(), "Vertikala Diorita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB, "Vertikala Endŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_END_STONE_BRICK_SLAB.asItem(), "Vertikala Endŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB, "Vertikala Verdigreta tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikala Verdigreta tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB, "Vertikala Granita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_GRANITE_SLAB.asItem(), "Vertikala Granita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB, "Vertikala Ĝangalarba ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asItem(), "Vertikala Ĝangalarba ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB, "Vertikala Mangla ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asItem(), "Vertikala Mangla ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB, "Vertikala Muska pavimŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asItem(), "Vertikala Muska pavimŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB, "Vertikala Muska ŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asItem(), "Vertikala Muska ŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB, "Vertikala Fangobrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asItem(), "Vertikala Fangobrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB, "Vertikala Netherbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asItem(), "Vertikala Netherbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB, "Vertikala Kverka ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_OAK_SLAB.asItem(), "Vertikala Kverka ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB, "Vertikala Verdigrega tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikala Verdigrega tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB, "Vertikala Helkverka ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_PALE_OAK_SLAB.asItem(), "Vertikala Helkverka ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB, "Vertikala Polurita andezita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asItem(), "Vertikala Polurita andezita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, "Vertikala Polurita nigroŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asItem(), "Vertikala Polurita nigroŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB, "Vertikala Polurita nigroŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asItem(), "Vertikala Polurita nigroŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB, "Vertikala Polurita ardeza ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asItem(), "Vertikala Polurita ardeza ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB, "Vertikala Polurita diorita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asItem(), "Vertikala Polurita diorita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB, "Vertikala Polurita granita ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asItem(), "Vertikala Polurita granita ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB, "Vertikala Polurita tofa ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_POLISHED_TUFF_SLAB.asItem(), "Vertikala Polurita tofa ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB, "Vertikala Prismarinbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asItem(), "Vertikala Prismarinbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB, "Vertikala Prismarina ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asItem(), "Vertikala Prismarina ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB, "Vertikala Purpura ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_PURPUR_SLAB.asItem(), "Vertikala Purpura ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB, "Vertikala Kvarca ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asItem(), "Vertikala Kvarca ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB, "Vertikala Ruĝa Netherbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asItem(), "Vertikala Ruĝa Netherbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB, "Vertikala Ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asItem(), "Vertikala Ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB, "Vertikala Rezinbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_RESIN_BRICK_SLAB.asItem(), "Vertikala Rezinbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB, "Vertikala Sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asItem(), "Vertikala Sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB, "Vertikala Glata kvarca ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asItem(), "Vertikala Glata kvarca ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, "Vertikala Glata ruĝa sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asItem(), "Vertikala Glata ruĝa sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB, "Vertikala Glata sabloŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asItem(), "Vertikala Glata sabloŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB, "Vertikala Glata ŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asItem(), "Vertikala Glata ŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB, "Vertikala Picea ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asItem(), "Vertikala Picea ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB, "Vertikala Ŝtonbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asItem(), "Vertikala Ŝtonbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB, "Vertikala Ŝtona ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_STONE_SLAB.asItem(), "Vertikala Ŝtona ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB, "Vertikala Tofbrika ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_BRICK_SLAB.asItem(), "Vertikala Tofbrika ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB, "Vertikala Tofa ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_TUFF_SLAB.asItem(), "Vertikala Tofa ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB, "Vertikala Torda ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WARPED_SLAB.asItem(), "Vertikala Torda ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB, "Vertikala Vaksita tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asItem(), "Vertikala Vaksita tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB, "Vertikala Vaksita verdigreta tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asItem(), "Vertikala Vaksita verdigreta tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB, "Vertikala Vaksita verdigrega tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem(), "Vertikala Vaksita verdigrega tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB, "Vertikala Vaksita verdigra tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikala Vaksita verdigra tranĉita kupra ŝtupo");

        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB, "Vertikala Verdigra tranĉita kupra ŝtupo");
        translationBuilder.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asItem(), "Vertikala Verdigra tranĉita kupra ŝtupo");

    }
}