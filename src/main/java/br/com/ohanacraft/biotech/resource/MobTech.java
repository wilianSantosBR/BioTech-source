package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.MobTechDTO;
import br.com.ohanacraft.biotech.dto.MobTechDTO.MobTechType;
import br.com.ohanacraft.biotech.machine.TechMutation;
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
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

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
        RecipeType.ENHANCED_CRAFTING_TABLE, getRoboticStartRecipe(item))
        .setMobTechType(item.getMobTechType())
        .setMobTechTier(1)
        .register(plugin);

    // upgrade tier
    for (int i = 2; i <= 9; i++) {
      TechRobotic.addRecipe(BioTech.buildItemFromMobTechDTO(item, (i - 1)),
          BioTech.buildItemFromMobTechDTO(item, i));
      new MobTech(Categories.TECHMOB_CATEGORY, BioTech.buildItemFromMobTechDTO(item, i),
          RecipeType.NULL, new ItemStack[]{TechRobotic.TECH_ROBOTIC})
          .setMobTechType(item.getMobTechType())
          .setMobTechTier(i)
          .register(plugin);
    }
  }

  private static ItemStack[] getRoboticStartRecipe(MobTechDTO mobTech) {
    MobTechType mobTechType = mobTech.getMobTechType();
    SlimefunItemStack itemStack = null;
    if(mobTech.getId().contains("_BEE")){
      itemStack = BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0);
    } else if(mobTech.getId().contains("_GOLEM")){
      itemStack = BioTech.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0);
    }

    if (MobTechType.ROBOTIC_ACCELERATION == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.FIRE_RUNE, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
              Components.BIOTECH_SYNTHETIC_RUBY, itemStack, Components.BIOTECH_SYNTHETIC_RUBY
      };
    }
    if (MobTechType.ROBOTIC_CLONING == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.RAINBOW_RUNE, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
              Components.BIOTECH_SYNTHETIC_RUBY, itemStack, Components.BIOTECH_SYNTHETIC_RUBY
      };
    }
    if (MobTechType.ROBOTIC_EFFICIENCY == mobTechType) {
      return new ItemStack[]{
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.LIGHTNING_RUNE, SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_2, SlimefunItems.PLASTIC_SHEET,
              Components.BIOTECH_SYNTHETIC_RUBY, itemStack, Components.BIOTECH_SYNTHETIC_RUBY
      };
    }
    return null;
  }

  private static void buildMutation(BioTech plugin, MobTechDTO item) {

    SlimefunItemStack slimefunItemStack = BioTech.buildItemFromMobTechDTO(item, 1);
    new MobTech(Categories.TECHMOB_CATEGORY, slimefunItemStack,
        RecipeType.NULL, new ItemStack[]{TechMutation.TECH_MUTATION})
        .setMobTechType(item.getMobTechType())
        .setMobTechTier(1)
        .register(plugin);

    SlimefunItemStack simpleInput = null;

    if(item.getId().contains("_BEE")){
      simpleInput = BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0);
    } else if(item.getId().contains("_GOLEM")){
      simpleInput = BioTech.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0);
    }

    TechMutation.addRecipe(simpleInput, getGeneMutation(item.getMobTechType()),
        (MobTechType.MUTATION_BERSERK == item.getMobTechType()) ? 20 : 10,
        BioTech.buildItemFromMobTechDTO(item, 1));
    for (int i = 2; i <= 9; i++) {
      final SlimefunItemStack inputTier = BioTech.buildItemFromMobTechDTO(item, (i - 1));
      final SlimefunItemStack itemStack = BioTech.buildItemFromMobTechDTO(item, i);
      TechMutation.addRecipe(inputTier, inputTier,
          (MobTechType.MUTATION_BERSERK == item.getMobTechType()) ? 20 : 10,
          itemStack);
      new MobTech(Categories.TECHMOB_CATEGORY, itemStack,
          RecipeType.NULL, new ItemStack[]{TechMutation.TECH_MUTATION})
          .setMobTechType(item.getMobTechType())
          .setMobTechTier(1)
          .register(plugin);
    }

  }

  private static SlimefunItemStack getGeneMutation(MobTechType mobTechType) {
    if (MobTechType.MUTATION_BERSERK == mobTechType) {
      return Components.BIOTECH_GENE_BERSERK;
    }else if (MobTechType.MUTATION_INTELLIGENCE == mobTechType){
      return Components.BIOTECH_GENE_INTELLIGENCE;
    } else if (MobTechType.MUTATION_LUCK == mobTechType) {
      return Components.BIOTECH_GENE_LUCK;
    }
    return Components.BIOTECH_GENE_CORE;
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
