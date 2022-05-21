package com.github.wiliansantosbr.biotech.resource;

import com.github.wiliansantosbr.biotech.machine.TechGenerator;
import com.github.wiliansantosbr.biotech.BioTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
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
    public static final SlimefunItemStack BIOTECH_CARD_STONE = new SlimefunItemStack(
        "BIOTECH_CARD_STONE", Material.MUSIC_DISC_STRAD,
        "&bCard de Stone", "", "&fChange to Production Stone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_GRANITE = new SlimefunItemStack(
        "BIOTECH_CARD_GRANITE", Material.MUSIC_DISC_STRAD,
        "&bCard de Granite", "", "&fChange to Production Granite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_DIORITE = new SlimefunItemStack(
        "BIOTECH_CARD_DIORITE", Material.MUSIC_DISC_STRAD,
        "&bCard de Diorite", "", "&fChange to Production Diorite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_ANDESITE = new SlimefunItemStack(
        "BIOTECH_CARD_ANDESITE", Material.MUSIC_DISC_STRAD,
        "&bCard de Andesite", "", "&fChange to Production Andesite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_GRAVEL = new SlimefunItemStack(
        "BIOTECH_CARD_GRAVEL", Material.MUSIC_DISC_STRAD,
        "&bCard de Gravel", "", "&fChange to Production Gravel",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_SAND = new SlimefunItemStack(
        "BIOTECH_CARD_SAND", Material.MUSIC_DISC_STRAD,
        "&bCard de Sand", "", "&fChange to Production Sand",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_ENDSTONE = new SlimefunItemStack(
        "BIOTECH_CARD_ENDSTONE", Material.MUSIC_DISC_STRAD,
        "&bCard de Endstone", "", "&fChange to Production Endstone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_CLAY = new SlimefunItemStack(
        "BIOTECH_CARD_CLAY", Material.MUSIC_DISC_STRAD,
        "&bCard de Glay", "", "&fChange to Production Glay",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_SNOW = new SlimefunItemStack(
        "BIOTECH_CARD_SNOW", Material.MUSIC_DISC_STRAD,
        "&bCard de Snow", "", "&fChange to Production Snow",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_COAL = new SlimefunItemStack(
        "BIOTECH_CARD_COAL", Material.MUSIC_DISC_13,
        "&bCard de Coal", "", "&fChange to Production Coal",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_IRON = new SlimefunItemStack(
        "BIOTECH_CARD_IRON", Material.MUSIC_DISC_13,
        "&bCard de Iron", "", "&fChange to Production Iron",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_GOLD = new SlimefunItemStack(
        "BIOTECH_CARD_GOLD", Material.MUSIC_DISC_13,
        "&bCard de Gold", "", "&fChange to Production Gold",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_QUARTZ = new SlimefunItemStack(
        "BIOTECH_CARD_QUARTZ", Material.MUSIC_DISC_13,
        "&bCard de Quartz", "", "&fChange to Production Quartz",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_QUARTZ_BLOCK = new SlimefunItemStack(
        "BIOTECH_CARD_QUARTZ_BLOCK", Material.MUSIC_DISC_13,
        "&bCard de Quartz Block", "", "&fChange to Production Quartz Block",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_LAPIS = new SlimefunItemStack(
        "BIOTECH_CARD_LAPIS", Material.MUSIC_DISC_13,
        "&bCard de Lapiz", "", "&fChange to Production Lapiz",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_REDSTONE = new SlimefunItemStack(
        "BIOTECH_CARD_REDSTONE", Material.MUSIC_DISC_13,
        "&bCard de Redstone", "", "&fChange to Production Redstone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_DIAMOND = new SlimefunItemStack(
        "BIOTECH_CARD_DIAMOND", Material.MUSIC_DISC_FAR,
        "&bCard de Diamond", "", "&fChange to Production Diamond",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_EMERALD = new SlimefunItemStack(
        "BIOTECH_CARD_EMERALD", Material.MUSIC_DISC_FAR,
        "&bCard de Emerald", "", "&fChange to Production Emerald",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_NETHERITE = new SlimefunItemStack(
        "BIOTECH_CARD_NETHERITE", Material.MUSIC_DISC_FAR,
        "&bCard de Netherite", "", "&fChange to Production Netherite",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_AMETHYST = new SlimefunItemStack(
            "BIOTECH_CARD_AMETHYST", Material.MUSIC_DISC_FAR,
            "&bCard de Ametista", "", "&fChange to Production Ametista",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_IRON_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_IRON_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Iron Dust", "", "&fChange to Production Iron Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

    public static final SlimefunItemStack BIOTECH_CARD_LEAD_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_LEAD_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Lead Dust", "", "&fChange to Production Lead Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_GOLD_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_GOLD_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Gold Dust", "", "&fChange to Production Gold Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_COPPER_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_COPPER_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Copper Dust", "", "&fChange to Production Copper Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_MAGNESIUM_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_MAGNESIUM_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Magnesium Dust", "", "&fChange to Production Magnesium Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_ALUMINUM_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_ALUMINUM_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Aluminum Dust", "", "&fChange to Production Aluminum Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_SILVER_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_SILVER_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Silver Dust", "", "&fChange to Production Silver Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_TIN_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_TIN_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Tin Dust", "", "&fChange to Production Tin Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static final SlimefunItemStack BIOTECH_CARD_ZINC_DUST = new SlimefunItemStack(
        "BIOTECH_CARD_ZINC_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard de Zinc Dust", "", "&fChange to Production Zinc Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


    public static void setup(BioTech plugin) {

        // setup cards
        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_STONE,
            Material.STONE, Material.COBBLESTONE);

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
            Material.QUARTZ, Material.QUARTZ);

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_QUARTZ_BLOCK,
            Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK);

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

        TechGenerator.preSetup(plugin, GenerateCardSimple.BIOTECH_CARD_AMETHYST,
            Material.AMETHYST_BLOCK, Material.AMETHYST_SHARD);

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
