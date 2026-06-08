package com.example.examplemod.item;

import com.example.examplemod.BaseMod;
import com.example.examplemod.entity.EntityMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber
public class ItemMod {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaseMod.MODID);

    //BASIC ITEMS
    public static final RegistryObject<Item> STRUCTURE_GEL = ITEMS.register("structuregel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SUPER_GLUE = ITEMS.register("super_glue",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

//    public static final RegistryObject<Item> RACCOON_SPAWN_EGG = ITEMS.register("sith_spawn_egg",
//            () -> new ForgeSpawnEggItem(EntityMod.SITH,0x000000, 0xBA0606,
//                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
