package com.ronnoc.simplesabers;

import com.ronnoc.simplesabers.registry.InitRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(SimpleSabers.MOD_ID)
public class SimpleSabers {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "simplesabers";

    public SimpleSabers() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        InitRegistry.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("simplesabers") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(InitRegistry.RED_LIGHTSABER.get());
        }};
}
