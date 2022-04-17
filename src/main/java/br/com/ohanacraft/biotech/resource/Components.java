package br.com.ohanacraft.biotech.resource;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
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
    public static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_OAK_WOOD= {
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD
    };

    //rubi

    public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SlimefunItemStack("SYNTHETIC_AMETHYST",
            Material.PURPLE_DYE, "&4Synthetic Amethyst", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_SAPPHIRE,
            SlimefunItems.SYNTHETIC_DIAMOND, new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.SYNTHETIC_DIAMOND,
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_SAPPHIRE
    };

    public static final SlimefunItemStack SYNTHETIC_RUBY = new SlimefunItemStack("SYNTHETIC_RUBY",
            Material.PINK_DYE, "&4Synthetic Ruby", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
            SlimefunItems.SYNTHETIC_DIAMOND, Components.SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND,
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD
    };
}
