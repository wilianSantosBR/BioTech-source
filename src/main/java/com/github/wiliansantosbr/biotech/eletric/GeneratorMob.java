package com.github.wiliansantosbr.biotech.eletric;

import com.github.wiliansantosbr.biotech.ItemGroups;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.inventory.ItemStack;

public class GeneratorMob extends AbstractEnergyProvider {

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB_BASIC = new SlimefunItemStack(
      "BIOTECH_GENERATOR_MOB_BASIC", Material.COMPOSTER, "&bGenerator Mob Basic", "",
      "&7Generate energy from generated methane", "&7by Pigs, Cows and Sheep",
      "&8(must be within 3 blocks of distance)", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), UtilEnergy.energyBuffer(1000),
      UtilEnergy.energyPowerPerSecond(50),
      "", "&7BioTech Machine");

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB_BASIC = new ItemStack[]{SlimefunItems.SMALL_CAPACITOR,
      SlimefunItems.SILICON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.ALUMINUM_INGOT, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_INGOT,
      SlimefunItems.SMALL_CAPACITOR};

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB_MEDIUM = new SlimefunItemStack("BIOTECH_GENERATOR_MOB",
      Material.COMPOSTER, "&bGenerator Mob Medium", "", "&7Generate energy from generated methane",
      "&7by Pigs, Cows and Sheep", "&8(must be within 3 blocks of distance)", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), UtilEnergy.energyBuffer(4000),
      UtilEnergy.energyPowerPerSecond(200),
      "", "&7BioTech Machine");

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB_MEDIUM = new ItemStack[]{
      GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC, SlimefunItems.FERROSILICON, GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC,
      SlimefunItems.REINFORCED_PLATE, SupremeComponents.SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE,
      GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC, SlimefunItems.ALUMINUM_BRONZE_INGOT,
      GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC};

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB_ADVANCED = new SlimefunItemStack(
      "BIOTECH_GENERATOR_MOB_ADVANCED", Material.COMPOSTER, "&bGenerator Mob Advanced", "",
      "&7Generate energy from generated methane", "&7by Pigs, Cows and Sheep",
      "&8(must be within 3 blocks of distance)", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), UtilEnergy.energyBuffer(16000),
      UtilEnergy.energyPowerPerSecond(800),
      "", "&7BioTech Machine");

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB_ADVANCED = new ItemStack[]{
      GeneratorMob.BIOTECH_GENERATOR_MOB_MEDIUM, SlimefunItems.CARBONADO, GeneratorMob.BIOTECH_GENERATOR_MOB_MEDIUM,
      SlimefunItems.HEATING_COIL, SlimefunItems.PLUTONIUM, SlimefunItems.HEATING_COIL,
      GeneratorMob.BIOTECH_GENERATOR_MOB_MEDIUM, SupremeComponents.INDUCTIVE_MACHINE,
      GeneratorMob.BIOTECH_GENERATOR_MOB_MEDIUM};

  private int energy;
  private int buffer;
  private int mobRange = 3;

  public static void setup(@Nonnull BioTech plugin) {

    new GeneratorMob(GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC,
        GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB_BASIC).setBuffer(1000).setEnergy(50).register(plugin);

    new GeneratorMob(GeneratorMob.BIOTECH_GENERATOR_MOB_MEDIUM,
        GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB_MEDIUM).setBuffer(4000).setEnergy(200).register(plugin);

    new GeneratorMob(GeneratorMob.BIOTECH_GENERATOR_MOB_ADVANCED,
        GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB_ADVANCED).setBuffer(16000).setEnergy(800).register(plugin);

  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Location l) {
    try {
      Predicate<Entity> predicate = this::isValidAnimal;
      Future<Boolean> task = Bukkit.getScheduler().callSyncMethod(BioTech.instance,
          () -> l.getWorld().getNearbyEntities(l, mobRange, mobRange, mobRange, predicate).isEmpty());
      return !task.get();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n) {
    return n instanceof Cow || n instanceof Sheep || n instanceof Pig;
  }


  public GeneratorMob(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.ELETRIC_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public final GeneratorMob setEnergy(int value) {
    this.energy = value;
    return this;
  }

  public final GeneratorMob setBuffer(int value) {
    this.buffer = value;
    return this;
  }

  @Nonnull
  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.OBSERVER);
  }

  @Override
  public int getEnergyProduction() {
    return energy;
  }

  @Override
  protected void registerDefaultFuelTypes() {
  }

  @Override
  public int getGeneratedOutput(Location l, Config config) {
    if (l != null) {
      return isAnimalNearby(l) ? getEnergyProduction() : 0;
    }
    return 0;
  }

  @Override
  public int getCapacity() {
    return this.buffer;
  }

  @Override
  public int[] getInputSlots() {
    return new int[0];
  }

  @Override
  public int[] getOutputSlots() {
    return new int[0];
  }
}
