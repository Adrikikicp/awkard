# awkard
The power of modding

AwkardLib is a powerful mod api for Forge, Fabric and Quilt. Combining 3 powers into one mod, using Architectury Loom

# Installation

Add this to settings.gradle:

```gradle
pluginManagement {
    repositories {
        maven { url "https://maven.fabricmc.net/" }
        maven { url "https://maven.architectury.dev/" }
        maven { url "https://maven.minecraftforge.net/" }
        maven { url "https://maven.quiltmc.org/" }
        gradlePluginPortal()
        mavenCentral()
    }
}

include("common")
include("fabric")
include("quilt")
include("forge")

//replace your-name with your mod name
rootProject.name = "your-name"


```

Add four folders:
common,

fabric,

quilt,

forge

and Use our example mod for the build.gradle or see the wiki
