package net.pearadise.pearexpansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * Represents a vertical slab block for the Pear Expansion mod.
 * <p>
 * This block can be placed in a vertical orientation, allowing for more creative building options.
 * It supports single and double slab states, and its collision and outline shapes depend on its facing direction.
 * </p>
 *
 * @author RobiPoire
 * @version 0.2
 */
public class VerticalSlabBlock extends Block {

    /**
     * Property indicating if the slab is a single slab (true) or a double slab (false).
     */
    public static final BooleanProperty SINGLE = BooleanProperty.of("single");
    /**
     * Property representing the horizontal facing direction of the slab.
     */
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    /**
     * Voxel shape for a slab facing north.
     */
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    /**
     * Voxel shape for a slab facing south.
     */
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    /**
     * Voxel shape for a slab facing west.
     */
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    /**
     * Voxel shape for a slab facing east.
     */
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    /**
     * Constructs a new VerticalSlabBlock with the specified settings.
     *
     * @param settings The block settings.
     */
    public VerticalSlabBlock(Settings settings) {
        super(settings);
    }

    /**
     * Returns the voxel shape for the sides of the block based on its state.
     * <p>
     * If the block is a single slab, returns the shape corresponding to its facing direction.
     * If it is a double slab, returns a full cube shape.
     * </p>
     *
     * @param state The current block state.
     * @param world The block view.
     * @param pos   The block position.
     * @return The voxel shape for the block sides.
     */
    @Override
    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        boolean type = state.get(SINGLE);
        Direction direction = state.get(FACING);
        VoxelShape voxelShape;

        if (type) {
            switch (direction) {
                case WEST -> voxelShape = WEST_SHAPE.asCuboid();
                case EAST -> voxelShape = EAST_SHAPE.asCuboid();
                case SOUTH -> voxelShape = SOUTH_SHAPE.asCuboid();
                case NORTH -> voxelShape = NORTH_SHAPE.asCuboid();
                default -> throw new MatchException(null, null);
            }

            return voxelShape;
        } else {
            return VoxelShapes.fullCube();
        }
    }

    /**
     * Returns the outline shape of the block for rendering and interaction.
     *
     * @param state   The current block state.
     * @param world   The block view.
     * @param pos     The block position.
     * @param context The shape context.
     * @return The outline voxel shape.
     */
    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Returns the collision shape of the block for entity collision.
     *
     * @param state   The current block state.
     * @param world   The block view.
     * @param pos     The block position.
     * @param context The shape context.
     * @return The collision voxel shape.
     */
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Determines if the block can be replaced by another slab during placement.
     * <p>
     * Allows replacing a single slab with a double slab if the placement context is valid.
     * </p>
     *
     * @param state   The current block state.
     * @param context The item placement context.
     * @return True if the block can be replaced, false otherwise.
     */
    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        Direction direction = state.get(FACING);

        if (context.getStack().isOf(this.asItem()) && state.get(SINGLE)) {
            if (context.canReplaceExisting()) {
                return context.getSide().getOpposite() == direction;
            }
        }

        return false;
    }

    /**
     * Returns the block state to be placed based on the placement context.
     * <p>
     * Determines the facing and single/double state based on player interaction and placement position.
     * </p>
     *
     * @param ctx The item placement context.
     * @return The block state to be placed, or null if placement is not possible.
     */
    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos pos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockState state = ctx.getWorld().getBlockState(pos);
        BlockState state2 = Objects.requireNonNull(super.getPlacementState(ctx));

        if (state.isOf(this) && state.get(FACING) == ctx.getSide().getOpposite()) {
            return state.isOf(this) ? state2.with(SINGLE, false) : super.getPlacementState(ctx);
        }

        if (direction == Direction.NORTH && ctx.getHitPos().z - pos.getZ() > 0.5) {
            return state2.with(FACING, Direction.SOUTH).with(SINGLE, true);
        } else if (direction == Direction.SOUTH && ctx.getHitPos().z - pos.getZ() < 0.5) {
            return state2.with(FACING, Direction.NORTH).with(SINGLE, true);
        } else if (direction == Direction.WEST && ctx.getHitPos().x - pos.getX() > 0.5) {
            return state2.with(FACING, Direction.EAST).with(SINGLE, true);
        } else if (direction == Direction.EAST && ctx.getHitPos().x - pos.getX() < 0.5) {
            return state2.with(FACING, Direction.WEST).with(SINGLE, true);
        } else {
            return state2.with(FACING, direction);
        }
    }

    /**
     * Appends the block properties to the state manager.
     * <p>
     * Adds the SINGLE and FACING properties to the block state.
     * </p>
     *
     * @param builder The state manager builder.
     */
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SINGLE, FACING);
    }

}