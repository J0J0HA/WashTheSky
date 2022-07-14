
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jojojux.washthesky.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import de.jojojux.washthesky.block.entity.SVBCMTConverterBlockEntity;
import de.jojojux.washthesky.WashtheskyMod;

public class WashtheskyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, WashtheskyMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WASHING_MACHINE = register("washing_machine", WashtheskyModBlocks.WASHING_MACHINE,
			SVBCMTConverterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
