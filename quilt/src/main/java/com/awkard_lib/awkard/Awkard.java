package com.awkard_lib.awkard;

import com.mojang.logging.LogUtils;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;


public class Awkard implements ModInitializer {

    public void onInitialize(ModContainer container) {
        LogUtils.getLogger().info("Awkard lib");
    }
}
