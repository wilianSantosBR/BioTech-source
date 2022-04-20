package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.addons.supremeexpansion.Cetrus;
import br.com.ohanacraft.biotech.addons.supremeexpansion.Components;
import br.com.ohanacraft.biotech.generic.SimpleItemContainerMachine;
import br.com.ohanacraft.biotech.util.SimpleItemRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ForgeMagicalMachine extends SimpleItemContainerMachine {

  public static final SlimefunItemStack FORGE_MAGICAL_MACHINE = new SlimefunItemStack(
      "FORGE_MAGICAL_MACHINE", Material.ENCHANTING_TABLE,
      "&bForge Magical", "", "&fThis machine allows you to", "&fforge magical resources.",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20));

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE = new ItemStack[]{
      Components.STAINLESS_MACHINE, new ItemStack(Material.ENCHANTING_TABLE),
      Components.STAINLESS_MACHINE,
      Components.INDUCTOR_MACHINE, Components.CRYSTALLIZER_MACHINE, Components.INDUCTOR_MACHINE,
      SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
      SlimefunItems.ELECTRIFIED_CRUCIBLE_3};

  public static final SlimefunItemStack FORGE_MAGICAL_MACHINE_II = new SlimefunItemStack(
      "FORGE_MAGICAL_MACHINE_II", Material.ENCHANTING_TABLE,
      "&bForge Magical II", "", "&fThis machine allows you to", "&fforge magical resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100));

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE_II = new ItemStack[]{
      Components.CONVEYANCE_MACHINE, Cetrus.CETRUS_LUX, Components.CONVEYANCE_MACHINE,
      Components.INDUCTOR_MACHINE, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE,
      Components.INDUCTOR_MACHINE,
      Components.THORNERITE, Cetrus.CETRUS_LUMIUM, Components.THORNERITE};

  public static final SlimefunItemStack FORGE_MAGICAL_MACHINE_III = new SlimefunItemStack(
      "FORGE_MAGICAL_MACHINE_III", Material.ENCHANTING_TABLE,
      "&bForge Magical III", "", "&fThis machine allows you to", "&fforge magical resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300));

  public static final ItemStack[] RECIPE_FORGE_MAGICAL_MACHINE_III = new ItemStack[]{
      Components.THORNERITE, Cetrus.CETRUS_LUX, Components.THORNERITE,
      Components.SUPREME, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_II, Components.SUPREME,
      Components.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, Components.CRYSTALLIZER_MACHINE};
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_GRAVEL = new SimpleItemRecipe(
      new ItemStack(Material.COBBLESTONE, 32), new ItemStack(Material.GRAVEL, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SAND = new SimpleItemRecipe(
      new ItemStack(Material.GRAVEL, 32), new ItemStack(Material.SAND, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SOUL_SAND = new SimpleItemRecipe(
      new ItemStack(Material.SAND, 32), new ItemStack(Material.SOUL_SAND, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_QUARTZ = new SimpleItemRecipe(
      new ItemStack(Material.SOUL_SAND, 32), new ItemStack(Material.QUARTZ, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_NETHERRACK = new SimpleItemRecipe(
      new ItemStack(Material.STONE, 32), new ItemStack(Material.NETHERRACK, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_NETHER_WART = new SimpleItemRecipe(
      new ItemStack(Material.WHEAT, 32), new ItemStack(Material.NETHER_WART, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_1 = new SimpleItemRecipe(
      new ItemStack(Material.NETHER_WART, 32),
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_2 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 32),
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_MAGICLUMP_3 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 32),
      new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ENDER_EYE = new SimpleItemRecipe(
      new ItemStack(Material.ENDER_PEARL, 16), new ItemStack(Material.ENDER_EYE, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_1 = new SimpleItemRecipe(
      new ItemStack(Material.ENDER_EYE, 32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_2 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 32),
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ENDERLUMP_3 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 32),
      new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_SAPPHIRE = new SimpleItemRecipe(
      new ItemStack(Material.LAPIS_LAZULI, 32),
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_EMERALD = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32),
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_EMERALD, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_CARBON = new SimpleItemRecipe(
      new ItemStack(Material.COAL, 32), new SlimefunItemStack(SlimefunItems.CARBON, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_COMPRESSED_CARBON = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.CARBON, 32),
      new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_CARBON_CHUNK = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, 32),
      new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 4));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SYNTHETIC_DIAMOND = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.CARBON_CHUNK, 16),
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_CARBONADO = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND, 16),
      new SlimefunItemStack(SlimefunItems.CARBONADO, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SOLAR_PANEL = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.FERROSILICON, 32),
      new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_MAGNET = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.MAGNET, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ELECTRO_MAGNET = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGNET, 32),
      new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_ELECTRIC_MOTOR = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 32),
      new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_HEATING_COIL = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR, 32),
      new SlimefunItemStack(SlimefunItems.HEATING_COIL, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_TINY_URANIUM = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.CRUSHED_ORE, 32),
      new SlimefunItemStack(SlimefunItems.TINY_URANIUM, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_SMALL_URANIUM = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.TINY_URANIUM, 32),
      new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_URANIUM = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.SMALL_URANIUM, 32),
      new SlimefunItemStack(SlimefunItems.URANIUM, 8));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.URANIUM, 32),
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_2 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_3 = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_2, 32),
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_STEEL_PLATE = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 4));
  public static final SimpleItemRecipe RECIPE_FORGE_MAGICAL_REINFORCED_PLATE = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 4));

  public ForgeMagicalMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<SimpleItemRecipe> getAllRecipe() {
    List<SimpleItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_MAGICAL_GRAVEL);
    list.add(RECIPE_FORGE_MAGICAL_SAND);
    list.add(RECIPE_FORGE_MAGICAL_SOUL_SAND);
    list.add(RECIPE_FORGE_MAGICAL_QUARTZ);
    list.add(RECIPE_FORGE_MAGICAL_NETHERRACK);
    list.add(RECIPE_FORGE_MAGICAL_NETHER_WART);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_1);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_2);
    list.add(RECIPE_FORGE_MAGICAL_MAGICLUMP_3);
    list.add(RECIPE_FORGE_MAGICAL_ENDER_EYE);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_1);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_2);
    list.add(RECIPE_FORGE_MAGICAL_ENDERLUMP_3);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_SAPPHIRE);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_EMERALD);
    list.add(RECIPE_FORGE_MAGICAL_CARBON);
    list.add(RECIPE_FORGE_MAGICAL_COMPRESSED_CARBON);
    list.add(RECIPE_FORGE_MAGICAL_CARBON_CHUNK);
    list.add(RECIPE_FORGE_MAGICAL_SYNTHETIC_DIAMOND);
    list.add(RECIPE_FORGE_MAGICAL_CARBONADO);
    list.add(RECIPE_FORGE_MAGICAL_SOLAR_PANEL);
    list.add(RECIPE_FORGE_MAGICAL_MAGNET);
    list.add(RECIPE_FORGE_MAGICAL_ELECTRO_MAGNET);
    list.add(RECIPE_FORGE_MAGICAL_ELECTRIC_MOTOR);
    list.add(RECIPE_FORGE_MAGICAL_HEATING_COIL);
    list.add(RECIPE_FORGE_MAGICAL_TINY_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_SMALL_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_URANIUM);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_2);
    list.add(RECIPE_FORGE_MAGICAL_BLISTERING_INGOT_3);
    list.add(RECIPE_FORGE_MAGICAL_STEEL_PLATE);
    list.add(RECIPE_FORGE_MAGICAL_REINFORCED_PLATE);
    return list;
  }

}
