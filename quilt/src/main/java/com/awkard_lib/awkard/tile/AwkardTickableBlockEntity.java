package com.awkard_lib.awkard.tile;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.util.ClientPlayerTickable;
import net.minecraft.util.math.BlockPos;

public class AwkardTickableBlockEntity extends BlockEntity {

    public AwkardTickableBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }


    public void tick() {
        toUpdatePacket();
    }
}
