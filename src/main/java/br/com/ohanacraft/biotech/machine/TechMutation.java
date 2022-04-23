package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.RecipeTechMutationDTO;
import br.com.ohanacraft.biotech.resource.BeeTech;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.IronGolemTech;
import com.sun.tools.javac.util.List;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TechMutation {

    public static final SlimefunItemStack TECH_MUTATION = new SlimefunItemStack("BIOTECH_TECH_MUTATION",
            Material.SLIME_BLOCK, "&aTech &bMutation", "");
    public static final ItemStack[] RECIPE_TECH_MUTATION = {
        Components.TRIPLE_COMPRESSED_SLIME_BALL, Components.BIOTECH_SYNTHETIC_RUBY, Components.TRIPLE_COMPRESSED_MAGMA_CREAM,
        SlimefunItems.REINFORCED_PLATE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_PLATE,
        Components.TRIPLE_COMPRESSED_SPONGE, Components.BIOTECH_SYNTHETIC_RUBY, Components.TRIPLE_COMPRESSED_LEATHER
    };


    public static void setup(BioTech plugin) {

        preSetup(plugin, TechMutation.TECH_MUTATION, TechMutation.RECIPE_TECH_MUTATION);


    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack[] recipe) {
        new SlimefunItem(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
                recipe).register(plugin);
    }

    private static List<RecipeTechMutationDTO> recipes = List.of(
           new  RecipeTechMutationDTO(BeeTech.SIMPLE_BEE,BeeTech.SIMPLE_BEE,20,BeeTech.MUTATION_BERSERK_BEE),
           new  RecipeTechMutationDTO(BeeTech.SIMPLE_BEE,BeeTech.SIMPLE_BEE,5,BeeTech.MUTATION_LUCK_BEE),
           new  RecipeTechMutationDTO(BeeTech.SIMPLE_BEE,BeeTech.SIMPLE_BEE,5,BeeTech.MUTATION_INTELLIGENCE_BEE),
           new  RecipeTechMutationDTO(IronGolemTech.SIMPLE_GOLEM,IronGolemTech.SIMPLE_GOLEM,20,IronGolemTech.MUTATION_BERSERK_GOLEM),
           new  RecipeTechMutationDTO(IronGolemTech.SIMPLE_GOLEM,IronGolemTech.SIMPLE_GOLEM,5,IronGolemTech.MUTATION_LUCK_GOLEM),
           new  RecipeTechMutationDTO(IronGolemTech.SIMPLE_GOLEM,IronGolemTech.SIMPLE_GOLEM,5,IronGolemTech.MUTATION_INTELLIGENCE_GOLEM)
    );
}