package net.crookedman.example.client.renderer.block;

import net.crookedman.example.block.entity.FertilizerBlockEntity;
import net.crookedman.example.client.model.block.FertilizerModel;
import net.crookedman.crookedlib.renderer.GeoBlockRenderer;

/**
 * Example {@link net.minecraft.world.level.block.entity.BlockEntity} renderer for {@link FertilizerBlockEntity}
 * @see FertilizerModel
 * @see FertilizerBlockEntity
 */
public class FertilizerBlockRenderer extends GeoBlockRenderer<FertilizerBlockEntity> {
	public FertilizerBlockRenderer() {
		super(new FertilizerModel());
	}
}
