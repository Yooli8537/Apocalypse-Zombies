package com.y_apocalypse_zombies;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;

public class ModDamageTypes {
    public static final ResourceKey<DamageType> INFECTED =
            ResourceKey.create(Registries.DAMAGE_TYPE,
                    Identifier.fromNamespaceAndPath(YApocalypseZombies.MOD_ID, "infected")
            );
}
