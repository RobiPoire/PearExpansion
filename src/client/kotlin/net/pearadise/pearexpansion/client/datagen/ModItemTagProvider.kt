package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.ItemTags
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
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
     * Creates a [TagKey] for an item tag with the given ID.
     *
     * @param id The tag ID.
     * @return The [TagKey] for the item tag.
     */
    @Suppress("unused")
    private fun of(id: String): TagKey<Item> = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, id))

    /**
     * Configures and adds items to vanilla tags.
     *
     * Registers pears as horse food, piglin loved, and horse tempt items.
     *
     * @param registries The registry lookup.
     */
    override fun configure(registries: RegistryWrapper.WrapperLookup) {
        // Add pears to horse food tag
        valueLookupBuilder(ItemTags.HORSE_FOOD)
            .add(ModItems.PEAR, ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)

        // Add golden pears to piglin loved tag
        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
            .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)

        // Add golden pears to horse tempt items tag
        valueLookupBuilder(ItemTags.HORSE_TEMPT_ITEMS)
            .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR)
    }
}