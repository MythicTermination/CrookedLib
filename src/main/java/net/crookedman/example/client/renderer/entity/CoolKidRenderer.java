package net.crookedman.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.layer.CoolKidGlassesLayer;
import net.crookedman.example.entity.CoolKidEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.renderer.GeoEntityRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoRenderer} implementation of an entity that uses a {@link net.crookedman.crookedlib.renderer.layer.GeoRenderLayer render layer}
 * @see CoolKidGlassesLayer
 * @see CoolKidEntity
 */
public class CoolKidRenderer extends GeoEntityRenderer<CoolKidEntity> {
	public CoolKidRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DefaultedEntityGeoModel<>(new ResourceLocation(CrookedLib.MOD_ID, "cool_kid")));

		this.shadowRadius = 0.25f;

		// Add our render layer
		addRenderLayer(new CoolKidGlassesLayer(this));
    }
}
