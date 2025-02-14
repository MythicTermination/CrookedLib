package net.crookedman.example.client.model.entity;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.MutantZombieRenderer;
import net.crookedman.example.entity.DynamicExampleEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link DynamicExampleEntity}
 * @see MutantZombieRenderer
 */
public class MutantZombieModel extends DefaultedEntityGeoModel<DynamicExampleEntity> {
	public MutantZombieModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "mutant_zombie"));
	}
}