package com.ronnoc.simplesabers;

import com.ronnoc.simplesabers.gen.ore.crystaloregen.CommonCrystalOreGen;
import com.ronnoc.simplesabers.gen.ore.crystaloregen.RareCrystalOreGen;
import com.ronnoc.simplesabers.registry.BlockRegistry;
import com.ronnoc.simplesabers.registry.CrystalRegistry;
import com.ronnoc.simplesabers.registry.MainRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(SimpleSabers.MOD_ID)
public class SimpleSabers {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "simplesabers";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("simplesabers", "simplesabers"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    public SimpleSabers() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        MainRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        BlockRegistry.ITEMS.register(bus);
        CrystalRegistry.ITEMS.register(bus);
        CrystalRegistry.BLOCKS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, CommonCrystalOreGen::addFeaturesToBiomes);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, RareCrystalOreGen::addFeaturesToBiomes);
    }
    private void setup(final FMLCommonSetupEvent event) {
        RenderTypeLookup.setRenderLayer(CrystalRegistry.RED_CRYSTAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(CrystalRegistry.BLUE_CRYSTAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(CrystalRegistry.GREEN_CRYSTAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(CrystalRegistry.PURPLE_CRYSTAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(CrystalRegistry.WHITE_CRYSTAL_ORE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(CrystalRegistry.YELLOW_CRYSTAL_ORE.get(), RenderType.getCutout());
    }
    public static final ItemGroup TAB = new ItemGroup("simplesabers") {
        @Override
        public ItemStack createIcon() {return new ItemStack(MainRegistry.RED_LIGHTSABER.get());}};

    public static final ItemGroup DONATOR_TAB = new ItemGroup("simplesabers_donator") {
        @Override
        public ItemStack createIcon() {return new ItemStack(MainRegistry.RONNS_LIGHTSABER.get());}};}

