package com.ronnoc.simplesabers.blockbase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CrystalOre extends Block
{
    public CrystalOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(6.0F, 99.0F)
                .harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.STONE)
                .setLightLevel(value -> 15).setRequiresTool()
                .doesNotBlockMovement());}
}