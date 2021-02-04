package com.ronnoc.simplesabers.registry;

import com.ronnoc.simplesabers.SimpleSabers;
import com.ronnoc.simplesabers.blockbase.BlockItemBase;
import com.ronnoc.simplesabers.blockbase.MetalShip;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleSabers.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSabers.MOD_ID);

    // BLOCKS
    public static final RegistryObject<Block> METALSHIP_BLOCK = BLOCKS.register("metalship_block", MetalShip::new);






    // BLOCK ITEMS
    public static final RegistryObject<Item> METALSHIP_BLOCK_ITEM = ITEMS.register("metalship_block", () -> new BlockItemBase(METALSHIP_BLOCK.get()));
}