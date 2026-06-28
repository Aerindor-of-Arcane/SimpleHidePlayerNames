package com.aerindor.simplehideplayernames.mixin;

import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RendererLivingEntity.class)
public abstract class MixinRendererLivingEntity<T extends EntityLivingBase> {

    @Inject(
        method = "func_147906_a",
        at = @At("HEAD"),
        cancellable = true
    )
    private void hidePlayerNames(T entity, String str, double x, double y, double z, int maxDistance, CallbackInfo ci) {

        if (entity instanceof EntityPlayer) {
            ci.cancel();
        }
    }
}
