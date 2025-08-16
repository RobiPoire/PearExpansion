package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.item.ModItems;
import net.pearadise.pearexpansion.util.ModContentLists;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.pearadise.pearexpansion.util.ModContentLists.VERTICAL_TO_BASE_BLOCK;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<net.minecraft.registry.RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(net.minecraft.registry.RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {

            public CraftingRecipeJsonBuilder createVerticalSlabRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
                return this.createShaped(category, output, 6).input('#', input).pattern("#").pattern("#").pattern("#");
            }

            @Override
            public void generate() {

                this.createShaped(RecipeCategory.FOOD, ModItems.GOLDEN_PEAR)
                        .input('#', Items.GOLD_INGOT)
                        .input('X', ModItems.PEAR)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .criterion("has_gold_ingot", this.conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(this.exporter);

                generateVerticalSlabsRecipe();

            }

            private void generateVerticalSlabsRecipe() {
                for (Map.Entry<Block, Block> verticalToBaseBlock : VERTICAL_TO_BASE_BLOCK.entrySet()) {
                    Block verticalSlab = verticalToBaseBlock.getKey();
                    Block baseBlock = verticalToBaseBlock.getValue();

                    Identifier baseId = Registries.BLOCK.getId(verticalSlab);

                    Identifier craftingId = Identifier.of(baseId.getNamespace(), baseId.getPath() + "_crafting");
                    createVerticalSlabRecipe(RecipeCategory.BUILDING_BLOCKS, verticalSlab.asItem(), Ingredient.ofItem(baseBlock.asItem()))
                            .criterion(hasItem(baseBlock.asItem()), conditionsFromItem(baseBlock.asItem()))
                            .offerTo(exporter, String.valueOf(craftingId));

                    if (ModContentLists.PICKAXE_MINEABLE_BLOCKS.contains(verticalSlab)) {
                        Identifier stonecutId = Identifier.of(baseId.getNamespace(), baseId.getPath() + "_stonecutting");
                        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(baseBlock.asItem()), RecipeCategory.BUILDING_BLOCKS, verticalSlab.asItem(), 2)
                                .criterion(hasItem(baseBlock.asItem()), conditionsFromItem(baseBlock.asItem()))
                                .offerTo(exporter, String.valueOf(stonecutId));
                    }
                }
            }
        };
    }

    @Override
    public String getName() {
        return "Pear Expansion Recipe Provider";
    }
}
