package com.example.examplemod.event;

import com.example.examplemod.BaseMod;
import com.example.examplemod.entity.EntityMod;
import com.example.examplemod.entity.SithEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BaseMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityMod.SITH.get(), SithEntity.createAttributes().build());
    }
}
