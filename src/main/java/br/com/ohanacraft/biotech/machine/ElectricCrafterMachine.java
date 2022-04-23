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


public class ElectricCrafterMachine extends MediumContainerMachine {

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE = new SlimefunItemStack(
      "ELECTRIC_CRAFTER_MACHINE",
      Material.CRAFTING_TABLE, "&bElectric Crafter",
      "", "&fCraft Items",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      Energy.energyPowerPerSecond(20));

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE = new ItemStack[]{
      SupremeComponents.STAINLESS_MACHINE, SlimefunItems.VANILLA_AUTO_CRAFTER,
      SupremeComponents.STAINLESS_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.ENHANCED_AUTO_CRAFTER,
      SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_II = new SlimefunItemStack(
      "ELECTRIC_CRAFTER_MACHINE_II",
      Material.CRAFTING_TABLE, "&bElectric Crafter II",
      "", "&fAdvanced Craft Items",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      Energy.energyPowerPerSecond(100));

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE, SupremeComponents.BLEND_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_IGNIS, SupremeComponents.CRYSTALLIZER_MACHINE};

  public static final SlimefunItemStack ELECTRIC_CRAFTER_MACHINE_III = new SlimefunItemStack(
      "ELECTRIC_CRAFTER_MACHINE_III",
      Material.CRAFTING_TABLE, "&bElectric Crafter III",
      "", "&fAdvanced Craft Items",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      Energy.energyPowerPerSecond(300));

  public static final ItemStack[] RECIPE_ELECTRIC_CRAFTER_MACHINE_III = new ItemStack[]{
      SupremeComponents.THORNERITE, Cetrus.CETRUS_LUX, SupremeComponents.THORNERITE,
      SupremeComponents.SUPREME, ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_II, SupremeComponents.SUPREME,
      SupremeComponents.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final SimpleRecipe RECIPE_BATTERY = new SimpleRecipe(
      new SlimefunItemStack(SlimefunItems.BATTERY, 1),
      new ItemStack[]{
          new ItemStack(SlimefunItems.ZINC_INGOT), new ItemStack(SlimefunItems.SULFATE),
          new ItemStack(SlimefunItems.COPPER_INGOT),
          new ItemStack(SlimefunItems.ZINC_INGOT), new ItemStack(SlimefunItems.SULFATE),
          new ItemStack(SlimefunItems.COPPER_INGOT),
          new ItemStack(Material.REDSTONE), null, null
      });
  public static final SimpleRecipe RECIPE_BLAZE_POWDER = new SimpleRecipe(
      new ItemStack(Material.BLAZE_POWDER, 2),
      new ItemStack[]{
          new ItemStack(Material.BLAZE_ROD), null, null,
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_ENDER_EYE = new SimpleRecipe(
      new ItemStack(Material.ENDER_EYE, 1),
      new ItemStack[]{
          new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.ENDER_PEARL), null,
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_GLASS_BOTTLE = new SimpleRecipe(
      new ItemStack(Material.GLASS_BOTTLE, 3),
      new ItemStack[]{
          new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
          new ItemStack(Material.GLASS),
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_FISHING_ROD = new SimpleRecipe(
      new ItemStack(Material.FISHING_ROD, 1),
      new ItemStack[]{
          new ItemStack(Material.STICK), new ItemStack(Material.STRING),
          new ItemStack(Material.STRING),
          new ItemStack(Material.STICK), null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_FLINT_AND_STEEL = new SimpleRecipe(
      new ItemStack(Material.FLINT_AND_STEEL, 1),
      new ItemStack[]{
          new ItemStack(Material.IRON_INGOT), new ItemStack(Material.FLINT), null,
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_SHEARS = new SimpleRecipe(
      new ItemStack(Material.SHEARS, 1),
      new ItemStack[]{
          new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
          new ItemStack(Material.IRON_INGOT),
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_IRON_SWORD = new SimpleRecipe(
      new ItemStack(Material.IRON_SWORD, 1),
      new ItemStack[]{
          new ItemStack(Material.STICK), new ItemStack(Material.IRON_INGOT),
          new ItemStack(Material.IRON_INGOT),
          null, null, null,
          null, null, null
      });
  public static final SimpleRecipe RECIPE_BARREL = new SimpleRecipe(
      new ItemStack(Material.BARREL, 1),
      new ItemStack[]{
          new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_SLAB),
          new ItemStack(Material.OAK_PLANKS),
          new ItemStack(Material.OAK_PLANKS), null, new ItemStack(Material.OAK_PLANKS),
          new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_SLAB),
          new ItemStack(Material.OAK_PLANKS)
      });

  public ElectricCrafterMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<SimpleRecipe> getAllRecipe() {
    List<SimpleRecipe> list = new ArrayList<>();
    list.add(RECIPE_BATTERY);
    list.add(RECIPE_BLAZE_POWDER);
    list.add(RECIPE_ENDER_EYE);
    list.add(RECIPE_GLASS_BOTTLE);
    list.add(RECIPE_FISHING_ROD);
    list.add(RECIPE_FLINT_AND_STEEL);
    list.add(RECIPE_SHEARS);
    list.add(RECIPE_IRON_SWORD);
    list.add(RECIPE_BARREL);
    return list;
  }

}
