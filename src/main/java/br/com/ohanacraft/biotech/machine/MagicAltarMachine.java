package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.generic.MediumContainerMachine;
import br.com.ohanacraft.biotech.addons.supremeexpansion.Cetrus;
import br.com.ohanacraft.biotech.addons.supremeexpansion.SupremeComponents;
import br.com.ohanacraft.biotech.util.Energy;
import br.com.ohanacraft.biotech.util.SimpleRecipe;
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


public class MagicAltarMachine extends MediumContainerMachine {

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SlimefunItemStack(
      "MAGIC_ALTAR_MACHINE",
      Material.SMOKER, "&bMagic Altar",
      "", "&fCraft Rune and Magical Items",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      Energy.energyPowerPerSecond(20));

  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{
      SlimefunItems.ANCIENT_PEDESTAL, SupremeComponents.CRYSTALLIZER_MACHINE,
      SlimefunItems.ANCIENT_PEDESTAL,
      SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.ANCIENT_ALTAR, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.ANCIENT_PEDESTAL, SupremeComponents.INDUCTOR_MACHINE, SlimefunItems.ANCIENT_PEDESTAL};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SlimefunItemStack(
      "MAGIC_ALTAR_MACHINE_II",
      Material.SMOKER, "&bMagic Altar II",
      "", "&fAdvanced Craft Rune and Magical Items",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      Energy.energyPowerPerSecond(100));

  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_II = new ItemStack[]{
      SupremeComponents.THORNERITE, Cetrus.CETRUS_AQUA, SupremeComponents.THORNERITE,
      Cetrus.CETRUS_VENTUS, MagicAltarMachine.MAGIC_ALTAR_MACHINE, Cetrus.CETRUS_LUX,
      SupremeComponents.THORNERITE, Cetrus.CETRUS_IGNIS, SupremeComponents.THORNERITE};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SlimefunItemStack(
      "MAGIC_ALTAR_MACHINE_III",
      Material.SMOKER, "&bMagic Altar III",
      "", "&fAdvanced Craft Rune and Magical Items",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      Energy.energyPowerPerSecond(300));

  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_III = new ItemStack[]{
      SupremeComponents.THORNERITE, Cetrus.CETRUS_LUMIUM, SupremeComponents.THORNERITE,
      SupremeComponents.SUPREME, MagicAltarMachine.MAGIC_ALTAR_MACHINE_II, SupremeComponents.SUPREME,
      SupremeComponents.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final SimpleRecipe RECIPE_RUNE_AIR = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4),
      new ItemStack[]{
          new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.FEATHER),
          new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.GHAST_TEAR),
          new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.FEATHER)
      });
  public static final SimpleRecipe RECIPE_RUNE_EARTH = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 4),
      new ItemStack[]{
          new ItemStack(Material.DIRT), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE),
          new ItemStack(Material.OBSIDIAN), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.OBSIDIAN),
          new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.DIRT)
      });
  public static final SimpleRecipe RECIPE_RUNE_FIRE = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 4),
      new ItemStack[]{
          new ItemStack(Material.FIRE_CHARGE), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.FIRE_CHARGE),
          new ItemStack(Material.BLAZE_POWDER), new ItemStack(SlimefunItems.EARTH_RUNE),
          new ItemStack(Material.FLINT_AND_STEEL),
          new ItemStack(Material.FIRE_CHARGE), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.FIRE_CHARGE)
      });
  public static final SimpleRecipe RECIPE_RUNE_WATER = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.WATER_RUNE, 4),
      new ItemStack[]{
          new ItemStack(Material.SALMON), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.WATER_BUCKET),
          new ItemStack(Material.SAND), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.SAND),
          new ItemStack(Material.WATER_BUCKET), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.COD)
      });
  public static final SimpleRecipe RECIPE_RUNE_ENDER = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 6),
      new ItemStack[]{
          new ItemStack(Material.ENDER_PEARL), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.ENDER_PEARL),
          new ItemStack(Material.ENDER_EYE), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.ENDER_EYE),
          new ItemStack(Material.ENDER_PEARL), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.ENDER_PEARL)
      });
  public static final SimpleRecipe RECIPE_RUNE_LIGHTNING = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 4),
      new ItemStack[]{
          new ItemStack(Material.IRON_INGOT), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.IRON_INGOT),
          new ItemStack(SlimefunItems.AIR_RUNE), new ItemStack(Material.PHANTOM_MEMBRANE),
          new ItemStack(SlimefunItems.WATER_RUNE),
          new ItemStack(Material.IRON_INGOT), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.IRON_INGOT)
      });
  public static final SimpleRecipe RECIPE_RUNE_RAINBOW = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.RAINBOW_RUNE, 1),
      new ItemStack[]{
          new ItemStack(Material.RED_DYE), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.CYAN_DYE),
          new ItemStack(Material.WHITE_WOOL), new ItemStack(SlimefunItems.ENDER_RUNE),
          new ItemStack(Material.WHITE_WOOL),
          new ItemStack(Material.YELLOW_DYE), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.MAGENTA_DYE)
      });
  public static final SimpleRecipe RECIPE_RUNE_SOULBOUND = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.SOULBOUND_RUNE, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.ENDER_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)
      });
  public static final SimpleRecipe RECIPE_RUNE_ENCHANTMENT = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(SlimefunItems.MAGICAL_GLASS), new ItemStack(SlimefunItems.LIGHTNING_RUNE),
          new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)
      });
  public static final SimpleRecipe RECIPE_RUNE_VILLAGERS = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.VILLAGER_RUNE, 3),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(Material.CRYING_OBSIDIAN),
          new ItemStack(SlimefunItems.STRANGE_NETHER_GOO), new ItemStack(SlimefunItems.FIRE_RUNE),
          new ItemStack(SlimefunItems.STRANGE_NETHER_GOO),
          new ItemStack(Material.CRYING_OBSIDIAN), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)
      });
  public static final SimpleRecipe RECIPE_BLANK_RUNE = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1),
      new ItemStack[]{
          new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.OBSIDIAN),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE)
      });
  public static final SimpleRecipe RECIPE_ESSENCE_OF_AFTERLIFE = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(SlimefunItems.EARTH_RUNE), new ItemStack(SlimefunItems.NECROTIC_SKULL),
          new ItemStack(SlimefunItems.FIRE_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.WATER_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3)
      });
  public static final SimpleRecipe RECIPE_LAVA_CRYSTAL = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.LAVA_CRYSTAL, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.BLAZE_POWDER), new ItemStack(SlimefunItems.FIRE_RUNE),
          new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1)
      });
  public static final SimpleRecipe RECIPE_MAGICAL_GLASS = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.MAGICAL_GLASS, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_DUST),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.GLASS_PANE),
          new ItemStack(Material.EXPERIENCE_BOTTLE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(Material.EXPERIENCE_BOTTLE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2)
      });
  public static final SimpleRecipe RECIPE_COMMON_TALISMAN = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.COMMON_TALISMAN, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_8K),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          null, new ItemStack(Material.EMERALD), null,
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_8K),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2)
      });
  public static final SimpleRecipe RECIPE_MAGICAL_BOOK_COVER = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.MAGICAL_BOOK_COVER, 1),
      new ItemStack[]{
          null, new ItemStack(SlimefunItems.MAGIC_LUMP_2), null,
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(Material.BOOK),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          null, new ItemStack(SlimefunItems.MAGIC_LUMP_2), null
      });
  public static final SimpleRecipe RECIPE_POWER_CRYSTAL = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL, 1),
      new ItemStack[]{
          new ItemStack(Material.REDSTONE), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE),
          new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND),
          new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE)
      });
  public static final SimpleRecipe RECIPE_ELYTRA_SCALE = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.FEATHER),
          new ItemStack(Material.PHANTOM_MEMBRANE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3)
      });
  public static final SimpleRecipe RECIPE_ELITROS = new SimpleRecipe(
      new ItemStack(Material.ELYTRA, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE),
          new ItemStack(SlimefunItems.AIR_RUNE), new ItemStack(Material.LEATHER_CHESTPLATE),
          new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE)
      });
  public static final SimpleRecipe RECIPE_INFUSED_ELYTRA = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.INFUSED_ELYTRA, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE),
          new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE),
          new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE), new ItemStack(Material.ELYTRA),
          new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE),
          new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.FLASK_OF_KNOWLEDGE)
      });

  public MagicAltarMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<SimpleRecipe> getAllRecipe() {
    List<SimpleRecipe> list = new ArrayList<>();
    list.add(RECIPE_RUNE_AIR);
    list.add(RECIPE_RUNE_EARTH);
    list.add(RECIPE_RUNE_FIRE);
    list.add(RECIPE_RUNE_WATER);
    list.add(RECIPE_RUNE_ENDER);
    list.add(RECIPE_RUNE_LIGHTNING);
    list.add(RECIPE_RUNE_RAINBOW);
    list.add(RECIPE_RUNE_SOULBOUND);
    list.add(RECIPE_RUNE_ENCHANTMENT);
    list.add(RECIPE_RUNE_VILLAGERS);
    list.add(RECIPE_BLANK_RUNE);
    list.add(RECIPE_ESSENCE_OF_AFTERLIFE);
    list.add(RECIPE_LAVA_CRYSTAL);
    list.add(RECIPE_MAGICAL_GLASS);
    list.add(RECIPE_COMMON_TALISMAN);
    list.add(RECIPE_MAGICAL_BOOK_COVER);
    list.add(RECIPE_POWER_CRYSTAL);
    list.add(RECIPE_ELYTRA_SCALE);
    list.add(RECIPE_ELITROS);
    list.add(RECIPE_INFUSED_ELYTRA);
    return list;
  }

}
