![crookedlib-banner](https://i.ibb.co/dM3r3L1/crookedlib-banner.png)

# Introduction
Welcome to CrookedLib! This fork brings the power of GeckoLib's 4.0 animation engine to Minecraft version 1.19.2. Initially created for personal use in EntityJS Mod as its animation engine, this backport is now available for broader use, providing support akin to Gecko's 4.0+ versions.

## Features
- **Backported Animation Engine**: Enjoy the full functionality of GeckoLib's 1.19.3 animation engine in the unsupported Minecraft 1.19.2.
- Built-in Oculus Compat Fix from newer GeckoLib versions.

## Usage
Refer to the [official GeckoLib documentation](https://github.com/bernie-g/geckolib/wiki) for comprehensive guidance on utilizing the animation engine in your Minecraft mods.

### Gradle Setup
To integrate CrookedLib into your project, add the following repositories and dependencies to your `build.gradle`:
```
repositories {
maven { url 'https://dl.cloudsmith.io/public/lio/crookedlib/maven/' }
}
dependencies {
implementation fg.deobf('net.crookedman.crookedlib:crookedlib-forge-1.19.2:0.0.1')
}
```

## Issues and Contributions
If you encounter any issues or have suggestions for improvements, please open an issue on this mod's GitHub repository instead of GeckoLib. Contributions are welcome through pull requests.


## License
This project is licensed under the [MIT License](https://github.com/crookedman/crookedlib/blob/master/LICENSE).

## Acknowledgments
Special thanks to the creators and maintainers of GeckoLib for their excellent work on the original library.
