package com.example.examplemod.structures;

import com.example.examplemod.BaseMod;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StructureMod {
    public static final DeferredRegister<StructureFeature<?>> DEFERRED_REGISTRY_STRUCTURE =
            DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, BaseMod.MODID);

    public static final RegistryObject<StructureFeature<?>> SKY_STRUCTURES =
            DEFERRED_REGISTRY_STRUCTURE.register("bespin_cloud_city", BespinCloudCityStructure::new);


    public static void register(IEventBus eventBus) {
        DEFERRED_REGISTRY_STRUCTURE.register(eventBus);
    }
}
