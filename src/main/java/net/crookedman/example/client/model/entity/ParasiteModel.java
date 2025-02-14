package net.crookedman.example.client.model.entity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.ParasiteRenderer;
import net.crookedman.example.entity.ParasiteEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link ParasiteEntity}
 * @see ParasiteRenderer
 */
public class ParasiteModel extends DefaultedEntityGeoModel<ParasiteEntity> {
	public ParasiteModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "parasite"));
	}

	// We want our model to render using the translucent render type
	@Override
	public RenderType getRenderType(ParasiteEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureResource(animatable));
	}
}