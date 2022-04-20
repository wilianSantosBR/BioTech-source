package br.com.ohanacraft.biotech.generic;

import br.com.ohanacraft.biotech.util.InventoryRecipe;
import br.com.ohanacraft.biotech.util.SimpleRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;

import static java.util.Objects.nonNull;

@Async
public class MediumContainerMachine extends AContainer implements NotHopperable, RecipeDisplayItem {

    public List<SimpleRecipe> machineRecipes = new ArrayList<>();
    private Map<Block, MachineRecipe> processing = new HashMap<Block, MachineRecipe>();
    private Map<Block, Integer> progressItem = new HashMap<Block, Integer>();
    private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
    private int timeProcess = 15;
    private String machineIdentifier = "MediumContainerMachine";

    public MediumContainerMachine setMachineIdentifier(@Nonnull String machineIdentifier){
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    public MediumContainerMachine setMachineRecipes(@Nonnull List<SimpleRecipe> machineRecipes){
        this.machineRecipes = machineRecipes;
        return this;
    }

    public MediumContainerMachine setTimeProcess(int timeProcess){
        this.timeProcess = timeProcess;
        return this;
    }

    @ParametersAreNonnullByDefault
    public MediumContainerMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        new BlockMenuPreset(getId(), getItemName()) {

            @Override
            public void init() {
                constructMenu(this);
            }

            @Override
            public boolean canOpen(Block b, Player p) {
                return true;
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                if (flow == ItemTransportFlow.WITHDRAW) {
                    return getOutputSlots();
                }
                return new int[0];
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
                if (flow == ItemTransportFlow.WITHDRAW) {
                    return getOutputSlots();
                }

                int fullSlots = 0;
                List<Integer> slots = new LinkedList<>();

                for (int slot : getInputSlots()) {
                    ItemStack stack = menu.getItemInSlot(slot);
                    if (stack != null && SlimefunUtils.isItemSimilar(stack, item, false, true)) {
                        if (stack.getAmount() >= stack.getMaxStackSize()) {
                            fullSlots++;
                        }

                        slots.add(slot);
                    }
                }

                if (slots.isEmpty()) {
                    return getInputSlots();
                } else if (fullSlots == slots.size()) {
                    // All slots with that item are already full
                    return new int[0];
                } else {
                    slots.sort(compareSlots(menu));
                    int[] array = new int[slots.size()];

                    for (int i = 0; i < slots.size(); i++) {
                        array[i] = slots.get(i);
                    }

                    return array;
                }
            }
        };
    }

    @Nonnull
    private Comparator<Integer> compareSlots(@Nonnull DirtyChestMenu menu) {
        return Comparator.comparingInt(slot -> menu.getItemInSlot(slot).getAmount());
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {
        for (int i : InventoryRecipe.MEDIUM_BORDER) {
            preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InventoryRecipe.MEDIUM_INPUT_BORDER) {
            preset.addItem(i, new CustomItemStack(Material.CYAN_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : InventoryRecipe.MEDIUM_OUTPUT_BORDER) {
            preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());
        }

        preset.addItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());

        for (int i : getOutputSlots()) {
            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

                @Override
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
                    if (cursor == null) return true;
                    return cursor.getType() == Material.AIR;
                }
            });
        }
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.PISTON);
    }

    @Override
    public int[] getInputSlots() {
        return InventoryRecipe.MEDIUM_INPUT;
    }

    @Override
    public int[] getOutputSlots() {
        return InventoryRecipe.MEDIUM_OUTPUT;
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return nonNull(this.machineIdentifier) ? this.machineIdentifier : "MachineIdentifier";
    }

    private static void invalidInput(BlockMenu menu) {
        menu.replaceExistingItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(
                Material.RED_STAINED_GLASS_PANE,
                "&cInput a valid material to start"
        ));
    }

    private static void invalidOutput(BlockMenu menu) {
        menu.replaceExistingItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(
                Material.RED_STAINED_GLASS_PANE,
                "&cOutput is full"
        ));
    }

    private static void noEnergyStart(BlockMenu menu) {
        menu.replaceExistingItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(
                Material.RED_STAINED_GLASS_PANE, "&cConnect energy to start"
        ));
    }

    private static void noEnergyContinue(BlockMenu menu, ItemStack material) {
        menu.replaceExistingItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(
                material, "&cConnect energy to continue"
        ));
    }

    private static void noMaterialContinue(BlockMenu menu, ItemStack material) {
        menu.replaceExistingItem(InventoryRecipe.MEDIUM_STATUS_SLOT, new CustomItemStack(
                material, "&cDeposit more materials to continue"
        ));
    }


    @Override
    protected void tick(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);

        if (this.isProcessing(b)) {

            final MachineRecipe machineRecipe = processing.get(b);

            if (getCharge(b.getLocation()) < getEnergyConsumption()) {
                noEnergyContinue(inv, (machineRecipe.getOutput()[0]));
                return;
            }

            final int processItem = getProgressItem(b);
            final int ticks = getProcessing(b).getTicks();
            int ticksLeft = getProgressTime(b);
            ItemStack[] result = machineRecipe.getOutput();

            //verifica se inventário está cheio
            int fullSlots = 0;
            List<Integer> slots = new LinkedList<>();
            for (int slot : getOutputSlots()) {
                ItemStack stack = inv.getItemInSlot(slot);
                if (stack != null && SlimefunUtils.isItemSimilar(stack, result[0], false, false)) {
                    if (stack.getAmount() >= stack.getMaxStackSize()) {
                        fullSlots++;
                    }
                    slots.add(slot);
                }
            }

            if (!slots.isEmpty() && fullSlots == getOutputSlots().length) {
                // All slots with that item are already full
                invalidOutput(inv);
                return;
            }

            if ((ticksLeft == ticks) && (ticksLeft > 0) && this.takeCharge(b.getLocation())) {

                startProcessTicks(b, inv, ticks, ticksLeft, result[0]);

            } else if ((ticksLeft <= 0) && (processItem >= 9) && this.takeCharge(b.getLocation())) {

                endProcessTicks(b, inv, result);

            } else if ((ticksLeft <= 0) && (processItem < 9) && this.takeCharge(b.getLocation())) {

                checkMaterialProgress(b, inv, machineRecipe, processItem, ticks, ticksLeft, result);

            } else {

                processTicks(b, inv, machineRecipe, processItem, ticks, ticksLeft, result);

            }

        } else {

            if (getCharge(b.getLocation()) < getEnergyConsumption()) {
                noEnergyStart(inv);
                return;
            }

            MachineRecipe next = this.findNextRecipe(inv);

            if (next != null) {

                processing.put(b, next);
                progressTime.put(b, next.getTicks());
                progressItem.put(b, 0);

            } else {

                invalidInput(inv);
            }
        }

    }

    private void processTicks(Block b, BlockMenu inv, MachineRecipe machineRecipe, int processItem, int ticks, int ticksLeft, ItemStack[] result) {
        final ItemStack[] recipeInput = machineRecipe.getInput();
        if (((ticksLeft < ticks) && (ticksLeft > 0)) && this.takeCharge(b.getLocation())) {
            int time = ticksLeft - this.getSpeed();
            if(time < 0) time = 0;
            progressTime.put(b, time);
            ChestMenuUtils.updateProgressbar(inv, InventoryRecipe.MEDIUM_STATUS_SLOT, ticksLeft, ticks, result[0]);

            if (processItem < 9 && recipeInput[processItem] != null) {
                ItemStack itemStack = recipeInput[processItem];
                if (consumeItem(b, itemStack)) {
                    progressItem.put(b, processItem + 1);
                }
            }

        }
    }

    private void endProcessTicks(Block b, BlockMenu inv, ItemStack[] result) {
        //give result
        for (ItemStack itemStack : result) {
            inv.pushItem(itemStack.clone(), getOutputSlots());
        }
        progressTime.remove(b);
        processing.remove(b);
        progressItem.remove(b);
        invalidInput(inv);
    }

    private void startProcessTicks(Block b, BlockMenu inv, int ticks, int ticksLeft, ItemStack itemStack) {
        ChestMenuUtils.updateProgressbar(inv, InventoryRecipe.MEDIUM_STATUS_SLOT, ticksLeft, ticks, itemStack);
        int time = ticksLeft - this.getSpeed();
        if(time < 0) time = 0;
        progressTime.put(b, time);
        progressItem.put(b, 0);
    }

    private void checkMaterialProgress(Block b, BlockMenu inv, MachineRecipe machineRecipe, int processItem, int ticks, int ticksLeft, ItemStack[] result) {
        noMaterialContinue(inv, result[0]);
        for (int i = processItem; i < 9; i++) {
            ItemStack itemStack = machineRecipe.getInput()[i];
            if (consumeItem(b, itemStack)) {
                if (ticksLeft > 0) {
                    int time = ticksLeft - this.getSpeed();
                    if(time < 0) time = 0;
                    progressTime.put(b, time);
                }
                progressItem.put(b, i + 1);
                ChestMenuUtils.updateProgressbar(inv, InventoryRecipe.MEDIUM_STATUS_SLOT, ticksLeft, ticks, result[0]);
            }
        }
    }

    private boolean consumeItem(Block b, ItemStack itemToConsume) {
        final BlockMenu inv = BlockStorage.getInventory(b);
        int[] inputSlots = this.getInputSlots();
        for (int slot : inputSlots) {
            ItemStack item = inv.getItemInSlot(slot);
            if (item != null && SlimefunUtils.isItemSimilar(item, itemToConsume, false, true)) {
                inv.consumeItem(slot, itemToConsume.getAmount());
                return true;
            }
        }
        return false;
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {

        int[] inputSlots = this.getInputSlots();

        for (SimpleRecipe recipe: machineRecipes) {

            ItemStack[] recipeInput = recipe.getRecipe();

            int foundSize = 0;
            for (ItemStack itemStack : recipeInput) {
                for (int inputSlot : inputSlots) {
                    if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(inputSlot), itemStack, false, true)) {
                        foundSize++;
                        break;
                    }
                }
            }

            if (foundSize == 9) {
                return new MachineRecipe(timeProcess, recipeInput, new ItemStack[]{recipe.getItem()});
            }

        }

        return null;

    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList();
        machineRecipes.forEach(recipe -> {
            displayRecipes.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
            displayRecipes.add(recipe.getItem());
        });
        return displayRecipes;
    }

    public int getProgressTime(Block b) {
        return progressTime.get(b) != null ? progressTime.get(b) : timeProcess;
    }

    public int getProgressItem(Block b) {
        return progressItem.get(b) != null ? progressItem.get(b) : 0;
    }

    public MachineRecipe getProcessing(Block b) {
        return processing.get(b);
    }

    public boolean isProcessing(Block b) {
        return getProcessing(b) != null;
    }

}