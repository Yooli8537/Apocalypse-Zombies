package com.y_apocalypse_zombies;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.level.Level;

// This Zombie spawns whenever a regular villager is converted.
// He has a higher aggression towards villagers.
public class InfectedApocalypseZombie extends BaseApocalypseZombie {
    public InfectedApocalypseZombie(EntityType<? extends Zombie> entityType, Level world) {
        super(entityType, world);

        this.xpReward = 4;
    }

    @Override
    public boolean doHurtTarget(ServerLevel serverLevel, Entity target) {
        boolean value = super.doHurtTarget(serverLevel, target);
        if (value) {
            // Apply "Infected" effect
        }
        return value;
    }
}
