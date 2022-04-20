package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Components {


    //lã

    public static final SlimefunItemStack SINGLE_COMPRESSED_WOOL = new SlimefunItemStack("SINGLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eSingle Compressed Wool", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_WOOL = {
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_WOOL = new SlimefunItemStack("DOUBLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eDouble Compressed Wool", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_WOOL = {
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL,
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL,
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_WOOL = new SlimefunItemStack("TRIPLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eTriple Compressed Wool", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_WOOL = {
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL,
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL,
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL
    };

    //Couro

    public static final SlimefunItemStack SINGLE_COMPRESSED_LEATHER = new SlimefunItemStack("SINGLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eSingle Compressed Leather", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_LEATHER = {
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_LEATHER = new SlimefunItemStack("DOUBLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eDouble Compressed Leather", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_LEATHER = {
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER,
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER,
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_LEATHER = new SlimefunItemStack("TRIPLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eTriple Compressed Leather", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_LEATHER = {
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER,
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER,
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER
    };

    //Madeira

    public static final SlimefunItemStack SINGLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("SINGLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eSingle Compressed Wood", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_OAK_WOOD = {
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("DOUBLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eDouble Compressed Wood", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_OAK_WOOD = {
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD,
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD,
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("TRIPLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eTriple Compressed Wood", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_OAK_WOOD = {
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD
    };

    //esponja

    public static final SlimefunItemStack SINGLE_COMPRESSED_SPONGE = new SlimefunItemStack("SINGLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eSingle Compressed Sponge", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SPONGE = {
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_SPONGE = new SlimefunItemStack("DOUBLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eDouble Compressed Sponge", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SPONGE = {
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE,
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE,
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_SPONGE = new SlimefunItemStack("TRIPLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eTriple Compressed Sponge", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SPONGE = {
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE,
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE,
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE
    };


    //Bola de Slime


    public static final SlimefunItemStack SINGLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("SINGLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eSingle Compressed Slime Ball", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SLIME_BALL = {
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("DOUBLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eDouble Compressed Slime Ball", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SLIME_BALL = {
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL,
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL,
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("TRIPLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eTriple Compressed Slime Ball", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SLIME_BALL = {
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL,
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL,
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL
    };

    //Creme de Magma


    public static final SlimefunItemStack SINGLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("SINGLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eSingle Compressed Magma Cream", "");
    public static final ItemStack[] RECIPE_SINGLE_COMPRESSED_MAGMA_CREAM = {
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("DOUBLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eDouble Compressed Magma Cream", "");
    public static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_MAGMA_CREAM = {
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM,
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM,
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("TRIPLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eTriple Compressed Magma Cream", "");
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_MAGMA_CREAM = {
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM,
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM,
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM
    };


    //amethyst

    public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SlimefunItemStack("SYNTHETIC_AMETHYST",
            Material.PURPLE_DYE, "&4Synthetic Amethyst", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_SAPPHIRE,
            SlimefunItems.SYNTHETIC_DIAMOND, new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.SYNTHETIC_DIAMOND,
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_SAPPHIRE
    };

    //rubi

    public static final SlimefunItemStack SYNTHETIC_RUBY = new SlimefunItemStack("SYNTHETIC_RUBY",
            Material.PINK_DYE, "&4Synthetic Ruby", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
            SlimefunItems.SYNTHETIC_DIAMOND, Components.SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND,
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD
    };


    public static void setup(BioTech plugin) {

        //lã
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_WOOL, Components.RECIPE_SINGLE_COMPRESSED_WOOL);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_WOOL, Components.RECIPE_DOUBLE_COMPRESSED_WOOL);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_WOOL, Components.RECIPE_TRIPLE_COMPRESSED_WOOL);

        //couro
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_LEATHER, Components.RECIPE_SINGLE_COMPRESSED_LEATHER);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_LEATHER, Components.RECIPE_DOUBLE_COMPRESSED_LEATHER);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_LEATHER, Components.RECIPE_TRIPLE_COMPRESSED_LEATHER);

        //madeira
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.RECIPE_SINGLE_COMPRESSED_OAK_WOOD);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.RECIPE_DOUBLE_COMPRESSED_OAK_WOOD);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_OAK_WOOD, Components.RECIPE_TRIPLE_COMPRESSED_OAK_WOOD);


        //esponja
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_SPONGE, Components.RECIPE_SINGLE_COMPRESSED_SPONGE);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_SPONGE, Components.RECIPE_DOUBLE_COMPRESSED_SPONGE);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_SPONGE, Components.RECIPE_TRIPLE_COMPRESSED_SPONGE);

        //Bola de Slime
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.RECIPE_SINGLE_COMPRESSED_SLIME_BALL);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.RECIPE_DOUBLE_COMPRESSED_SLIME_BALL);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_SLIME_BALL, Components.RECIPE_TRIPLE_COMPRESSED_SLIME_BALL);


        //Creme de Magma
        registerEnhancedCraft(plugin, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.RECIPE_SINGLE_COMPRESSED_MAGMA_CREAM);
        registerEnhancedCraft(plugin, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.RECIPE_DOUBLE_COMPRESSED_MAGMA_CREAM);
        registerEnhancedCraft(plugin, Components.TRIPLE_COMPRESSED_MAGMA_CREAM, Components.RECIPE_TRIPLE_COMPRESSED_MAGMA_CREAM);

        //gemas
        registerEnhancedCraft(plugin, Components.SYNTHETIC_AMETHYST, Components.RECIPE_SYNTHETIC_AMETHYST);
        registerEnhancedCraft(plugin, Components.SYNTHETIC_RUBY, Components.RECIPE_SYNTHETIC_RUBY);


    }


    private static void registerEnhancedCraft(BioTech plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register(plugin);
    }
}


