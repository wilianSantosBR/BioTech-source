package com.github.wiliansantosbr.biotech.machine;

import com.github.wiliansantosbr.biotech.resource.BeeTech;
import com.github.wiliansantosbr.biotech.resource.IronGolemTech;
import com.github.wiliansantosbr.biotech.tools.MobCollectorTech;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class MobTechCollectorMachine extends AContainer implements RecipeDisplayItem {


  public static final SlimefunItemStack MOB_TECH_COLLECTOR_MACHINE = new SlimefunItemStack(
      "MOB_TECH_COLLECTOR_MACHINE", Material.NETHER_GOLD_ORE,
      "&bMobTech Collector Machine", "", "&fThis machine allows you to collect ",
      "&fMobTech head nearby mobs. (4 block)",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20),
      "", "&7BioTech Machine");

  public static final ItemStack[] RECIPE_MOB_TECH_COLLECTOR_MACHINE = new ItemStack[]{
      SupremeComponents.RUSTLESS_MACHINE, MobCollectorTech.MOB_COLLECTOR_III, SupremeComponents.RUSTLESS_MACHINE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER, SupremeComponents.ADAMANTIUM_PLATE};

  //todo Willian change item
  public static final SlimefunItemStack TOOL_RUN_MACHINE = SupremeComponents.SYNTHETIC_RUBY;

  private final Set<MobTechCollectorMachineRecipe> MobTechCollectorMachineRecipes = new HashSet();
  private int mobRange = 4;

  @ParametersAreNonnullByDefault
  public MobTechCollectorMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    this.addProduce(new MobTechCollectorMachineRecipe(MobTechCollectorMachine.TOOL_RUN_MACHINE,
        BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0), (n) -> n instanceof Bee));
    this.addProduce(new MobTechCollectorMachineRecipe(MobTechCollectorMachine.TOOL_RUN_MACHINE,
        BioTech.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0), (n) -> n instanceof IronGolem));
  }


  public void addProduce(@Nonnull MobTechCollectorMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.MobTechCollectorMachineRecipes.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        MobTechCollectorMachine.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return MobTechCollectorMachineRecipe.getAllRecipe();
  }

  @Nonnull
  @Override
  public String getRecipeSectionLabel(@Nonnull Player p) {
    return "&7Collects:";
  }


  @Override
  protected MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
    int[] inputSlots = this.getInputSlots();

    for (int i = 0; i < inputSlots.length; ++i) {
      int slot = inputSlots[i];
      Iterator iterator = this.MobTechCollectorMachineRecipes.iterator();

      while (iterator.hasNext()) {
        MobTechCollectorMachineRecipe produce = (MobTechCollectorMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null
            && SlimefunUtils.isItemSimilar(itemInSlot, MobTechCollectorMachine.TOOL_RUN_MACHINE, false, false)
            && InvUtils.fits(inv.toInventory(), produce.getOutput()[0],
            this.getOutputSlots())) {
          Block invBlock = inv.getBlock();
          produce.getClass();
          if (this.isAnimalNearby(invBlock, produce::test)) {
            inv.consumeItem(slot, 1);
            return produce;
          }
        }
      }
    }

    return null;
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !b.getWorld().getNearbyEntities(b.getLocation(), mobRange, mobRange, mobRange, (n) -> {
      final boolean validAnimal = this.isValidAnimal(n, predicate);
      if(validAnimal){
        n.remove();
      }
      return validAnimal;
    }).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "MOB_TECH_COLLECTOR";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.IRON_SWORD);
  }

  public final MobTechCollectorMachine setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

}
