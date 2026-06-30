package com.y_apocalypse_zombies;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;

// This Zombie spawns whenever a regular villager is converted.
// He has a higher aggression towards villagers.
public class InfectedApocalypseZombie extends BaseApocalypseZombie {
    public InfectedApocalypseZombie(EntityType<? extends Zombie> entityType, Level world) {
        super(entityType, world);

        this.xpReward = 4;
        this.spawnBaseReinforcements = false;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return BaseApocalypseZombie.createAttributes();
    }

    MobEffectInstance attackEffect = new MobEffectInstance(ModEffects.INFECTED_EFFECT, 7 * 20, 0, false, true, true);

    @Override
    public boolean doHurtTarget(ServerLevel serverLevel, Entity target) {
        boolean value = super.doHurtTarget(serverLevel, target);
        if (value && target instanceof LivingEntity livingTarget) {
            livingTarget.addEffect(attackEffect);
        }
        return value;
    }
}
