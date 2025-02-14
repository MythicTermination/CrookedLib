package net.crookedman.example.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.item.GeckoArmorItem;
import net.crookedman.example.item.WolfArmorItem;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedItemGeoModel;
import net.crookedman.crookedlib.renderer.GeoArmorRenderer;
import net.crookedman.crookedlib.renderer.GeoRenderer;
import net.crookedman.crookedlib.renderer.layer.AutoGlowingGeoLayer;

/**
 * Example {@link GeoRenderer} for the {@link WolfArmorItem} example item
 */
public final class GeckoArmorRenderer extends GeoArmorRenderer<GeckoArmorItem> {
	public GeckoArmorRenderer() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(CrookedLib.MOD_ID, "armor/gecko_armor")));

		addRenderLayer(new AutoGlowingGeoLayer<>(this));
	}
}
