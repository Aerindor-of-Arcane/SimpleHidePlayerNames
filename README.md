Simple Hide Player Names

Simple Hide Player Names is a lightweight client-side mod for Minecraft 1.7.10 that hides the overhead nameplates of player entities. It is intended for players who prefer a cleaner screen while playing or recording gameplay.

Features
Hides overhead player name tags.
Client-side only.
Lightweight implementation using Mixins.
Designed for Minecraft 1.7.10.
Requirements

The following components are required:

Minecraft 1.7.10
Minecraft Forge 10.13.4.1614
Angelica (required for Mixin support)
UniMixins (or another compatible Mixin bootstrap, if your environment requires it)
Java 8 or later (build environment may use a newer JDK if configured accordingly)
Installation
Install Minecraft Forge 1.7.10.
Install Angelica (and any required Mixin bootstrap such as UniMixins, if not already included by your modpack).
Download the latest release of Simple Hide Player Names.
Place the JAR file into your Minecraft mods folder.
Launch Minecraft.
Building from Source

Clone the repository:

git clone https://github.com/<your-username>/simplehideplayernames.git

Build with Gradle:

gradlew build

The compiled JAR will be generated in:

build/libs/
Compatibility

This mod is intended for:

Minecraft 1.7.10
Forge 10.13.4.1614
Angelica-based environments

Compatibility with other rendering or nametag modification mods has not been extensively tested.

Issues

If you encounter a bug or compatibility problem, please open an issue on this repository and include:

Minecraft version
Forge version
Angelica version
Mod list (if applicable)
Latest latest.log or crash report
