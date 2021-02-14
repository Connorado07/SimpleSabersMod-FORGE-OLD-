package com.ronnoc.simplesabers;

import com.ronnoc.simplesabers.registry.MainRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LightsaberMaterial implements IItemTier {
    public static final LightsaberMaterial INSTANCE = new LightsaberMaterial();
    @Override
    public int getMaxUses() {
        return 8600;
    }
    @Override
    public float getEfficiency() {
        return 0;
    }
    @Override
    public float getAttackDamage() {
        return 11;
    }
    @Override
    public int getHarvestLevel() {
        return 0;
    }
    @Override
    public int getEnchantability() {
        return 0;
    }
    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems();
    }}
