package net.pearadise.pearexpansion.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides custom loot tables for blocks in the Pear Expansion mod.
 * <p>
 * This class defines how certain blocks drop custom items, such as pears,
 * when broken in the game. It extends the FabricBlockLootTableProvider
 * to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionBlockLootTableProvider extends FabricBlockLootTableProvider {

    /**
     * Constructs a new PearExpansionBlockLootTableProvider.
     *
     * @param dataOutput     The output destination for generated data.
     * @param registryLookup A future providing access to the registry lookup.
     */
    protected PearExpansionBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    /**
     * Generates loot tables for custom block drops.
     * <p>
     * Adds a 0.5% chance for OAK_LEAVES and DARK_OAK_LEAVES to drop a pear item
     * when broken. This method is called during data generation.
     * </p>
     */
    @Override
    public void generate() {
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
    }
}