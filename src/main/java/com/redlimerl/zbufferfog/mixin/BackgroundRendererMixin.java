package com.redlimerl.zbufferfog.mixin;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GameRenderer.class)
public abstract class BackgroundRendererMixin {

    @Redirect(method = "method_0_3350", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1015;method_4388(II)V"))
    private void setFogType(int i, int f) {
    }
}
