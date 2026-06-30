package com.y_apocalypse_zombies;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class InfectedEffect extends MobEffect {
    public InfectedEffect() {
        super(MobEffectCategory.HARMFUL, 0x8dbb32); // 0x = Marks Hexadecimal
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        // Only applies damage every 45 Ticks
        return duration % 45 == 0;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        Holder<DamageType> infectedDamage = level.registryAccess()
                .lookupOrThrow(Registries.DAMAGE_TYPE)
                .getOrThrow(ModDamageTypes.INFECTED);

        entity.hurtServer(level, new DamageSource(infectedDamage), 2.0F + amplifier);
        return super.applyEffectTick(level, entity, amplifier);
    }
}
