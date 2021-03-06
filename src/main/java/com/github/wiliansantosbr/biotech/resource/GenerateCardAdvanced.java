package com.github.wiliansantosbr.biotech.resource;

import com.github.wiliansantosbr.biotech.machine.TechGenerator;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class GenerateCardAdvanced {

  /**
   * tipos card avançado
   *
   * MUSIC_DISC_BLOCKS      8 laranja
   * MUSIC_DISC_CHIRP       9 vemelho
   * MUSIC_DISC_MALL        10 roxo
   * MUSIC_DISC_STAL        11 preto
   */

  public static final SlimefunItemStack BIOTECH_CARD_SOLDER_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_SOLDER_INGOT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Solder Ingot", "", "&fChange to Production Solder Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_CARD_BILLON_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_BILLON_INGOT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Billon Ingot", "", "&fChange to Production Billon Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_CARD_BRONZE_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_BRONZE_INGOT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Bronze Ingot", "", "&fChange to Production Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_CARD_BRASS_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_BRASS_INGOT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Brass Ingot", "", "&fChange to Production Brass Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_CARD_SULFATE = new SlimefunItemStack(
      "BIOTECH_CARD_SULFATE", Material.MUSIC_DISC_BLOCKS,
      "&bCard de Sulfate", "", "&fChange to Production Sulfate",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");

  public static final SlimefunItemStack BIOTECH_CARD_CARBON = new SlimefunItemStack(
      "BIOTECH_CARD_CARBON", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Carbon", "", "&fChange to Production Carbon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_SILICON = new SlimefunItemStack(
      "BIOTECH_CARD_SILICON", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Silicon", "", "&fChange to Production Silicon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_STEEL = new SlimefunItemStack("BIOTECH_CARD_STEEL",
      Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Steel", "", "&fChange to Production Steel",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_NICKEL = new SlimefunItemStack(
      "BIOTECH_CARD_NICKEL", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Nickel", "", "&fChange to Production Nickel",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_FERROSILICON = new SlimefunItemStack(
      "BIOTECH_CARD_FERROSILICON", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Ferrosilicon", "", "&fChange to Production Ferrosilicon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_DAMASCUS = new SlimefunItemStack(
      "BIOTECH_CARD_DAMASCUS", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Damascus", "", "&fChange to Production Damascus",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_COBALT = new SlimefunItemStack(
      "BIOTECH_CARD_COBALT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Cobalt", "", "&fChange to Production Cobalt",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_DURALUMIN_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_DURALUMIN_INGOT", Material.MUSIC_DISC_BLOCKS,
      "&bUpgrade Machine Duralumin Ingot", "", "&fChange to Production Duralumin Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  // TIER 2
  public static final SlimefunItemStack BIOTECH_CARD_ALUMINUM_BRONZE_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_ALUMINUM_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Aluminum Bronze Ingot", "",
      "&fChange to Production Aluminum Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_ALUMINUM_BRASS_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_ALUMINUM_BRASS_INGOT", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Aluminum Brass Ingot", "",
      "&fAltera para Aluminum Produção de Brass Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_CORINTHIAN_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Corinthian Bronze Ingot", "",
      "&fChange to Production Corinthian Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_GOLD24K = new SlimefunItemStack(
      "BIOTECH_CARD_GOLD24K", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Gold 24k", "", "&fChange to Production Ouro 24k",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_CARBON_PRESS = new SlimefunItemStack(
      "BIOTECH_CARD_CARBON_PRESS", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Compressed Carbon", "", "&fChange to Production Compressed Carbon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_HARDENED_METAL_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_HARDENED_METAL_INGOT", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Hardened Metal Ingot", "",
      "&fChange to Production Hardened Metal Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_REDSTONE_ALLOY = new SlimefunItemStack(
      "BIOTECH_CARD_REDSTONE_ALLOY", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Redstone Alloy", "", "&fChange to Production Redstone Alloy",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_PLASTIC_SHEET = new SlimefunItemStack(
      "BIOTECH_CARD_PLASTIC_SHEET", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Plastic Sheet", "", "&fChange to Production Plastic Sheet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_BATTERY = new SlimefunItemStack(
      "BIOTECH_CARD_BATTERY", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Battery", "", "&fChange to Production Battery",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_MAGNET = new SlimefunItemStack(
      "BIOTECH_CARD_MAGNET", Material.MUSIC_DISC_CHIRP,
      "&bUpgrade Machine Magnet", "", "&fChange to Production Magnet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_ELECTRO_MAGNET = new SlimefunItemStack(
      "BIOTECH_CARD_ELECTRO_MAGNET", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Electro Magnet", "", "&fChange to Production Electro Magnet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_ELECTRIC_MOTOR = new SlimefunItemStack(
      "BIOTECH_CARD_ELECTRIC_MOTOR", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Electric Motor", "", "&fChange to Production Electric Motor",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_HEATING_COIL= new SlimefunItemStack(
      "BIOTECH_CARD_HEATING_COIL", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Heating Coil", "", "&fChange to Production Heating Coil",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_SYNTHETIC_SAPPHIRE = new SlimefunItemStack(
      "BIOTECH_CARD_SYNTHETIC_SAPPHIRE", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Synthetic Sapphire", "", "&fChange to Production Synthetic Sapphire",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_SYNTHETIC_EMERALD = new SlimefunItemStack(
      "BIOTECH_CARD_SYNTHETIC_EMERALD", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Synthetic Emerald", "", "&fChange to Production Synthetic Emerald",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_SYNTHETIC_DIAMOND = new SlimefunItemStack(
      "BIOTECH_CARD_SYNTHETIC_DIAMOND", Material.MUSIC_DISC_MALL,
      "&bUpgrade Machine Synthetic Diamond", "", "&fChange to Production Synthetic Diamond",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_CARBONADO= new SlimefunItemStack(
      "BIOTECH_CARD_CARBONADO", Material.MUSIC_DISC_STAL,
      "&bUpgrade Machine Carbonado", "", "&fChange to Production Carbonado",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static final SlimefunItemStack BIOTECH_CARD_REINFORCED_ALLOY_INGOT = new SlimefunItemStack(
      "BIOTECH_CARD_REINFORCED_ALLOY_INGOT", Material.MUSIC_DISC_STAL,
      "&bUpgrade Machine Reinforced Alloy Ingot", "",
      "&fChange to Production Reinforced Alloy Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&7BioTech Component");


  public static void setup(BioTech plugin) {

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_SOLDER_INGOT,
        SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_BILLON_INGOT,
        SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_BRONZE_INGOT,
        SlimefunItems.BRONZE_INGOT, SlimefunItems.BRONZE_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_BRASS_INGOT,
        SlimefunItems.BRASS_INGOT, SlimefunItems.BRASS_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_SULFATE,
        SlimefunItems.SULFATE, SlimefunItems.SULFATE);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_CARBON,
        SlimefunItems.CARBON, SlimefunItems.CARBON);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_SILICON,
        SlimefunItems.SILICON, SlimefunItems.SILICON);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_STEEL,
        SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_NICKEL,
        SlimefunItems.NICKEL_INGOT, SlimefunItems.NICKEL_INGOT);

    TechGenerator.preSetup(plugin, GenerateCardAdvanced.BIOTECH_CARD_DURALUMIN_INGOT,
        SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_FERROSILICON,
        SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_DAMASCUS,
        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_COBALT,
        SlimefunItems.COBALT_INGOT, SlimefunItems.COBALT_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_ALUMINUM_BRONZE_INGOT,
        SlimefunItems.ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_ALUMINUM_BRASS_INGOT,
        SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_CORINTHIAN_BRONZE_INGOT,
        SlimefunItems.CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_GOLD24K,
        SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_CARBON_PRESS,
        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_SYNTHETIC_SAPPHIRE,
        SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_SYNTHETIC_EMERALD,
        SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_BATTERY,
        SlimefunItems.BATTERY, SlimefunItems.BATTERY);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_MAGNET,
        SlimefunItems.MAGNET, SlimefunItems.MAGNET);

    TechGenerator.preSetup(plugin, 2, GenerateCardAdvanced.BIOTECH_CARD_PLASTIC_SHEET,
        SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_HARDENED_METAL_INGOT,
        SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.TITANIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_REDSTONE_ALLOY,
        SlimefunItems.REDSTONE_ALLOY, SupremeComponents.TITANIUM_PLATE, SlimefunItems.REDSTONE_ALLOY);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_ELECTRO_MAGNET,
        SlimefunItems.ELECTRO_MAGNET, SupremeComponents.IRIDIUM_PLATE, SlimefunItems.ELECTRO_MAGNET);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_ELECTRIC_MOTOR,
        SlimefunItems.ELECTRIC_MOTOR, SupremeComponents.AURUM_PLATE, SlimefunItems.ELECTRIC_MOTOR);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_HEATING_COIL,
        SlimefunItems.HEATING_COIL, SupremeComponents.AURUM_PLATE, SlimefunItems.HEATING_COIL);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_SYNTHETIC_DIAMOND,
        SlimefunItems.SYNTHETIC_DIAMOND, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.SYNTHETIC_DIAMOND);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_CARBONADO,
        SlimefunItems.CARBONADO, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.CARBONADO);

    TechGenerator.preSetup(plugin, 3, GenerateCardAdvanced.BIOTECH_CARD_REINFORCED_ALLOY_INGOT,
        SlimefunItems.REINFORCED_ALLOY_INGOT, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT);

  }
}
