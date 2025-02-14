package net.crookedman.example.client.model.entity;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.entity.ReplacedCreeperEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;

/**
 * Example {@link net.crookedman.crookedlib.model.GeoModel} for dynamically replacing an
 * existing entity's renderer with a GeckoLib model (in this case, {@link net.minecraft.world.entity.monster.Creeper}
 * @see net.crookedman.crookedlib.renderer.GeoReplacedEntityRenderer
 * @see net.crookedman.example.client.renderer.entity.ReplacedCreeperRenderer
 */
public class ReplacedCreeperModel extends DefaultedEntityGeoModel<ReplacedCreeperEntity> {
	public ReplacedCreeperModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "creeper"));
	}
}
