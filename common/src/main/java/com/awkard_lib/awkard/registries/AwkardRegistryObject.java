package com.awkard_lib.awkard.registries;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;

import java.util.function.Supplier;

public class AwkardRegistryObject<T> implements Supplier {




    public static <T> void register(String item_name, Registry<? super T> registryIn){

        Registry.register(registryIn,item_name, null);
    }


    @Override
    public Object get() {
        return null;
    }
}
