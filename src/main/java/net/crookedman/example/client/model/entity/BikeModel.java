package net.crookedman.example.client.model.entity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.BikeRenderer;
import net.crookedman.example.entity.BikeEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link BikeEntity}
 * @see BikeRenderer
 */
public class BikeModel extends DefaultedEntityGeoModel<BikeEntity> {
	public BikeModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "bike"));
	}

	// We want this entity to have a translucent render
	@Override
	public RenderType getRenderType(BikeEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureResource(animatable));
	}
}
