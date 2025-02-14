package net.crookedman.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.crookedman.example.client.model.entity.RaceCarModel;
import net.crookedman.example.entity.RaceCarEntity;
import net.crookedman.crookedlib.renderer.GeoEntityRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoRenderer} implementation of an entity
 * @see RaceCarModel
 * @see RaceCarEntity
 */
public class RaceCarRenderer extends GeoEntityRenderer<RaceCarEntity> {
	public RaceCarRenderer(EntityRendererProvider.Context context) {
		super(context, new RaceCarModel());
	}
}