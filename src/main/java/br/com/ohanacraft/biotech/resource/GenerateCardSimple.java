package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.machine.TechGenerator;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

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


    //TODO Willian remover todas as RECIPE_

    public static final SlimefunItemStack BIOTECH_CARD_GRANITE = new SlimefunItemStack("BIOTECH_CARD_GRANITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Granite", "", "&fAltera para Produção de Granite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));



    public static final SlimefunItemStack BIOTECH_CARD_DIORITE = new SlimefunItemStack("BIOTECH_CARD_DIORITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Diorite", "", "&fAltera para Produção de Diorite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_ANDESITE = new SlimefunItemStack("BIOTECH_CARD_ANDESITE", Material.MUSIC_DISC_STRAD,
            "&bCard de Andesite", "", "&fAltera para Produção de Andesite",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_GRAVEL = new SlimefunItemStack("BIOTECH_CARD_GRAVEL", Material.MUSIC_DISC_STRAD,
            "&bCard de Gravel", "", "&fAltera para Produção de Gravel",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_SAND = new SlimefunItemStack("BIOTECH_CARD_SAND", Material.MUSIC_DISC_STRAD,
            "&bCard de Sand", "", "&fAltera para Produção de Sand",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_ENDSTONE = new SlimefunItemStack("BIOTECH_CARD_ENDSTONE", Material.MUSIC_DISC_STRAD,
            "&bCard de Endstone", "", "&fAltera para Produção de Endstone",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_CLAY = new SlimefunItemStack("BIOTECH_CARD_CLAY", Material.MUSIC_DISC_STRAD,
            "&bCard de Glay", "", "&fAltera para Produção de Glay",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_SNOW = new SlimefunItemStack("BIOTECH_CARD_SNOW", Material.MUSIC_DISC_STRAD,
            "&bCard de Snow", "", "&fAltera para Produção de Snow",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_COAL = new SlimefunItemStack("BIOTECH_CARD_COAL", Material.MUSIC_DISC_13,
            "&bCard de Coal", "", "&fAltera para Produção de Coal",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_IRON = new SlimefunItemStack("BIOTECH_CARD_IRON", Material.MUSIC_DISC_13,
            "&bCard de Iron", "", "&fAltera para Produção de Iron",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_GOLD = new SlimefunItemStack("BIOTECH_CARD_GOLD", Material.MUSIC_DISC_13,
            "&bCard de Gold", "", "&fAltera para Produção de Gold",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_QUARTZ = new SlimefunItemStack("BIOTECH_CARD_QUARTZ", Material.MUSIC_DISC_13,
            "&bCard de Quartz", "", "&fAltera para Produção de Quartz",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_LAPIS = new SlimefunItemStack("BIOTECH_CARD_LAPIS", Material.MUSIC_DISC_13,
            "&bCard de Lapiz", "", "&fAltera para Produção de Lapiz",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_REDSTONE = new SlimefunItemStack("BIOTECH_CARD_REDSTONE", Material.MUSIC_DISC_13,
            "&bCard de Redstone", "", "&fAltera para Produção de Redstone",
            "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_DIAMOND = new SlimefunItemStack("BIOTECH_CARD_DIAMOND", Material.MUSIC_DISC_FAR,
            "&bCard de Diamond", "", "&fAltera para Produção de Diamond",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_EMERALD = new SlimefunItemStack("BIOTECH_CARD_EMERALD", Material.MUSIC_DISC_FAR,
            "&bCard de Emerald", "", "&fAltera para Produção de Emerald",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_NETHERITE = new SlimefunItemStack("BIOTECH_CARD_NETHERITE", Material.MUSIC_DISC_FAR,
            "&bCard de Netherite", "", "&fAltera para Produção de Netherite",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_IRON_DUST = new SlimefunItemStack("BIOTECH_CARD_IRON_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Iron Dust", "", "&fAltera para Produção de Iron Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));

    public static final SlimefunItemStack BIOTECH_CARD_LEAD_DUST = new SlimefunItemStack("BIOTECH_CARD_LEAD_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Lead Dust", "", "&fAltera para Produção de Lead Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_GOLD_DUST = new SlimefunItemStack("BIOTECH_CARD_GOLD_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Gold Dust", "", "&fAltera para Produção de Gold Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_COPPER_DUST = new SlimefunItemStack("BIOTECH_CARD_COPPER_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Copper Dust", "", "&fAltera para Produção de Copper Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_MAGNESIUM_DUST = new SlimefunItemStack("BIOTECH_CARD_MAGNESIUM_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Magnesium Dust", "", "&fAltera para Produção de Magnesium Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_ALUMINUM_DUST = new SlimefunItemStack("BIOTECH_CARD_ALUMINUM_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Aluminum Dust", "", "&fAltera para Produção de Aluminum Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_SILVER_DUST = new SlimefunItemStack("BIOTECH_CARD_SILVER_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Silver Dust", "", "&fAltera para Produção de Silver Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_TIN_DUST = new SlimefunItemStack("BIOTECH_CARD_TIN_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Tin Dust", "", "&fAltera para Produção de Tin Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack BIOTECH_CARD_ZINC_DUST = new SlimefunItemStack("BIOTECH_CARD_ZINC_DUST", Material.MUSIC_DISC_MELLOHI,
            "&bCard de Zinc Dust", "", "&fAltera para Produção de Zinc Dust",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));



    public static void setup(BioTech plugin) {


        // setup cards
        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_STONE,
            Material.STONE, Material.COBBLESTONE);

        //TODO Willian ajustar preSetup para no local recipe por entrada (material)

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GRANITE,
                Material.POLISHED_GRANITE, Material.GRANITE);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_DIORITE,
                Material.POLISHED_DIORITE, Material.DIORITE);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ANDESITE,
                Material.POLISHED_ANDESITE, Material.ANDESITE);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GRAVEL,
                Material.GRAVEL, Material.GRAVEL);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SAND,
                Material.SANDSTONE, Material.SAND);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ENDSTONE,
                Material.END_STONE_BRICKS, Material.END_STONE);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_CLAY,
                Material.CLAY, Material.CLAY);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SNOW,
                Material.SNOW_BLOCK, Material.SNOW_BLOCK);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_COAL,
                Material.COAL_BLOCK, Material.COAL);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_IRON,
                Material.IRON_BLOCK, Material.IRON_INGOT);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GOLD,
                Material.GOLD_BLOCK, Material.GOLD_INGOT);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_QUARTZ,
                Material.QUARTZ_BLOCK, Material.QUARTZ);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_LAPIS,
                Material.LAPIS_LAZULI, Material.LAPIS_LAZULI);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_REDSTONE,
                Material.REDSTONE_BLOCK, Material.REDSTONE);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_DIAMOND,
                Material.DIAMOND_BLOCK, Material.DIAMOND);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_EMERALD,
                Material.EMERALD_BLOCK, Material.EMERALD);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_NETHERITE,
                Material.NETHERITE_BLOCK, Material.NETHERITE_INGOT);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_IRON_DUST,
            SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_LEAD_DUST,
                SlimefunItems.LEAD_DUST, SlimefunItems.LEAD_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_GOLD_DUST,
                SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_COPPER_DUST,
                SlimefunItems.COPPER_DUST, SlimefunItems.COPPER_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_MAGNESIUM_DUST,
                SlimefunItems.MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ALUMINUM_DUST,
                SlimefunItems.ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_SILVER_DUST,
                SlimefunItems.SILVER_DUST, SlimefunItems.SILVER_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_TIN_DUST,
                SlimefunItems.TIN_DUST, SlimefunItems.TIN_DUST);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_ZINC_DUST,
                SlimefunItems.ZINC_DUST, SlimefunItems.ZINC_DUST);

    }
}
