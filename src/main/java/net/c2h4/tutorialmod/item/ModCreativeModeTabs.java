package net.c2h4.tutorialmod.item;

import net.c2h4.tutorialmod.TutorialMod;
import net.c2h4.tutorialmod.block.ModBlocks;
import net.c2h4.tutorialmod.block.entity.ModBlockEntities;
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
                        Output.accept(ModItems.STRAWBERRY.get());
                        Output.accept(ModItems.PINE_CONE.get());

                        Output.accept(ModItems.STRAWBERRY_SEEDS.get());
                        Output.accept(ModItems.RHINO_SPAWN_EGG.get());

                        Output.accept(ModItems.METAL_DETECTOR.get());
                        Output.accept(ModItems.SAPPHIRE_STAFF.get());

                        Output.accept(ModItems.SAPPHIRE_SWORD.get());
                        Output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        Output.accept(ModItems.SAPPHIRE_AXE.get());
                        Output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        Output.accept(ModItems.SAPPHIRE_HOE.get());

                        Output.accept(ModItems.SAPPHIRE_HELMET.get());
                        Output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        Output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        Output.accept(ModItems.SAPPHIRE_BOOTS.get());

                        Output.accept(ModItems.EMERALD_HELMET.get());
                        Output.accept(ModItems.EMERALD_CHESTPLATE.get());
                        Output.accept(ModItems.EMERALD_LEGGINGS.get());
                        Output.accept(ModItems.EMERALD_BOOTS.get());

                        Output.accept(ModItems.DICE.get());

                        Output.accept(ModItems.PINE_CHEST_BOAT.get());
                        Output.accept(ModItems.PINE_BOAT.get());

                        Output.accept(ModBlocks.SOUND_BLOCK.get());

                        Output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        Output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        Output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        Output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        Output.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        Output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        Output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        Output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        Output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        Output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        Output.accept(ModBlocks.SAPPHIRE_WALL.get());

                        Output.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        Output.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        Output.accept(ModBlocks.CATMINT.get());
                        Output.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        Output.accept(ModBlocks.PINE_LOG.get());
                        Output.accept(ModBlocks.PINE_WOOD.get());
                        Output.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        Output.accept(ModBlocks.STRIPPED_PINE_WOOD.get());

                        Output.accept(ModBlocks.PINE_PLANKS.get());
                        Output.accept(ModBlocks.PINE_LEAVES.get());

                        Output.accept(ModBlocks.PINE_SIGN.get());
                        Output.accept(ModBlocks.PINE_HANGING_SIGN.get());

                        Output.accept(ModBlocks.PINE_SAPLING.get());
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
