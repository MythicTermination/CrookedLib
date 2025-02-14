package net.crookedman.example.client.renderer.item;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.item.PistolItem;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedItemGeoModel;
import net.crookedman.crookedlib.renderer.GeoItemRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoItemRenderer} for {@link PistolItem}
 */
public class PistolRenderer extends GeoItemRenderer<PistolItem> {
	public PistolRenderer() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(CrookedLib.MOD_ID, "pistol")));
	}
}