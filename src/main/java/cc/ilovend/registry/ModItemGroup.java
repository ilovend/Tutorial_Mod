package cc.ilovend.registry;

import cc.ilovend.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
            .displayName(Text.translatable("itemgroup.tutorial-mod.citrine"))
            .icon(() ->new ItemStack(ModItems.CITRINE))
            .build();

    public static  void registerItemGroups(){
        TutorialMod.LOGGER.debug("Registering Mod Item Groups for " + TutorialMod.MOD_ID);
    }

}
