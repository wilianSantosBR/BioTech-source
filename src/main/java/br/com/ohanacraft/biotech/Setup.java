package br.com.ohanacraft.biotech;

import br.com.ohanacraft.biotech.resource.Bee;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.IronGolem;

import javax.annotation.Nonnull;

public class Setup {

    public static void setup(@Nonnull BioTech plugin) {

        Bee.setup(plugin);

        IronGolem.setup(plugin);

        Components.setup(plugin);

    }

}
