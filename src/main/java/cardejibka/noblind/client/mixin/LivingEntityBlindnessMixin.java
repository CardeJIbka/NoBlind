package cardejibka.noblind.client.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityBlindnessMixin {

    @Inject(method = "hasEffect", at = @At("HEAD"), cancellable = true)
    private void noblind$hideBlindness(Holder<MobEffect> effect, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity self = (LivingEntity) (Object) this;
        if (self == Minecraft.getInstance().player) {
            if (effect.is(MobEffects.BLINDNESS) || effect.is(MobEffects.DARKNESS)) {
                cir.setReturnValue(false);
            }
        }
    }
}