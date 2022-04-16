package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeExpansion.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Bee {

    public static final SlimefunItemStack SIMPLE_BEE =
            new SlimefunItemStack("SIMPLE_BEE",
                    "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d",
                    "&eAbelha &fComum", "");

    public static final SlimefunItemStack INTELLIGENCE_BEE =
            new SlimefunItemStack("INTELLIGENCE_BEE",
                    "1445c3def689427fd8df8cad824c0a6b553d4f847eb03705196a69c7eed946af",
                    "&eAbelha &fInteligente", "");

    public static final SlimefunItemStack LOCK_BEE =
            new SlimefunItemStack("LOCK_BEE",
                    "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d",
                    "&eAbelha &fSortuda", "");

    public static final SlimefunItemStack BERSERK_BEE =
            new SlimefunItemStack("BERSERK_BEE",
                    "d8916ea1ffb39f13dbbf4e62449dd2cbd5d2812f414e97608af0609e139d6115",
                    "&eAbelha &fBerserk", "");

    public static final SlimefunItemStack EFFICIENTY_BEE =
            new SlimefunItemStack("EFFICIENTY_BEE",
                    "fb7a761d715d2c3c73a7d01411e61f4237e4f7633cc9f4db2cf05f66d2030a17",
                    "&eAbelha &fEficiente", "");

    public static final SlimefunItemStack CLONING_BEE =
            new SlimefunItemStack("CLONING_BEE",
                    "2ea2ba84c8c91dcb28af56a36dd49a1e51c3557e853f5d3777877758737b5557",
                    "&eAbelha &fClonadora", "");

    public static final SlimefunItemStack ACCELERATION_BEE =
            new SlimefunItemStack("ACCELERATION_BEE",
                    "ACCELERATION_BEE",
                    "&eAbelha &fAceleradora", "");

    public static void setup(BioTech plugin) {

        preSetup(plugin, Bee.SIMPLE_BEE);
        preSetup(plugin, Bee.INTELLIGENCE_BEE);
        preSetup(plugin, Bee.LOCK_BEE);
        preSetup(plugin, Bee.BERSERK_BEE);
        preSetup(plugin, Bee.EFFICIENTY_BEE);
        preSetup(plugin, Bee.CLONING_BEE);
        preSetup(plugin, Bee.ACCELERATION_BEE);

    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{}).register(plugin);
    }
}