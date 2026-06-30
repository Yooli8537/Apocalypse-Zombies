package com.y_apocalypse_zombies;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

public class ModEffects implements ModInitializer {
    public static Holder<MobEffect> INFECTED_EFFECT =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(YApocalypseZombies.MOD_ID, "infected_effect"),
                    new InfectedEffect()
            );

    @Override
    public void onInitialize() {}
}
