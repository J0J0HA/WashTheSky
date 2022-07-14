
package de.jojojux.washthesky.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import de.jojojux.washthesky.procedures.GetWaterProcedure;
import de.jojojux.washthesky.init.WashtheskyModTabs;
import de.jojojux.washthesky.init.WashtheskyModItems;

public class WoodenBucketOfSaplingItem extends Item {
	public WoodenBucketOfSaplingItem() {
		super(new Item.Properties().tab(WashtheskyModTabs.TAB_WASHTHESKY).durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(WashtheskyModItems.WOODEN_BUCKET.get());
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GetWaterProcedure.execute(entity, itemstack);
	}
}
