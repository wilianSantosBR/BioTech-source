package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.addons.supremeexpansion.CoreAlloy;
import br.com.ohanacraft.biotech.addons.supremeexpansion.CoreBlock;
import br.com.ohanacraft.biotech.machine.BioTechGeradoresDeRecursosItem;
import br.com.ohanacraft.biotech.machine.BioTechGeradoresDeRecursosMaquina;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GenerateCardSimple {

    /**
     * tipos card simples

     MUSIC_DISC_STRAD       1 branco
     MUSIC_DISC_13          2 amarelo/branco
     MUSIC_DISC_MELLOHI     3 rosa/branco
     MUSIC_DISC_FAR         4 verdeclaro
     MUSIC_DISC_CAT         5 verde
     MUSIC_DISC_WARD        6 verde/verdeclaro
     MUSIC_DISC_WAIT        7 azul

     */
    // cards basicos
    public static final SlimefunItemStack BIOTECH_CARD_STONE = new SlimefunItemStack("BIOTECH_CARD_STONE", Material.MUSIC_DISC_STRAD,
            "&bCard de Stone", "", "&fAltera para Produção de Stone",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_STONE = new ItemStack[]{
            new ItemStack(Material.STONE), new ItemStack(Material.STONE), new ItemStack(Material.STONE),
            new ItemStack(Material.STONE), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.STONE),
            new ItemStack(Material.STONE), new ItemStack(Material.STONE), new ItemStack(Material.STONE)
    };

    public static final SlimefunItemStack BIOTECH_CARD_GRANITE = new SlimefunItemStack("BIOTECH_CARD_GRANITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Granite", "", "&fAltera para Produção de Granite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_GRANITE = new ItemStack[]{
            new ItemStack(Material.GRANITE), new ItemStack(Material.GRANITE), new ItemStack(Material.GRANITE),
            new ItemStack(Material.GRANITE), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.GRANITE),
            new ItemStack(Material.GRANITE), new ItemStack(Material.GRANITE), new ItemStack(Material.GRANITE)
    };


    public static final SlimefunItemStack BIOTECH_CARD_DIORITE = new SlimefunItemStack("BIOTECH_CARD_DIORITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Diorite", "", "&fAltera para Produção de Diorite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_DIORITE = new ItemStack[]{
            new ItemStack(Material.DIORITE), new ItemStack(Material.DIORITE), new ItemStack(Material.DIORITE),
            new ItemStack(Material.DIORITE), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.DIORITE),
            new ItemStack(Material.DIORITE), new ItemStack(Material.DIORITE), new ItemStack(Material.DIORITE)
    };

    public static final SlimefunItemStack BIOTECH_CARD_ANDESITE = new SlimefunItemStack("BIOTECH_CARD_ANDESITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Andesite", "", "&fAltera para Produção de Andesite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_MUDAR_ANDESITE_MACHINE = new ItemStack[]{
            new ItemStack(Material.ANDESITE), new ItemStack(Material.ANDESITE), new ItemStack(Material.ANDESITE),
            new ItemStack(Material.ANDESITE), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.ANDESITE),
            new ItemStack(Material.ANDESITE), new ItemStack(Material.ANDESITE), new ItemStack(Material.ANDESITE)
    };

    public static final SlimefunItemStack BIOTECH_CARD_GRAVEL = new SlimefunItemStack("BIOTECH_CARD_GRAVEL", Material.MUSIC_DISC_STRAD,
            "&bCard de Gravel", "", "&fAltera para Produção de Gravel",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_GRAVEL = new ItemStack[]{
            new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL),
            new ItemStack(Material.GRAVEL), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.GRAVEL),
            new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL)
    };

    public static final SlimefunItemStack BIOTECH_CARD_SAND = new SlimefunItemStack("BIOTECH_CARD_SAND", Material.MUSIC_DISC_STRAD,
            "&bCard de Sand", "", "&fAltera para Produção de Sand",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_SAND = new ItemStack[]{
            new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.SAND),
            new ItemStack(Material.SAND), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.SAND),
            new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.SAND)
    };

    public static final SlimefunItemStack BIOTECH_CARD_ENDSTONE = new SlimefunItemStack("BIOTECH_CARD_ENDSTONE", Material.MUSIC_DISC_STRAD,
            "&bCard de Endstone", "", "&fAltera para Produção de Endstone",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_ENDSTONE = new ItemStack[]{
            new ItemStack(Material.END_STONE), new ItemStack(Material.END_STONE), new ItemStack(Material.END_STONE),
            new ItemStack(Material.END_STONE), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.END_STONE),
            new ItemStack(Material.END_STONE), new ItemStack(Material.END_STONE), new ItemStack(Material.END_STONE)
    };

    public static final SlimefunItemStack BIOTECH_CARD_CLAY = new SlimefunItemStack("BIOTECH_CARD_CLAY", Material.MUSIC_DISC_STRAD,
            "&bCard de Glay", "", "&fAltera para Produção de Glay",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_CLAY = new ItemStack[]{
            new ItemStack(Material.CLAY), new ItemStack(Material.CLAY), new ItemStack(Material.CLAY),
            new ItemStack(Material.CLAY), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.CLAY),
            new ItemStack(Material.CLAY), new ItemStack(Material.CLAY), new ItemStack(Material.CLAY)
    };

    public static final SlimefunItemStack BIOTECH_CARD_SNOW = new SlimefunItemStack("BIOTECH_CARD_SNOW", Material.MUSIC_DISC_STRAD,
            "&bCard de Snow", "", "&fAltera para Produção de Snow",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_SNOW = new ItemStack[]{
            new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.SNOW_BLOCK),
            new ItemStack(Material.SNOW_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.SNOW_BLOCK),
            new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.SNOW_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_COAL = new SlimefunItemStack("BIOTECH_CARD_COAL", Material.MUSIC_DISC_13,
            "&bCard de Coal", "", "&fAltera para Produção de Coal",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_COAL = new ItemStack[]{
            new ItemStack(Material.COAL_BLOCK), new ItemStack(Material.COAL_BLOCK), new ItemStack(Material.COAL_BLOCK),
            new ItemStack(Material.COAL_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.COAL_BLOCK),
            new ItemStack(Material.COAL_BLOCK), new ItemStack(Material.COAL_BLOCK), new ItemStack(Material.COAL_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_IRON = new SlimefunItemStack("BIOTECH_CARD_IRON", Material.MUSIC_DISC_13,
            "&bCard de Iron", "", "&fAltera para Produção de Iron",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_IRON = new ItemStack[]{
            new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.IRON_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_GOLD = new SlimefunItemStack("BIOTECH_CARD_GOLD", Material.MUSIC_DISC_13,
            "&bCard de Gold", "", "&fAltera para Produção de Gold",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_GOLD = new ItemStack[]{
            new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.GOLD_BLOCK),
            new ItemStack(Material.GOLD_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.GOLD_BLOCK),
            new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.GOLD_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_QUARTZ = new SlimefunItemStack("BIOTECH_CARD_QUARTZ", Material.MUSIC_DISC_13,
            "&bCard de Quartz", "", "&fAltera para Produção de Quartz",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_QUARTZ = new ItemStack[]{
            new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK),
            new ItemStack(Material.QUARTZ_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.QUARTZ_BLOCK),
            new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.QUARTZ_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_LAPIS = new SlimefunItemStack("BIOTECH_CARD_LAPIS", Material.MUSIC_DISC_13,
            "&bCard de Lapiz", "", "&fAltera para Produção de Lapiz",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_LAPIS = new ItemStack[]{
            new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.LAPIS_BLOCK),
            new ItemStack(Material.LAPIS_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.LAPIS_BLOCK),
            new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.LAPIS_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_REDSTONE = new SlimefunItemStack("BIOTECH_CARD_REDSTONE", Material.MUSIC_DISC_13,
            "&bCard de Redstone", "", "&fAltera para Produção de Redstone",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_REDSTONE = new ItemStack[]{
            new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK),
            new ItemStack(Material.REDSTONE_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, new ItemStack(Material.REDSTONE_BLOCK),
            new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_DIAMOND = new SlimefunItemStack("BIOTECH_CARD_DIAMOND", Material.MUSIC_DISC_FAR,
            "&bCard de Diamond", "", "&fAltera para Produção de Diamond",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_DIAMOND = new ItemStack[]{
            new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND_BLOCK),
            new ItemStack(Material.DIAMOND_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, new ItemStack(Material.DIAMOND_BLOCK),
            new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_EMERALD = new SlimefunItemStack("BIOTECH_CARD_EMERALD", Material.MUSIC_DISC_FAR,
            "&bCard de Emerald", "", "&fAltera para Produção de Emerald",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_EMERALD = new ItemStack[]{
            new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK),
            new ItemStack(Material.EMERALD_BLOCK), BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_AVANCADO, new ItemStack(Material.EMERALD_BLOCK),
            new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_NETHERITE = new SlimefunItemStack("BIOTECH_CARD_NETHERITE", Material.MUSIC_DISC_FAR,
            "&bCard de Netherite", "", "&fAltera para Produção de Netherite",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_NETHERITE = new ItemStack[]{
            new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.NETHERITE_BLOCK),
            new ItemStack(Material.NETHERITE_BLOCK), GenerateCardSimple.BIOTECH_CARD_DIAMOND, new ItemStack(Material.NETHERITE_BLOCK),
            new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.NETHERITE_BLOCK)
    };

    public static final SlimefunItemStack BIOTECH_CARD_IRON_DUST = new SlimefunItemStack("BIOTECH_CARD_IRON_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Iron Dust", "", "&fAltera para Produção de Iron Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_IRON_DUST = new ItemStack[]{
            SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST,
            SlimefunItems.IRON_DUST, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, SlimefunItems.IRON_DUST,
            SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST
    };

    public static final SlimefunItemStack BIOTECH_CARD_LEAD_DUST = new SlimefunItemStack("BIOTECH_CARD_LEAD_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Lead Dust", "", "&fAltera para Produção de Lead Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_LEAD_DUST = new ItemStack[]{
            Components.ALLOY_PLATINUM, InfinityExpansionMaterials.LEAD_SINGULARITY, Components.ALLOY_PLATINUM,
            InfinityExpansionMaterials.LEAD_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.LEAD_SINGULARITY,
            Components.ALLOY_PLATINUM, InfinityExpansionMaterials.LEAD_SINGULARITY, Components.ALLOY_PLATINUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_GOLD_DUST = new SlimefunItemStack("BIOTECH_CARD_GOLD_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Gold Dust", "", "&fAltera para Produção de Gold Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_GOLD_DUST = new ItemStack[]{
            Components.ALLOY_AURUM, InfinityExpansionMaterials.GOLD_SINGULARITY, Components.ALLOY_AURUM,
            InfinityExpansionMaterials.GOLD_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.GOLD_SINGULARITY,
            Components.ALLOY_AURUM, InfinityExpansionMaterials.GOLD_SINGULARITY, Components.ALLOY_AURUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_COPPER_DUST = new SlimefunItemStack("BIOTECH_CARD_COPPER_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Copper Dust", "", "&fAltera para Produção de Copper Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_COPPER_DUST = new ItemStack[]{
            Components.ALLOY_AURUM, InfinityExpansionMaterials.COPPER_SINGULARITY, Components.ALLOY_AURUM,
            InfinityExpansionMaterials.COPPER_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.COPPER_SINGULARITY,
            Components.ALLOY_AURUM, InfinityExpansionMaterials.COPPER_SINGULARITY, Components.ALLOY_AURUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_MAGNESIUM_DUST = new SlimefunItemStack("BIOTECH_CARD_MAGNESIUM_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Magnesium Dust", "", "&fAltera para Produção de Magnesium Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_MAGNESIUM_DUST = new ItemStack[]{
            Components.ALLOY_MANGANESE, InfinityExpansionMaterials.MAGNESIUM_SINGULARITY, Components.ALLOY_MANGANESE,
            InfinityExpansionMaterials.MAGNESIUM_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.MAGNESIUM_SINGULARITY,
            Components.ALLOY_MANGANESE, InfinityExpansionMaterials.MAGNESIUM_SINGULARITY, Components.ALLOY_MANGANESE
    };

    public static final SlimefunItemStack BIOTECH_CARD_ALUMINUM_DUST = new SlimefunItemStack("BIOTECH_CARD_ALUMINUM_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Aluminum Dust", "", "&fAltera para Produção de Aluminum Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_ALUMINUM_DUST = new ItemStack[]{
            Components.ALLOY_ADAMANTIUM, InfinityExpansionMaterials.ALUMINUM_SINGULARITY, Components.ALLOY_ADAMANTIUM,
            InfinityExpansionMaterials.ALUMINUM_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.ALUMINUM_SINGULARITY,
            Components.ALLOY_ADAMANTIUM, InfinityExpansionMaterials.ALUMINUM_SINGULARITY, Components.ALLOY_ADAMANTIUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_SILVER_DUST = new SlimefunItemStack("BIOTECH_CARD_SILVER_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Silver Dust", "", "&fAltera para Produção de Silver Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_SILVER_DUST = new ItemStack[]{
            Components.ALLOY_IRIDIUM, InfinityExpansionMaterials.SILVER_SINGULARITY, Components.ALLOY_IRIDIUM,
            InfinityExpansionMaterials.SILVER_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.SILVER_SINGULARITY,
            Components.ALLOY_IRIDIUM, InfinityExpansionMaterials.SILVER_SINGULARITY, Components.ALLOY_IRIDIUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_TIN_DUST = new SlimefunItemStack("BIOTECH_CARD_TIN_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Tin Dust", "", "&fAltera para Produção de Tin Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_TIN_DUST = new ItemStack[]{
            Components.ALLOY_TITANIUM, InfinityExpansionMaterials.TIN_SINGULARITY, Components.ALLOY_TITANIUM,
            InfinityExpansionMaterials.TIN_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.TIN_SINGULARITY,
            Components.ALLOY_TITANIUM, InfinityExpansionMaterials.TIN_SINGULARITY, Components.ALLOY_TITANIUM
    };

    public static final SlimefunItemStack BIOTECH_CARD_ZINC_DUST = new SlimefunItemStack("BIOTECH_CARD_ZINC_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Zinc Dust", "", "&fAltera para Produção de Zinc Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));
    public static final ItemStack[] RECIPE_BIOTECH_CARD_ZINC_DUST = new ItemStack[]{
            Components.ALLOY_ZIRCONIUM, InfinityExpansionMaterials.ZINC_SINGULARITY, Components.ALLOY_ZIRCONIUM,
            InfinityExpansionMaterials.ZINC_SINGULARITY, BioTechGeradoresDeRecursosItem.OHANA_CENTRO_CARD_SIMPLES, InfinityExpansionMaterials.ZINC_SINGULARITY,
            Components.ALLOY_ZIRCONIUM, InfinityExpansionMaterials.ZINC_SINGULARITY, Components.ALLOY_ZIRCONIUM
    };


    public static void setup(BioTech plugin) {

        // setup cards
        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_STONE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_STONE, Material.COBBLESTONE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GRANITE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_GRANITE, Material.GRANITE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_DIORITE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_DIORITE, Material.DIORITE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ANDESITE,
                GenerateCardSimple.RECIPE_MUDAR_ANDESITE_MACHINE, Material.ANDESITE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GRAVEL,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_GRAVEL, Material.GRAVEL);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SAND,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_SAND, Material.SAND);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ENDSTONE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_ENDSTONE, Material.END_STONE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_CLAY,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_CLAY, Material.CLAY);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SNOW,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_SNOW, Material.SNOW_BLOCK);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_COAL,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_COAL, Material.COAL);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_IRON,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_IRON, Material.IRON_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GOLD,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_GOLD, Material.GOLD_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_QUARTZ,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_QUARTZ, Material.QUARTZ_BLOCK);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_LAPIS,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_LAPIS, Material.LAPIS_LAZULI);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_REDSTONE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_REDSTONE, Material.REDSTONE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_DIAMOND,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_DIAMOND, Material.DIAMOND);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_EMERALD,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_EMERALD, Material.EMERALD);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_NETHERITE,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_NETHERITE, Material.NETHERITE_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_IRON_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_IRON_DUST, SlimefunItems.IRON_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_LEAD_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_LEAD_DUST, SlimefunItems.LEAD_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GOLD_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_GOLD_DUST, SlimefunItems.GOLD_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_COPPER_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_COPPER_DUST, SlimefunItems.COPPER_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_MAGNESIUM_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ALUMINUM_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SILVER_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_SILVER_DUST, SlimefunItems.SILVER_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_TIN_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_TIN_DUST, SlimefunItems.TIN_DUST);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ZINC_DUST,
                GenerateCardSimple.RECIPE_BIOTECH_CARD_ZINC_DUST, SlimefunItems.ZINC_DUST);

    }
}
