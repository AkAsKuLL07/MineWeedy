package net.akaskull.mineweedy.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.akaskull.mineweedy.block.MarihuanaBlock;
import net.akaskull.mineweedy.MineweedyModElements;
import net.akaskull.mineweedy.MineweedyMod;

import java.util.Map;

@MineweedyModElements.ModElement.Tag
public class SemillasweedRightClickedOnBlockProcedure extends MineweedyModElements.ModElement {
	public SemillasweedRightClickedOnBlockProcedure(MineweedyModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MineweedyMod.LOGGER.warn("Failed to load dependency x for procedure SemillasweedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MineweedyMod.LOGGER.warn("Failed to load dependency y for procedure SemillasweedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MineweedyMod.LOGGER.warn("Failed to load dependency z for procedure SemillasweedRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MineweedyMod.LOGGER.warn("Failed to load dependency world for procedure SemillasweedRightClickedOnBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MarihuanaBlock.block.getDefaultState(), 3);
	}
}
