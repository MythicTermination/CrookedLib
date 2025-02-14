package net.crookedman.example.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.crookedman.example.block.GeckoHabitatBlock;
import net.crookedman.example.block.FertilizerBlock;
import net.crookedman.crookedlib.CrookedLib;

public final class BlockRegistry {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			CrookedLib.MOD_ID);

	public static final RegistryObject<GeckoHabitatBlock> GECKO_HABITAT = BLOCKS.register("gecko_habitat",
			GeckoHabitatBlock::new);
	public static final RegistryObject<FertilizerBlock> FERTILIZER = BLOCKS.register("fertilizer",
			FertilizerBlock::new);
}
