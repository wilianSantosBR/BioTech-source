package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.MobTechDTO;
import br.com.ohanacraft.biotech.dto.MobTechDTO.MobTechType;
import br.com.ohanacraft.biotech.machine.TechRobotic;
import br.com.ohanacraft.biotech.tools.MobCollectorTech;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;

public class MobTech extends SlimefunItem implements Radioactive, NotPlaceable {

  public MobTech(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
  }

  public static void preSetup(BioTech plugin, MobTechDTO item) {
    if (MobTechType.SIMPLE == item.getMobTechType()) {
      new MobTech(Categories.RESOURCE_CATEGORY, BioTech.buildItemFromMobTechDTO(item, 0),
          RecipeType.NULL, new ItemStack[]{MobCollectorTech.MOB_COLLECTOR_I})
          .setMobTechType(item.getMobTechType())
          .setMobTechTier(0)
          .register(plugin);
    } else {

      if (MobTechType.ROBOTIC_ACCELERATION == item.getMobTechType()
          || MobTechType.ROBOTIC_CLONING == item.getMobTechType()
          || MobTechType.ROBOTIC_EFFICIENCY == item.getMobTechType()) {
        buildRobotic(plugin, item);
      }

      if (MobTechType.MUTATION_BERSERK == item.getMobTechType()
          || MobTechType.MUTATION_INTELLIGENCE == item.getMobTechType()
          || MobTechType.MUTATION_LUCK == item.getMobTechType()) {
        buildMutation(plugin, item);
      }
    }
  }

  private static void buildRobotic(BioTech plugin, MobTechDTO item) {

    SlimefunItemStack slimefunItemStack = BioTech.buildItemFromMobTechDTO(item, 1);
    new MobTech(Categories.TECHMOB_CATEGORY, slimefunItemStack,
        RecipeType.ENHANCED_CRAFTING_TABLE, getRoboticStartRecipe(item.getMobTechType()))
        .setMobTechType(item.getMobTechType())
        .setMobTechTier(1)
        .register(plugin);

    // upgrade tier
    for (int i = 2; i <= 9; i++) {
      TechRobotic.addRecipe(BioTech.buildItemFromMobTechDTO(item, (i - 1)),
          BioTech.buildItemFromMobTechDTO(item, i));
      new MobTech(Categories.TECHMOB_CATEGORY, slimefunItemStack,
          RecipeType.NULL, new ItemStack[]{})
          .setMobTechType(item.getMobTechType())
          .setMobTechTier(i)
          .register(plugin);
    }
  }

  private static ItemStack[] getRoboticStartRecipe(MobTechType mobTechType) {
    if (MobTechType.ROBOTIC_ACCELERATION == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.REINFORCED_PLATE, Components.BIOTECH_SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE
      };
    }
    if (MobTechType.ROBOTIC_CLONING == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.RAINBOW_RUNE, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.REINFORCED_PLATE, Components.BIOTECH_SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE
      };
    }
    if (MobTechType.ROBOTIC_EFFICIENCY == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.SOLAR_GENERATOR_4, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.REINFORCED_PLATE, Components.BIOTECH_SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE
      };
    }
    return null;
  }

  //todo falta fazer
  private static void buildMutation(BioTech plugin, MobTechDTO item) {
    for (int i = 1; i <= 9; i++) {
      new MobTech(Categories.TECHMOB_CATEGORY, BioTech.buildItemFromMobTechDTO(
          item, i),
          RecipeType.NULL, new ItemStack[]{})
          .setMobTechType(item.getMobTechType())
          .setMobTechTier(i)
          .register(plugin);
    }
  }

  private Integer mobTechTier;
  private MobTechType mobTechType;

  public MobTechType getMobTechType() {
    return mobTechType;
  }

  @Nonnull
  public final MobTech setMobTechType(MobTechType value) {
    this.mobTechType = value;
    return this;
  }

  public Integer getMobTechTier() {
    return mobTechTier;
  }

  @Nonnull
  public final MobTech setMobTechTier(int value) {
    this.mobTechTier = value;
    return this;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    Radioactivity radioactivity;
    switch (this.mobTechType) {
      case MUTATION_INTELLIGENCE:
      case MUTATION_BERSERK:
      case MUTATION_LUCK:
        radioactivity = Radioactivity.VERY_DEADLY;
        break;
      case ROBOTIC_CLONING:
      case ROBOTIC_ACCELERATION:
      case ROBOTIC_EFFICIENCY:
        radioactivity = Radioactivity.HIGH;
        break;
      case SIMPLE:
      default:
        radioactivity = Radioactivity.LOW;
    }
    return radioactivity;
  }

}
