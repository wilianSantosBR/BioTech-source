package com.github.wiliansantosbr.biotech.machine;

import com.github.wiliansantosbr.biotech.ItemGroups;
import com.github.wiliansantosbr.biotech.dto.InterfaceMachineDTO;
import com.github.wiliansantosbr.biotech.dto.MobTechDTO.MobTechType;
import com.github.wiliansantosbr.biotech.resource.BioTechComponents;
import com.github.wiliansantosbr.biotech.resource.MobTech;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.machine.SimpleItemContainerMachine;
import com.github.relativobr.recipe.SimpleRecipe;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.ItemNotPlaceable;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class TechGenerator extends SimpleItemContainerMachine implements Radioactive {

  public static final SlimefunItemStack TECH_GENERATOR = new SlimefunItemStack(
      "BIOTECH_TECH_GENERATOR",
      Material.LOOM, "&aTech &bGenerator", "",
      "&fUsing power and bees/golem, slowly generates materials.",
      "",
      LoreBuilder.radioactive(Radioactivity.HIGH),
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
      UtilEnergy.energyPowerPerSecond(2000),
      "", "&7BioTech Machine");
  public static final ItemStack[] RECIPE_TECH_GENERATOR = {
      SupremeComponents.SYNTHETIC_AMETHYST, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.SYNTHETIC_AMETHYST,
      SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.LOOM), SlimefunItems.REINFORCED_ALLOY_INGOT,
          SupremeComponents.CARRIAGE_MACHINE, SlimefunItems.HEATING_COIL, SupremeComponents.CARRIAGE_MACHINE
  };

  public TechGenerator(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public static final List<SimpleRecipe> receitasParaProduzir = new ArrayList<>();
  private Map<Block, ItemStack> processing = new HashMap<Block, ItemStack>();
  private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
  private int speed = 1;

  public static void addReceitasParaProduzir(ItemStack receita, ItemStack item) {
    receitasParaProduzir.add(new SimpleRecipe(item, new ItemStack[]{receita}));
  }

  public static void addReceitasParaProduzir(ItemStack[] receita, ItemStack item) {
    receitasParaProduzir.add(new SimpleRecipe(item, receita));
  }

  public List<SimpleRecipe> getReceitasParaExibir() {
    // ordena para receitas com maior quantidade  itens
    return receitasParaProduzir.stream()
        .sorted((o1, o2) -> Integer.compare(o1.getRecipe().length, o2.getRecipe().length))
        .collect(Collectors.toList());
  }

  public List<SimpleRecipe> getReceitasParaProduzir() {
    // ordena para receitas com maior quantidade de itens
    return receitasParaProduzir.stream()
        .sorted((o1, o2) -> Integer.compare(o2.getRecipe().length, o1.getRecipe().length))
        .collect(Collectors.toList());
  }


  public static void preSetup(BioTech plugin, SlimefunItemStack item, Material input,
      Material output) {
    preSetup(plugin, 1, item, new ItemStack(input), new ItemStack(output));
  }

  public static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack input,
      ItemStack output) {
    new ItemNotPlaceable(ItemGroups.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input), new ItemStack(input), new ItemStack(input),
        new ItemStack(input), BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE, new ItemStack(input),
        new ItemStack(input), new ItemStack(input), new ItemStack(input)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
  }

  public static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack input1,
      ItemStack input2, ItemStack output) {
    new ItemNotPlaceable(ItemGroups.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input1), new ItemStack(input2), new ItemStack(input1),
        new ItemStack(input2), BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE, new ItemStack(input2),
        new ItemStack(input1), new ItemStack(input2), new ItemStack(input1)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
  }

  public static void preSetup(BioTech plugin, int tierCard, SlimefunItemStack item,
      Material input, Material output) {
    preSetup(plugin, tierCard, item, new ItemStack(input), new ItemStack(output));
  }

  public static void preSetup(BioTech plugin, int tierCard, SlimefunItemStack item,
      ItemStack input, ItemStack output) {
    new ItemNotPlaceable(ItemGroups.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input), new ItemStack(input), new ItemStack(input),
        new ItemStack(input), getCardTier(tierCard),
        new ItemStack(input),
        new ItemStack(input), new ItemStack(input), new ItemStack(input)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
  }

  public static void preSetup(BioTech plugin, int tierCard, SlimefunItemStack item,
      ItemStack input1,  ItemStack input2, ItemStack output) {
    new ItemNotPlaceable(ItemGroups.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input1), new ItemStack(input2), new ItemStack(input1),
        new ItemStack(input2), getCardTier(tierCard),new ItemStack(input2),
        new ItemStack(input1), new ItemStack(input2), new ItemStack(input1)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
  }

  private static ItemStack getCardTier(int tierCard) {
    if(tierCard >= 3) {
      return BioTechComponents.BIOTECH_CENTER_CARD_ULTIMATE;
    } else if(tierCard == 2) {
      return BioTechComponents.BIOTECH_CENTER_CARD_ADVANCED;
    } else {
      return BioTechComponents.BIOTECH_CENTER_CARD_SIMPLE;
    }
  }

  @Override
  public int[] getInputSlots() {
    return InterfaceMachineDTO.TECH_GENERATOR_INPUT_SLOTS;
  }

  @Override
  public int[] getOutputSlots() {
    return InterfaceMachineDTO.TECH_GENERATOR_OUTPUT_SLOTS;
  }

  @Override
  protected void constructMenu(BlockMenuPreset preset) {

    for (int i : InterfaceMachineDTO.TECH_GENERATOR_BORDER) {
      preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE,
          " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InterfaceMachineDTO.TECH_GENERATOR_BORDER_IN) {
      preset.addItem(i, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE,
          " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InterfaceMachineDTO.TECH_GENERATOR_BORDER_OUT) {
      preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE,
          " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InterfaceMachineDTO.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      preset.addItem(i, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE,
          " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InterfaceMachineDTO.TECH_GENERATOR_OUTPUT_SLOTS) {
      preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {
        @Override
        public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
          return false;
        }

        @Override
        public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor,
            ClickAction action) {
            if (cursor == null) {
                return true;
            }
          return cursor.getType() == Material.AIR;
        }
      });
    }

  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        TechGenerator.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  public void tick(Block b) {

    BlockMenu inv = BlockStorage.getInventory(b);

    // verifica se n??o est?? processando nada
    final ItemStack itemNaReceita = validRecipeItem(inv);
    final ItemStack itemProduzindo = processing.get(b);
    if (itemProduzindo == null) {

      if (itemNaReceita != null) {

        //INICIO PRODU????O
        invalidSituacao(inv, itemNaReceita.getType(), " ");

        // indica no block o processamento
        processing.put(b, itemNaReceita);
        progressTime.put(b, (getTimeProcess() * 2));

      } else {

        invalidSituacao(inv, "&cCards de receita n??o identificados");

      }

      // caso j?? tenha algo em processamento
    } else {

      // verifica se deve finalizar
      if (this.getProgressTime(b) <= 0) {

        //CRIA????O DO ITEM
        checkCloneOutput(inv, itemProduzindo.clone());

        //T??RMINO PRODU????O
        processing.put(b, null);
        progressTime.put(b, 0);
        invalidSituacao(inv, Material.BLACK_STAINED_GLASS_PANE, " ");

        // realiza consulmo de energia e ticks
      } else {

        // verifica est?? com mesmo data card
        if (SlimefunUtils.isItemSimilar(itemNaReceita, itemProduzindo, false, false)) {

          this.processTicks(b, inv, itemProduzindo);

        } else {

          //T??RMINO PRODU????O
          processing.put(b, null);
          progressTime.put(b, 0);
          invalidSituacao(inv, Material.BLACK_STAINED_GLASS_PANE, " ");
        }
      }
    }
  }

  private void checkCloneOutput(BlockMenu inv, ItemStack itemStack) {
    itemStack.setAmount(64);
    inv.pushItem(itemStack, this.getOutputSlots());
    ItemStack b1 = inv.getItemInSlot(getInputSlots()[1]);
    ItemStack b2 = inv.getItemInSlot(getInputSlots()[2]);
    ItemStack b3 = inv.getItemInSlot(getInputSlots()[3]);
    ItemStack b4 = inv.getItemInSlot(getInputSlots()[4]);
    if (b1 != null) {
      SlimefunItem mob1 = SlimefunItem.getByItem(b1);
      if (mob1 instanceof MobTech) {
        final MobTech mob11 = (MobTech) mob1;
        if(mob11.getMobTechType() == MobTechType.ROBOTIC_CLONING
            || mob11.getMobTechType() == MobTechType.MUTATION_LUCK) {
          int amount = Math.max(b1.getAmount() * mob11.getMobTechTier(), 64);
          itemStack.setAmount(amount);
          inv.pushItem(itemStack, this.getOutputSlots());
          if(mob11.getMobTechTier() >= 4){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob11.getMobTechTier() >= 6){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob11.getMobTechTier() >= 8){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
        }
      }
    }
    if (b2 != null) {
      SlimefunItem mob2 = SlimefunItem.getByItem(b2);
      if (mob2 instanceof MobTech) {
        final MobTech mob22 = (MobTech) mob2;
        if (mob22.getMobTechType() == MobTechType.ROBOTIC_CLONING
            || mob22.getMobTechType() == MobTechType.MUTATION_LUCK) {
          int amount = Math.max(b2.getAmount() * mob22.getMobTechTier(), 64);
          itemStack.setAmount(amount);
          inv.pushItem(itemStack, this.getOutputSlots());
          if(mob22.getMobTechTier() >= 4){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob22.getMobTechTier() >= 6){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob22.getMobTechTier() >= 8){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
        }
      }
    }
    if (b3 != null) {
      SlimefunItem mob3 = SlimefunItem.getByItem(b3);
      if (mob3 instanceof MobTech) {
        final MobTech mob33 = (MobTech) mob3;
        if(mob33.getMobTechType() == MobTechType.ROBOTIC_CLONING
            || mob33.getMobTechType() == MobTechType.MUTATION_LUCK) {
          int amount = Math.max(b3.getAmount() * mob33.getMobTechTier(), 64);
          itemStack.setAmount(amount);
          inv.pushItem(itemStack, this.getOutputSlots());
          if(mob33.getMobTechTier() >= 4){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob33.getMobTechTier() >= 6){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob33.getMobTechTier() >= 8){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
        }
      }
    }
    if (b4 != null) {
      SlimefunItem mob4 = SlimefunItem.getByItem(b4);
      if (mob4 instanceof MobTech) {
        final MobTech mob44 = (MobTech) mob4;
        if(mob44.getMobTechType() == MobTechType.ROBOTIC_CLONING
          || mob44.getMobTechType() == MobTechType.MUTATION_LUCK) {
          int amount = Math.max(b4.getAmount() * mob44.getMobTechTier(), 64);
          itemStack.setAmount(amount);
          inv.pushItem(itemStack, this.getOutputSlots());
          if(mob44.getMobTechTier() >= 4){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob44.getMobTechTier() >= 6){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if(mob44.getMobTechTier() >= 8){
            inv.pushItem(itemStack, this.getOutputSlots());
          }
        }
      }
    }
  }

  private static void invalidSituacao(BlockMenu menu, String txt) {
    for (int i : InterfaceMachineDTO.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, txt));
    }
  }

  private static void invalidSituacao(BlockMenu menu, Material material, String txt) {
    for (int i : InterfaceMachineDTO.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(material, txt));
    }
  }

  public int getProgressTime(Block b) {
    return progressTime.get(b) != null ? progressTime.get(b) : (getTimeProcess() * 2);
  }

  private void processTicks(Block b, BlockMenu inv, ItemStack result) {
    int ticksTotal = getTimeProcess() * 2;
    int ticksLeft = this.getProgressTime(b);
    if (ticksLeft > 0) {

      // verifica se h?? energia
      if (takeCharge(b.getLocation(), inv)) {

        int time = checkUpTime(ticksLeft, inv);

        if (time < 0) {
          time = 0;
        }
        progressTime.put(b, time);

        //todo ajustar para progresso parcial nos 3 slots
        for (int i : InterfaceMachineDTO.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
          ChestMenuUtils.updateProgressbar(inv, i, Math.round(ticksLeft / this.getSpeed()),
              Math.round(ticksTotal / this.getSpeed()), result);
        }
      } else {
        final int consumption = checkDownConsumption(this.getEnergyConsumption(), inv);
        invalidSituacao(inv, "&cSem energia na maquina (" + consumption + " j/s)");
      }
    } else {
      invalidSituacao(inv, "&cFalha no tempo da maquina");
    }
  }

  private int checkUpTime(int time, BlockMenu inv) {

    // tempo padr??o
    time = time - this.getSpeed();

    ItemStack b1 = inv.getItemInSlot(getInputSlots()[1]);
    ItemStack b2 = inv.getItemInSlot(getInputSlots()[2]);
    ItemStack b3 = inv.getItemInSlot(getInputSlots()[3]);
    ItemStack b4 = inv.getItemInSlot(getInputSlots()[4]);
    if (b1 != null) {
      SlimefunItem mob1 = SlimefunItem.getByItem(b1);
      if (mob1 instanceof MobTech) {
        final MobTech mob11 = (MobTech) mob1;
        if(mob11.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
          || mob11.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          time -= Math.round(((mob11.getMobTechTier() + 1) * b1.getAmount()) / 32);
        } else {
          time -= Math.round(b1.getAmount()/32);
        }
      }
    }
    if (b2 != null) {
      SlimefunItem mob2 = SlimefunItem.getByItem(b2);
      if (mob2 instanceof MobTech) {
        final MobTech mob22 = (MobTech) mob2;
        if (mob22.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
          || mob22.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          time -= Math.round(((mob22.getMobTechTier() + 1) * b2.getAmount()) / 32);
        } else {
          time -= Math.round(b2.getAmount()/32);
        }
      }
    }
    if (b3 != null) {
      SlimefunItem mob3 = SlimefunItem.getByItem(b3);
      if (mob3 instanceof MobTech) {
        final MobTech mob33 = (MobTech) mob3;
        if(mob33.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob33.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          time -= Math.round(((mob33.getMobTechTier() + 1) * b3.getAmount()) / 32);
        } else {
          time -= Math.round(b3.getAmount()/32);
        }
      }
    }
    if (b4 != null) {
      SlimefunItem mob4 = SlimefunItem.getByItem(b4);
      if (mob4 instanceof MobTech) {
        final MobTech mob44 = (MobTech) mob4;
        if(mob44.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob44.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          time -= Math.round(((mob44.getMobTechTier() + 1) * b4.getAmount()) / 32);
        } else {
          time -= Math.round(b4.getAmount()/32);
        }
      }
    }
    return time;
  }

  protected boolean takeCharge(@Nonnull Location l, BlockMenu inv) {
    Validate.notNull(l, "Can't attempt to take charge from a null location!");
    if (this.isChargeable()) {
      int charge = this.getCharge(l);
      int consumption = checkDownConsumption(this.getEnergyConsumption(), inv);
      if (charge < consumption) {
        return false;
      } else {
        this.setCharge(l, charge - consumption);
        return true;
      }
    } else {
      return true;
    }
  }

  private int checkDownConsumption(int consumption, BlockMenu inv) {
    ItemStack b1 = inv.getItemInSlot(getInputSlots()[1]);
    ItemStack b2 = inv.getItemInSlot(getInputSlots()[2]);
    ItemStack b3 = inv.getItemInSlot(getInputSlots()[3]);
    ItemStack b4 = inv.getItemInSlot(getInputSlots()[4]);
    if (b1 != null) {
      SlimefunItem mob1 = SlimefunItem.getByItem(b1);
      if (mob1 instanceof MobTech) {
        final MobTech mob11 = (MobTech) mob1;
        if(mob11.getMobTechType() == MobTechType.ROBOTIC_EFFICIENCY
          || mob11.getMobTechType() == MobTechType.MUTATION_INTELLIGENCE) {
          consumption -= (mob11.getMobTechTier() + 1) * b1.getAmount();
        }
        if(mob11.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob11.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          consumption += (mob11.getMobTechTier() + 1) * b1.getAmount();
        }
      }
    }
    if (b2 != null) {
      SlimefunItem mob2 = SlimefunItem.getByItem(b2);
      if (mob2 instanceof MobTech) {
        final MobTech mob22 = (MobTech) mob2;
        if (mob22.getMobTechType() == MobTechType.ROBOTIC_EFFICIENCY
            || mob22.getMobTechType() == MobTechType.MUTATION_INTELLIGENCE) {
          consumption -= (mob22.getMobTechTier() + 1) * b2.getAmount();
        }
        if(mob22.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob22.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          consumption += (mob22.getMobTechTier() + 1) * b2.getAmount();
        }
      }
    }
    if (b3 != null) {
      SlimefunItem mob3 = SlimefunItem.getByItem(b3);
      if (mob3 instanceof MobTech) {
        final MobTech mob33 = (MobTech) mob3;
        if(mob33.getMobTechType() == MobTechType.ROBOTIC_EFFICIENCY
            || mob33.getMobTechType() == MobTechType.MUTATION_INTELLIGENCE) {
          consumption -= (mob33.getMobTechTier() + 1) * b3.getAmount();
        }
        if(mob33.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob33.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          consumption += (mob33.getMobTechTier() + 1) * b3.getAmount();
        }
      }
    }
    if (b4 != null) {
      SlimefunItem mob4 = SlimefunItem.getByItem(b4);
      if (mob4 instanceof MobTech) {
        final MobTech mob44 = (MobTech) mob4;
        if(mob44.getMobTechType() == MobTechType.ROBOTIC_EFFICIENCY
            || mob44.getMobTechType() == MobTechType.MUTATION_INTELLIGENCE) {
          consumption -= (mob44.getMobTechTier() + 1) * b4.getAmount();
        }
        if(mob44.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mob44.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          consumption += (mob44.getMobTechTier() + 1) * b4.getAmount();
        }
      }
    }
    return Math.max(consumption, 1);
  }

  private ItemStack validRecipeItem(BlockMenu inv) {
    // percore as poss??veis receitas
    for (SimpleRecipe produce : this.getReceitasParaProduzir()) {
      if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[0]),
          produce.getRecipe()[0],
          false,
          true)) {
        return produce.getItem();
      }

    }
    return null;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    this.getReceitasParaExibir().forEach(recipe -> {
      ItemStack itemStack = recipe.getItem().clone();
      itemStack.setAmount(64);
      displayRecipes.add(recipe.getRecipe()[0]);
        displayRecipes.add(itemStack);

    });
    return displayRecipes;
  }

  public TechGenerator setSpeed(int speed) {
    this.speed = speed;
    return this;
  }

  public int getSpeed() {
    return speed;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    return Radioactivity.HIGH;
  }
}