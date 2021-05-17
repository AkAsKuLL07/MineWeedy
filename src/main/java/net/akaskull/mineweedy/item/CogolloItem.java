
package net.akaskull.mineweedy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.akaskull.mineweedy.procedures.CogolloFoodEatenProcedure;
import net.akaskull.mineweedy.itemgroup.MineWeedyItemGroup;
import net.akaskull.mineweedy.MineweedyModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@MineweedyModElements.ModElement.Tag
public class CogolloItem extends MineweedyModElements.ModElement {
	@ObjectHolder("mineweedy:cogollo")
	public static final Item block = null;
	public CogolloItem(MineweedyModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MineWeedyItemGroup.tab).maxStackSize(32).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(9).saturation(3.3f).build()));
			setRegistryName("cogollo");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 15;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cogollazo de la parra"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				CogolloFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
