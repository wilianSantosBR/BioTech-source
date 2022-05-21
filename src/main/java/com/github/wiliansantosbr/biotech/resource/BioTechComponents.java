package com.github.wiliansantosbr.biotech.resource;

import com.github.wiliansantosbr.biotech.ItemGroups;
import com.github.wiliansantosbr.biotech.machine.TechMutation;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class BioTechComponents {

  //lã

  public static final SlimefunItemStack SINGLE_COMPRESSED_WOOL = new SlimefunItemStack("BIOTECH_SINGLE_WOOL",
      Material.WHITE_WOOL, "&eSingle Compressed Wool", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_WOOL = {new ItemStack(Material.WHITE_WOOL),
      new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
      new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL),
      new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.WHITE_WOOL)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_WOOL = new SlimefunItemStack("BIOTECH_DOUBLE_WOOL",
      Material.WHITE_WOOL, "&eDouble Compressed Wool", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_WOOL = {BioTechComponents.SINGLE_COMPRESSED_WOOL,
      BioTechComponents.SINGLE_COMPRESSED_WOOL, BioTechComponents.SINGLE_COMPRESSED_WOOL,
      BioTechComponents.SINGLE_COMPRESSED_WOOL, BioTechComponents.SINGLE_COMPRESSED_WOOL,
      BioTechComponents.SINGLE_COMPRESSED_WOOL, BioTechComponents.SINGLE_COMPRESSED_WOOL,
      BioTechComponents.SINGLE_COMPRESSED_WOOL, BioTechComponents.SINGLE_COMPRESSED_WOOL};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_WOOL = new SlimefunItemStack("BIOTECH_TRIPLE_WOOL",
      Material.WHITE_WOOL, "&eTriple Compressed Wool", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_WOOL = {BioTechComponents.DOUBLE_COMPRESSED_WOOL,
      BioTechComponents.DOUBLE_COMPRESSED_WOOL, BioTechComponents.DOUBLE_COMPRESSED_WOOL,
      BioTechComponents.DOUBLE_COMPRESSED_WOOL, BioTechComponents.DOUBLE_COMPRESSED_WOOL,
      BioTechComponents.DOUBLE_COMPRESSED_WOOL, BioTechComponents.DOUBLE_COMPRESSED_WOOL,
      BioTechComponents.DOUBLE_COMPRESSED_WOOL, BioTechComponents.DOUBLE_COMPRESSED_WOOL};

  //Couro

  public static final SlimefunItemStack SINGLE_COMPRESSED_LEATHER = new SlimefunItemStack("BIOTECH_SINGLE_LEATHER",
      Material.LEATHER, "&eSingle Compressed Leather", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_LEATHER = {new ItemStack(Material.LEATHER),
      new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
      new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
      new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_LEATHER = new SlimefunItemStack("BIOTECH_DOUBLE_LEATHER",
      Material.LEATHER, "&eDouble Compressed Leather", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_LEATHER = {BioTechComponents.SINGLE_COMPRESSED_LEATHER,
      BioTechComponents.SINGLE_COMPRESSED_LEATHER, BioTechComponents.SINGLE_COMPRESSED_LEATHER,
      BioTechComponents.SINGLE_COMPRESSED_LEATHER, BioTechComponents.SINGLE_COMPRESSED_LEATHER,
      BioTechComponents.SINGLE_COMPRESSED_LEATHER, BioTechComponents.SINGLE_COMPRESSED_LEATHER,
      BioTechComponents.SINGLE_COMPRESSED_LEATHER, BioTechComponents.SINGLE_COMPRESSED_LEATHER};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_LEATHER = new SlimefunItemStack("BIOTECH_TRIPLE_LEATHER",
      Material.LEATHER, "&eTriple Compressed Leather", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_LEATHER = {BioTechComponents.DOUBLE_COMPRESSED_LEATHER,
      BioTechComponents.DOUBLE_COMPRESSED_LEATHER, BioTechComponents.DOUBLE_COMPRESSED_LEATHER,
      BioTechComponents.DOUBLE_COMPRESSED_LEATHER, BioTechComponents.DOUBLE_COMPRESSED_LEATHER,
      BioTechComponents.DOUBLE_COMPRESSED_LEATHER, BioTechComponents.DOUBLE_COMPRESSED_LEATHER,
      BioTechComponents.DOUBLE_COMPRESSED_LEATHER, BioTechComponents.DOUBLE_COMPRESSED_LEATHER};

  //Madeira

  public static final SlimefunItemStack SINGLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("BIOTECH_SINGLE_OAK_WOOD",
      Material.OAK_WOOD, "&eSingle Compressed Wood", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_OAK_WOOD = {new ItemStack(Material.OAK_WOOD),
      new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
      new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD),
      new ItemStack(Material.OAK_WOOD), new ItemStack(Material.OAK_WOOD)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("BIOTECH_DOUBLE_OAK_WOOD",
      Material.OAK_WOOD, "&eDouble Compressed Wood", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_OAK_WOOD = {BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD, BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD, BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD, BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD, BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_OAK_WOOD = new SlimefunItemStack("BIOTECH_TRIPLE_OAK_WOOD",
      Material.OAK_WOOD, "&eTriple Compressed Wood", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_OAK_WOOD = {BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD, BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD, BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD, BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD,
      BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD, BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD};

  //esponja

  public static final SlimefunItemStack SINGLE_COMPRESSED_SPONGE = new SlimefunItemStack("BIOTECH_SINGLE_SPONGE",
      Material.SPONGE, "&eSingle Compressed Sponge", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SPONGE = {new ItemStack(Material.SPONGE),
      new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
      new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE),
      new ItemStack(Material.SPONGE), new ItemStack(Material.SPONGE)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_SPONGE = new SlimefunItemStack("BIOTECH_DOUBLE_SPONGE",
      Material.SPONGE, "&eDouble Compressed Sponge", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SPONGE = {BioTechComponents.SINGLE_COMPRESSED_SPONGE,
      BioTechComponents.SINGLE_COMPRESSED_SPONGE, BioTechComponents.SINGLE_COMPRESSED_SPONGE,
      BioTechComponents.SINGLE_COMPRESSED_SPONGE, BioTechComponents.SINGLE_COMPRESSED_SPONGE,
      BioTechComponents.SINGLE_COMPRESSED_SPONGE, BioTechComponents.SINGLE_COMPRESSED_SPONGE,
      BioTechComponents.SINGLE_COMPRESSED_SPONGE, BioTechComponents.SINGLE_COMPRESSED_SPONGE};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_SPONGE = new SlimefunItemStack("BIOTECH_TRIPLE_SPONGE",
      Material.SPONGE, "&eTriple Compressed Sponge", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SPONGE = {BioTechComponents.DOUBLE_COMPRESSED_SPONGE,
      BioTechComponents.DOUBLE_COMPRESSED_SPONGE, BioTechComponents.DOUBLE_COMPRESSED_SPONGE,
      BioTechComponents.DOUBLE_COMPRESSED_SPONGE, BioTechComponents.DOUBLE_COMPRESSED_SPONGE,
      BioTechComponents.DOUBLE_COMPRESSED_SPONGE, BioTechComponents.DOUBLE_COMPRESSED_SPONGE,
      BioTechComponents.DOUBLE_COMPRESSED_SPONGE, BioTechComponents.DOUBLE_COMPRESSED_SPONGE};

  //Bola de Slime


  public static final SlimefunItemStack SINGLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack(
      "BIOTECH_SINGLE_SLIME_BALL", Material.SLIME_BALL, "&eSingle Compressed Slime Ball", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_SLIME_BALL = {new ItemStack(Material.SLIME_BALL),
      new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
      new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL),
      new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack(
      "BIOTECH_DOUBLE_SLIME_BALL", Material.SLIME_BALL, "&eDouble Compressed Slime Ball", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_SLIME_BALL = {
      BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL, BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL, BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL, BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL, BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_SLIME_BALL = new SlimefunItemStack(
      "BIOTECH_TRIPLE_SLIME_BALL", Material.SLIME_BALL, "&eTriple Compressed Slime Ball", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_SLIME_BALL = {
      BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL, BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL, BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL, BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL, BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL,
      BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL};

  //Creme de Magma


  public static final SlimefunItemStack SINGLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack(
      "BIOTECH_SINGLE_MAGMA_CREAM", Material.MAGMA_CREAM, "&eSingle Compressed Magma Cream", "", "&8(9x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_SINGLE_COMPRESSED_MAGMA_CREAM = {new ItemStack(Material.MAGMA_CREAM),
      new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
      new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM),
      new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.MAGMA_CREAM)};

  public static final SlimefunItemStack DOUBLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack(
      "BIOTECH_DOUBLE_MAGMA_CREAM", Material.MAGMA_CREAM, "&eDouble Compressed Magma Cream", "", "&8(81x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_DOUBLE_COMPRESSED_MAGMA_CREAM = {
      BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM};

  public static final SlimefunItemStack TRIPLE_COMPRESSED_MAGMA_CREAM = new SlimefunItemStack(
      "BIOTECH_TRIPLE_MAGMA_CREAM", Material.MAGMA_CREAM, "&eTriple Compressed Magma Cream", "", "&8(729x)",
      "", "&7BioTech Component");
  private static final ItemStack[] RECIPE_TRIPLE_COMPRESSED_MAGMA_CREAM = {
      BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM, BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM,
      BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM};


  // componente
  public static final SlimefunItemStack BIOTECH_CENTER_CARD_SIMPLE = new SlimefunItemStack("BIOTECH_CENTER_CARD_SIMPLE",
      Material.MUSIC_DISC_11, "&BComponente Básico para Card", "", "&fComponente para Maquina de produzir itens", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_SIMPLE = new ItemStack[]{
      SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ADVANCED_CIRCUIT_BOARD, SupremeComponents.SYNTHETIC_AMETHYST, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD};

  public static final SlimefunItemStack BIOTECH_CENTER_CARD_ADVANCED = new SlimefunItemStack(
      "BIOTECH_CENTER_CARD_ADVANCED", Material.MUSIC_DISC_PIGSTEP, "&BComponente Avançado para Card", "",
      "&fComponente para Maquina de produzir itens", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_ADVANCED = new ItemStack[]{
      SlimefunItems.ADVANCED_CIRCUIT_BOARD, BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE, SupremeComponents.SYNTHETIC_RUBY, BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE,
      SlimefunItems.HEATING_COIL, BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL};

  public static final SlimefunItemStack BIOTECH_CENTER_CARD_ULTIMATE = new SlimefunItemStack(
      "BIOTECH_CENTER_CARD_ULTIMATE", Material.MUSIC_DISC_PIGSTEP, "&BComponente Ultimate para Card", "",
      "&fComponente para Maquina de produzir itens", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_CENTER_CARD_ULTIMATE = new ItemStack[]{
      SupremeComponents.SYNTHETIC_RUBY, BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED, SupremeComponents.SYNTHETIC_RUBY,
      BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED, SupremeComponents.PETRIFIER_MACHINE, BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED,
      SlimefunItems.REINFORCED_PLATE, BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE};

  //pó

  public static final SlimefunItemStack BIOTECH_DUST_NETHERITE = new SlimefunItemStack("BIOTECH_DUST_NETHERITE",
      Material.MELON_SEEDS, "&fNetherite Dust", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_DUST_NETHERITE = new ItemStack[]{
      new ItemStack(Material.NETHERITE_INGOT), null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack BIOTECH_DUST_GLOW_INK = new SlimefunItemStack("BIOTECH_DUST_GLOW_INK",
      Material.PUMPKIN_SEEDS, "&fGlow Ink Dust", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_DUST_GLOW_INK = new ItemStack[]{new ItemStack(Material.GLOW_INK_SAC),
      null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack BIOTECH_DUST_AMETHYST = new SlimefunItemStack("BIOTECH_DUST_AMETHYST",
      Material.BEETROOT_SEEDS, "&fAmethyst Dust", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_DUST_AMETHYST = new ItemStack[]{
      new ItemStack(Material.AMETHYST_SHARD), null, null, null, null, null, null, null, null};

  //Gene

  public static final SlimefunItemStack BIOTECH_GENE_BERSERK = new SlimefunItemStack("BIOTECH_GENE_BERSERK",
      Material.FIRE_CORAL, "&fBerserk Gene", "",
      "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_GENE_INTELLIGENCE = new SlimefunItemStack("BIOTECH_GENE_INTELLIGENCE",
      Material.TUBE_CORAL, "&fIntelligence Gene", "",
      "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_GENE_LUCK = new SlimefunItemStack("BIOTECH_GENE_LUCK",
      Material.HORN_CORAL, "&fLuck Gene", "",
      "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_GENE_CORE = new SlimefunItemStack("BIOTECH_GENE_CORE", Material.CONDUIT,
      "&fGene Core", "",
      "&7BioTech Component");
  private static final ItemStack[] RECIPE_BIOTECH_GENE_CORE = new ItemStack[]{BioTechComponents.BIOTECH_GENE_BERSERK,
      SupremeComponents.SYNTHETIC_RUBY, BioTechComponents.BIOTECH_GENE_BERSERK,
      BioTechComponents.BIOTECH_GENE_INTELLIGENCE, SupremeComponents.SYNTHETIC_RUBY,
      BioTechComponents.BIOTECH_GENE_INTELLIGENCE, BioTechComponents.BIOTECH_GENE_LUCK,
      SupremeComponents.SYNTHETIC_RUBY, BioTechComponents.BIOTECH_GENE_LUCK};


  public static void setup(BioTech plugin) {

    //lã
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_WOOL,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_WOOL);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_WOOL,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_WOOL);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_WOOL,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_WOOL);

    //couro
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_LEATHER,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_LEATHER);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_LEATHER,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_LEATHER);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_LEATHER,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_LEATHER);

    //madeira
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_OAK_WOOD,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_OAK_WOOD);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_OAK_WOOD,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_OAK_WOOD);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_OAK_WOOD,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_OAK_WOOD);

    //esponja
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_SPONGE,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_SPONGE);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_SPONGE,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_SPONGE);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_SPONGE,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_SPONGE);

    //Bola de Slime
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_SLIME_BALL,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_SLIME_BALL);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_SLIME_BALL,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_SLIME_BALL);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_SLIME_BALL,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_SLIME_BALL);

    //Creme de Magma
    registerEnhancedCraft(plugin, BioTechComponents.SINGLE_COMPRESSED_MAGMA_CREAM,
        BioTechComponents.RECIPE_SINGLE_COMPRESSED_MAGMA_CREAM);
    registerEnhancedCraft(plugin, BioTechComponents.DOUBLE_COMPRESSED_MAGMA_CREAM,
        BioTechComponents.RECIPE_DOUBLE_COMPRESSED_MAGMA_CREAM);
    registerEnhancedCraft(plugin, BioTechComponents.TRIPLE_COMPRESSED_MAGMA_CREAM,
        BioTechComponents.RECIPE_TRIPLE_COMPRESSED_MAGMA_CREAM);

    //discos
    registerEnhancedCraft(plugin, BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE,
        BioTechComponents.RECIPE_BIOTECH_CENTER_CARD_SIMPLE);
    registerEnhancedCraft(plugin, BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED,
        BioTechComponents.RECIPE_BIOTECH_CENTER_CARD_ADVANCED);
    registerEnhancedCraft(plugin, BioTechComponents.BIOTECH_CENTER_CARD_ULTIMATE,
        BioTechComponents.RECIPE_BIOTECH_CENTER_CARD_ULTIMATE);

    //po
    registerGrindStone(plugin, BioTechComponents.BIOTECH_DUST_NETHERITE,
        BioTechComponents.RECIPE_BIOTECH_DUST_NETHERITE);
    registerGrindStone(plugin, BioTechComponents.BIOTECH_DUST_GLOW_INK, BioTechComponents.RECIPE_BIOTECH_DUST_GLOW_INK);
    registerGrindStone(plugin, BioTechComponents.BIOTECH_DUST_AMETHYST, BioTechComponents.RECIPE_BIOTECH_DUST_AMETHYST);

    //gene
    addRecipeTechMutation(BioTechComponents.BIOTECH_DUST_NETHERITE, SlimefunItems.FIRE_RUNE,
        BioTechComponents.BIOTECH_GENE_BERSERK);
    addRecipeTechMutation(BioTechComponents.BIOTECH_DUST_GLOW_INK, SlimefunItems.LIGHTNING_RUNE,
        BioTechComponents.BIOTECH_GENE_LUCK);
    addRecipeTechMutation(BioTechComponents.BIOTECH_DUST_AMETHYST, SlimefunItems.RAINBOW_RUNE,
        BioTechComponents.BIOTECH_GENE_INTELLIGENCE);

    registerTechMutation(plugin, BioTechComponents.BIOTECH_GENE_BERSERK);
    registerTechMutation(plugin, BioTechComponents.BIOTECH_GENE_LUCK);
    registerTechMutation(plugin, BioTechComponents.BIOTECH_GENE_INTELLIGENCE);

    //gene core
    registerEnhancedCraft(plugin, BioTechComponents.BIOTECH_GENE_CORE, BioTechComponents.RECIPE_BIOTECH_GENE_CORE);

    //radiação
    addRecipeTechMutation(SlimefunItems.URANIUM, SlimefunItems.URANIUM, SlimefunItems.NEPTUNIUM);
    addRecipeTechMutation(SlimefunItems.NEPTUNIUM, SlimefunItems.NEPTUNIUM, SlimefunItems.PLUTONIUM);
    addRecipeTechMutation(SlimefunItems.PLUTONIUM, SlimefunItems.URANIUM, SlimefunItems.BOOSTED_URANIUM);
  }

  private static void registerEnhancedCraft(BioTech plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE,
        recipe).register(plugin);
  }

  private static void registerGrindStone(BioTech plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new SlimefunItem(ItemGroups.RESOURCE_CATEGORY, itemStack, RecipeType.GRIND_STONE, recipe,
        new SlimefunItemStack(itemStack, 1)).register(plugin);
  }

  private static void addRecipeTechMutation(SlimefunItemStack itemStack1, SlimefunItemStack itemStack2,
      SlimefunItemStack output) {
    TechMutation.addRecipe(itemStack1, itemStack2, 100, output);
  }

  private static void registerTechMutation(BioTech plugin, SlimefunItemStack output) {
    new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY, output, RecipeType.NULL,
        new ItemStack[]{TechMutation.TECH_MUTATION}).register(plugin);
  }
}


