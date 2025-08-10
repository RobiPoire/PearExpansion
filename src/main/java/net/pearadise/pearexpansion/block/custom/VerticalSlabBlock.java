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
 *
 * <p>
 * This block allows placement of slabs in a vertical orientation, supporting both single and double slab states.
 * The collision and outline shapes depend on the facing direction and whether the slab is single or double.
 * Used to provide more creative building options for players.
 * </p>
 *
 * @author RobiPoire
 * @see net.pearadise.pearexpansion.block.ModBlocks
 */
public class VerticalSlabBlock extends Block {

    /**
     * Property indicating if the slab is a single slab ({@code true}) or a double slab ({@code false}).
     */
    public static final BooleanProperty SINGLE = BooleanProperty.of("single");

    /**
     * Property indicating if the block is waterlogged.
     */
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    /**
     * Property representing the horizontal facing direction of the slab.
     */
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

    /**
     * Voxel shape for a slab facing north (occupies the north half of the block).
     */
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);

    /**
     * Voxel shape for a slab facing south (occupies the south half of the block).
     */
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);

    /**
     * Voxel shape for a slab facing west (occupies the west half of the block).
     */
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);

    /**
     * Voxel shape for a slab facing east (occupies the east half of the block).
     */
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    /**
     * Constructs a new {@code VerticalSlabBlock} with the specified settings.
     *
     * @param settings the block settings to use (copied from a template block)
     */
    public VerticalSlabBlock(Settings settings) {
        super(settings);
    }

    /**
     * Returns the voxel shape for the sides of the block based on its state.
     *
     * <p>
     * If the block is a single slab, returns the shape corresponding to its facing direction.
     * If it is a double slab, returns a full cube shape.
     * </p>
     *
     * @param state the current block state
     * @param world the block view
     * @param pos   the block position
     * @return the voxel shape for the block sides
     */
    @Override
    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        boolean type = state.get(SINGLE);
        Direction direction = state.get(FACING);
        VoxelShape voxelShape;

        if (type) {
            // Return the half-block shape based on facing direction
            switch (direction) {
                case WEST -> voxelShape = WEST_SHAPE.asCuboid();
                case EAST -> voxelShape = EAST_SHAPE.asCuboid();
                case SOUTH -> voxelShape = SOUTH_SHAPE.asCuboid();
                case NORTH -> voxelShape = NORTH_SHAPE.asCuboid();
                default -> throw new MatchException(null, null); // Should never occur
            }
            return voxelShape;
        } else {
            // Double slab: return full cube
            return VoxelShapes.fullCube();
        }
    }

    /**
     * Returns the outline shape of the block for rendering and interaction.
     *
     * <p>
     * The outline shape is used for block selection and rendering highlights.
     * </p>
     *
     * @param state   the current block state
     * @param world   the block view
     * @param pos     the block position
     * @param context the shape context
     * @return the outline voxel shape
     */
    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // Use the same shape as the sides for outline
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Returns the collision shape of the block for entity collision.
     *
     * <p>
     * The collision shape determines how entities interact with the block.
     * </p>
     *
     * @param state   the current block state
     * @param world   the block view
     * @param pos     the block position
     * @param context the shape context
     * @return the collision voxel shape
     */
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // Use the same shape as the sides for collision
        return this.getSidesShape(state, world, pos);
    }

    /**
     * Determines if the block can be replaced by another slab during placement.
     *
     * <p>
     * Allows replacing a single slab with a double slab if the placement context is valid.
     * Only allows replacement if the player is placing the same slab type and is targeting the correct side.
     * </p>
     *
     * @param state   the current block state
     * @param context the item placement context
     * @return {@code true} if the block can be replaced, {@code false} otherwise
     */
    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        Direction direction = state.get(FACING);

        // Only allow replacement if placing the same slab and the block is single
        if (context.getStack().isOf(this.asItem()) && state.get(SINGLE)) {
            if (context.canReplaceExisting()) {
                // Only allow if the player is placing on the opposite side of the facing
                return context.getSide().getOpposite() == direction;
            }
        }
        return false;
    }

    /**
     * Returns the block state to be placed based on the placement context.
     *
     * <p>
     * Determines the facing and single/double state based on player interaction and placement position.
     * If placing against an existing single slab of the same type and facing, creates a double slab.
     * Otherwise, determines facing based on player direction and hit position.
     * </p>
     *
     * @param ctx the item placement context
     * @return the block state to be placed, or {@code null} if placement is not possible
     */
    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos pos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockState state = ctx.getWorld().getBlockState(pos);
        BlockState state2 = Objects.requireNonNull(super.getPlacementState(ctx));

        // If placing against an existing single slab of the same type and facing, make it double
        if (state.isOf(this) && state.get(FACING) == ctx.getSide().getOpposite()) {
            return state.isOf(this) ? state2.with(SINGLE, false) : super.getPlacementState(ctx);
        }

        // Determine facing and single/double state based on hit position and player direction
        if (direction == Direction.NORTH && ctx.getHitPos().z - pos.getZ() > 0.5) {
            return state2.with(FACING, Direction.SOUTH).with(SINGLE, true);
        } else if (direction == Direction.SOUTH && ctx.getHitPos().z - pos.getZ() < 0.5) {
            return state2.with(FACING, Direction.NORTH).with(SINGLE, true);
        } else if (direction == Direction.WEST && ctx.getHitPos().x - pos.getX() > 0.5) {
            return state2.with(FACING, Direction.EAST).with(SINGLE, true);
        } else if (direction == Direction.EAST && ctx.getHitPos().x - pos.getX() < 0.5) {
            return state2.with(FACING, Direction.WEST).with(SINGLE, true);
        } else {
            // Default: use player facing
            return state2.with(FACING, direction);
        }
    }

    /**
     * Appends the block properties to the state manager.
     *
     * <p>
     * Adds the {@link #SINGLE}, {@link #FACING}, and {@link #WATERLOGGED} properties to the block state.
     * </p>
     *
     * @param builder the state manager builder
     */
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SINGLE, FACING, WATERLOGGED);
    }

}