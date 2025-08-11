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
import net.pearadise.pearexpansion.block.ModBlocks;
import net.pearadise.pearexpansion.item.ModItems;

import java.util.concurrent.CompletableFuture;

/**
 * Provides custom loot tables for blocks in the Pear Expansion mod.
 *
 * <p>
 * This class defines how certain blocks drop custom items, such as pears,
 * when broken in the game. It extends {@link FabricBlockLootTableProvider}
 * to integrate with the Fabric data generation system. Register this provider
 * during data generation to ensure custom loot tables are generated.
 * </p>
 *
 * @author RobiPoire
 * @see FabricBlockLootTableProvider
 * @see ModItems
 */
public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    /**
     * Constructs a new {@code PearExpansionBlockLootTableProvider}.
     *
     * <p>
     * Called by the Fabric data generator during the data generation phase.
     * </p>
     *
     * @param dataOutput     the output destination for generated data (must not be null)
     * @param registryLookup a future providing access to the registry lookup (must not be null)
     */
    protected ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    /**
     * Generates loot tables for custom block drops.
     *
     * <p>
     * Adds a 0.5% chance for {@link Blocks#OAK_LEAVES} and {@link Blocks#DARK_OAK_LEAVES}
     * to drop a pear item when broken. This method is called automatically during
     * data generation by the Fabric API.
     * </p>
     *
     * @implNote This method overrides the base provider to add custom loot pools.
     */
    @Override
    public void generate() {
        // Add a loot table for OAK_LEAVES with a 0.5% chance to drop a pear
        addDrop(Blocks.OAK_LEAVES, LootTable.builder().pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(ModItems.PEAR)
                        .conditionally(RandomChanceLootCondition.builder(0.005f)) // 0.5% chance
                )
        ));

        // Add a loot table for DARK_OAK_LEAVES with a 0.5% chance to drop a pear
        addDrop(Blocks.DARK_OAK_LEAVES, LootTable.builder().pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(ModItems.PEAR)
                        .conditionally(RandomChanceLootCondition.builder(0.005f)) // 0.5% chance
                )
        ));

        for (var block : ModBlocks.ALL_BLOCKS) {
            addDrop(block);
        }
    }
}