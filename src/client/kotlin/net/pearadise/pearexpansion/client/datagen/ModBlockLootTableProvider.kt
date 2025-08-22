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
     * Generates loot tables for all custom blocks:
     * - Vertical slabs
     * - Pear drops from oak and dark oak leaves
     */
    override fun generate() {
        // Vertical slab drops
        ModContentLists.ALL_VERTICAL_SLABS.forEach { addDrop(it, ::verticalSlabDrops) }

        // Pear leaf drops
        listOf(Blocks.OAK_LEAVES, Blocks.DARK_OAK_LEAVES).forEach { addDrop(it, leavesDrop(ModItems.PEAR)) }
    }

    /**
     * Creates a loot table for leaves that can drop a custom item.
     *
     * Fortune enchantment increases drop chance.
     *
     * @param dropItem The item to drop from leaves.
     * @return The loot table builder.
     */
    private fun leavesDrop(dropItem: Item): LootTable.Builder =
        LootTable.builder().pool(
            LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1f))
                .conditionally(createWithoutShearsOrSilkTouchCondition())
                .with(
                    addSurvivesExplosionCondition(
                        Blocks.OAK_LEAVES,
                        ItemEntry.builder(dropItem).conditionally(
                            TableBonusLootCondition.builder(
                                registries.getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE),
                                0.005f, 0.0055555557f, 0.00625f, 0.008333334f, 0.025f
                            )
                        )
                    )
                )
        )

    /**
     * Creates a loot table for vertical slabs.
     *
     * Drops 2 slabs if the block is a double slab, otherwise drops 1.
     *
     * @param slab The vertical slab block.
     * @return The loot table builder.
     */
    private fun verticalSlabDrops(slab: Block): LootTable.Builder =
        LootTable.builder().pool(
            LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1f))
                .with(
                    applyExplosionDecay(
                        slab,
                        ItemEntry.builder(slab).apply(
                            SetCountLootFunction.builder(ConstantLootNumberProvider.create(2f)).conditionally(
                                BlockStatePropertyLootCondition.builder(slab).properties(
                                    StatePredicate.Builder.create()
                                        .exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)
                                )
                            )
                        )
                    )
                )
        )
}
