package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder
import net.minecraft.data.recipe.RecipeExporter
import net.minecraft.data.recipe.RecipeGenerator
import net.minecraft.data.recipe.StonecuttingRecipeJsonBuilder
import net.minecraft.item.ItemConvertible
import net.minecraft.item.Items
import net.minecraft.recipe.Ingredient
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.item.ModItems
import net.pearadise.pearexpansion.util.ModContentLists
import java.util.concurrent.CompletableFuture

/**
 * Provides and generates custom recipes for the mod's data pack.
 *
 * Handles shaped crafting and stonecutting recipes for custom items and blocks.
 *
 * @constructor Creates a new recipe provider.
 * @param output The data output for generated files.
 * @param registriesFuture Future for registry lookup.
 */
class ModRecipeProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricRecipeProvider(output, registriesFuture) {

    /**
     * Returns a custom [RecipeGenerator] for this mod.
     *
     * @param registryLookup The registry lookup.
     * @param exporter The recipe exporter.
     * @return The [RecipeGenerator] instance.
     */
    override fun getRecipeGenerator(
        registryLookup: RegistryWrapper.WrapperLookup,
        exporter: RecipeExporter
    ): RecipeGenerator {
        return object : RecipeGenerator(registryLookup, exporter) {

            /**
             * Creates a shaped recipe for vertical slabs (6 output).
             *
             * @param category The recipe category.
             * @param output The output item.
             * @param input The input ingredient.
             * @return The [CraftingRecipeJsonBuilder] for the recipe.
             */
            private fun createVerticalSlabRecipe(
                category: RecipeCategory,
                output: ItemConvertible,
                input: Ingredient
            ): CraftingRecipeJsonBuilder =
                createShaped(category, output, 6)
                    .input('#', input)
                    .pattern("#")
                    .pattern("#")
                    .pattern("#")

            /**
             * Generates all custom recipes for the mod.
             */
            override fun generate() {
                // Golden Pear crafting recipe
                createShaped(RecipeCategory.FOOD, ModItems.GOLDEN_PEAR)
                    .input('#', Items.GOLD_INGOT)
                    .input('X', ModItems.PEAR)
                    .pattern("###")
                    .pattern("#X#")
                    .pattern("###")
                    .criterion("has_gold_ingot", conditionsFromItem(Items.GOLD_INGOT))
                    .offerTo(exporter)

                // Vertical slab crafting and stonecutting recipes
                generateVerticalSlabsRecipe()
            }

            /**
             * Generates crafting and stonecutting recipes for all vertical slab blocks.
             */
            private fun generateVerticalSlabsRecipe() {
                ModContentLists.VERTICAL_TO_BASE_BLOCK.forEach { (verticalSlab, baseBlock) ->
                    val baseId = Registries.BLOCK.getId(verticalSlab)
                    val namespace = baseId.namespace
                    val path = baseId.path

                    // Crafting recipe
                    val craftingId = Identifier.of(namespace, "${path}_crafting")
                    createVerticalSlabRecipe(
                        RecipeCategory.BUILDING_BLOCKS,
                        verticalSlab.asItem(),
                        Ingredient.ofItem(baseBlock.asItem())
                    )
                        .criterion(hasItem(baseBlock.asItem()), conditionsFromItem(baseBlock.asItem()))
                        .offerTo(exporter, craftingId.toString())

                    // Stonecutting recipe if slab is pickaxe-mineable
                    if (verticalSlab in ModContentLists.PICKAXE_MINEABLE_BLOCKS) {
                        val stonecutId = Identifier.of(namespace, "${path}_stonecutting")
                        StonecuttingRecipeJsonBuilder.createStonecutting(
                            Ingredient.ofItems(baseBlock.asItem()),
                            RecipeCategory.BUILDING_BLOCKS,
                            verticalSlab.asItem(),
                            2
                        )
                            .criterion(hasItem(baseBlock.asItem()), conditionsFromItem(baseBlock.asItem()))
                            .offerTo(exporter, stonecutId.toString())
                    }
                }
            }
        }
    }

    /**
     * Returns the name of this recipe provider for logging and display.
     *
     * @return The provider name.
     */
    override fun getName(): String = "Pear Expansion Recipe Provider"
}
