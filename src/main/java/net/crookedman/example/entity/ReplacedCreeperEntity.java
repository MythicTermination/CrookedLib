package net.crookedman.example.entity;

import net.minecraft.world.entity.EntityType;
import net.crookedman.crookedlib.animatable.GeoEntity;
import net.crookedman.crookedlib.animatable.GeoReplacedEntity;
import net.crookedman.crookedlib.constant.DefaultAnimations;
import net.crookedman.crookedlib.core.animation.AnimatableManager;
import net.crookedman.crookedlib.core.animatable.instance.AnimatableInstanceCache;
import net.crookedman.crookedlib.util.GeckoLibUtil;

/**
 * Replacement {@link net.minecraft.world.entity.monster.Creeper} {@link GeoEntity} to showcase
 * replacing the model and animations of an existing entity
 * @see net.crookedman.crookedlib.renderer.GeoReplacedEntityRenderer
 * @see net.crookedman.example.client.renderer.entity.ReplacedCreeperRenderer
 * @see net.crookedman.example.client.model.entity.ReplacedCreeperModel
 */
public class ReplacedCreeperEntity implements GeoReplacedEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

	// Register the idle + walk animations for the entity.<br>
	// In this situation we're going to use a generic controller that is already built for us
	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(DefaultAnimations.genericWalkIdleController(this));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}

	@Override
	public EntityType<?> getReplacingEntityType() {
		return EntityType.CREEPER;
	}
}
