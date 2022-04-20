package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.addons.supremeexpansion.Cetrus;
import br.com.ohanacraft.biotech.addons.supremeexpansion.Components;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.springframework.scheduling.annotation.Async;

@Async
public class VirtualGarden extends AContainer implements NotHopperable, RecipeDisplayItem {

  public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE = new SlimefunItemStack(
      "VIRTUAL_GARDEN", Material.STRIPPED_WARPED_HYPHAE,
      "&bVirtual Garden", "", "&fThis machine allows you to", "&fcultivate some resources.",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20));

  public static final ItemStack[] RECIPE_VIRTUAL_GARDEN_MACHINE = new ItemStack[]{
      Components.STAINLESS_MACHINE, new ItemStack(Material.STRIPPED_WARPED_HYPHAE),
      Components.STAINLESS_MACHINE,
      Components.INDUCTOR_MACHINE, Components.CRYSTALLIZER_MACHINE, Components.INDUCTOR_MACHINE,
      Components.ADAMANTIUM_PLATE, SlimefunItems.PROGRAMMABLE_ANDROID_FARMER,
      Components.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE_II = new SlimefunItemStack(
      "VIRTUAL_GARDEN_II", Material.STRIPPED_WARPED_HYPHAE,
      "&bVirtual Garden II", "", "&fThis machine allows you to", "&fcultivate some resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100));

  public static final ItemStack[] RECIPE_VIRTUAL_GARDEN_MACHINE_II = new ItemStack[]{
      Components.CONVEYANCE_MACHINE, Cetrus.CETRUS_LUMIUM, Components.CONVEYANCE_MACHINE,
      Components.INDUCTOR_MACHINE, VirtualGarden.VIRTUAL_GARDEN_MACHINE,
      Components.INDUCTOR_MACHINE,
      Components.THORNERITE, Cetrus.CETRUS_AQUA, Components.THORNERITE};

  public static final SlimefunItemStack VIRTUAL_GARDEN_MACHINE_III = new SlimefunItemStack(
      "VIRTUAL_GARDEN_III", Material.STRIPPED_WARPED_HYPHAE,
      "&bVirtual Garden III", "", "&fThis machine allows you to", "&fcultivate some resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300));

  public static final ItemStack[] RECIPE_VIRTUAL_GARDEN_MACHINE_III = new ItemStack[]{
      Components.THORNERITE, Cetrus.CETRUS_LUX, Components.THORNERITE,
      Components.SUPREME, VirtualGarden.VIRTUAL_GARDEN_MACHINE_II, Components.SUPREME,
      Components.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, Components.CRYSTALLIZER_MACHINE};
  public static Map<Block, MachineRecipe> processing = new HashMap<>();
  public static Map<Block, Integer> progress = new HashMap<>();
  private final Set<VirtualGardenMachineRecipe> virtualGardenMachineRecipes = new HashSet();

  @ParametersAreNonnullByDefault
  public VirtualGarden(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    VirtualGardenMachineRecipe.getAllRecipe().forEach(recipe -> {
      this.addProduce(new VirtualGardenMachineRecipe(recipe));
    });
  }


  public void addProduce(@Nonnull VirtualGardenMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.virtualGardenMachineRecipes.add(produce);
  }


  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    VirtualGardenMachineRecipe.getAllRecipe().forEach(recipe -> {
      displayRecipes.add(
          new CustomItemStack(recipe.getMaterial(), null, "&fRequires &bto cultivate"));
      displayRecipes.add(new ItemStack(recipe.getMainItem()));
    });
    return displayRecipes;
  }


  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        VirtualGarden.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }


  @Nonnull
  @Override
  public String getRecipeSectionLabel(@Nonnull Player p) {
    return "&7Cultivate:";
  }

  @Override
  protected MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
    int[] inputSlots = this.getInputSlots();
    for (int slot : inputSlots) {
      for (VirtualGardenMachineRecipe produce : this.virtualGardenMachineRecipes) {
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null
            && itemInSlot.getType() == itemInInput.getType() && InvUtils.fits(inv.toInventory(),
            produce.getOutput()[0], this.getOutputSlots())) {
          return produce;
        }
      }
    }
    return null;
  }


  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "VIRTUAL_GARDEN";
  }


  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.IRON_HOE);
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
          for (ItemStack output : processing.get(b).getOutput()) {
            inv.pushItem(output.clone(), getOutputSlots());
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

  public MachineRecipe getProcessing(Block b) {
    return processing.get(b);
  }

  public boolean isProcessing(Block b) {
    return getProcessing(b) != null;
  }


}
