
package net.akaskull.mineweedy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.akaskull.mineweedy.itemgroup.MineWeedyItemGroup;
import net.akaskull.mineweedy.MineweedyModElements;

@MineweedyModElements.ModElement.Tag
public class CanamoItem extends MineweedyModElements.ModElement {
	@ObjectHolder("mineweedy:canamo")
	public static final Item block = null;
	public CanamoItem(MineweedyModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MineWeedyItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("canamo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
