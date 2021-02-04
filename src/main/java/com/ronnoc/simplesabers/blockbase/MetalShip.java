package com.ronnoc.simplesabers.blockbase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalShip extends Block {
    public MetalShip() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 10.0F)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.METAL)
                .setRequiresTool()
        );
    }
}