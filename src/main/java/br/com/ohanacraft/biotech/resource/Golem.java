package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeExpansion.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Golem {

    public static final SlimefunItemStack CUSTOM_OHANA_SALADA_DE_FRUTA =
            new SlimefunItemStack("CUSTOM_OHANA_SALADA_DE_FRUTA",
                    "f1a3727b9be72f6ac65ed9d303a1776f4cadfac00db38882e241a9ddfcaa3a56",
                    "&cSalada de Fruta", "");

    public static void setup(BioTech plugin) {

        preSetup(plugin, Golem.CUSTOM_OHANA_SALADA_DE_FRUTA);

    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{}).register(plugin);
    }
}