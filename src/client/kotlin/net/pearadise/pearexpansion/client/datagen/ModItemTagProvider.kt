package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.ItemTags
import net.pearadise.pearexpansion.item.ModItems
import java.util.concurrent.CompletableFuture

/**
 * Provides and generates item tags for the Pear Expansion mod.
 *
 * Adds custom items to vanilla tags like horse food, piglin loved, and horse tempt items.
 *
 * @constructor Creates a new item tag provider.
 * @param output The data output for generated files.
 * @param registriesFuture Future for registry lookup.
 */
class ModItemTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricTagProvider.ItemTagProvider(output, registriesFuture) {

    /**
     * Configures and adds items to vanilla tags.
     *
     * Registers pears as horse food, piglin loved, and horse tempt items.
     *
     * @param registries The registry lookup.
     */
    override fun configure(registries: RegistryWrapper.WrapperLookup) {
        // Pears as horse food
        valueLookupBuilder(ItemTags.HORSE_FOOD)
            .add(ModItems.PEAR, ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)

        // Golden pears are piglin loved
        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
            .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)

        // Golden pears are horse tempt items
        valueLookupBuilder(ItemTags.HORSE_TEMPT_ITEMS)
            .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)
    }
}
