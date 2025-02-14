package net.crookedman.example.client.model.entity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.crookedman.example.client.renderer.entity.FakeGlassRenderer;
import net.crookedman.example.entity.FakeGlassEntity;
import net.crookedman.crookedlib.CrookedLib;
import net.crookedman.crookedlib.model.DefaultedEntityGeoModel;
import net.crookedman.crookedlib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link FakeGlassEntity}
 * @see FakeGlassRenderer
 */
public class FakeGlassModel extends DefaultedEntityGeoModel<FakeGlassEntity> {
	private static final ResourceLocation REDSTONE_BLOCK_TEXTURE =
			new ResourceLocation("minecraft", "textures/block/redstone_block.png");

	public FakeGlassModel() {
		super(new ResourceLocation(CrookedLib.MOD_ID, "fake_glass"));
	}

	// We just want our texture to be the Redstone Block texture
	@Override
	public ResourceLocation getTextureResource(FakeGlassEntity animatable) {
		return REDSTONE_BLOCK_TEXTURE;
	}

	// We want our entity to be translucent
	@Override
	public RenderType getRenderType(FakeGlassEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
