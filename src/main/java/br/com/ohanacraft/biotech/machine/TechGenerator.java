package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.InterfaceMachineDTO;
import br.com.ohanacraft.biotech.generic.SimpleItemContainerMachine;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.MobTech;
import br.com.ohanacraft.biotech.util.Energy;
import br.com.ohanacraft.biotech.util.ItemNotPlaceable;
import br.com.ohanacraft.biotech.util.SimpleRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
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
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class TechGenerator extends SimpleItemContainerMachine {

  public static final SlimefunItemStack TECH_GENERATOR = new SlimefunItemStack(
      "BIOTECH_TECH_GENERATOR",
      Material.LOOM, "&aTech &bGenerator", "",
      "&fUsing power and bees/golem, slowly generates materials.",
      "",
      LoreBuilder.radioactive(Radioactivity.HIGH),
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
      Energy.energyPowerPerSecond(2000),
      "");
  public static final ItemStack[] RECIPE_TECH_GENERATOR = {
      Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST,
      SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.LOOM),
      SlimefunItems.REINFORCED_ALLOY_INGOT,
      Components.TRIPLE_COMPRESSED_OAK_WOOD, SlimefunItems.ELECTRIC_MOTOR,
      Components.TRIPLE_COMPRESSED_OAK_WOOD
  };

  public TechGenerator(SlimefunItemStack item, ItemStack[] recipe) {
    super(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public static void setup(BioTech plugin) {

    // build maquina
    new TechGenerator(TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR)
        .setTimeProcess(1800)
        .setMachineIdentifier(TechGenerator.TECH_GENERATOR.getItemId())
        .setCapacity(2000)
        .setEnergyConsumption(2000)
        .register(plugin);

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
    // ordena para receitas com maior quantidade de itens
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
    new ItemNotPlaceable(Categories.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input), new ItemStack(input), new ItemStack(input),
        new ItemStack(input), Components.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(input),
        new ItemStack(input), new ItemStack(input), new ItemStack(input)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
  }

  public static void preSetup(BioTech plugin, int tierCard, SlimefunItemStack item,
      Material input, Material output) {
    preSetup(plugin, tierCard, item, new ItemStack(input), new ItemStack(output));
  }

  public static void preSetup(BioTech plugin, int tierCard, SlimefunItemStack item,
      ItemStack input, ItemStack output) {
    new ItemNotPlaceable(Categories.CARDS_RESOURCE_CATEGORY,
        item, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
        new ItemStack(input), new ItemStack(input), new ItemStack(input),
        new ItemStack(input),
        tierCard <= 1
            ? Components.OHANA_CENTRO_CARD_SIMPLES
            : Components.OHANA_CENTRO_CARD_AVANCADO,
        new ItemStack(input),
        new ItemStack(input), new ItemStack(input), new ItemStack(input)
    }).register(plugin);
    TechGenerator.addReceitasParaProduzir(item, output);
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

    // verifica se não está processando nada
    final ItemStack itemNaReceita = validRecipeItem(inv);
    final ItemStack itemProduzindo = processing.get(b);
    if (itemProduzindo == null) {

      if (itemNaReceita != null) {

        //INICIO PRODUÇÃO
        invalidSituacao(inv, itemNaReceita.getType(), " ");

        // indica no block o processamento
        processing.put(b, itemNaReceita);
        progressTime.put(b, (getTimeProcess() * 2));

      } else {

        invalidSituacao(inv, "&cCards de receita não identificados");

      }

      // caso já tenha algo em processamento
    } else {

      // verifica se deve finalizar
      if (this.getProgressTime(b) <= 0) {

        //CRIAÇÃO DO ITEM
        inv.pushItem(itemProduzindo.clone(), this.getOutputSlots());

        //TÉRMINO PRODUÇÃO
        processing.put(b, null);
        progressTime.put(b, 0);
        invalidSituacao(inv, Material.BLACK_STAINED_GLASS_PANE, " ");

        // realiza consulmo de energia e ticks
      } else {

        // verifica está com mesmo data card
        if (SlimefunUtils.isItemSimilar(itemNaReceita, itemProduzindo, false, false)) {

          this.processTicks(b, inv, itemProduzindo);

        } else {

          //TÉRMINO PRODUÇÃO
          processing.put(b, null);
          progressTime.put(b, 0);
          invalidSituacao(inv, Material.BLACK_STAINED_GLASS_PANE, " ");
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
      // verifica se há energia
      if (this.takeCharge(b.getLocation())) {

        int time = ticksLeft - this.getSpeed();

        ItemStack b1 = inv.getItemInSlot(getInputSlots()[1]);
        ItemStack b2 = inv.getItemInSlot(getInputSlots()[2]);
        ItemStack b3 = inv.getItemInSlot(getInputSlots()[3]);
        ItemStack b4 = inv.getItemInSlot(getInputSlots()[4]);

        if (b1 != null) {
          SlimefunItem mob1 = SlimefunItem.getByItem(b1);
          if (mob1 instanceof MobTech) {
            time -= (((MobTech) mob1).getMobTechTier()+1) * b1.getAmount();
          }
        }
        if (b2 != null) {
          SlimefunItem mob2 = SlimefunItem.getByItem(b2);
          if (mob2 instanceof MobTech) {
            time -= (((MobTech) mob2).getMobTechTier()+1) * b2.getAmount();
          }
        }
        if (b3 != null) {
          SlimefunItem mob3 = SlimefunItem.getByItem(b3);
          if (mob3 instanceof MobTech) {
            time -= (((MobTech) mob3).getMobTechTier()+1) * b3.getAmount();
          }
        }
        if (b4 != null) {
          SlimefunItem mob4 = SlimefunItem.getByItem(b4);
          if (mob4 instanceof MobTech) {
            time -= (((MobTech) mob4).getMobTechTier()+1) * b4.getAmount();
          }
        }

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
        invalidSituacao(inv, "&cSem energia para maquina");
      }
    } else {
      invalidSituacao(inv, "&cFalha no tempo da maquina");
    }
  }

  private ItemStack validRecipeItem(BlockMenu inv) {
    // percore as possíveis receitas
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
    final CustomItemStack empty = new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " ");
    final CustomItemStack separator = new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " ");
    List<ItemStack> displayRecipes = new ArrayList();
    this.getReceitasParaExibir().forEach(recipe -> {
      final int tamanho = recipe.getRecipe().length;
      if (tamanho == 1) {
        displayRecipes.add(recipe.getRecipe()[0]);
        displayRecipes.add(recipe.getItem());
      } else if (tamanho >= 2) {
        displayRecipes.add(recipe.getRecipe()[0]);
        displayRecipes.add(recipe.getItem());
        for (int i = 1; i < tamanho; i++) {
          displayRecipes.add(recipe.getRecipe()[i]);
          displayRecipes.add(empty);
        }
      }
      displayRecipes.add(separator);
      displayRecipes.add(separator);
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
}