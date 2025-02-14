package net.crookedman.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.crookedman.example.client.model.entity.BikeModel;
import net.crookedman.example.entity.BikeEntity;
import net.crookedman.crookedlib.renderer.GeoEntityRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoRenderer} for {@link BikeEntity}
 * @see BikeModel
 */
public class BikeRenderer extends GeoEntityRenderer<BikeEntity> {
	public BikeRenderer(EntityRendererProvider.Context context) {
		super(context, new BikeModel());
	}
}
