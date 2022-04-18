package br.com.ohanacraft.biotech;

import br.com.ohanacraft.biotech.machine.TechEvolution;
import br.com.ohanacraft.biotech.machine.TechGenerator;
import br.com.ohanacraft.biotech.machine.TechMutation;
import br.com.ohanacraft.biotech.resource.BeeTech;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.IronGolemTech;
import br.com.ohanacraft.biotech.tools.MobCollectorTech;

import javax.annotation.Nonnull;

public class Setup {

    public static void setup(@Nonnull BioTech plugin) {

        Components.setup(plugin);

        MobCollectorTech.setup(plugin);

        BeeTech.setup(plugin);

        IronGolemTech.setup(plugin);

        TechGenerator.setup(plugin);

        TechEvolution.setup(plugin);

        TechMutation.setup(plugin);

    }

}
