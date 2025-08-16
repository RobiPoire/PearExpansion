package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of("pear_expansion", id));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        valueLookupBuilder(ItemTags.HORSE_FOOD)
                .add(ModItems.PEAR, ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR);

        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR);

        valueLookupBuilder(ItemTags.HORSE_TEMPT_ITEMS)
                .add(ModItems.GOLDEN_PEAR, ModItems.ENCHANTED_GOLDEN_PEAR);

    }
}