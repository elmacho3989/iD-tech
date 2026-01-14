package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class SithEntity extends Zombie {

    public SithEntity (EntityType<? extends Zombie> type, Level level){
        super(type, level);
    }

    public static EntityType<SithEntity> TYPE = (EntityType<SithEntity>)
            EntityType.Builder.of(SithEntity::new, MobCategory.MONSTER)
                    .build("sith")
                    .setRegistryName(BaseMod.MODID, "sith");

    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE,0x000000,0xBA0606);

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes().add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }
}
