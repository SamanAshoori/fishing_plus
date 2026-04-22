<img width="16" height="16" alt="golden_salmon" src="https://github.com/user-attachments/assets/d6a64c8a-4735-4ba3-a89a-4f79951a5c91" />
# Fishing Plus

A Fabric mod for Minecraft that aims to make fishing slightly more fun.

## Status

Early development. Not ready for general use yet.

## Requirements

- Minecraft **26.1.2**
- Fabric Loader **0.19.2** or newer
- Fabric API **0.146.1+26.1.2**
- Java **25**

## Features

Currently minimal — this is scaffolding, not a finished mod.

- **Golden Salmon** — a new item.

More to come. Planned directions include new catch types, fishing-related loot, and mechanical tweaks to the fishing rod itself.

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/).
2. Install [Fabric API](https://modrinth.com/mod/fabric-api).
3. Drop the `fishing-plus-*.jar` into your `mods/` folder.

## Building from source

```bash
git clone <repo-url>
cd fishing-plus-template-26.1.2
./gradlew build
```

The compiled jar will be in `build/libs/`.

To test in a development client:

```bash
./gradlew runClient
```

## Project layout

```
src/main/
├── java/professorsalmon/fishingplus/
│   ├── FishingPlus.java       — main entrypoint
│   ├── ModItems.java          — item registry
│   └── mixin/                 — mixin injections (currently empty)
└── resources/
    ├── fabric.mod.json        — mod manifest
    ├── fishing_plus.mixins.json
    └── assets/fishing_plus/
        ├── items/             — item model definitions (1.21.4+ format)
        ├── lang/              — translations
        ├── models/item/       — item models
        └── textures/item/     — item textures
```

## License

CC0-1.0

## Author

professorsalmon
