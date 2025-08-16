package net.pearadise.pearexpansion.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import net.pearadise.pearexpansion.block.enums.VerticalSlabType;
import net.pearadise.pearexpansion.state.ModProperties;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements Waterloggable {
    public static final EnumProperty<VerticalSlabType> TYPE = ModProperties.VERTICAL_SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final MapCodec<VerticalSlabBlock> CODEC = createCodec(VerticalSlabBlock::new);
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    public VerticalSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(TYPE, VerticalSlabType.NORTH).with(WATERLOGGED, false));
    }

    @Override
    public MapCodec<? extends VerticalSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(TYPE)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            case DOUBLE -> VoxelShapes.fullCube();
        };
    }

    private boolean isOppositeSide(VerticalSlabType type, Direction side) {
        return switch (type) {
            case NORTH -> side == Direction.SOUTH;
            case SOUTH -> side == Direction.NORTH;
            case WEST  -> side == Direction.EAST;
            case EAST  -> side == Direction.WEST;
            default    -> false;
        };
    }


    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState existing = ctx.getWorld().getBlockState(blockPos);

        if (existing.isOf(this)) {
            VerticalSlabType currentType = existing.get(TYPE);

            if (currentType != VerticalSlabType.DOUBLE) {
                Direction side = ctx.getSide();

                if (isOppositeSide(currentType, side)) {
                    return existing.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false);
                }

                return null;
            }

            return existing;
        }

        // Cas 2 : placement normal
        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        BlockState base = this.getDefaultState().with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);

        VerticalSlabType type = getSlabTypeForPlacement(ctx, blockPos);
        return base.with(TYPE, type);
    }



    private VerticalSlabType getSlabTypeForPlacement(ItemPlacementContext ctx, BlockPos blockPos) {
        Direction playerFacing = ctx.getHorizontalPlayerFacing();
        double hitX = ctx.getHitPos().x - blockPos.getX();
        double hitZ = ctx.getHitPos().z - blockPos.getZ();

        // Le joueur regarde plutôt Nord/Sud
        if (playerFacing == Direction.NORTH || playerFacing == Direction.SOUTH) {
            if (hitZ > 0.5) {
                return VerticalSlabType.SOUTH;
            } else {
                return VerticalSlabType.NORTH;
            }
        }

        // Le joueur regarde plutôt Est/Ouest
        if (playerFacing == Direction.EAST || playerFacing == Direction.WEST) {
            if (hitX > 0.5) {
                return VerticalSlabType.EAST;
            } else {
                return VerticalSlabType.WEST;
            }
        }

        // fallback (devrait jamais arriver)
        return VerticalSlabType.NORTH;
    }



    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack stack = context.getStack();
        VerticalSlabType type = state.get(TYPE);

        // Pas remplaçable si déjà double ou si ce n'est pas le bon item
        if (type == VerticalSlabType.DOUBLE || !stack.isOf(this.asItem())) {
            return false;
        }

        // On veut permettre le clic directement sur la slab existante
        if (context.canReplaceExisting()) {
            BlockPos pos = context.getBlockPos();
            VerticalSlabType target = getSlabTypeForPlacement(context, pos);

            // Si le type qu'on veut poser est différent → OK (fusion possible)
            if (target != type) {
                return true;
            }

            // 👉 Ici on autorise aussi si on clique directement,
            //    même si Minecraft pense que c'est le même "côté"
            return true;
        }

        return true;
    }


    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE && Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
    }

    @Override
    public boolean canFillWithFluid(@Nullable LivingEntity filler, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE && Waterloggable.super.canFillWithFluid(filler, world, pos, state, fluid);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            WorldView world,
            ScheduledTickView tickView,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            Random random
    ) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return type == NavigationType.WATER && state.getFluidState().isIn(FluidTags.WATER);
    }
}

































