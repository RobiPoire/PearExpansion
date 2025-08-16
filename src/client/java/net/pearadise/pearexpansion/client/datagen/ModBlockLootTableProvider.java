package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.block.VerticalSlabBlock;
import net.pearadise.pearexpansion.block.enums.VerticalSlabType;
import net.pearadise.pearexpansion.item.ModItems;
import net.pearadise.pearexpansion.util.ModContentLists;

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

        for (Block verticalSlab : ModContentLists.ALL_VERTICAL_SLABS) {
            addDrop(verticalSlab, this::verticalSlabDrops);
        }

        addDrop(Blocks.OAK_LEAVES, itemLeavesDrop(ModItems.PEAR));
        addDrop(Blocks.DARK_OAK_LEAVES, itemLeavesDrop(ModItems.PEAR));
    }

    public LootTable.Builder itemLeavesDrop(Item dropItem) {
        return LootTable.builder()
                .pool(
                        LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .conditionally(this.createWithoutShearsOrSilkTouchCondition())
                                .with(
                                        ((LeafEntry.Builder<?>) this.addSurvivesExplosionCondition(Blocks.OAK_LEAVES, ItemEntry.builder(dropItem)))
                                                .conditionally(TableBonusLootCondition.builder(
                                                        this.registries.getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE),
                                                        0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F
                                                ))
                                )
                );
    }

    public LootTable.Builder verticalSlabDrops(Block drop) {
        return LootTable.builder()
                .pool(
                        LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(
                                        this.applyExplosionDecay(
                                                drop,
                                                ItemEntry.builder(drop)
                                                        .apply(
                                                                SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0F))
                                                                        .conditionally(BlockStatePropertyLootCondition.builder(drop).properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)))
                                                        )
                                        )
                                )
                );
    }


}
