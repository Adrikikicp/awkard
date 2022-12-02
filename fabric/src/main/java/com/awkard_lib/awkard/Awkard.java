package com.awkard_lib.awkard;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;

public class Awkard implements ModInitializer {
    @Override
    public void onInitialize() {
        LogUtils.getLogger().info("Awkard lib");
    }
}
