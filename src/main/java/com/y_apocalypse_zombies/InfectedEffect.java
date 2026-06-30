package com.y_apocalypse_zombies;

import net.minecraft.server.level.ServerLevel;
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
        entity.hurtServer(level, level.damageSources().magic(), 2.0F + amplifier);
        return super.applyEffectTick(level, entity, amplifier);
    }
}
