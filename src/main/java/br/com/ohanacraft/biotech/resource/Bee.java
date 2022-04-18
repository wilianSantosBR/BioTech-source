package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.resource.MobTech.MobTechType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Bee {

    public static final SlimefunItemStack SIMPLE_BEE =
            new SlimefunItemStack("BIOTECH_SIMPLE_BEE",
                    "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d",
                    "Abelha Comum", "");

    public static final SlimefunItemStack INTELLIGENCE_BEE =
            new SlimefunItemStack("BIOTECH_INTELLIGENCE_BEE",
                    "1445c3def689427fd8df8cad824c0a6b553d4f847eb03705196a69c7eed946af",
                    "Abelha Inteligente", "");

    public static final SlimefunItemStack LUCK_BEE =
            new SlimefunItemStack("BIOTECH_LUCK_BEE",
                    "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d",
                    "Abelha Sortuda", "");

    public static final SlimefunItemStack BERSERK_BEE =
            new SlimefunItemStack("BIOTECH_BERSERK_BEE",
                    "d8916ea1ffb39f13dbbf4e62449dd2cbd5d2812f414e97608af0609e139d6115",
                    "Abelha Berserk", "");

    public static final SlimefunItemStack EFFICIENCY_BEE =
            new SlimefunItemStack("BIOTECH_EFFICIENCY_BEE",
                    "fb7a761d715d2c3c73a7d01411e61f4237e4f7633cc9f4db2cf05f66d2030a17",
                    "Abelha Eficiente", "");

    public static final SlimefunItemStack CLONING_BEE =
            new SlimefunItemStack("BIOTECH_CLONING_BEE",
                    "2ea2ba84c8c91dcb28af56a36dd49a1e51c3557e853f5d3777877758737b5557",
                    "Abelha Clonadora", "");

    public static final SlimefunItemStack ACCELERATION_BEE =
            new SlimefunItemStack("BIOTECH_ACCELERATION_BEE",
                    "725926d73f6f9480efad9e930e8a4a2566c115287a5b40ec0f50d58afab1a72a",
                    "Abelha Aceleradora", "");


    public static void setup(BioTech plugin) {

        MobTech.preSetup(plugin, Bee.SIMPLE_BEE, MobTechType.SIMPLE);
        MobTech.preSetup(plugin, Bee.INTELLIGENCE_BEE, MobTechType.INTELLIGENCE);
        MobTech.preSetup(plugin, Bee.LUCK_BEE, MobTechType.LUCK);
        MobTech.preSetup(plugin, Bee.BERSERK_BEE, MobTechType.BERSERK);
        MobTech.preSetup(plugin, Bee.EFFICIENCY_BEE, MobTechType.EFFICIENCY);
        MobTech.preSetup(plugin, Bee.CLONING_BEE, MobTechType.CLONING);
        MobTech.preSetup(plugin, Bee.ACCELERATION_BEE, MobTechType.ACCELERATION);

    }


}