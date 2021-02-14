package com.ronnoc.simplesabers.registry;

import com.ronnoc.simplesabers.SimpleSabers;
import com.ronnoc.simplesabers.blockbase.BlockItemBase;
import com.ronnoc.simplesabers.blockbase.CrystalOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CrystalRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleSabers.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSabers.MOD_ID);

    public static final RegistryObject<Block> RED_CRYSTAL_ORE = BLOCKS.register("red_crystal_ore", CrystalOre::new);
    public static final RegistryObject<Block> GREEN_CRYSTAL_ORE = BLOCKS.register("green_crystal_ore", CrystalOre::new);
    public static final RegistryObject<Block> PURPLE_CRYSTAL_ORE = BLOCKS.register("purple_crystal_ore", CrystalOre::new);
    public static final RegistryObject<Block> WHITE_CRYSTAL_ORE = BLOCKS.register("white_crystal_ore", CrystalOre::new);
    public static final RegistryObject<Block> YELLOW_CRYSTAL_ORE = BLOCKS.register("yellow_crystal_ore", CrystalOre::new);
    public static final RegistryObject<Block> BLUE_CRYSTAL_ORE = BLOCKS.register("blue_crystal_ore", CrystalOre::new);

    public static final RegistryObject<Item> RED_CRYSTAL_ORE_ITEM = ITEMS.register("red_crystal_ore", () -> new BlockItemBase(RED_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> GREEN_CRYSTAL_ORE_ITEM = ITEMS.register("green_crystal_ore", () -> new BlockItemBase(GREEN_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> PURPLE_CRYSTAL_ORE_ITEM = ITEMS.register("purple_crystal_ore", () -> new BlockItemBase(PURPLE_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> YELLOW_CRYSTAL_ORE_ITEM = ITEMS.register("yellow_crystal_ore", () -> new BlockItemBase(YELLOW_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> WHITE_CRYSTAL_ORE_ITEM = ITEMS.register("white_crystal_ore", () -> new BlockItemBase(WHITE_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_ORE_ITEM = ITEMS.register("blue_crystal_ore", () -> new BlockItemBase(BLUE_CRYSTAL_ORE.get()));}
