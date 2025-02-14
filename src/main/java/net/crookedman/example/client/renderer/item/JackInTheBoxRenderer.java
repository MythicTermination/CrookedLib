package net.crookedman.example.client.renderer.item;

import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.item.JackInTheBoxItem;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedItemGeoModel;
import net.crookedman.crookedlib.renderer.GeoItemRenderer;

/**
 * Example {@link net.crookedman.crookedlib.renderer.GeoItemRenderer} for {@link JackInTheBoxItem}
 */
public class JackInTheBoxRenderer extends GeoItemRenderer<JackInTheBoxItem> {
	public JackInTheBoxRenderer() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(CrookedLib.MOD_ID, "jack_in_the_box")));
	}
}
