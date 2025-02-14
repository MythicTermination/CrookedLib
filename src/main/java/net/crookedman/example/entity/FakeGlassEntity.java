package net.crookedman.example.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;
import net.crookedman.example.client.model.entity.FakeGlassModel;
import net.crookedman.example.client.renderer.entity.FakeGlassRenderer;
import net.crookedman.crookedlib.animatable.GeoEntity;
import net.crookedman.crookedlib.core.animatable.GeoAnimatable;
import net.crookedman.crookedlib.core.animation.AnimatableManager;
import net.crookedman.crookedlib.core.animatable.instance.AnimatableInstanceCache;
import net.crookedman.crookedlib.renderer.DynamicGeoEntityRenderer;
import net.crookedman.crookedlib.util.GeckoLibUtil;

/**
 * Example {@link GeoAnimatable} implementation of an entity that uses the texture-per-bone feature of
 * {@link DynamicGeoEntityRenderer}
 * @see FakeGlassModel
 * @see FakeGlassRenderer
 */
public class FakeGlassEntity extends PathfinderMob implements GeoEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

	public FakeGlassEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
		super(entityType, level);
	}

	// We don't care about animations for this one
	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
