package net.c2h4.tutorialmod.item;

import net.c2h4.tutorialmod.TutorialMod;
import net.c2h4.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((ItemDisplayParameters, Output) -> {
                        Output.accept(ModItems.SAPPHIRE.get());
                        Output.accept(ModItems.RAW_SAPPHIRE.get());

                        Output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        Output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        Output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        Output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
