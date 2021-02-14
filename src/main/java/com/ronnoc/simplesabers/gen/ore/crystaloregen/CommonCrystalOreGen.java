package com.ronnoc.simplesabers.gen.ore.crystaloregen;

import com.ronnoc.simplesabers.registry.CrystalRegistry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class CommonCrystalOreGen {
        private static final int veinSize = 2;
        private static final int maxHeight = 120;
        private static final int minHeight = 3;
        private static final int veinsPerChunk = 28;

        public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
                if (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))) {
                        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                                Feature.ORE.withConfiguration(
                                        new OreFeatureConfig
                                                (OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                                        CrystalRegistry.BLUE_CRYSTAL_ORE.get().getDefaultState(), veinSize))
                                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(
                                                minHeight, 0, maxHeight))).square().func_242731_b(veinsPerChunk));}
                if (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))) {
                       event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                                 Feature.ORE.withConfiguration(
                                         new OreFeatureConfig
                                                 (OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                                 CrystalRegistry.RED_CRYSTAL_ORE.get().getDefaultState(), veinSize))
                                                .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(
                                                minHeight, 0, maxHeight))).square().func_242731_b(veinsPerChunk));}
                if (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))) {
                        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                                Feature.ORE.withConfiguration(
                                        new OreFeatureConfig
                                                (OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                                        CrystalRegistry.GREEN_CRYSTAL_ORE.get().getDefaultState(), veinSize))
                                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(
                                                minHeight, 0, maxHeight))).square().func_242731_b(veinsPerChunk));} }}