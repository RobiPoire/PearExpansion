package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.pearadise.pearexpansion.util.ModContentLists;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ModContentLists.AXE_MINEABLE_BLOCKS.toArray(Block[]::new));

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModContentLists.PICKAXE_MINEABLE_BLOCKS.toArray(Block[]::new));
    }
}
