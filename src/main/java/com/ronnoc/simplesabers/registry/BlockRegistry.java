package com.ronnoc.simplesabers.registry;

import com.ronnoc.simplesabers.SimpleSabers;
import com.ronnoc.simplesabers.blockbase.BlockItemBase;
import com.ronnoc.simplesabers.blockbase.CrystalOre;
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
    public static final RegistryObject<Block> BLUE_CRYSTAL_ORE_BLOCK = BLOCKS.register("blue_crystal_ore_block", CrystalOre::new);
    public static final RegistryObject<Block> RED_CRYSTAL_ORE_BLOCK = BLOCKS.register("red_crystal_ore_block", CrystalOre::new);
    public static final RegistryObject<Block> GREEN_CRYSTAL_ORE_BLOCK = BLOCKS.register("green_crystal_ore_block", CrystalOre::new);
    public static final RegistryObject<Block> PURPLE_CRYSTAL_ORE_BLOCK = BLOCKS.register("purple_crystal_ore_block", CrystalOre::new);
    public static final RegistryObject<Block> WHITE_CRYSTAL_ORE_BLOCK = BLOCKS.register("white_crystal_ore_block", CrystalOre::new);
    public static final RegistryObject<Block> YELLOW_CRYSTAL_ORE_BLOCK = BLOCKS.register("yellow_crystal_ore_block", CrystalOre::new);


    // BLOCK ITEMS
    public static final RegistryObject<Item> METALSHIP_BLOCK_ITEM = ITEMS.register("metalship_block", () -> new BlockItemBase(METALSHIP_BLOCK.get()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("blue_crystal_ore_block", () -> new BlockItemBase(BLUE_CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> RED_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("red_crystal_ore_block", () -> new BlockItemBase(RED_CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("green_crystal_ore_block", () -> new BlockItemBase(GREEN_CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> PURPLE_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("purple_crystal_ore_block", () -> new BlockItemBase(PURPLE_CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> YELLOW_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("yellow_crystal_ore_block", () -> new BlockItemBase(YELLOW_CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> WHITE_CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("white_crystal_ore_block", () -> new BlockItemBase(WHITE_CRYSTAL_ORE_BLOCK.get()));
}