package net.crookedman.example.client.renderer.block;

import net.crookedman.example.block.entity.GeckoHabitatBlockEntity;
import net.crookedman.example.client.model.block.GeckoHabitatModel;
import net.crookedman.crookedlib.renderer.GeoBlockRenderer;

/**
 * Example {@link net.minecraft.world.level.block.entity.BlockEntity} renderer for {@link GeckoHabitatBlockEntity}
 * @see GeckoHabitatModel
 * @see GeckoHabitatBlockEntity
 */
public class GeckoHabitatBlockRenderer extends GeoBlockRenderer<GeckoHabitatBlockEntity> {
	public GeckoHabitatBlockRenderer() {
		super(new GeckoHabitatModel());
	}
}
