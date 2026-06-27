package com.example.examplemod.entity;


import net.minecraft.resources.ResourceLocation;
import com.example.examplemod.BaseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityMod {


    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BaseMod.MODID);

    public static final RegistryObject<EntityType<SithEntity>> SITH =
            ENTITY_TYPES.register("sith",
                    () -> EntityType.Builder.of(SithEntity::new, MobCategory.MONSTER)
                            .build(new ResourceLocation(BaseMod.MODID, "sith").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }




}
