package br.com.ohanacraft.biotech;

import br.com.ohanacraft.biotech.resource.Bee;
import br.com.ohanacraft.biotech.resource.Golem;

import javax.annotation.Nonnull;

public class Setup {

    public static void setup(@Nonnull BioTech plugin) {

        Bee.setup(plugin);

        Golem.setup(plugin);


    }

}
