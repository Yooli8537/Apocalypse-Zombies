# Apocalypse Zombies

A Minecraft Mod which adds new Zombie Variations made for a future Zombie Apocalypse Modpack.

## Table of Contents

- [Features](#features)
  - [Base Zombie](#base-zombie)
  - [Rusher](#rusher)
  - [Tank](#tank)
- [Installation](#installation)
  - [Dependencies](#dependencies)
  - [Modrinth](#modrinth)
  - [Manual Install](#manual-install)
- [Running the Project directly from an IDE / CLI](#running-the-project-directly-from-an-ide--cli)
- [Scripts](#scripts)
- [Known Issues](#known-issues)
- [Planned Features](#planned-features)

## Features

The Mod currently features three new zombie types, the *Base Zombie*, *Rusher* and the *Tank*.

### Base Zombie

The Base Zombie is a slightly weaker version to the regular Zombie but spawns in larger Groups.

### Rusher

The Rusher has a special move. Upon first seeing you,
it will charge towards you at a fast pace until taking or dealing damage.
If he does catch you, he'll deal 1.5x the amount of damage he usually does.

### Tank

The Tank is a lot bulkier than the average zombie, which is both a benefit and drawback.
With increased Damage, Health and knockback, he's a force to be reckoned with.
He also has a very high chance to summon reinforcements to aid him in battle.

### Infected

The Infected has an especially bad case of the Zombie infection, usually because he's been freshly mauled by a Horde.
Getting attacked by the Infected has a chance to carry over this infection, dealing damage over a long time.

## Installation

### Dependencies

The Mod depends on the following projects to also be installed:

- [Fabric API](https://modrinth.com/mod/fabric-api)
- [GeckoLib](https://modrinth.com/mod/geckolib) version 5.4.5 or later
- Fabric Loader version 0.19.2 or later
- Minecraft version 1.21.11
- Java version 21 or later

### Modrinth

Download the project from [Modrinth](https://modrinth.com/mod/y-apocalypse-zombies) and add it to any **Fabric 1.21.11** Modpack.

*Currently, this link doesn't work as the project is still being reviewed by Modrinth.*

### Manual Install

1. Make sure you have a Minecraft Instance on the version `1.21.11` with Fabric installed.
2. Run these commands:

``` PowerShell
git clone https://github.com/Yooli8537/Apocalypse-Zombies

cd Apocalypse-Zombies

.\scripts\build.ps1
```

3. Navigate to this directory: `Apocalypse-Zombies\build\libs\`
4. Copy the `y_apocalypse_zombies-X.X.X.jar` file and paste it into your Minecraft Launcher's `mods/` folder.

## Running the Project directly from an IDE / CLI

In order to run the project from an IDE, use the following commands:

``` PowerShell
git clone https://github.com/Yooli8537/Apocalypse-Zombies

cd Apocalypse-Zombies

.\scripts\runClient.ps1
```

## Scripts

This project includes three scripts to aid development.
If you want to install the scripts, you can download them from this [repository](https://github.com/Yooli8537/Minecraft-Fabric-1.21.11-Development-Scripts).

## Known Issues

### Base Zombie Texture

The Base Zombie currently uses the default Zombie Texture instead of having his own.

### Tank cannot Jump

The Tank can jump very high but basically never uses this skill because his pathfinding wasn't made for it.

### Lacking Armor render Support

Right now, Armor doesn't render on the custom Zombie's models.
Armor should be rendered for the Rusher to avoid confusion. Due to the Tank's more complex Model and it's nature,
I likely won't add Armor support for it as it fits the identity of the Tank.
A tankier Tank isn't a bad thing to me.

### Held Items are invisible

Items held by the Zombies are invisible, leading to very unfair gameplay.

### Shield Bugs

The Shield blocking an attack doesn't trigger the attack animation.
Furthermore, the Rush from a Rusher isn't stopped when hitting a shield, leading to weird circling behavior.

### Infected (Effect)

Dying to the Infected Effect sometimes triggers *death.attack.infected.player* (or something like that) instead of the intended death message.

Dying to the Infected Effect doesn't zombify the Entity.

### Baby Villager Conversion Issue

Baby Villagers turn into adult Infected Zombies. Half-intentional since these zombies aren't supposed to spawn as babies, but I'll make an exception for this case.

### Reinforcement Spawning

Reinforcements don't check for Water and can thus spawn in Water and be completely useless, just sinking to the bottom.

## Planned Features

### Randomized Textures

In order to provide more variety, I'll add many different outfits for the zombies and different Skin Textures as well.

### Crawler

The Crawler will be a Zombie which crawls on the floor.
By doing this, he'll be able to get to his target through the smallest of gaps.

### Ranged Zombie

I don't know how I will implement this yet, but some kind of ranged Zombie is on my To-Do List.

### Leaper

The Leaper will be able to jump over larger walls and ambush a player hiding behind the cover of one.

### Villager compatibility

Villagers aren't scared of the Apocalypse Zombies, even though they attack them.
This is obviously unintended and will be fixed at some point.

### Curing

All the Zombies should be able to be cured, as they're all obviously people.
Curing them will turn them into regular Villagers.

### Pillager Infection

Pillagers should also be infected and converted into the ranged Zombie version.

### Advanced AI

The Zombies should have a vague sense of teamwork, grouping together and
attacking from different angles to make stopping them harder.
