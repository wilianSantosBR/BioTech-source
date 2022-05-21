package com.github.wiliansantosbr.biotech;

import com.github.wiliansantosbr.biotech.eletric.GeneratorMob;
import com.github.wiliansantosbr.biotech.machine.MobTechCollectorMachine;
import com.github.wiliansantosbr.biotech.machine.TechGenerator;
import com.github.wiliansantosbr.biotech.machine.TechMutation;
import com.github.wiliansantosbr.biotech.machine.TechRobotic;
import com.github.wiliansantosbr.biotech.resource.BeeTech;
import com.github.wiliansantosbr.biotech.resource.BioTechComponents;
import com.github.wiliansantosbr.biotech.resource.GenerateCardAdvanced;
import com.github.wiliansantosbr.biotech.resource.GenerateCardSimple;
import com.github.wiliansantosbr.biotech.resource.IronGolemTech;
import com.github.wiliansantosbr.biotech.tools.BedrockCollector;
import com.github.wiliansantosbr.biotech.tools.MobCollectorTech;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import javax.annotation.Nonnull;

public class Setup {

    public static void setup(@Nonnull BioTech plugin) {

        //BIOTECH
        BioTechComponents.setup(plugin);
        MobCollectorTech.setup(plugin);
        BeeTech.setup(plugin);
        IronGolemTech.setup(plugin);
        GenerateCardSimple.setup(plugin);
        GenerateCardAdvanced.setup(plugin);

        new TechGenerator(TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR)
            .setTimeProcess(1800)
            .setMachineIdentifier(TechGenerator.TECH_GENERATOR.getItemId())
            .setCapacity(5000)
            .setEnergyConsumption(2000)
            .register(plugin);

        new TechRobotic(TechRobotic.TECH_ROBOTIC, TechRobotic.RECIPE_TECH_ROBOTIC)
            .setTimeProcess(60)
            .setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId())
            .setCapacity(500)
            .setEnergyConsumption(500)
            .register(plugin);

        new TechMutation(TechMutation.TECH_MUTATION, TechMutation.RECIPE_TECH_MUTATION)
            .setTimeProcess(60)
            .setMachineIdentifier(TechMutation.TECH_MUTATION.getItemId())
            .setCapacity(500)
            .setEnergyConsumption(500)
            .register(plugin);

        GeneratorMob.setup(plugin);

        new MobTechCollectorMachine(ItemGroups.MACHINES_CATEGORY, MobTechCollectorMachine.MOB_TECH_COLLECTOR_MACHINE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            MobTechCollectorMachine.RECIPE_MOB_TECH_COLLECTOR_MACHINE)
            .setMobRange(4)
            .setCapacity(1000)
            .setProcessingSpeed(1)
            .setEnergyConsumption(200)
            .register(plugin);


//        BedrockCollector.setup(plugin);


    }

}
