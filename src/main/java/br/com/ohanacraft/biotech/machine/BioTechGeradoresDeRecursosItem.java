package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BioTechGeradoresDeRecursosItem extends SlimefunItem implements NotPlaceable {


    // componente
    public static final SlimefunItemStack OHANA_CENTRO_CARD_SIMPLES = new SlimefunItemStack("OHANA_CENTRO_CARD_SIMPLES",
            Material.MUSIC_DISC_11,
            "&BComponente Básico para Card", "", "&fComponente para Maquina de produzir itens",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CENTRO_CARD_SIMPLES = new ItemStack[]{
            SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD,
            SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BASIC_CIRCUIT_BOARD,
            SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD
    };

    public static final SlimefunItemStack OHANA_CENTRO_CARD_AVANCADO = new SlimefunItemStack("OHANA_CENTRO_CARD_AVANCADO",
            Material.MUSIC_DISC_PIGSTEP,
            "&BComponente Avançado para Card", "", "&fComponente para Maquina de produzir itens",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CENTRO_CARD_AVANCADO = new ItemStack[]{
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            OHANA_CENTRO_CARD_SIMPLES, Components.SYNTHETIC_RUBY, OHANA_CENTRO_CARD_SIMPLES,
            SlimefunItems.ELECTRO_MAGNET, OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.ELECTRO_MAGNET
    };

    // MAQUINA COMUM

    public static final SlimefunItemStack CORE_BASIC_MACHINE_CASE = new SlimefunItemStack("CORE_BASIC_MACHINE_CASE", Material.IRON_BLOCK,
            "&bCore Básico", "", "&fCore Básico", "", "&fConsumo de energia conforme componentes",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.speed(1), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] RECIPE_CORE_BASIC_MACHINE_CASE = new ItemStack[]{
            null, null, null,
            null, null, null,
            null, null, null};

    public static final SlimefunItemStack CORE_MEDIUM_MACHINE_CASE = new SlimefunItemStack("CORE_MEDIUM_MACHINE_CASE", Material.GOLD_BLOCK,
            "&bCore Médio", "", "&fCore Médio", "", "&fConsumo de energia conforme componentes", "&fProduz cards do Core Básico",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(5), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] RECIPE_CORE_MEDIUM_MACHINE_CASE = new ItemStack[]{
            null, null, null,
            null, null, null,
            null, null, null};

    public static final SlimefunItemStack CORE_ADVANCED_MACHINE_CASE = new SlimefunItemStack("CORE_ADVANCED_MACHINE_CASE", Material.DIAMOND_BLOCK,
            "&bCore Avançado", "", "&fCore Avançado", "", "&fConsumo de energia conforme componentes", "&fProduz cards do Core Básico/Médio",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(15), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] RECIPE_CORE_ADVANCED_MACHINE_CASE = new ItemStack[]{
            null, null, null,
            null, null, null,
            null, null, null};

    // MAQUINA PARA MULTI BLOCK

    public static final SlimefunItemStack MULTIBLOCK_CORE_BASIC_MACHINE_CASE = new SlimefunItemStack("MULTIBLOCK_CORE_BASIC_MACHINE_CASE", Material.IRON_BLOCK,
            "&4MULTIBLOCK &bCore Básico", "", "&fCore Básico", "", "&fConsumo de energia conforme componentes",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.speed(1), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] MULTIBLOCK_RECIPE_CORE_BASIC_MACHINE_CASE = new ItemStack[]{
            null, new ItemStack(Material.CHEST), null,
            null, CORE_BASIC_MACHINE_CASE, null,
            null, new ItemStack(Material.BLAST_FURNACE), null};

    public static final SlimefunItemStack MULTIBLOCK_CORE_MEDIUM_MACHINE_CASE = new SlimefunItemStack("MULTIBLOCK_CORE_MEDIUM_MACHINE_CASE", Material.GOLD_BLOCK,
            "&4MULTIBLOCK &bCore Médio", "", "&fCore Médio", "", "&fConsumo de energia conforme componentes", "&fProduz cards do Core Básico",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(5), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] MULTIBLOCK_RECIPE_CORE_MEDIUM_MACHINE_CASE = new ItemStack[]{
            null, new ItemStack(Material.CHEST), null,
            new ItemStack(Material.GLASS), CORE_MEDIUM_MACHINE_CASE, new ItemStack(Material.GLASS),
            null, new ItemStack(Material.BLAST_FURNACE), null};

    public static final SlimefunItemStack MULTIBLOCK_CORE_ADVANCED_MACHINE_CASE = new SlimefunItemStack("MULTIBLOCK_CORE_ADVANCED_MACHINE_CASE", Material.DIAMOND_BLOCK,
            "&4MULTIBLOCK &bCore Avançado", "", "&fCore Avançado", "", "&fConsumo de energia conforme componentes", "&fProduz cards do Core Básico/Médio",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(15), LoreBuilder.powerPerSecond(100));
    public static final ItemStack[] MULTIBLOCK_RECIPE_CORE_ADVANCED_MACHINE_CASE = new ItemStack[]{
            new ItemStack(Material.PISTON), new ItemStack(Material.CHEST), new ItemStack(Material.PISTON),
            new ItemStack(Material.GLASS), CORE_ADVANCED_MACHINE_CASE, new ItemStack(Material.GLASS),
            new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.BLAST_FURNACE), new ItemStack(Material.NETHERITE_BLOCK)};


    public BioTechGeradoresDeRecursosItem(ItemGroup customOhanaMachinesGeneratorCategory, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(customOhanaMachinesGeneratorCategory, item, recipeType, recipe);
    }

    public static void setup(BioTech plugin) {

        // setup componentes
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY,
                OHANA_CENTRO_CARD_SIMPLES,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                RECIPE_OHANA_CENTRO_CARD_SIMPLES)
                .register(plugin);
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY,
                OHANA_CENTRO_CARD_AVANCADO,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                RECIPE_OHANA_CENTRO_CARD_AVANCADO)
                .register(plugin);

        // setup maquinas
        setupMaquina(plugin, BioTechGeradoresDeRecursosItem.CORE_BASIC_MACHINE_CASE,
                BioTechGeradoresDeRecursosItem.RECIPE_CORE_BASIC_MACHINE_CASE, 1, 1); //60seg
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY, BioTechGeradoresDeRecursosItem.MULTIBLOCK_CORE_BASIC_MACHINE_CASE,
                RecipeType.MULTIBLOCK,
                BioTechGeradoresDeRecursosItem.MULTIBLOCK_RECIPE_CORE_BASIC_MACHINE_CASE)
                .register(plugin);

        setupMaquina(plugin, BioTechGeradoresDeRecursosItem.CORE_MEDIUM_MACHINE_CASE,
                BioTechGeradoresDeRecursosItem.RECIPE_CORE_MEDIUM_MACHINE_CASE, 5, 2); //12seg
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY, BioTechGeradoresDeRecursosItem.MULTIBLOCK_CORE_MEDIUM_MACHINE_CASE,
                RecipeType.MULTIBLOCK,
                BioTechGeradoresDeRecursosItem.MULTIBLOCK_RECIPE_CORE_MEDIUM_MACHINE_CASE)
                .register(plugin);

        setupMaquina(plugin, BioTechGeradoresDeRecursosItem.CORE_ADVANCED_MACHINE_CASE,
                BioTechGeradoresDeRecursosItem.RECIPE_CORE_ADVANCED_MACHINE_CASE, 15, 3); //6seg
        new BioTechGeradoresDeRecursosItem(Categories.CARDS_RESOURCE_CATEGORY, BioTechGeradoresDeRecursosItem.MULTIBLOCK_CORE_ADVANCED_MACHINE_CASE,
                RecipeType.MULTIBLOCK,
                BioTechGeradoresDeRecursosItem.MULTIBLOCK_RECIPE_CORE_ADVANCED_MACHINE_CASE)
                .register(plugin);


    }

    public static void setupMaquina(BioTech plugin, SlimefunItemStack item, ItemStack[] recipe, int speed, int tier) {
        // build maquina
        new BioTechGeradoresDeRecursosMaquina(item, recipe)
                .setTier(tier)
                .setSpeed(speed)
                .setTimeProcess(30)
                .setMachineIdentifier(item.getItemId())
                .setCapacity(100)
                .setEnergyConsumption(100)
                .register(plugin);
    }


}
