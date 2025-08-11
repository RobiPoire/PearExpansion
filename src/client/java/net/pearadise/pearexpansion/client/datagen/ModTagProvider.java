package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.data.tag.ProvidedTagBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        TagKey<Block> mineableWithAxe = TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft", "mineable/axe"));
        ProvidedTagBuilder<Block, Block> builderMineableWithAxe = valueLookupBuilder(mineableWithAxe);
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsAxeable()) {
            builderMineableWithAxe.add(verticalSlab.getBlock());
        }

        TagKey<Block> mineableWithPickaxe = TagKey.of(RegistryKeys.BLOCK, Identifier.of("minecraft", "mineable/pickaxe"));
        ProvidedTagBuilder<Block, Block> builderMineableWithPickaxe = valueLookupBuilder(mineableWithPickaxe);
        for (VerticalSlabBlockEnum verticalSlab : VerticalSlabBlockEnum.getAllVerticalSlabsPickaxable()) {
            builderMineableWithPickaxe.add(verticalSlab.getBlock());
        }

    }
}
