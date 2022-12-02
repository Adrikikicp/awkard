package com.awkard_lib.awkard.tile;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public abstract class AwkardMenuTileEntity extends AwkardTileEntity implements SidedInventory {
    public AwkardMenuTileEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }


}
