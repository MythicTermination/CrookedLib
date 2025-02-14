package net.crookedman.example.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.crookedman.example.client.model.block.GeckoHabitatModel;
import net.crookedman.example.client.renderer.block.GeckoHabitatBlockRenderer;
import net.crookedman.example.registry.BlockEntityRegistry;
import net.crookedman.crookedlib.animatable.GeoBlockEntity;
import net.crookedman.crookedlib.constant.DefaultAnimations;
import net.crookedman.crookedlib.core.animatable.instance.AnimatableInstanceCache;
import net.crookedman.crookedlib.core.animation.AnimatableManager;
import net.crookedman.crookedlib.core.animation.AnimationController;
import net.crookedman.crookedlib.util.GeckoLibUtil;

/**
 * Example {@link BlockEntity} implementation using a GeckoLib model.
 * @see GeckoHabitatModel
 * @see GeckoHabitatBlockRenderer
 */
public class GeckoHabitatBlockEntity extends BlockEntity implements GeoBlockEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

	public GeckoHabitatBlockEntity(BlockPos pos, BlockState state) {
		super(BlockEntityRegistry.GECKO_HABITAT.get(), pos, state);
	}

	// We just want a permanent idle animation happening here
	// But if it's day time we want him to take a nap
	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, state -> {
			if (getLevel().getDayTime() > 23000 || getLevel().getDayTime() < 13000) {
				return state.setAndContinue(DefaultAnimations.REST);
			}
			else {
				return state.setAndContinue(DefaultAnimations.IDLE);
			}
		}));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
