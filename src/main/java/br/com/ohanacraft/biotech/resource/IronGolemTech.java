package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.dto.MobTechDTO;
import br.com.ohanacraft.biotech.dto.MobTechDTO.MobTechType;

public class IronGolemTech {

    public static final MobTechDTO SIMPLE_GOLEM =
            new MobTechDTO("BIOTECH_SIMPLE_GOLEM",
                    "Golem Comum",
                    "e13f34227283796bc017244cb46557d64bd562fa9dab0e12af5d23ad699cf697",
                    MobTechType.SIMPLE);

    public static final MobTechDTO MUTATION_BERSERK_GOLEM =
            new MobTechDTO("BERSERK_GOLEM",
                    "Golem Mutante Berserk",
                    "ca14326aeac97f96189bb9969e7b955ec650d37b7c9790356ff09f32010f1ae0",
                    MobTechType.BERSERK);

    public static final MobTechDTO ROBOTIC_ACCELERATION_GOLEM =
            new MobTechDTO("ACCELERATION_GOLEM",
                    "Golem Robótico Acelerador",
                    "1bfb3534baf81dc3f82feffbcd1c9ae33fac7dcc8291d2ee43d819d5a9b61",
                    MobTechType.ACCELERATION);

    public static final MobTechDTO MUTATION_INTELLIGENCE_GOLEM =
            new MobTechDTO("BIOTECH_INTELLIGENCE_GOLEM",
                    "Golem Mutante Inteligente",
                    "562f0e9a738265c75bdd92b9e2e02377fec9f3b027086a0dec273bbdf6798be",
                    MobTechType.INTELLIGENCE);

    public static final MobTechDTO ROBOTIC_EFFICIENCY_GOLEM =
            new MobTechDTO("EFFICIENCY_GOLEM",
                    "Golem Robótico Eficiente",
                    "6d351a4ef45749565514d22f48e9695005a582b9ddbbbc444647ff0b056f4ffa",
                    MobTechType.EFFICIENCY);

    public static final MobTechDTO MUTATION_LUCK_GOLEM =
            new MobTechDTO("BIOTECH_LOCK_GOLEM",
                    "Golem Mutante Sortudo",
                    "ef6e7a9c941e71bbfeb9ccdf91119ed7868bef05e661b1e14d3e34a9b17088d9",
                    MobTechType.LUCK);

    public static final MobTechDTO ROBOTIC_CLONING_GOLEM =
            new MobTechDTO("CLONING_GOLEM",
                    "Golem Robótico Clonador",
                    "ec4a74ac2d0ceff89157ad16121b6bcb2b5e5e694b460a27d3b9944f368c17ce",
                    MobTechType.CLONING);

    public static void setup(BioTech plugin) {

        MobTech.preSetup(plugin, IronGolemTech.SIMPLE_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.MUTATION_INTELLIGENCE_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.MUTATION_LUCK_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.MUTATION_BERSERK_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_EFFICIENCY_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_CLONING_GOLEM);
        MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_ACCELERATION_GOLEM);

    }

}