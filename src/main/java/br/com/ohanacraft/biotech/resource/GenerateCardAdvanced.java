package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.machine.BioTechGeradoresDeRecursosItem;
import br.com.ohanacraft.biotech.machine.BioTechGeradoresDeRecursosMaquina;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GenerateCardAdvanced {

    /**
     * tipos card avançado

     MUSIC_DISC_BLOCKS      8 laranja
     MUSIC_DISC_CHIRP       9 vemelho
     MUSIC_DISC_MALL        10 roxo
     MUSIC_DISC_STAL        11 preto

     */

    public static final SlimefunItemStack OHANA_CARD_SOLDER_INGOT = new SlimefunItemStack("OHANA_CARD_SOLDER_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Solder Ingot", "", "&fAltera para Produção de Solder Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_SOLDER_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_LEAD_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_LEAD_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_TIN_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_TIN_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_LEAD_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_LEAD_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_BILLON_INGOT = new SlimefunItemStack("OHANA_CARD_BILLON_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Billon Ingot", "", "&fAltera para Produção de Billon Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_BILLON_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_BRONZE_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Bronze Ingot", "", "&fAltera para Produção de Bronze Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_BRONZE_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_TIN_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_TIN_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_BRASS_INGOT = new SlimefunItemStack("OHANA_CARD_BRASS_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Brass Ingot", "", "&fAltera para Produção de Brass Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_BRASS_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ZINC_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ZINC_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_SULFATE = new SlimefunItemStack("OHANA_CARD_SULFATE", Material.MUSIC_DISC_BLOCKS,
            "&bCard de Sulfate", "", "&fAltera para Produção de Sulfate",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_SULFATE = new ItemStack[]{
            SlimefunItems.ELECTRIFIED_CRUCIBLE, SlimefunItems.ELECTRIC_ORE_GRINDER, SlimefunItems.ELECTRIFIED_CRUCIBLE,
            SlimefunItems.ELECTRIC_ORE_GRINDER, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.ELECTRIC_ORE_GRINDER,
            SlimefunItems.ELECTRIFIED_CRUCIBLE, SlimefunItems.ELECTRIC_ORE_GRINDER, SlimefunItems.ELECTRIFIED_CRUCIBLE
    };

    public static final SlimefunItemStack OHANA_CARD_CARBON = new SlimefunItemStack("OHANA_CARD_CARBON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Carbon", "", "&fAltera para Produção de Carbon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_CARBON = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL, InfinityExpansionMaterials.COAL_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL,
            SlimefunItems.CARBON_PRESS, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.CARBON_PRESS,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL, InfinityExpansionMaterials.COAL_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL
    };

    public static final SlimefunItemStack OHANA_CARD_SILICON = new SlimefunItemStack("OHANA_CARD_SILICON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Silicon", "", "&fAltera para Produção de Silicon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_SILICON = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_QUARTZ, InfinityExpansionMaterials.QUARTZ_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_QUARTZ,
            SlimefunItems.ELECTRIC_SMELTERY, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.ELECTRIC_SMELTERY,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_QUARTZ, InfinityExpansionMaterials.QUARTZ_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_QUARTZ
    };

    public static final SlimefunItemStack OHANA_CARD_STEEL = new SlimefunItemStack("OHANA_CARD_STEEL", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Steel", "", "&fAltera para Produção de Steel",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_STEEL = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_NICKEL = new SlimefunItemStack("OHANA_CARD_NICKEL", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Nickel", "", "&fAltera para Produção de Nickel",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_NICKEL = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_FERROSILICON = new SlimefunItemStack("OHANA_CARD_FERROSILICON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Ferrosilicon", "", "&fAltera para Produção de Ferrosilicon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_FERROSILICON = new ItemStack[]{
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SILICON, InfinityExpansionMaterials.QUARTZ_SINGULARITY, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SILICON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.IRON_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON
    };

    public static final SlimefunItemStack OHANA_CARD_DAMASCUS = new SlimefunItemStack("OHANA_CARD_DAMASCUS", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Damascus", "", "&fAltera para Produção de Damascus",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_DAMASCUS = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_STEEL, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_COBALT = new SlimefunItemStack("OHANA_CARD_COBALT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Cobalt", "", "&fAltera para Produção de Cobalt",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_COBALT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_NICKEL, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_DURALUMIN_INGOT = new SlimefunItemStack("OHANA_CARD_DURALUMIN_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Duralumin Ingot", "", "&fAltera para Produção de Duralumin Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_DURALUMIN_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST
    };

    // TIER 2
    public static final SlimefunItemStack OHANA_CARD_ALUMINUM_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_ALUMINUM_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Aluminum Bronze Ingot", "", "&fAltera para Produção de Aluminum Bronze Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_ALUMINUM_BRONZE_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRONZE_INGOT, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRONZE_INGOT,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_ALUMINUM_BRASS_INGOT = new SlimefunItemStack("OHANA_CARD_ALUMINUM_BRASS_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Aluminum Brass Ingot", "", "&fAltera para Aluminum Produção de Brass Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_ALUMINUM_BRASS_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRASS_INGOT, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRASS_INGOT,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_CORINTHIAN_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Corinthian Bronze Ingot", "", "&fAltera para Produção de Corinthian Bronze Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_CORINTHIAN_BRONZE_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRONZE_INGOT, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_SILVER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRONZE_INGOT, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_GOLD24K = new SlimefunItemStack("OHANA_CARD_GOLD24K", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Gold 24k", "", "&fAltera para Produção de Ouro 24k", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_GOLD24K = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD, InfinityExpansionMaterials.GOLD_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD,
            InfinityExpansionMaterials.GOLD_SINGULARITY, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, InfinityExpansionMaterials.GOLD_SINGULARITY,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD, InfinityExpansionMaterials.GOLD_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_GOLD
    };

    public static final SlimefunItemStack OHANA_CARD_CARBON_PRESS = new SlimefunItemStack("OHANA_CARD_CARBON_PRESS", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Compressed Carbon", "", "&fAltera para Produção de Compressed Carbon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_CARBON_PRESS = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON, OhanaGeradoresDeRecursosItem.CORE_ADVANCED_MACHINE_CASE, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COAL
    };

    public static final SlimefunItemStack OHANA_CARD_HARDENED_METAL_INGOT = new SlimefunItemStack("OHANA_CARD_HARDENED_METAL_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Hardened Metal Ingot", "", "&fAltera para Produção de Hardened Metal Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_HARDENED_METAL_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DAMASCUS, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON_PRESS, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DAMASCUS,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DURALUMIN_INGOT, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DURALUMIN_INGOT,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRONZE_INGOT, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON_PRESS, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRONZE_INGOT
    };

    public static final SlimefunItemStack OHANA_CARD_REDSTONE_ALLOY = new SlimefunItemStack("OHANA_CARD_REDSTONE_ALLOY", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Redstone Alloy", "", "&fAltera para Produção de Redstone Alloy", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_REDSTONE_ALLOY = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_REDSTONE, InfinityExpansionMaterials.REDSTONE_SINGULARITY, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_REDSTONE,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_FERROSILICON, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_FERROSILICON,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_HARDENED_METAL_INGOT, InfinityExpansionMaterials.REDSTONE_SINGULARITY, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_HARDENED_METAL_INGOT
    };

    public static final SlimefunItemStack OHANA_CARD_BATTERY = new SlimefunItemStack("OHANA_CARD_BATTERY", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Battery", "", "&fAltera para Produção de Battery", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_BATTERY = new ItemStack[]{
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_REDSTONE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_REDSTONE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_REDSTONE,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ZINC_DUST, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST,
            OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ZINC_DUST, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SULFATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_COPPER_DUST
    };

    public static final SlimefunItemStack OHANA_CARD_MAGNET = new SlimefunItemStack("OHANA_CARD_MAGNET", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Magnet", "", "&fAltera para Produção de Magnet", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_MAGNET = new ItemStack[]{
            InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_IRON_DUST, InfinityExpansionMaterials.MACHINE_PLATE,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_NICKEL, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_COBALT,
            InfinityExpansionMaterials.MACHINE_PLATE, OhanaGeradoresDeRecursosCardSimples.OHANA_CARD_ALUMINUM_DUST, InfinityExpansionMaterials.MACHINE_PLATE
    };

    public static final SlimefunItemStack OHANA_CARD_ELECTRO_MAGNET = new SlimefunItemStack("OHANA_CARD_ELECTRO_MAGNET", Material.MUSIC_DISC_MALL,
            "&bUpgrade Machine Electro Magnet", "", "&fAltera para Produção de Electro Magnet", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_ELECTRO_MAGNET = new ItemStack[]{
            InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_MAGNET, InfinityExpansionMaterials.MACHINE_CORE,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_NICKEL, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_COBALT,
            InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BATTERY, InfinityExpansionMaterials.MACHINE_CORE
    };


    //TIER 3
    public static final SlimefunItemStack OHANA_CARD_REINFORCED_ALLOY_INGOT = new SlimefunItemStack("OHANA_CARD_REINFORCED_ALLOY_INGOT", Material.MUSIC_DISC_STAL,
            "&bUpgrade Machine Reinforced Alloy Ingot", "", "&fAltera para Produção de Reinforced Alloy Ingot", "&4Apenas Maquina Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_REINFORCED_ALLOY_INGOT = new ItemStack[]{
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DAMASCUS, InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SOLDER_INGOT,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_HARDENED_METAL_INGOT, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BILLON_INGOT,
            OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CORINTHIAN_BRONZE_INGOT, InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_GOLD24K
    };

    public static final SlimefunItemStack OHANA_CARD_ESSENCE_OHANA = new SlimefunItemStack("OHANA_CARD_ESSENCE_OHANA", Material.MUSIC_DISC_STAL,
            "&bUpgrade Machine Essence Ohana", "", "&fAltera para Produção de Essence Ohana", "&4Apenas Maquina Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_ESSENCE_OHANA = new ItemStack[]{
            OhanaRecursosVariados.OHANA_BLOCK_OHANA, Components.BLEND_MACHINE, OhanaRecursosVariados.OHANA_BLOCK_OHANA,
            InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, InfinityExpansionMaterials.MACHINE_CORE,
            OhanaRecursosVariados.OHANA_BLOCK_OHANA, Components.BLEND_MACHINE, OhanaRecursosVariados.OHANA_BLOCK_OHANA
    };

    public static final SlimefunItemStack OHANA_CARD_VOID_BIT = new SlimefunItemStack("OHANA_CARD_VOID_BIT", Material.MUSIC_DISC_STAL,
            "&bUpgrade Machine Void Bit", "", "&fAltera para Produção de Void Bit", "&4Apenas Maquina Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_OHANA_CARD_VOID_BIT = new ItemStack[]{
            InfinityExpansionMaterials.VOID_INGOT, InfinityExpansionMaterials.INFINITE_INGOT, InfinityExpansionMaterials.VOID_INGOT,
            InfinityExpansionMaterials.MACHINE_CORE, OhanaGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, InfinityExpansionMaterials.MACHINE_CORE,
            InfinityExpansionMaterials.VOID_INGOT, InfinityExpansionMaterials.INFINITE_INGOT, InfinityExpansionMaterials.VOID_INGOT
    };

    public static void setup(OhanaCraft plugin) {

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SOLDER_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_SOLDER_INGOT, SlimefunItems.SOLDER_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BILLON_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_BILLON_INGOT, SlimefunItems.BILLON_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRONZE_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_BRONZE_INGOT, SlimefunItems.BRONZE_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BRASS_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_BRASS_INGOT, SlimefunItems.BRASS_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SULFATE,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_SULFATE, SlimefunItems.SULFATE);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_CARBON, SlimefunItems.CARBON);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_SILICON,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_SILICON, SlimefunItems.SILICON);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_STEEL,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_STEEL, SlimefunItems.STEEL_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_NICKEL,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_NICKEL, SlimefunItems.NICKEL_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_FERROSILICON,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_FERROSILICON, SlimefunItems.FERROSILICON);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DAMASCUS,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_DAMASCUS, SlimefunItems.DAMASCUS_STEEL_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_COBALT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_COBALT, SlimefunItems.COBALT_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin,  OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_DURALUMIN_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRONZE_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ALUMINUM_BRASS_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CORINTHIAN_BRONZE_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_GOLD24K,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_GOLD24K, SlimefunItems.GOLD_24K);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_CARBON_PRESS,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_CARBON_PRESS, SlimefunItems.CARBON_PRESS);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_REDSTONE_ALLOY,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_HARDENED_METAL_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_BATTERY,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_BATTERY, SlimefunItems.BATTERY);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_MAGNET,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_MAGNET, SlimefunItems.MAGNET);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 2, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ELECTRO_MAGNET,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 3, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_REINFORCED_ALLOY_INGOT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 3, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_ESSENCE_OHANA,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_ESSENCE_OHANA, OhanaRecursosVariados.OHANA_ESSENCE_OHANA);

        OhanaGeradoresDeRecursosMaquina.preSetup(plugin, 3, OhanaGeradoresDeRecursosCardAvancado.OHANA_CARD_VOID_BIT,
                OhanaGeradoresDeRecursosCardAvancado.RECIPE_OHANA_CARD_VOID_BIT, InfinityExpansionMaterials.VOID_BIT);

    }
}
