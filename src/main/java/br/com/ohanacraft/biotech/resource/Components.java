package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeexpansion.SupremeComponents;
import br.com.ohanacraft.biotech.machine.TechMutation;
import br.com.ohanacraft.biotech.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Components {


    //lã

    public static final SlimefunItemStack SINGLE_COMPRESSED_WOOL = new SlimefunItemStack("SINGLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eSingle Compressed Wool", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_WOOL = {
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
            new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_WOOL = new SlimefunItemStack("DOUBLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eDouble Compressed Wool", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_WOOL = {
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL,
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL,
            Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL, Components.SINGLE_COMPRESSED_WOOL
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_WOOL = new SlimefunItemStack("TRIPLE_COMPRESSED_WOOL",
            Material.WHITE_WOOL, "&eTriple Compressed Wool", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_WOOL = {
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL,
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL,
            Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL, Components.DOUBLE_COMPRESSED_WOOL
    };

    //Couro

    public static final SlimefunItemStack SINGLE_COMPRESSED_LEATHER = new SlimefunItemStack("SINGLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eSingle Compressed Leather", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_LEATHER = {
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
            new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_LEATHER = new SlimefunItemStack("DOUBLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eDouble Compressed Leather", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_LEATHER = {
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER,
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER,
            Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER, Components.SINGLE_COMPRESSED_LEATHER
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_LEATHER = new SlimefunItemStack("TRIPLE_COMPRESSED_LEATHER",
            Material.LEATHER, "&eTriple Compressed Leather", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_LEATHER = {
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER,
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER,
            Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER, Components.DOUBLE_COMPRESSED_LEATHER
    };

    //Madeira

    public static final SlimefunItemStack SINGLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("SINGLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eSingle Compressed Wood", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_OAK_WOOD = {
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
            new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("DOUBLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eDouble Compressed Wood", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_OAK_WOOD = {
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD,
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD,
            Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD, Components.SINGLE_COMPRESSED_OAK_WOOD
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("TRIPLE_COMPRESSED_OAK_WOOD",
            Material.OAK_WOOD, "&eTriple Compressed Wood", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_OAK_WOOD = {
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD,
            Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD, Components.DOUBLE_COMPRESSED_OAK_WOOD
    };

    //esponja

    public static final SlimefunItemStack SINGLE_COMPRESSED_SPONGE = new SlimefunItemStack("SINGLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eSingle Compressed Sponge", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SPONGE = {
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
            new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_SPONGE = new SlimefunItemStack("DOUBLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eDouble Compressed Sponge", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SPONGE = {
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE,
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE,
            Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE, Components.SINGLE_COMPRESSED_SPONGE
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_SPONGE = new SlimefunItemStack("TRIPLE_COMPRESSED_SPONGE",
            Material.SPONGE, "&eTriple Compressed Sponge", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SPONGE = {
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE,
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE,
            Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE, Components.DOUBLE_COMPRESSED_SPONGE
    };


    //Bola de Slime


    public static final SlimefunItemStack SINGLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("SINGLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eSingle Compressed Slime Ball", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SLIME_BALL = {
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
            new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("DOUBLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eDouble Compressed Slime Ball", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SLIME_BALL = {
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL,
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL,
            Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL, Components.SINGLE_COMPRESSED_SLIME_BALL
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack("TRIPLE_COMPRESSED_SLIME_BALL",
            Material.SLIME_BALL, "&eTriple Compressed Slime Ball", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SLIME_BALL = {
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL,
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL,
            Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL, Components.DOUBLE_COMPRESSED_SLIME_BALL
    };

    //Creme de Magma


    public static final SlimefunItemStack SINGLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("SINGLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eSingle Compressed Magma Cream", "");
    private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_MAGMA_CREAM = {
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
            new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM)
    };

    public static final SlimefunItemStack DOUBLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("DOUBLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eDouble Compressed Magma Cream", "");
    private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_MAGMA_CREAM = {
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM,
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM,
            Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM, Components.SINGLE_COMPRESSED_MAGMA_CREAM
    };

    public static final SlimefunItemStack TRIPLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack("TRIPLE_COMPRESSED_MAGMA_CREAM",
            Material.MAGMA_CREAM, "&eTriple Compressed Magma Cream", "");
    private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_MAGMA_CREAM = {
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM,
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM,
            Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM, Components.DOUBLE_COMPRESSED_MAGMA_CREAM
    };


    //amethyst

    public static final SlimefunItemStack BIOTECH_SYNTHETIC_AMETHYST = new SlimefunItemStack("BIOTECH_SYNTHETIC_AMETHYST",
            Material.PURPLE_DYE, "&4Synthetic Amethyst", "");
    private static final ItemStack[] RECIPE_BIOTECH_SYNTHETIC_AMETHYST = {
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE,
            SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3,
            SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE
    };

    //rubi

    public static final SlimefunItemStack BIOTECH_SYNTHETIC_RUBY = new SlimefunItemStack("BIOTECH_SYNTHETIC_RUBY",
            Material.PINK_DYE, "&4Synthetic Ruby", "");
    private static final ItemStack[] RECIPE_BIOTECH_SYNTHETIC_RUBY = {
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
            SlimefunItems.SYNTHETIC_DIAMOND, Components.BIOTECH_SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND,
            SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD
    };



    // componente
    public static final SlimefunItemStack BIOTECH_CENTER_CARD_SIMPLE = new SlimefunItemStack("BIOTECH_CENTER_CARD_SIMPLE",
            Material.MUSIC_DISC_11,
            "&BComponente Básico para Card", "", "&fComponente para Maquina de produzir itens",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_SIMPLE = new ItemStack[]{
            SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD,
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, Components.BIOTECH_SYNTHETIC_AMETHYST, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD
    };

    public static final SlimefunItemStack BIOTECH_CENTER_CARD_ADVANCED = new SlimefunItemStack("BIOTECH_CENTER_CARD_ADVANCED",
            Material.MUSIC_DISC_PIGSTEP,
            "&BComponente Avançado para Card", "", "&fComponente para Maquina de produzir itens",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_ADVANCED = new ItemStack[]{
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, BIOTECH_CENTER_CARD_SIMPLE, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            BIOTECH_CENTER_CARD_SIMPLE, Components.BIOTECH_SYNTHETIC_RUBY, BIOTECH_CENTER_CARD_SIMPLE,
            SlimefunItems.HEATING_COIL, BIOTECH_CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL
    };

    public static final SlimefunItemStack BIOTECH_CENTER_CARD_ULTIMATE = new SlimefunItemStack("BIOTECH_CENTER_CARD_ULTIMATE",
            Material.MUSIC_DISC_PIGSTEP,
            "&BComponente Ultimate para Card", "", "&fComponente para Maquina de produzir itens",
            "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE));
    private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_ULTIMATE = new ItemStack[]{
            Components.BIOTECH_SYNTHETIC_RUBY, BIOTECH_CENTER_CARD_ADVANCED, Components.BIOTECH_SYNTHETIC_RUBY,
            BIOTECH_CENTER_CARD_ADVANCED, SupremeComponents.PETRIFIER_MACHINE, BIOTECH_CENTER_CARD_ADVANCED,
            SlimefunItems.REINFORCED_PLATE, BIOTECH_CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE
    };

    //pó

    public static final SlimefunItemStack BIOTECH_DUST_NETHERITE = new SlimefunItemStack("BIOTECH_DUST_NETHERITE",
            Material.MELON_SEEDS,
            "&fNetherite Dust", "");
    private static final ItemStack[] RECIPE_BIOTECH_DUST_NETHERITE = new ItemStack[]{
            new ItemStack(Material.NETHERITE_INGOT), null, null,
            null, null, null,
            null, null, null
    };

    public static final SlimefunItemStack BIOTECH_DUST_GLOW_INK = new SlimefunItemStack("BIOTECH_DUST_GLOW_INK",
            Material.PUMPKIN_SEEDS,
            "&fGlow Ink Dust", "");
    private static final ItemStack[] RECIPE_BIOTECH_DUST_GLOW_INK = new ItemStack[]{
            new ItemStack(Material.GLOW_INK_SAC), null, null,
            null, null, null,
            null, null, null
    };

    public static final SlimefunItemStack BIOTECH_DUST_AMETHYST = new SlimefunItemStack("BIOTECH_DUST_AMETHYST",
            Material.BEETROOT_SEEDS,
            "&fAmethyst Dust", "");
    private static final ItemStack[] RECIPE_BIOTECH_DUST_AMETHYST = new ItemStack[]{
            new ItemStack(Material.AMETHYST_SHARD), null, null,
            null, null, null,
            null, null, null
    };

    //Gene

    public static final SlimefunItemStack BIOTECH_GENE_BERSERK = new SlimefunItemStack("BIOTECH_GENE_BERSERK",
            Material.FIRE_CORAL,
            "&fBerserk Gene", "");

    public static final SlimefunItemStack BIOTECH_GENE_INTELLIGENCE = new SlimefunItemStack("BIOTECH_GENE_INTELLIGENCE",
            Material.TUBE_CORAL,
            "&fIntelligence Gene", "");

    public static final SlimefunItemStack BIOTECH_GENE_LUCK = new SlimefunItemStack("BIOTECH_GENE_LUCK",
            Material.HORN_CORAL,
            "&fLuck Gene", "");

    public static final SlimefunItemStack BIOTECH_GENE_CORE = new SlimefunItemStack("BIOTECH_GENE_CORE",
            Material.CONDUIT,
            "&fGene Core", "");
    private static final ItemStack[] RECIPE_BIOTECH_GENE_CORE = new ItemStack[]{
            Components.BIOTECH_GENE_BERSERK, Components.BIOTECH_SYNTHETIC_RUBY, Components.BIOTECH_GENE_BERSERK,
            Components.BIOTECH_GENE_INTELLIGENCE, Components.BIOTECH_SYNTHETIC_RUBY, Components.BIOTECH_GENE_INTELLIGENCE,
            Components.BIOTECH_GENE_LUCK, Components.BIOTECH_SYNTHETIC_RUBY, Components.BIOTECH_GENE_LUCK
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
        registerEnhancedCraft(plugin, Components.BIOTECH_SYNTHETIC_AMETHYST, Components.RECIPE_BIOTECH_SYNTHETIC_AMETHYST);
        registerEnhancedCraft(plugin, Components.BIOTECH_SYNTHETIC_RUBY, Components.RECIPE_BIOTECH_SYNTHETIC_RUBY);

        //discos
        registerEnhancedCraft(plugin, Components.BIOTECH_CENTER_CARD_SIMPLE, Components.RECIPE_BIOTECH_CENTER_CARD_SIMPLE);
        registerEnhancedCraft(plugin, Components.BIOTECH_CENTER_CARD_ADVANCED, Components.RECIPE_BIOTECH_CENTER_CARD_ADVANCED);
        registerEnhancedCraft(plugin, Components.BIOTECH_CENTER_CARD_ULTIMATE, Components.RECIPE_BIOTECH_CENTER_CARD_ULTIMATE);

        //po
        registerGrindStone(plugin, Components.BIOTECH_DUST_NETHERITE, Components.RECIPE_BIOTECH_DUST_NETHERITE);
        registerGrindStone(plugin, Components.BIOTECH_DUST_GLOW_INK, Components.RECIPE_BIOTECH_DUST_GLOW_INK);
        registerGrindStone(plugin, Components.BIOTECH_DUST_AMETHYST, Components.RECIPE_BIOTECH_DUST_AMETHYST);

        //gene
        addRecipeTechMutation(Components.BIOTECH_DUST_NETHERITE, SlimefunItems.FIRE_RUNE ,Components.BIOTECH_GENE_BERSERK);
        addRecipeTechMutation(Components.BIOTECH_DUST_GLOW_INK, SlimefunItems.LIGHTNING_RUNE,Components.BIOTECH_GENE_LUCK);
        addRecipeTechMutation(Components.BIOTECH_DUST_AMETHYST, SlimefunItems.RAINBOW_RUNE,Components.BIOTECH_GENE_INTELLIGENCE);

        registerTechMutation(plugin, Components.BIOTECH_GENE_BERSERK);
        registerTechMutation(plugin, Components.BIOTECH_GENE_LUCK);
        registerTechMutation(plugin, Components.BIOTECH_GENE_INTELLIGENCE);

        //gene core
        registerEnhancedCraft(plugin, Components.BIOTECH_GENE_CORE, Components.RECIPE_BIOTECH_GENE_CORE);

        //radiação
        addRecipeTechMutation(SlimefunItems.URANIUM, SlimefunItems.URANIUM,SlimefunItems.NEPTUNIUM);
        addRecipeTechMutation(SlimefunItems.NEPTUNIUM, SlimefunItems.NEPTUNIUM,SlimefunItems.PLUTONIUM);
        addRecipeTechMutation(SlimefunItems.PLUTONIUM, SlimefunItems.URANIUM,SlimefunItems.BOOSTED_URANIUM);
    }

    private static void registerEnhancedCraft(BioTech plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register(plugin);
    }

    private static void registerGrindStone(BioTech plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
        new SlimefunItem(Categories.RESOURCE_CATEGORY, itemStack, RecipeType.GRIND_STONE, recipe, new SlimefunItemStack(itemStack, 1)).register(plugin);
    }

    private static void addRecipeTechMutation(SlimefunItemStack itemStack1, SlimefunItemStack itemStack2, SlimefunItemStack output) {
        TechMutation.addRecipe(itemStack1,  itemStack2, 100, output);
    }

    private static void registerTechMutation(BioTech plugin, SlimefunItemStack output) {
        new ItemNotPlaceable(Categories.RESOURCE_CATEGORY, output, RecipeType.NULL, new ItemStack[]{TechMutation.TECH_MUTATION}).register(plugin);
    }
}


