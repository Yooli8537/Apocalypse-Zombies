package com.y_apocalypse_zombies;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;

import static com.y_apocalypse_zombies.BaseApocalypseZombie.infectedSpawner;

public class ModEffects implements ModInitializer {
    public static Holder<MobEffect> INFECTED_EFFECT =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(YApocalypseZombies.MOD_ID, "infected_effect"),
                    new InfectedEffect()
            );

    @Override
    public void onInitialize() {
        ServerLivingEntityEvents.ALLOW_DEATH.register((killed, damageSource, damageAmount) -> {
            if (killed.hasEffect(INFECTED_EFFECT) &&
                    (killed instanceof Villager || killed instanceof Player || killed instanceof IronGolem)) {
                if (killed.level() instanceof ServerLevel serverLevel) {
                    LivingEntity infected = infectedSpawner(serverLevel, killed);

                    if (infected != null) {
                        infected.setPos(killed.getX(), killed.getY(), killed.getZ());
                        infected.setYRot(killed.getYRot());
                        serverLevel.addFreshEntity(infected);
                        killed.discard();
                        return true;
                    }
                }
            }
            return true;
        });
    }
}
