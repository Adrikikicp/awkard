package com.awkard_lib.awkard.registries;

import com.awkard_lib.awkard.Awkard;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class AwkardRegistry<T> {

    public String modid;

    public static AwkardRegistry init(String mod_id,Registry registry){

        if(registry == Registry.BLOCK){
            LoggerFactory.getLogger(AwkardRegistry.class).info("Register Blocks");
            AwkardRegistryObject.register(mod_id, Registry.BLOCK);
        }

        if(registry == Registry.ITEM){
            LoggerFactory.getLogger(AwkardRegistry.class).info("Register Items");
            AwkardRegistryObject.register(mod_id, Registry.ITEM);
        }

        if(registry == Registry.ENTITY_TYPE){
            LoggerFactory.getLogger(AwkardRegistry.class).info("Register Entities");
            AwkardRegistryObject.register(mod_id, Registry.ENTITY_TYPE);
        }

        if(registry == Registry.FLUID){
            LoggerFactory.getLogger(AwkardRegistry.class).info("Register Fluids");
            AwkardRegistryObject.register(mod_id, Registry.FLUID);
        }

        if(registry == Registry.BLOCK_ENTITY_TYPE){
            LoggerFactory.getLogger(AwkardRegistry.class).info("Register Tiles");
            AwkardRegistryObject.register(mod_id, Registry.BLOCK_ENTITY_TYPE);
        }

     AwkardRegistryObject.register(mod_id, Registry.REGISTRIES);
        return new AwkardRegistry();
    }

    public String getModId(String id){
        modid = id;
        return id;
    }

    public String getModModId(){

        return modid;
    }

    public void register(@NotNull final Registry registryType, @NotNull  final String name, T entry){

        final Identifier key = new Identifier(this.getModId(modid), name);
Registry.register(registryType,name,entry);

    }


}
