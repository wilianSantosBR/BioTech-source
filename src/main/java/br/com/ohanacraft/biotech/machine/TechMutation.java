package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.InterfaceMachineDTO;
import br.com.ohanacraft.biotech.dto.MobTechMutationDTO;
import br.com.ohanacraft.biotech.generic.SimpleItemContainerMachine;
import br.com.ohanacraft.biotech.generic.UtilMachine;
import br.com.ohanacraft.biotech.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

public class TechMutation extends SimpleItemContainerMachine {

    public static final SlimefunItemStack TECH_MUTATION = new SlimefunItemStack("BIOTECH_TECH_MUTATION",
            Material.SLIME_BLOCK, "&aTech &bMutation", "");
    public static final ItemStack[] RECIPE_TECH_MUTATION = {
        Components.TRIPLE_COMPRESSED_SLIME_BALL, Components.BIOTECH_SYNTHETIC_RUBY, Components.TRIPLE_COMPRESSED_MAGMA_CREAM,
        SlimefunItems.REINFORCED_PLATE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_PLATE,
        Components.TRIPLE_COMPRESSED_SPONGE, Components.BIOTECH_SYNTHETIC_RUBY, Components.TRIPLE_COMPRESSED_LEATHER
    };


    public static void setup(BioTech plugin) {

        // build maquina
        new TechMutation(TechMutation.TECH_MUTATION, TechMutation.RECIPE_TECH_MUTATION)
            .setTimeProcess(60)
            .setMachineIdentifier(TechMutation.TECH_MUTATION.getItemId())
            .setCapacity(500)
            .setEnergyConsumption(500)
            .register(plugin);

    }

    public TechMutation(SlimefunItemStack item, ItemStack[] recipe) {
        super(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }

    public static final List<MobTechMutationDTO> recipes = new ArrayList<>();
    private Map<Block, MobTechMutationDTO> processing = new HashMap<Block, MobTechMutationDTO>();
    private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
    private int speed = 1;

    public static void addRecipe(SlimefunItemStack recipe1, SlimefunItemStack recipe2, int chance, SlimefunItemStack item) {
        recipes.add(new MobTechMutationDTO(recipe1, recipe2, chance, item));
    }

    @Override
    public int[] getInputSlots() {
        return InterfaceMachineDTO.TECH_MUTATION_INPUT_SLOTS;
    }

    @Override
    public int[] getOutputSlots() {
        return InterfaceMachineDTO.TECH_MUTATION_OUTPUT_SLOTS;
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {

        for (int i : InterfaceMachineDTO.TECH_MUTATION_BORDER) {
            preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE,
                " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InterfaceMachineDTO.TECH_MUTATION_BORDER_IN) {
            preset.addItem(i, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE,
                " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InterfaceMachineDTO.TECH_MUTATION_BORDER_OUT) {
            preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE,
                " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InterfaceMachineDTO.TECH_MUTATION_PROGRESS_BAR_SLOT) {
            preset.addItem(i, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE,
                " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InterfaceMachineDTO.TECH_MUTATION_OUTPUT_SLOTS) {
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
                TechMutation.this.tick(b);
            }

            public boolean isSynchronized() {
                return true;
            }
        });
    }

    public void tick(Block b) {

        BlockMenu inv = BlockStorage.getInventory(b);

        // verifica se não está processando nada
        final MobTechMutationDTO itemNaReceita = validRecipeItem(inv);
        final MobTechMutationDTO itemProduzindo = processing.get(b);
        if (itemProduzindo == null) {

            if (itemNaReceita != null) {

                // consome os 1 mutante tier anterior
                inv.consumeItem(getInputSlots()[0], 1);
                inv.consumeItem(getInputSlots()[1], 1);

                //INICIO PRODUÇÃO
                invalidProgressBar(inv, itemNaReceita.getOutput().getType(), " ");

                // indica no block o processamento
                processing.put(b, itemNaReceita);
                progressTime.put(b, (getTimeProcess() * 2));

            } else {

                invalidProgressBar(inv, "&cTechMutation de receita não identificados");

            }

            // caso já tenha algo em processamento
        } else {

            // verifica se deve finalizar
            if (this.getProgressTime(b) <= 0) {

                //CRIAÇÃO DO ITEM
                if(UtilMachine.getRandomInt() >= itemProduzindo.getChance()){
                    inv.pushItem(itemProduzindo.getOutput().clone(), this.getOutputSlots());
                    invalidProgressBar(inv, Material.BLACK_STAINED_GLASS_PANE, " Success! ");
                } else {
                    invalidProgressBar(inv, Material.BLACK_STAINED_GLASS_PANE, " Fail! ");
                }

                //TÉRMINO PRODUÇÃO
                processing.put(b, null);
                progressTime.put(b, 0);

                // realiza consulmo de energia e ticks
            } else {

                this.processTicks(b, inv, itemProduzindo.getOutput());

            }

        }

    }

    private static void invalidProgressBar(BlockMenu menu, String txt) {
        for (int i : InterfaceMachineDTO.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
            menu.replaceExistingItem(i, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, txt));
        }
    }

    private static void invalidProgressBar(BlockMenu menu, Material material, String txt) {
        for (int i : InterfaceMachineDTO.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
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
                if (time < 0) {
                    time = 0;
                }
                progressTime.put(b, time);

                //todo ajustar para progresso parcial nos 3 slots
                for (int i : InterfaceMachineDTO.TECH_ROBOTIC_PROGRESS_BAR_SLOT) {
                    ChestMenuUtils.updateProgressbar(inv, i, Math.round(ticksLeft / this.getSpeed()),
                        Math.round(ticksTotal / this.getSpeed()), result);
                }
            } else {
                invalidProgressBar(inv, "&cSem energia para maquina");
            }
        } else {
            invalidProgressBar(inv, "&cFalha no tempo da maquina");
        }
    }

    private MobTechMutationDTO validRecipeItem(BlockMenu inv) {
        // percore as possíveis receitas
        for (MobTechMutationDTO produce : this.recipes) {
            ItemStack input1 = produce.getInput1().clone();
            ItemStack input2 = produce.getInput2().clone();
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[0]),
                input1,
                false,
                false) &&
                SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[1]),
                    input2,
                    false,
                    false)) {
                return produce;
            }

        }
        return null;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList();
        this.recipes.forEach(recipe -> {
            displayRecipes.add(recipe.getInput1());
            displayRecipes.add(new CustomItemStack(Material.NAME_TAG, " " + recipe.getChance() + "% "));
            displayRecipes.add(recipe.getInput2());
            displayRecipes.add(recipe.getOutput());
        });
        return displayRecipes;
    }

    public TechMutation setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

}