/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package net.crookedman.example;

import net.crookedman.crookedlib.CrookedLib;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.crookedman.example.registry.*;

@EventBusSubscriber
@Mod(CrookedLib.MOD_ID)
public final class CrookedLibMod {
	public static CreativeModeTab geckolibItemGroup;
	public static final String DISABLE_EXAMPLES_PROPERTY_KEY = "crookedlib.disable_examples";

	public CrookedLibMod() {
		CrookedLib.initialize();

		if (shouldRegisterExamples()) {
			IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
			EntityRegistry.ENTITIES.register(bus);
			ItemRegistry.ITEMS.register(bus);
			BlockEntityRegistry.TILES.register(bus);
			BlockRegistry.BLOCKS.register(bus);
			SoundRegistry.SOUNDS.register(bus);
			geckolibItemGroup = new CreativeModeTab(CreativeModeTab.getGroupCountSafe(), "crookedlib") {
				@Override
				public ItemStack makeIcon() {
					return new ItemStack(ItemRegistry.JACK_IN_THE_BOX.get());
				}
			};
		}
	}



	/**
	 * By default, crookedlib will register and activate several example entities,
	 * items, and blocks when in dev.<br>
	 * These examples are <u>not</u> present when in a production environment
	 * (normal players).<br>
	 * This can be disabled by setting the
	 * {@link CrookedLibMod#DISABLE_EXAMPLES_PROPERTY_KEY} to false in your run args
	 */
	static boolean shouldRegisterExamples() {
		return !FMLEnvironment.production && !Boolean.getBoolean(DISABLE_EXAMPLES_PROPERTY_KEY);
	}
}
