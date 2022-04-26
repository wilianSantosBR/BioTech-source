package br.com.ohanacraft.biotech;

import br.com.ohanacraft.biotech.eletric.GeneratorMob;
import br.com.ohanacraft.biotech.machine.SetupElectricMachine;
import br.com.ohanacraft.biotech.machine.TechGenerator;
import br.com.ohanacraft.biotech.machine.TechMutation;
import br.com.ohanacraft.biotech.machine.TechRobotic;
import br.com.ohanacraft.biotech.resource.*;
import br.com.ohanacraft.biotech.tools.MobCollectorTech;

import javax.annotation.Nonnull;

public class Setup {

  public static void setup(@Nonnull BioTech plugin) {

    Components.setup(plugin);

    MobCollectorTech.setup(plugin);

    BeeTech.setup(plugin);

    IronGolemTech.setup(plugin);

    GenerateCardSimple.setup(plugin);

    GenerateCardAdvanced.setup(plugin);

    SetupElectricMachine.setup(plugin);

    TechGenerator.setup(plugin);

    TechRobotic.setup(plugin);

    TechMutation.setup(plugin);

    GeneratorMob.setup(plugin);

  }

}
