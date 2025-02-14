package net.crookedman.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.crookedman.example.client.model.entity.ParasiteModel;
import net.crookedman.example.entity.ParasiteEntity;
import net.crookedman.crookedlib.renderer.GeoEntityRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoRenderer} implementation of an entity
 * @see ParasiteModel
 * @see ParasiteEntity
 */
public class ParasiteRenderer extends GeoEntityRenderer<ParasiteEntity> {
	public ParasiteRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ParasiteModel());
	}
}
