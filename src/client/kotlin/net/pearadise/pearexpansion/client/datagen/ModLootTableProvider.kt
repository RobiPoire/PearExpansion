package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.enchantment.Enchantments
import net.minecraft.item.Item
import net.minecraft.loot.LootPool
import net.minecraft.loot.LootTable
import net.minecraft.loot.condition.BlockStatePropertyLootCondition
import net.minecraft.loot.condition.TableBonusLootCondition
import net.minecraft.loot.entry.ItemEntry
import net.minecraft.loot.entry.LeafEntry
import net.minecraft.loot.function.SetCountLootFunction
import net.minecraft.loot.provider.number.ConstantLootNumberProvider
import net.minecraft.predicate.StatePredicate
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper
import net.pearadise.pearexpansion.block.VerticalSlabBlock
import net.pearadise.pearexpansion.block.enums.VerticalSlabType
import net.pearadise.pearexpansion.item.ModItems
import net.pearadise.pearexpansion.util.ModContentLists
import java.util.concurrent.CompletableFuture

/**
 * Provides custom loot tables for blocks in the Pear Expansion mod.
 *
 * Handles loot for vertical slabs and pear drops from leaves.
 *
 * @constructor Creates a new block loot table provider.
 * @param dataOutput The data output for generated files.
 * @param registryLookup Future for registry lookup.
 */
class ModBlockLootTableProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricBlockLootTableProvider(dataOutput, registryLookup) {

    /**
     * Generates loot tables for all custom blocks.
     *
     * Adds loot for vertical slabs and pear drops from leaves.
     */
    override fun generate() {
        // Add loot tables for all vertical slab blocks
        for (verticalSlab in ModContentLists.ALL_VERTICAL_SLABS) {
            addDrop(verticalSlab, ::verticalSlabDrops)
        }

        // Add loot tables for leaves dropping pears
        addDrop(Blocks.OAK_LEAVES, itemLeavesDrop(ModItems.PEAR))
        addDrop(Blocks.DARK_OAK_LEAVES, itemLeavesDrop(ModItems.PEAR))
    }

    /**
     * Creates a loot table for leaves that can drop a custom item.
     *
     * The drop chance increases with the Fortune enchantment.
     *
     * @param dropItem The item to drop from leaves.
     * @return The loot table builder for the leaves.
     */
    fun itemLeavesDrop(dropItem: Item): LootTable.Builder {
        return LootTable.builder().pool(
            LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                .conditionally(createWithoutShearsOrSilkTouchCondition())
                .with(
                    addSurvivesExplosionCondition(
                        Blocks.OAK_LEAVES,
                        ItemEntry.builder(dropItem).conditionally(
                            TableBonusLootCondition.builder(
                                registries.getOrThrow(RegistryKeys.ENCHANTMENT)
                                    .getOrThrow(Enchantments.FORTUNE),
                                0.005f,
                                0.0055555557f,
                                0.00625f,
                                0.008333334f,
                                0.025f
                            )
                        )
                    ) as LeafEntry.Builder<*>
                )
        )
    }

    /**
     * Creates a loot table for vertical slab blocks.
     *
     * Drops 2 slabs if the block is a double slab, otherwise drops 1.
     *
     * @param drop The vertical slab block to drop.
     * @return The loot table builder for the slab.
     */
    fun verticalSlabDrops(drop: Block): LootTable.Builder {
        return LootTable.builder().pool(
            LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).with(
                applyExplosionDecay(
                    drop,
                    ItemEntry.builder(drop).apply(
                        SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f)).conditionally(
                            BlockStatePropertyLootCondition.builder(drop).properties(
                                StatePredicate.Builder.create()
                                    .exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)
                            )
                        )
                    )
                )
            )
        )
    }
}