package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlock;
import net.pearadise.pearexpansion.block.custom.VerticalSlabBlockEnum;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides custom loot tables for blocks in the Pear Expansion mod.
 */
public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    protected ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Oak leaves / dark oak leaves: petit chance de drop pear
        addDrop(Blocks.OAK_LEAVES, LootTable.builder().pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(ModItems.PEAR)
                        .conditionally(RandomChanceLootCondition.builder(0.005f)) // 0.5% chance
                )
        ));

        addDrop(Blocks.DARK_OAK_LEAVES, LootTable.builder().pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(ModItems.PEAR)
                        .conditionally(RandomChanceLootCondition.builder(0.005f)) // 0.5% chance
                )
        ));

        // Vertical slabs: 1 si single=true, 2 si single=false
        for (VerticalSlabBlockEnum slabEnum : VerticalSlabBlockEnum.values()) {
            Block slabBlock = slabEnum.getBlock();

            LootPool.Builder poolSingle = LootPool.builder()
                    .conditionally(
                            BlockStatePropertyLootCondition.builder(slabBlock)
                                    .properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, true))
                    )
                    .with(ItemEntry.builder(slabBlock.asItem()))
                    .rolls(ConstantLootNumberProvider.create(1.0F));

            LootPool.Builder poolDouble = LootPool.builder()
                    .conditionally(
                            BlockStatePropertyLootCondition.builder(slabBlock)
                                    .properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.SINGLE, false))
                    )
                    .with(ItemEntry.builder(slabBlock.asItem())
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))))
                    .rolls(ConstantLootNumberProvider.create(1.0F));

            LootTable.Builder table = LootTable.builder()
                    .pool(poolSingle)
                    .pool(poolDouble);

            addDrop(slabBlock, table);
        }
    }
}
