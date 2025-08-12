package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.PearExpansion;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<net.minecraft.registry.RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(net.minecraft.registry.RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                // ---- SHAPED recipes (explicit RegistryKey to avoid collision with stonecutting)
                for (VerticalSlabBlockEnum slabEnum : VerticalSlabBlockEnum.values()) {
                    Item slabItem = slabEnum.getBlock().asItem();
                    Item baseItem = slabEnum.getTextureSourceBlock().asItem();

                    // Crée un RegistryKey<Recipe<?>> explicite => path: recipes/crafting/<name>.json
                    Identifier craftingId = Identifier.of(PearExpansion.MOD_ID, "crafting/" + slabEnum.getRegistryName());
                    RegistryKey<net.minecraft.recipe.Recipe<?>> recipeKey =
                            RegistryKey.of(RegistryKeys.RECIPE, craftingId);

                    createShaped(RecipeCategory.BUILDING_BLOCKS, slabItem, 6)
                            .pattern("x")
                            .pattern("x")
                            .pattern("x")
                            .input('x', baseItem)
                            .criterion(hasItem(baseItem), conditionsFromItem(baseItem))
                            .offerTo(exporter, recipeKey); // <-- use RegistryKey here
                }

                // ---- STONECUTTER recipes (default offerTo(exporter) - produces recipe id based on result)
                for (VerticalSlabBlockEnum slabEnum : VerticalSlabBlockEnum.allPickaxable()) {
                    Item slabItem = slabEnum.getBlock().asItem();
                    Item baseItem = slabEnum.getTextureSourceBlock().asItem();

                    StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseItem), RecipeCategory.BUILDING_BLOCKS, slabItem, 2)
                            .criterion(hasItem(baseItem), conditionsFromItem(baseItem))
                            .offerTo(exporter); // default id, won't collide with the explicit crafting/<name>
                }
            }
        };
    }

    @Override
    public String getName() {
        return "Pear Expansion Recipe Provider";
    }
}
