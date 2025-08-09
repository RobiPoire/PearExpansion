package net.pearadise.pearexpansion.client.datagen.internal;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.pearadise.pearexpansion.item.ModItems;

/**
 * Provides internal model data for the Pear Expansion mod.
 * <p>
 * This class is responsible for generating item and block state models
 * used by the mod during data generation. It extends the FabricModelProvider
 * to integrate with the Fabric data generation system.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class PearExpansionInternalModelProvider extends FabricModelProvider {

    /**
     * Constructs a new PearExpansionInternalModelProvider.
     *
     * @param output The output destination for generated model data.
     */
    public PearExpansionInternalModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * Generates block state models for the mod.
     * <p>
     * This method is called during data generation to define custom block state models.
     * Currently, it does not generate any block state models.
     * </p>
     *
     * @param blockStateModelGenerator The generator used to create block state models.
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    /**
     * Generates item models for the mod.
     * <p>
     * Registers the PEAR, GOLDEN_PEAR, and ENCHANTED_GOLDEN_PEAR items with their respective models.
     * The ENCHANTED_GOLDEN_PEAR uses the GOLDEN_PEAR as its texture source.
     * </p>
     *
     * @param itemModelGenerator The generator used to create item models.
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PEAR, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(ModItems.ENCHANTED_GOLDEN_PEAR, ModItems.GOLDEN_PEAR, Models.GENERATED);

    }

    /**
     * Returns the name of this model provider.
     *
     * @return A string representing the name of the provider.
     */
    @Override
    public String getName() {
        return "PearExpansion Internal Model Provider";
    }
}