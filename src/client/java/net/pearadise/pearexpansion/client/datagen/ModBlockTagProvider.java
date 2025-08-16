package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.util.ModContentLists;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> VERTICAL_SLABS = of("vertical_slabs");
    public static final TagKey<Block> WOODEN_VERTICAL_SLABS = of("wooden_vertical_slabs");


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of("pear_expansion", id));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {

        valueLookupBuilder(VERTICAL_SLABS)
                .add(ModContentLists.ALL_VERTICAL_SLABS.toArray(Block[]::new));

        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ModContentLists.AXE_MINEABLE_BLOCKS.toArray(Block[]::new));
        valueLookupBuilder(WOODEN_VERTICAL_SLABS)
                .add(ModContentLists.AXE_MINEABLE_BLOCKS.toArray(Block[]::new));

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModContentLists.PICKAXE_MINEABLE_BLOCKS.toArray(Block[]::new));
    }

}
