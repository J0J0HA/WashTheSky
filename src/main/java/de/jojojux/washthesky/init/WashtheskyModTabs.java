
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jojojux.washthesky.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WashtheskyModTabs {
	public static CreativeModeTab TAB_WASHTHESKY;

	public static void load() {
		TAB_WASHTHESKY = new CreativeModeTab("tabwashthesky") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WashtheskyModItems.WOODEN_BUCKET_SAPLING.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
