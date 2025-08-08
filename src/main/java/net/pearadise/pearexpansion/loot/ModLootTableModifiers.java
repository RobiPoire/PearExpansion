/**
 * Utility class to modify vanilla loot tables to include custom pear drops for PearExpansion.
 * <p>
 * Registers a listener to the {@link LootTableEvents#MODIFY} event and injects a loot pool
 * into target leaf blocks tables, allowing pears to drop with a configurable chance.
 * </p>
 *
 * @author RobiPoire
 * @since 0.1
 */
package net.pearadise.pearexpansion.loot;

import net.pearadise.pearexpansion.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryKey;

public final class ModLootTableModifiers {

    /**
     * Chance for a pear to drop from target leaves (0.5%).
     */
    private static final float PEAR_DROP_CHANCE = 0.005f;

    /**
     * Private constructor to prevent instantiation.
     */
    private ModLootTableModifiers() {
    }

    /**
     * Initializes loot table modifications by registering the modify event listener.
     * <p>
     * Should be called during mod setup to ensure pear drops are injected.
     * </p>
     *
     * @since 0.1
     * <p>Example usage:</p>
     * <pre><code>
     * ModLootTableModifiers.init();
     * </code></pre>
     */
    public static void init() {
        LootTableEvents.MODIFY.register(
                (key, tableBuilder, source, registries) ->
                        onLootTableModify(key, tableBuilder, source)
        );
    }

    /**
     * Callback to modify a loot table if it matches target leaf blocks.
     * <p>
     * Checks if the loot table is builtin and corresponds to oak or dark oak leaves,
     * then adds a pear loot pool.
     * </p>
     *
     * @param key          the registry key of the loot table
     * @param tableBuilder the builder for the loot table being modified
     * @param source       the source of the loot table (builtin or data-driven)
     */
    private static void onLootTableModify(
            RegistryKey<LootTable> key,
            LootTable.Builder tableBuilder,
            LootTableSource source
    ) {
        if (source.isBuiltin() && isTargetLeavesTable(key)) {
            tableBuilder.pool(createPearPool());
        }
    }

    /**
     * Determines if the given loot table key matches oak or dark oak leaves.
     *
     * @param key the loot table registry key
     * @return true if the key is for oak or dark oak leaves, false otherwise
     */
    private static boolean isTargetLeavesTable(RegistryKey<LootTable> key) {
        return key.equals(Blocks.OAK_LEAVES.getLootTableKey().orElse(null))
                || key.equals(Blocks.DARK_OAK_LEAVES.getLootTableKey().orElse(null));
    }

    /**
     * Creates a {@link LootPool.Builder} that adds a pear item entry with a random chance condition.
     *
     * @return a loot pool builder configured to drop pears
     */
    private static LootPool.Builder createPearPool() {
        return LootPool.builder()
                .with(ItemEntry.builder(ModItems.PEAR.getItem()))
                .conditionally(RandomChanceLootCondition.builder(PEAR_DROP_CHANCE));
    }
}

