package net.pearadise.pearexpansion.client.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.BlockTags
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import net.pearadise.pearexpansion.MOD_ID
import net.pearadise.pearexpansion.util.ModContentLists
import java.util.concurrent.CompletableFuture

/**
 * Provides and generates block tags for the Pear Expansion mod.
 *
 * Adds custom tags for vertical slabs and registers mineable tags for custom blocks.
 *
 * @constructor Creates a new block tag provider.
 * @param output The data output for generated files.
 * @param registriesFuture Future for registry lookup.
 */
class ModBlockTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {

    companion object {
        /** Tag for all vertical slab blocks. */
        val VERTICAL_SLABS: TagKey<Block> = of("vertical_slabs")

        /** Tag for all wooden vertical slab blocks. */
        val WOODEN_VERTICAL_SLABS: TagKey<Block> = of("wooden_vertical_slabs")

        /**
         * Creates a [TagKey] for a block tag with the given ID.
         *
         * @param id The tag ID.
         * @return The [TagKey] for the block tag.
         */
        private fun of(id: String): TagKey<Block> =
            TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, id))
    }

    /**
     * Configures and adds blocks to custom and vanilla tags.
     *
     * Registers all vertical slabs, axe-mineable, wooden vertical slabs,
     * and pickaxe-mineable blocks.
     *
     * @param registries The registry lookup.
     */
    override fun configure(registries: RegistryWrapper.WrapperLookup) {
        // Add all vertical slabs to the custom tag
        val allVertical = ModContentLists.ALL_VERTICAL_SLABS.toTypedArray()
        valueLookupBuilder(VERTICAL_SLABS)
            .add(*allVertical)

        // Add axe-mineable blocks to the vanilla tag
        val axeMineable = ModContentLists.AXE_MINEABLE_BLOCKS.toTypedArray()
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
            .add(*axeMineable)

        // Add wooden vertical slabs to the custom tag
        valueLookupBuilder(WOODEN_VERTICAL_SLABS)
            .add(*axeMineable)

        // Add pickaxe-mineable blocks to the vanilla tag
        val pickMineable = ModContentLists.PICKAXE_MINEABLE_BLOCKS.toTypedArray()
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(*pickMineable)
    }
}