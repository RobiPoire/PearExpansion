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
 * Provides custom block tags for the Pear Expansion mod.
 *
 * Registers tags for vertical slabs and adds mining tags for custom blocks.
 */
class ModBlockTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {

    companion object {
        /** All vertical slab blocks. */
        val VERTICAL_SLABS: TagKey<Block> = tag("vertical_slabs")

        /** All wooden vertical slab blocks. */
        val WOODEN_VERTICAL_SLABS: TagKey<Block> = tag("wooden_vertical_slabs")

        /** Creates a [TagKey] for a block tag with the given ID. */
        private fun tag(id: String): TagKey<Block> =
            TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, id))
    }

    /**
     * Configures and adds blocks to custom and vanilla tags.
     */
    override fun configure(registries: RegistryWrapper.WrapperLookup) {
        // Custom tags
        valueLookupBuilder(VERTICAL_SLABS).add(*ModContentLists.ALL_VERTICAL_SLABS.toTypedArray())
        valueLookupBuilder(WOODEN_VERTICAL_SLABS).add(*ModContentLists.AXE_MINEABLE_BLOCKS.toTypedArray())

        // Vanilla tags
        valueLookupBuilder(BlockTags.AXE_MINEABLE).add(*ModContentLists.AXE_MINEABLE_BLOCKS.toTypedArray())
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).add(*ModContentLists.PICKAXE_MINEABLE_BLOCKS.toTypedArray())
    }
}
