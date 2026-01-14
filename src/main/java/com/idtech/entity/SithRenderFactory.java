package com.idtech.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.monster.Zombie;

public class SithRenderFactory implements EntityRendererProvider<Zombie> {
    public static final SithRenderFactory INSTANCE = new SithRenderFactory();

    @Override
    public EntityRenderer <Zombie> create(Context manager){
        return  new SithRenderer(manager);
    }
}
