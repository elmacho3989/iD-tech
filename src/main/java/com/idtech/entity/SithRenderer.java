package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;

public class SithRenderer extends ZombieRenderer {

    public SithRenderer(EntityRendererProvider.Context provider){
        super(provider);
    }

    @Override
    public ResourceLocation getTextureLocation(Zombie entity){
        return new ResourceLocation(BaseMod.MODID,"textures/entity/sith.png");
    }
}
