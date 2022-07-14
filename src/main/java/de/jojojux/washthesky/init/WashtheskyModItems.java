
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jojojux.washthesky.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import de.jojojux.washthesky.item.WoodenBucketOfWaterItem;
import de.jojojux.washthesky.item.WoodenBucketOfSteamItem;
import de.jojojux.washthesky.item.WoodenBucketOfSaplingItem;
import de.jojojux.washthesky.item.WoodenBucketItem;
import de.jojojux.washthesky.item.TinyStoneItem;
import de.jojojux.washthesky.item.RubbleItem;
import de.jojojux.washthesky.item.PlaceholderItem;
import de.jojojux.washthesky.item.PebbleItem;
import de.jojojux.washthesky.item.EmeraldShardItem;
import de.jojojux.washthesky.item.DustItem;
import de.jojojux.washthesky.item.DirtPiceItem;
import de.jojojux.washthesky.item.DiamondShardItem;
import de.jojojux.washthesky.item.CoalGravelItem;
import de.jojojux.washthesky.item.BlockedItem;
import de.jojojux.washthesky.WashtheskyMod;

public class WashtheskyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WashtheskyMod.MODID);
	public static final RegistryObject<Item> WASHING_MACHINE = block(WashtheskyModBlocks.WASHING_MACHINE, WashtheskyModTabs.TAB_WASHTHESKY);
	public static final RegistryObject<Item> WOODEN_BUCKET_WATER = REGISTRY.register("wooden_bucket_water", () -> new WoodenBucketOfWaterItem());
	public static final RegistryObject<Item> WOODEN_BUCKET_SAPLING = REGISTRY.register("wooden_bucket_sapling",
			() -> new WoodenBucketOfSaplingItem());
	public static final RegistryObject<Item> PLACEHOLDER = REGISTRY.register("placeholder", () -> new PlaceholderItem());
	public static final RegistryObject<Item> PEBBLE = REGISTRY.register("pebble", () -> new PebbleItem());
	public static final RegistryObject<Item> TINY_STONE = REGISTRY.register("tiny_stone", () -> new TinyStoneItem());
	public static final RegistryObject<Item> BLOCKED = REGISTRY.register("blocked", () -> new BlockedItem());
	public static final RegistryObject<Item> DIRT_CRUMBS = REGISTRY.register("dirt_crumbs", () -> new DirtPiceItem());
	public static final RegistryObject<Item> RUBBLE_PART = REGISTRY.register("rubble_part", () -> new RubbleItem());
	public static final RegistryObject<Item> WOODEN_BUCKET = REGISTRY.register("wooden_bucket", () -> new WoodenBucketItem());
	public static final RegistryObject<Item> RUBBLE = block(WashtheskyModBlocks.RUBBLE, WashtheskyModTabs.TAB_WASHTHESKY);
	public static final RegistryObject<Item> EMERALD_SHARD = REGISTRY.register("emerald_shard", () -> new EmeraldShardItem());
	public static final RegistryObject<Item> DIAMOND_SHARD = REGISTRY.register("diamond_shard", () -> new DiamondShardItem());
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalGravelItem());
	public static final RegistryObject<Item> COMPOST = block(WashtheskyModBlocks.COMPOST, WashtheskyModTabs.TAB_WASHTHESKY);
	public static final RegistryObject<Item> WOODEN_BUCKET_OF_STEAM = REGISTRY.register("wooden_bucket_of_steam",
			() -> new WoodenBucketOfSteamItem());
	public static final RegistryObject<Item> DUST = REGISTRY.register("dust", () -> new DustItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
