package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.machine.BioTechGeradoresDeRecursosMaquina;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

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

    public static final SlimefunItemStack OHANA_CARD_BILLON_INGOT = new SlimefunItemStack("OHANA_CARD_BILLON_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Billon Ingot", "", "&fAltera para Produção de Billon Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));

    public static final SlimefunItemStack OHANA_CARD_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_BRONZE_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Bronze Ingot", "", "&fAltera para Produção de Bronze Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));

    public static final SlimefunItemStack OHANA_CARD_BRASS_INGOT = new SlimefunItemStack("OHANA_CARD_BRASS_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Brass Ingot", "", "&fAltera para Produção de Brass Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));

    public static final SlimefunItemStack OHANA_CARD_SULFATE = new SlimefunItemStack("OHANA_CARD_SULFATE", Material.MUSIC_DISC_BLOCKS,
            "&bCard de Sulfate", "", "&fAltera para Produção de Sulfate",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));

    //TODO Willian remover todas as RECIPE_

    public static final SlimefunItemStack OHANA_CARD_CARBON = new SlimefunItemStack("OHANA_CARD_CARBON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Carbon", "", "&fAltera para Produção de Carbon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_SILICON = new SlimefunItemStack("OHANA_CARD_SILICON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Silicon", "", "&fAltera para Produção de Silicon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_STEEL = new SlimefunItemStack("OHANA_CARD_STEEL", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Steel", "", "&fAltera para Produção de Steel",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_NICKEL = new SlimefunItemStack("OHANA_CARD_NICKEL", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Nickel", "", "&fAltera para Produção de Nickel",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_FERROSILICON = new SlimefunItemStack("OHANA_CARD_FERROSILICON", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Ferrosilicon", "", "&fAltera para Produção de Ferrosilicon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_DAMASCUS = new SlimefunItemStack("OHANA_CARD_DAMASCUS", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Damascus", "", "&fAltera para Produção de Damascus",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_COBALT = new SlimefunItemStack("OHANA_CARD_COBALT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Cobalt", "", "&fAltera para Produção de Cobalt",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_DURALUMIN_INGOT = new SlimefunItemStack("OHANA_CARD_DURALUMIN_INGOT", Material.MUSIC_DISC_BLOCKS,
            "&bUpgrade Machine Duralumin Ingot", "", "&fAltera para Produção de Duralumin Ingot",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    // TIER 2
    public static final SlimefunItemStack OHANA_CARD_ALUMINUM_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_ALUMINUM_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Aluminum Bronze Ingot", "", "&fAltera para Produção de Aluminum Bronze Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_ALUMINUM_BRASS_INGOT = new SlimefunItemStack("OHANA_CARD_ALUMINUM_BRASS_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Aluminum Brass Ingot", "", "&fAltera para Aluminum Produção de Brass Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack("OHANA_CARD_CORINTHIAN_BRONZE_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Corinthian Bronze Ingot", "", "&fAltera para Produção de Corinthian Bronze Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_GOLD24K = new SlimefunItemStack("OHANA_CARD_GOLD24K", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Gold 24k", "", "&fAltera para Produção de Ouro 24k", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_CARBON_PRESS = new SlimefunItemStack("OHANA_CARD_CARBON_PRESS", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Compressed Carbon", "", "&fAltera para Produção de Compressed Carbon",
            "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_HARDENED_METAL_INGOT = new SlimefunItemStack("OHANA_CARD_HARDENED_METAL_INGOT", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Hardened Metal Ingot", "", "&fAltera para Produção de Hardened Metal Ingot", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_REDSTONE_ALLOY = new SlimefunItemStack("OHANA_CARD_REDSTONE_ALLOY", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Redstone Alloy", "", "&fAltera para Produção de Redstone Alloy", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_BATTERY = new SlimefunItemStack("OHANA_CARD_BATTERY", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Battery", "", "&fAltera para Produção de Battery", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_MAGNET = new SlimefunItemStack("OHANA_CARD_MAGNET", Material.MUSIC_DISC_CHIRP,
            "&bUpgrade Machine Magnet", "", "&fAltera para Produção de Magnet", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static final SlimefunItemStack OHANA_CARD_ELECTRO_MAGNET = new SlimefunItemStack("OHANA_CARD_ELECTRO_MAGNET", Material.MUSIC_DISC_MALL,
            "&bUpgrade Machine Electro Magnet", "", "&fAltera para Produção de Electro Magnet", "&4Apenas Maquina Média ou Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));



    //TIER 3
    public static final SlimefunItemStack OHANA_CARD_REINFORCED_ALLOY_INGOT = new SlimefunItemStack("OHANA_CARD_REINFORCED_ALLOY_INGOT", Material.MUSIC_DISC_STAL,
            "&bUpgrade Machine Reinforced Alloy Ingot", "", "&fAltera para Produção de Reinforced Alloy Ingot", "&4Apenas Maquina Avançada",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE));


    public static void setup(BioTech plugin) {

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_SOLDER_INGOT,
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_BILLON_INGOT,
                SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_BRONZE_INGOT,
                SlimefunItems.BRONZE_INGOT, SlimefunItems.BRONZE_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_BRASS_INGOT,
                SlimefunItems.BRASS_INGOT, SlimefunItems.BRASS_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_SULFATE,
                SlimefunItems.SULFATE, SlimefunItems.SULFATE);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_CARBON,
                SlimefunItems.CARBON, SlimefunItems.CARBON);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, GenerateCardAdvanced.OHANA_CARD_SILICON,
                SlimefunItems.SILICON, SlimefunItems.SILICON);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_STEEL,
                SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_NICKEL,
                SlimefunItems.NICKEL_INGOT, SlimefunItems.NICKEL_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_FERROSILICON,
                SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_DAMASCUS,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_COBALT,
                SlimefunItems.COBALT_INGOT, SlimefunItems.COBALT_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin,  GenerateCardAdvanced.OHANA_CARD_DURALUMIN_INGOT,
                SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_ALUMINUM_BRONZE_INGOT,
                SlimefunItems.ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_ALUMINUM_BRASS_INGOT,
                SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_CORINTHIAN_BRONZE_INGOT,
                SlimefunItems.CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_GOLD24K,
                SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_CARBON_PRESS,
                SlimefunItems.CARBON_PRESS, SlimefunItems.CARBON_PRESS);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_REDSTONE_ALLOY,
                SlimefunItems.REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_HARDENED_METAL_INGOT,
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_BATTERY,
                SlimefunItems.BATTERY, SlimefunItems.BATTERY);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_MAGNET,
                SlimefunItems.MAGNET, SlimefunItems.MAGNET);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 2, GenerateCardAdvanced.OHANA_CARD_ELECTRO_MAGNET,
                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET);

        BioTechGeradoresDeRecursosMaquina.preSetup(plugin, 3, GenerateCardAdvanced.OHANA_CARD_REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT);

    }
}
