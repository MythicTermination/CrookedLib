package net.crookedman.example.client.renderer.armor;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.item.WolfArmorItem;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedItemGeoModel;
import net.crookedman.crookedlib.renderer.GeoArmorRenderer;
import net.crookedman.crookedlib.renderer.GeoRenderer;

/**
 * Example {@link GeoRenderer} for the {@link WolfArmorItem} example item
 */
public final class WolfArmorRenderer extends GeoArmorRenderer<WolfArmorItem> {
	public WolfArmorRenderer() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(CrookedLib.MOD_ID, "armor/wolf_armor")));
	}
}
