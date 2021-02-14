package com.ronnoc.simplesabers.registry;

import com.ronnoc.simplesabers.LightsaberMaterial;
import com.ronnoc.simplesabers.SimpleSabers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MainRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSabers.MOD_ID);
    //Lightsaber Crystals
    public static final RegistryObject<Item> KYBER_CRYSTAL_RED = ITEMS.register("kyber_crystal_red", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_BLUE = ITEMS.register("kyber_crystal_blue", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_GREEN = ITEMS.register("kyber_crystal_green", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_PURPLE = ITEMS.register("kyber_crystal_purple", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_YELLOW = ITEMS.register("kyber_crystal_yellow", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_WHITE = ITEMS.register("kyber_crystal_white", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).isImmuneToFire().maxStackSize(1).rarity(Rarity.RARE)));
    //Lightsabers
    public static final RegistryObject<SwordItem> RED_LIGHTSABER = ITEMS.register("red_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));
    public static final RegistryObject<SwordItem> BLUE_LIGHTSABER = ITEMS.register("blue_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));
    public static final RegistryObject<SwordItem> GREEN_LIGHTSABER = ITEMS.register("green_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));
    public static final RegistryObject<SwordItem> PURPLE_LIGHTSABER = ITEMS.register("purple_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));
    public static final RegistryObject<SwordItem> YELLOW_LIGHTSABER = ITEMS.register("yellow_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));
    public static final RegistryObject<SwordItem> WHITE_LIGHTSABER = ITEMS.register("white_lightsaber", () -> new SwordItem(LightsaberMaterial.INSTANCE, 0, 0.0F, new Item.Properties().group(SimpleSabers.TAB).setNoRepair().maxStackSize(1)));

    //Other Components
    public static final RegistryObject<Item> SABER_UPPER_PART = ITEMS.register("saber_upper_part", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).maxStackSize(16)));
    public static final RegistryObject<Item> SABER_LOWER_PART = ITEMS.register("saber_lower_part", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).maxStackSize(16)));
    public static final RegistryObject<Item> DURASTEEL_INGOT = ITEMS.register("durasteel_ingot", () -> new Item(new Item.Properties().group(SimpleSabers.TAB)));
    public static final RegistryObject<Item> FOCUS_CRYSTAL = ITEMS.register("focus_crystal", () -> new Item(new Item.Properties().group(SimpleSabers.TAB).maxStackSize(8)));

}
