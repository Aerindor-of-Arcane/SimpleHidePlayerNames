package com.aerindor.simplehideplayernames.mixin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Render.class)
public abstract class MixinRender {

    @Inject(
        method = "func_147906_a(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V",
        at = @At("HEAD"),
        cancellable = true,
        remap = true)
    private void hidePlayerNames(Entity entity, String str, double x, double y, double z, int maxDistance,
        CallbackInfo ci) {

        if (entity instanceof EntityPlayer) {
            ci.cancel();
        }
    }
}
