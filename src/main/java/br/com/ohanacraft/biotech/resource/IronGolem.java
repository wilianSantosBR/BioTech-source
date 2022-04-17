package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.resource.MobTech.MobTechType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class IronGolem {

    public static final SlimefunItemStack SIMPLE_GOLEM =
            new SlimefunItemStack("BIOTECH_SIMPLE_GOLEM",
                    "e13f34227283796bc017244cb46557d64bd562fa9dab0e12af5d23ad699cf697",
                    "&eGolem &fComum", "");

    public static final SlimefunItemStack INTELLIGENCE_GOLEM =
            new SlimefunItemStack("BIOTECH_INTELLIGENCE_GOLEM",
                    "562f0e9a738265c75bdd92b9e2e02377fec9f3b027086a0dec273bbdf6798be",
                    "&eGolem &fInteligente", "");

    public static final SlimefunItemStack LUCK_GOLEM =
            new SlimefunItemStack("BIOTECH_LOCK_GOLEM",
                    "ef6e7a9c941e71bbfeb9ccdf91119ed7868bef05e661b1e14d3e34a9b17088d9",
                    "&eGolem &fSortuda", "");

    public static final SlimefunItemStack BERSERK_GOLEM =
            new SlimefunItemStack("BERSERK_GOLEM",
                    "ca14326aeac97f96189bb9969e7b955ec650d37b7c9790356ff09f32010f1ae0",
                    "&eGolem &fBerserk", "");

    public static final SlimefunItemStack EFFICIENCY_GOLEM =
            new SlimefunItemStack("EFFICIENCY_GOLEM",
                    "6d351a4ef45749565514d22f48e9695005a582b9ddbbbc444647ff0b056f4ffa",
                    "&eGolem &fEficiente", "");

    public static final SlimefunItemStack CLONING_GOLEM =
            new SlimefunItemStack("CLONING_GOLEM",
                    "ec4a74ac2d0ceff89157ad16121b6bcb2b5e5e694b460a27d3b9944f368c17ce",
                    "&eGolem &fClonadora", "");

    public static final SlimefunItemStack ACCELERATION_GOLEM =
            new SlimefunItemStack("ACCELERATION_GOLEM",
                    "1bfb3534baf81dc3f82feffbcd1c9ae33fac7dcc8291d2ee43d819d5a9b61",
                    "&eGolem &fAceleradora", "");

    public static void setup(BioTech plugin) {

        MobTech.preSetup(plugin, IronGolem.SIMPLE_GOLEM, MobTechType.SIMPLE);
        MobTech.preSetup(plugin, IronGolem.INTELLIGENCE_GOLEM, MobTechType.INTELLIGENCE);
        MobTech.preSetup(plugin, IronGolem.LUCK_GOLEM, MobTechType.LUCK);
        MobTech.preSetup(plugin, IronGolem.BERSERK_GOLEM, MobTechType.BERSERK);
        MobTech.preSetup(plugin, IronGolem.EFFICIENCY_GOLEM, MobTechType.EFFICIENCY);
        MobTech.preSetup(plugin, IronGolem.CLONING_GOLEM, MobTechType.CLONING);
        MobTech.preSetup(plugin, IronGolem.ACCELERATION_GOLEM, MobTechType.ACCELERATION);

    }

}