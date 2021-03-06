
package de.jojojux.washthesky.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import de.jojojux.washthesky.procedures.SummonSteamProcedure;
import de.jojojux.washthesky.init.WashtheskyModTabs;
import de.jojojux.washthesky.init.WashtheskyModItems;

public class WoodenBucketOfSteamItem extends Item {
	public WoodenBucketOfSteamItem() {
		super(new Item.Properties().tab(WashtheskyModTabs.TAB_WASHTHESKY).stacksTo(1).rarity(Rarity.COMMON));
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
		return 32;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		SummonSteamProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
