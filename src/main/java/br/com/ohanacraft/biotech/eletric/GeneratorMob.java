package br.com.ohanacraft.biotech.eletric;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.util.Energy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class GeneratorMob extends SlimefunItem implements EnergyNetProvider  {

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB_BASIC = new SlimefunItemStack(
          "BIOTECH_GENERATOR_MOB_BASIC", Material.TARGET,
          "&bBasic Generator Mob", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          Energy.energyBuffer(500), Energy.energyPowerPerSecond(10));

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB_BASIC = new ItemStack[]{
          SlimefunItems.SMALL_CAPACITOR, SlimefunItems.SILICON, SlimefunItems.SMALL_CAPACITOR,
          SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_INGOT,
          SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.SMALL_CAPACITOR};

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB = new SlimefunItemStack(
      "BIOTECH_GENERATOR_MOB", Material.TARGET,
      "&bGenerator Mob", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          Energy.energyBuffer(4500), Energy.energyPowerPerSecond(90));

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB = new ItemStack[]{
      GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC, SlimefunItems.SILICON, GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC,
          SlimefunItems.ALUMINUM_INGOT, SlimefunItems.CARBONADO, SlimefunItems.ALUMINUM_INGOT,
          GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC, SlimefunItems.SILICON, GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC};

  public static final SlimefunItemStack BIOTECH_GENERATOR_MOB_ADVANCED = new SlimefunItemStack(
          "BIOTECH_GENERATOR_MOB_ADVANCED", Material.TARGET,
          "&bGenerator Mob Avanced", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
          Energy.energyBuffer(22500), Energy.energyPowerPerSecond(450));

  public static final ItemStack[] RECIPE_BIOTECH_GENERATOR_MOB_ADVANCED = new ItemStack[]{
          GeneratorMob.BIOTECH_GENERATOR_MOB, SlimefunItems.CARBONADO_EDGED_CAPACITOR, GeneratorMob.BIOTECH_GENERATOR_MOB,
          SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL,
          SlimefunItems.LEAD_DUST, SlimefunItems.STEEL_INGOT, SlimefunItems.LEAD_DUST};

  private int energy;
  private int buffer;
  private int mobRange = 4;
  private static final Set<GeneratorMobMachineRecipe> recipes = new HashSet();

  public static void setup(@Nonnull BioTech plugin) {

    new GeneratorMob(
            GeneratorMob.BIOTECH_GENERATOR_MOB_BASIC, GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB_BASIC)
            .setBuffer(500)
            .setEnergy(10)
            .register(plugin);

    new GeneratorMob(
            GeneratorMob.BIOTECH_GENERATOR_MOB, GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB)
            .setBuffer(4500)
            .setEnergy(90)
            .register(plugin);

    new GeneratorMob(
            GeneratorMob.BIOTECH_GENERATOR_MOB_ADVANCED, GeneratorMob.RECIPE_BIOTECH_GENERATOR_MOB_ADVANCED)
            .setBuffer(22500)
            .setEnergy(450)
            .register(plugin);


    recipes.clear();
    addProduce(new GeneratorMobMachineRecipe((n) -> n instanceof Cow));
    addProduce(new GeneratorMobMachineRecipe((n) -> n instanceof Pig));
    addProduce(new GeneratorMobMachineRecipe((n) -> n instanceof Sheep));

  }


  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !b.getWorld().getNearbyEntities(b.getLocation(), mobRange, mobRange, mobRange,
        (n) -> this.isValidAnimal(n, predicate)).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }


  public GeneratorMob(SlimefunItemStack item, ItemStack[] recipe) {
    super(Categories.ELETRIC_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }


  public static void addProduce(@Nonnull GeneratorMobMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    recipes.add(produce);
  }

  public final GeneratorMob setEnergy(int value) {
    final int i = value / 2;
    this.energy = Math.round(i);
    return this;
  }

  public final GeneratorMob setBuffer(int value) {
    this.buffer = value;
    return this;
  }

  @Nonnull
  @Override
  public EnergyNetComponentType getEnergyComponentType() {
    return EnergyNetComponentType.GENERATOR;
  }

  @Override
  public int getGeneratedOutput(Location l, Config config) {
    if(l != null) {
      for (GeneratorMobMachineRecipe recipe : recipes) {
        Block invBlock = l.getBlock();
        recipe.getClass();
        return isAnimalNearby(invBlock, recipe::test) ? energy : 0;
      }
    }
    return 0;
  }

  @Override
  public int getCapacity() {
    return this.buffer;
  }
}
