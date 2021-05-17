
package net.akaskull.mineweedy.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.akaskull.mineweedy.block.MarihuanaBlock;
import net.akaskull.mineweedy.MineweedyModElements;

@MineweedyModElements.ModElement.Tag
public class MineWeedyItemGroup extends MineweedyModElements.ModElement {
	public MineWeedyItemGroup(MineweedyModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmine_weedy") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MarihuanaBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
