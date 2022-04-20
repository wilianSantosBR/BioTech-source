package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.util.Energy;
import br.com.ohanacraft.biotech.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TechGenerator {

    public static final SlimefunItemStack TECH_GENERATOR = new SlimefunItemStack("BIOTECH_TECH_GENERATOR",
            Material.LOOM, "&aTech &bGenerator", "",
            "&fUsing power and bees/golem, slowly generates materials.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            Energy.energyPowerPerSecond(2000),
            "");
    public static final ItemStack[] RECIPE_TECH_GENERATOR = {
            Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST,
            SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.LOOM), SlimefunItems.REINFORCED_ALLOY_INGOT,
            Components.TRIPLE_COMPRESSED_OAK_WOOD, SlimefunItems.ELECTRIC_MOTOR, Components.TRIPLE_COMPRESSED_OAK_WOOD
    };

    public static void setup(BioTech plugin) {
        preSetup(plugin, TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR);
    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack[] recipe) {
        new SlimefunItem(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe)
                .register(plugin);
    }

}