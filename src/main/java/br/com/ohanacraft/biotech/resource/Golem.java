package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeExpansion.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Golem {

    public static final SlimefunItemStack SIMPLE_GOLEM =
            new SlimefunItemStack("SIMPLE_GOLEM",
                    "e13f34227283796bc017244cb46557d64bd562fa9dab0e12af5d23ad699cf697",
                    "&eGolem &fComum", "");

    public static final SlimefunItemStack INTELLIGENCE_GOLEM =
            new SlimefunItemStack("INTELLIGENCE_GOLEM",
                    "562f0e9a738265c75bdd92b9e2e02377fec9f3b027086a0dec273bbdf6798be",
                    "&eGolem &fInteligente", "");

    public static final SlimefunItemStack LOCK_GOLEM =
            new SlimefunItemStack("LOCK_GOLEM",
                    "ef6e7a9c941e71bbfeb9ccdf91119ed7868bef05e661b1e14d3e34a9b17088d9",
                    "&eGolem &fSortuda", "");

    public static final SlimefunItemStack BERSERK_GOLEM =
            new SlimefunItemStack("BERSERK_GOLEM",
                    "ca14326aeac97f96189bb9969e7b955ec650d37b7c9790356ff09f32010f1ae0",
                    "&eGolem &fBerserk", "");

    public static final SlimefunItemStack EFFICIENTY_GOLEM =
            new SlimefunItemStack("EFFICIENTY_GOLEM",
                    "6d351a4ef45749565514d22f48e9695005a582b9ddbbbc444647ff0b056f4ffa",
                    "&eGolem &fEficiente", "");

    public static final SlimefunItemStack CLONING_GOLEM =
            new SlimefunItemStack("CLONING_GOLEM",
                    "ec4a74ac2d0ceff89157ad16121b6bcb2b5e5e694b460a27d3b9944f368c17ce",
                    "&eGolem &fClonadora", "");

    public static final SlimefunItemStack ACCELERATION_GOLEM =
            new SlimefunItemStack("ACCELERATION_GOLEM",
                    "1bfb3534baf81dc3f82feffbcd1c9ae33fac7dcc8291d2ee43d819d5a9b61",
                    "&eGolem &fAceleradora", "");

    public static void setup(BioTech plugin) {

        preSetup(plugin, Golem.SIMPLE_GOLEM);
        preSetup(plugin, Golem.INTELLIGENCE_GOLEM);
        preSetup(plugin, Golem.LOCK_GOLEM);
        preSetup(plugin, Golem.BERSERK_GOLEM);
        preSetup(plugin, Golem.EFFICIENTY_GOLEM);
        preSetup(plugin, Golem.CLONING_GOLEM);
        preSetup(plugin, Golem.ACCELERATION_GOLEM);

    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{}).register(plugin);
    }
}