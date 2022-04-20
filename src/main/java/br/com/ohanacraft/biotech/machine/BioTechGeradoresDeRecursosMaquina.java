package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.generic.SimpleItemContainerMachine;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
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
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class BioTechGeradoresDeRecursosMaquina extends SimpleItemContainerMachine {

    public static final List<BioTechGenerateRecipe> receitasParaProduzir = new ArrayList<>();
    private Map<Block, ItemStack> processing = new HashMap<Block, ItemStack>();
    private Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
    private int tier = 1;
    private int speed = 1;

    public BioTechGeradoresDeRecursosMaquina(SlimefunItemStack item, ItemStack[] recipe) {
        super(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }

    public static void addReceitasParaProduzir(ItemStack receita, ItemStack item) {
        receitasParaProduzir.add(new BioTechGenerateRecipe(1, item, new ItemStack[]{receita}));
    }

    public static void addReceitasParaProduzir(ItemStack[] receita, ItemStack item) {
        receitasParaProduzir.add(new BioTechGenerateRecipe(1, item, receita));
    }

    public static void addReceitasParaProduzir(int tier, ItemStack receita, ItemStack item) {
        receitasParaProduzir.add(new BioTechGenerateRecipe(tier, item, new ItemStack[]{receita}));
    }

    public static void addReceitasParaProduzir(int tier, ItemStack[] receita, ItemStack item) {
        receitasParaProduzir.add(new BioTechGenerateRecipe(tier, item, receita));
    }

    public List<BioTechGenerateRecipe> getReceitasParaExibir(int filtroTier) {
        // ordena para receitas com maior quantidade de itens
        return receitasParaProduzir.stream()
                .filter(x -> isNull(filtroTier) || x.getTierDaMaquina() == filtroTier)
                .sorted((o1, o2) -> Integer.compare(o1.getReceitaDoItem().length, o2.getReceitaDoItem().length))
                .collect(Collectors.toList());
    }

    public List<BioTechGenerateRecipe> getReceitasParaProduzir(int filtroTier) {
        // ordena para receitas com maior quantidade de itens
        return receitasParaProduzir.stream()
                .filter(x -> isNull(filtroTier) || x.getTierDaMaquina() <= filtroTier)
                .sorted((o1, o2) -> Integer.compare(o2.getReceitaDoItem().length, o1.getReceitaDoItem().length))
                .collect(Collectors.toList());
    }


    public static void preSetup(BioTech plugin, SlimefunItemStack item, Material entrada, Material saida) {
        preSetup(plugin, 1, item, new ItemStack(entrada), new ItemStack(saida));
    }

    public static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack entrada, ItemStack saida) {
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY,
                item, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[]{
            new ItemStack(entrada), new ItemStack(entrada), new ItemStack(entrada),
            new ItemStack(entrada), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(entrada),
            new ItemStack(entrada), new ItemStack(entrada), new ItemStack(entrada)
        }).register(plugin);
        BioTechGeradoresDeRecursosMaquina.addReceitasParaProduzir(item, saida);
    }

    public static void preSetup(BioTech plugin, int tierReceita, SlimefunItemStack item, Material entrada, Material saida) {
        preSetup(plugin, tierReceita, item, new ItemStack(entrada), new ItemStack(saida));
    }

    public static void preSetup(BioTech plugin, int tierReceita, SlimefunItemStack item, ItemStack entrada, ItemStack saida) {
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY,
                item, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[]{
            new ItemStack(entrada), new ItemStack(entrada), new ItemStack(entrada),
            new ItemStack(entrada),
            tierReceita <= 1
            ? BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES
            : BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO,
            new ItemStack(entrada),
            new ItemStack(entrada), new ItemStack(entrada), new ItemStack(entrada)
        }).register(plugin);
        BioTechGeradoresDeRecursosMaquina.addReceitasParaProduzir(tierReceita, item, saida);
    }

    public static final int[] BORDA_ENTRADA = {
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            9, 17,
            18, 19, 20, 21, 23, 24, 25, 26,
    };
    public static final int[] ENTRADA = {
            10, 11, 12, 13, 14, 15, 16,

    };
    public static final int[] BORDA_SAIDA = {
            27, 28, 29, 30, 31, 32, 33, 34, 35,
            36, 44,
            45, 46, 47, 48, 49, 50, 51, 52, 53,
    };
    public static final int[] SAIDA = {
            37, 38, 39, 40, 41, 42, 43,
    };
    public static final int SITUACAO = 22;

    @Override
    public int[] getInputSlots() {
        return ENTRADA;
    }

    @Override
    public int[] getOutputSlots() {
        return SAIDA;
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {


        for (int i : BORDA_ENTRADA) {
            preset.addItem(i, new CustomItemStack(Material.LIME_STAINED_GLASS_PANE,
                    " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : BORDA_SAIDA) {
            preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE,
                    " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());
        }

        preset.addItem(SITUACAO, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE,
                " ", new String[0]), ChestMenuUtils.getEmptyClickHandler());

        for (int i : SAIDA) {
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
    public void preRegister() {
        this.addItemHandler(new BlockTicker() {
            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                BioTechGeradoresDeRecursosMaquina.this.tick(b);
            }

            public boolean isSynchronized() {
                return true;
            }
        });
    }

    public void tick(Block b) {

        BlockMenu inv = BlockStorage.getInventory(b);

        if (invalidMachineMultiblock(b)) {
            //disabled machine or no energy, abort...
            invalidSituacao(inv, "&cMontagem maquina inválida");
            return;
        }

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
                Block upBlock = b.getRelative(0, 1, 0);
                if (upBlock.getState() instanceof InventoryHolder) {
                    Inventory invUp = ((InventoryHolder) upBlock.getState()).getInventory();
                    if (invUp.firstEmpty() != -1) {
                        invUp.addItem(itemProduzindo.clone());
                    } else {
                        inv.pushItem(itemProduzindo.clone(), this.getOutputSlots());
                    }
                } else {
                    inv.pushItem(itemProduzindo.clone(), this.getOutputSlots());
                }

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

    // valida o tipo da maquina
    private boolean invalidMachineMultiblock(Block b) {
        Material type = b.getType();
        if (!Material.IRON_BLOCK.equals(type)
                && !Material.GOLD_BLOCK.equals(type)
                && !Material.DIAMOND_BLOCK.equals(type)) {
            return true;
        }

        // valida maquina basica
        Block upBlock = b.getRelative(0, 1, 0);
        Block downBlock = b.getRelative(0, -1, 0);
        final boolean valide1 = (upBlock.getType() == Material.CHEST
                && downBlock.getType() == Material.BLAST_FURNACE);
        if (Material.IRON_BLOCK.equals(type) && valide1) {
            return false;
        }

        // valida maquinas em paralelo
        Block distanciaOutraA1lado1 = b.getRelative(0, 0, 2);
        Block distanciaOutraA1lado2 = b.getRelative(0, 0, -2);
        Block distanciaOutraA2lado1 = b.getRelative(2, 0, 0);
        Block distanciaOutraA2lado2 = b.getRelative(-2, 0, 0);
        final boolean valideOutraMachineA = !(distanciaOutraA1lado1.getType() == Material.GOLD_BLOCK
                || distanciaOutraA1lado2.getType() == Material.GOLD_BLOCK
                || distanciaOutraA1lado1.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraA1lado2.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraA2lado1.getType() == Material.GOLD_BLOCK
                || distanciaOutraA2lado2.getType() == Material.GOLD_BLOCK
                || distanciaOutraA2lado1.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraA2lado2.getType() == Material.DIAMOND_BLOCK);

        Block distanciaOutraB1lado1 = b.getRelative(1, 0, 1);
        Block distanciaOutraB1lado2 = b.getRelative(1, 0, -1);
        Block distanciaOutraB2lado1 = b.getRelative(-1, 0, 1);
        Block distanciaOutraB2lado2 = b.getRelative(-1, 0, -1);
        final boolean valideOutraMachineB = !(distanciaOutraB1lado1.getType() == Material.GOLD_BLOCK
                || distanciaOutraB1lado2.getType() == Material.GOLD_BLOCK
                || distanciaOutraB1lado1.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraB1lado2.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraB2lado1.getType() == Material.GOLD_BLOCK
                || distanciaOutraB2lado2.getType() == Material.GOLD_BLOCK
                || distanciaOutraB2lado1.getType() == Material.DIAMOND_BLOCK
                || distanciaOutraB2lado2.getType() == Material.DIAMOND_BLOCK);


        // verifica tier medium
        Block centro1lado1 = b.getRelative(0, 0, 1);
        Block centro1lado2 = b.getRelative(0, 0, -1);
        Block centro2lado1 = b.getRelative(1, 0, 0);
        Block centro2lado2 = b.getRelative(-1, 0, 0);
        final boolean valide2 = (centro1lado1.getType() == Material.GLASS
                && centro1lado2.getType() == Material.GLASS)
                || (centro2lado1.getType() == Material.GLASS
                && centro2lado2.getType() == Material.GLASS);
        if (Material.GOLD_BLOCK.equals(type) && valide1 && valide2 && valideOutraMachineA && valideOutraMachineB) {
            return false;
        }

        // verifica tier advanced
        Block topo1lado1 = b.getRelative(0, 1, 1);
        Block topo1lado2 = b.getRelative(0, 1, -1);
        Block topo2lado1 = b.getRelative(1, 1, 0);
        Block topo2lado2 = b.getRelative(-1, 1, 0);
        Block base1lado1 = b.getRelative(0, -1, 1);
        Block base1lado2 = b.getRelative(0, -1, -1);
        Block base2lado1 = b.getRelative(1, -1, 0);
        Block base2lado2 = b.getRelative(-1, -1, 0);
        final boolean valide3 = (topo1lado1.getType() == Material.PISTON
                && topo1lado2.getType() == Material.PISTON
                && base1lado1.getType() == Material.NETHERITE_BLOCK
                && base1lado2.getType() == Material.NETHERITE_BLOCK)
                || (topo2lado1.getType() == Material.PISTON
                && topo2lado2.getType() == Material.PISTON
                && base2lado1.getType() == Material.NETHERITE_BLOCK
                && base2lado2.getType() == Material.NETHERITE_BLOCK);
        if (Material.DIAMOND_BLOCK.equals(type) && valide1 && valide2 && valide3 && valideOutraMachineA && valideOutraMachineB) {
            return false;
        }

        return true;
    }

    private static void invalidSituacao(BlockMenu menu, String txt) {
        menu.replaceExistingItem(SITUACAO, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, txt));
    }

    private static void invalidSituacao(BlockMenu menu, Material material, String txt) {
        menu.replaceExistingItem(SITUACAO, new CustomItemStack(material, txt));
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
                ChestMenuUtils.updateProgressbar(inv, SITUACAO, Math.round(ticksLeft / this.getSpeed()), Math.round(ticksTotal / this.getSpeed()), result);
            } else {
                invalidSituacao(inv, "&cSem energia para maquina");
            }
        } else {
            invalidSituacao(inv, "&cFalha no tempo da maquina");
        }
    }

    private ItemStack validRecipeItem(BlockMenu inv) {
        int[] inputSlots = this.getInputSlots();

        // percore as possíveis receitas
        for (BioTechGenerateRecipe produce : this.getReceitasParaProduzir(this.getTier())) {

            final ItemStack[] recipeInput = produce.getReceitaDoItem();
            int foundSize = 0;
            List<Integer> foundSlot = new ArrayList<>();

            // percorre os itens de entrada da receita
            for (ItemStack itemStack : recipeInput) {

                // percorre os slots
                for (int inputSlot : inputSlots) {

                    // ignora slots que já estão em uso na receita
                    if(!foundSlot.contains(inputSlot)
                        && SlimefunUtils.isItemSimilar(inv.getItemInSlot(inputSlot), itemStack, false, true)) {
                        foundSize++;
                        foundSlot.add(inputSlot);
                        break;
                    }
                }
            }

            if (foundSize == recipeInput.length) {
                return produce.getItemParaGerar();
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
        this.getReceitasParaExibir(this.getTier()).forEach(recipe -> {
            final int tamanho = recipe.getReceitaDoItem().length;
            if (tamanho == 1) {
                displayRecipes.add(recipe.getReceitaDoItem()[0]);
                displayRecipes.add(recipe.getItemParaGerar());
            } else if (tamanho >= 2) {
                displayRecipes.add(recipe.getReceitaDoItem()[0]);
                displayRecipes.add(recipe.getItemParaGerar());
                for (int i = 1; i < tamanho; i++) {
                    displayRecipes.add(recipe.getReceitaDoItem()[i]);
                    displayRecipes.add(empty);
                }
            }
            displayRecipes.add(separator);
            displayRecipes.add(separator);
        });
        return displayRecipes;
    }

    public BioTechGeradoresDeRecursosMaquina setTier(int tier){
        this.tier = tier;
        return this;
    }

    public int getTier() {
        return tier;
    }

    public BioTechGeradoresDeRecursosMaquina setSpeed(int speed){
        this.speed = speed;
        return this;
    }

    public int getSpeed() {
        return speed;
    }
}