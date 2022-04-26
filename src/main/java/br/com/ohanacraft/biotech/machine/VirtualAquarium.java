package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.generic.UtilMachine;
import br.com.ohanacraft.biotech.addons.supremeexpansion.Cetrus;
import br.com.ohanacraft.biotech.addons.supremeexpansion.SupremeComponents;
import br.com.ohanacraft.biotech.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.springframework.scheduling.annotation.Async;

@Async
public class VirtualAquarium extends AContainer implements RecipeDisplayItem {

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE = new SlimefunItemStack(
      "VIRTUAL_AQUARIUM", Material.DARK_PRISMARINE,
      "&bVirtual Aquarium", "", "&fThis machine allows you to collect ",
      "&f items that are collected at sea.",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20));

  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE = new ItemStack[]{
      Components.BIOTECH_SYNTHETIC_RUBY, new ItemStack(Material.FISHING_ROD), Components.BIOTECH_SYNTHETIC_RUBY,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.PROGRAMMABLE_ANDROID_2_FISHERMAN, SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_II = new SlimefunItemStack(
      "VIRTUAL_AQUARIUM_II", Material.DARK_PRISMARINE,
      "&bVirtual Aquarium II", "", "&fThis machine allows you to collect",
      "&f items that are collected at sea.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100));

  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE, Cetrus.CETRUS_LUMIUM, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.THORNERITE, Cetrus.CETRUS_IGNIS, SupremeComponents.THORNERITE};

  public static final SlimefunItemStack VIRTUAL_AQUARIUM_MACHINE_III = new SlimefunItemStack(
      "VIRTUAL_AQUARIUM_III", Material.DARK_PRISMARINE,
      "&bVirtual Aquarium III", "", "&fThis machine allows you to collect",
      "&f items that are collected at sea.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300));

  public static final ItemStack[] RECIPE_VIRTUAL_AQUARIUM_MACHINE_III = new ItemStack[]{
      SupremeComponents.THORNERITE, Cetrus.CETRUS_LUX, SupremeComponents.THORNERITE,
      SupremeComponents.SUPREME, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II, SupremeComponents.SUPREME,
      SupremeComponents.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};


  public static Map<Block, MachineRecipe> processing = new HashMap<>();
  public static Map<Block, Integer> progress = new HashMap<>();
  private final Set<VirtualAquariumMachineRecipe> virtualAquariumMachineRecipe = new HashSet();

  @ParametersAreNonnullByDefault
  public VirtualAquarium(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(Material.FISHING_ROD),
        new ItemStack[]{new ItemStack(Material.COD, 20), new ItemStack(Material.SALMON, 20),
            new ItemStack(Material.TROPICAL_FISH, 20), new ItemStack(Material.INK_SAC, 20),
            new ItemStack(Material.STICK, 5), new ItemStack(Material.ROTTEN_FLESH, 5),
            new ItemStack(Material.STRING, 5), new ItemStack(Material.BONE, 5)}));
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(Material.TRIDENT),
        new ItemStack[]{new ItemStack(Material.COD, 5), new ItemStack(Material.SALMON, 5),
            new ItemStack(Material.TROPICAL_FISH, 5), new ItemStack(Material.INK_SAC, 5),
            new ItemStack(Material.STICK, 20), new ItemStack(Material.ROTTEN_FLESH, 20),
            new ItemStack(Material.STRING, 20), new ItemStack(Material.BONE, 20)}));
    this.addProduce(new VirtualAquariumMachineRecipe(new ItemStack(Material.GOLDEN_HOE),
        new ItemStack[]{new ItemStack(Material.COD, 3), new ItemStack(Material.SALMON, 3),
            new ItemStack(Material.TROPICAL_FISH, 2), new ItemStack(Material.INK_SAC, 2),
            new ItemStack(Material.STICK, 30), new ItemStack(Material.ROTTEN_FLESH, 15),
            new ItemStack(Material.STRING, 30), new ItemStack(Material.BONE, 15)}));

  }


  public void addProduce(@Nonnull VirtualAquariumMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.virtualAquariumMachineRecipe.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        VirtualAquarium.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return VirtualAquariumMachineRecipe.getAllRecipe();
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
      Iterator iterator = this.virtualAquariumMachineRecipe.iterator();

      while (iterator.hasNext()) {
        VirtualAquariumMachineRecipe produce = (VirtualAquariumMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && (itemInSlot.getType()
            == itemInInput.getType())
            && InvUtils.fits(inv.toInventory(), produce.getOutput()[0], this.getOutputSlots())) {

          ItemMeta itemMeta = itemInSlot.getItemMeta();
          Damageable durability = (Damageable) itemMeta;
          int current = durability.getDamage();
          if (current + (2 * this.getSpeed()) >= itemInSlot.getType().getMaxDurability()) {
            inv.consumeItem(slot);
          } else {
            ((Damageable) itemMeta).setDamage(current + (2 * this.getSpeed()));
            itemInSlot.setItemMeta(itemMeta);
            inv.replaceExistingItem(slot, itemInSlot);
          }
          return produce;
        }
      }
    }

    return null;
  }

  @Override
  protected void tick(Block b) {
    BlockMenu inv = BlockStorage.getInventory(b);
    if (isProcessing(b)) {
      if (takeCharge(b.getLocation())) {
        int timeleft = progress.get(b);
        if (timeleft > 0) {
          ChestMenuUtils.updateProgressbar(inv, 22, timeleft, processing.get(b).getTicks(),
              getProgressBar());
          int time = timeleft - getSpeed();
            if (time < 0) {
                time = 0;
            }
          progress.put(b, time);
        } else {
          inv.replaceExistingItem(22, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
          ItemStack material = UtilMachine.getMaterial(processing.get(b).getOutput(),
              UtilMachine.getRandomInt());
          if (material != null) {
            final ItemStack itemStack = material.clone();
            inv.pushItem(itemStack, getOutputSlots());
          }
          progress.remove(b);
          processing.remove(b);
        }
      }
    } else {
      MachineRecipe next = findNextRecipe(inv);
      if (next != null) {
        processing.put(b, next);
        progress.put(b, next.getTicks());
      }
    }
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "VIRTUAL_AQUARIUM";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.FISHING_ROD);
  }


  public MachineRecipe getProcessing(Block b) {
    return processing.get(b);
  }

  public boolean isProcessing(Block b) {
    return getProcessing(b) != null;
  }


}
