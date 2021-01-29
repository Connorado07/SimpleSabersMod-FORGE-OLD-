package com.ronnoc.simplesabers;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class LightsaberMaterial implements IItemTier{

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
        return null;
    }
}
