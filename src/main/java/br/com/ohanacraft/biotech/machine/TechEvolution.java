package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeExpansion.util.ItemNotPlaceable;
import br.com.ohanacraft.biotech.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TechEvolution {

    public static final SlimefunItemStack TECH_EVOLUTION = new SlimefunItemStack("TECH_EVOLUTION",
            Material.LOOM, "&aTech &bEvolution", "");
    public static final ItemStack[] RECIPE_TECH_EVOLUTION = {
            Components.TRIPLE_COMPRESSED_LEATHER, Components.TRIPLE_COMPRESSED_WOOL, Components.TRIPLE_COMPRESSED_LEATHER,
            SlimefunItems.HARDENED_METAL_INGOT, Components.SYNTHETIC_RUBY, SlimefunItems.HARDENED_METAL_INGOT,
            Components.TRIPLE_COMPRESSED_OAK_WOOD, SlimefunItems.ELECTRIC_MOTOR, Components.TRIPLE_COMPRESSED_OAK_WOOD
    };


    public static void setup(BioTech plugin) {

        preSetup(plugin, TechEvolution.TECH_EVOLUTION,TechEvolution.RECIPE_TECH_EVOLUTION);


    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack[] recipe) {
        new SlimefunItem(Categories.RESOURCE_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
                recipe).register(plugin);
    }
}