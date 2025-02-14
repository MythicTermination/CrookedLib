package net.crookedman.example.client.model.entity;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.BatRenderer;
import net.crookedman.example.entity.BatEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link BatEntity}
 * @see BatRenderer
 */
public class BatModel extends DefaultedEntityGeoModel<BatEntity> {
	// We use the alternate super-constructor here to tell the model it should handle head-turning for us
	public BatModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "bat"), true);
	}
}
