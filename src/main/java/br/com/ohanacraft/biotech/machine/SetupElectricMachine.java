package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.Nonnull;
@Async
public class SetupElectricMachine {


  public static void setup(@Nonnull BioTech plugin) {

    new MobCollector(Categories.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        MobCollector.RECIPE_MOB_COLLECTOR_MACHINE)
        .setMobRange(4)
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new MobCollector(Categories.MACHINES_CATEGORY,
        MobCollector.MOB_COLLECTOR_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_II)
        .setMobRange(8)
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new MobCollector(Categories.MACHINES_CATEGORY,
        MobCollector.MOB_COLLECTOR_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_III)
        .setMobRange(16)
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

    new VirtualGarden(Categories.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE)
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new VirtualGarden(Categories.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_II)
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new VirtualGarden(Categories.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_III)
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

    new ForgeIngotMachine(Categories.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE)
        .setMachineIdentifier(ForgeIngotMachine.FORGE_INGOT_MACHINE.getItemId())
        .setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new ForgeIngotMachine(Categories.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE_II)
        .setMachineIdentifier(ForgeIngotMachine.FORGE_INGOT_MACHINE_II.getItemId())
        .setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new ForgeIngotMachine(Categories.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE_III)
        .setMachineIdentifier(ForgeIngotMachine.FORGE_INGOT_MACHINE_III.getItemId())
        .setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

    new ForgeMagicalMachine(Categories.MACHINES_CATEGORY, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE)
        .setMachineIdentifier(ForgeMagicalMachine.FORGE_MAGICAL_MACHINE.getItemId())
        .setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new ForgeMagicalMachine(Categories.MACHINES_CATEGORY,
        ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE_II)
        .setMachineIdentifier(ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_II.getItemId())
        .setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new ForgeMagicalMachine(Categories.MACHINES_CATEGORY,
        ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE_III)
        .setMachineIdentifier(ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_III.getItemId())
        .setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

    new MagicAltarMachine(Categories.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE)
        .setMachineIdentifier(MagicAltarMachine.MAGIC_ALTAR_MACHINE.getItemId())
        .setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(40)
        .setEnergyConsumption(20)
        .setProcessingSpeed(1)
        .register(plugin);

    new MagicAltarMachine(Categories.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE_II)
        .setMachineIdentifier(MagicAltarMachine.MAGIC_ALTAR_MACHINE_II.getItemId())
        .setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(200)
        .setEnergyConsumption(100)
        .setProcessingSpeed(5)
        .register(plugin);

    new MagicAltarMachine(Categories.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE_III)
        .setMachineIdentifier(MagicAltarMachine.MAGIC_ALTAR_MACHINE_III.getItemId())
        .setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(600)
        .setEnergyConsumption(300)
        .setProcessingSpeed(15)
        .register(plugin);

    new FoundryMachine(Categories.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        FoundryMachine.RECIPE_FOUNDRY_MACHINE)
        .setMachineIdentifier(FoundryMachine.FOUNDRY_MACHINE.getItemId())
        .setMachineRecipes(FoundryMachine.getAllRecipe())
        .setCapacity(2000)
        .setEnergyConsumption(1000)
        .setProcessingSpeed(1)
        .register(plugin);

    new FoundryMachine(Categories.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        FoundryMachine.RECIPE_FOUNDRY_MACHINE_II)
        .setMachineIdentifier(FoundryMachine.FOUNDRY_MACHINE_II.getItemId())
        .setMachineRecipes(FoundryMachine.getAllRecipe())
        .setCapacity(10000)
        .setEnergyConsumption(5000)
        .setProcessingSpeed(5)
        .register(plugin);

    new FoundryMachine(Categories.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        FoundryMachine.RECIPE_FOUNDRY_MACHINE_III)
        .setMachineIdentifier(FoundryMachine.FOUNDRY_MACHINE_III.getItemId())
        .setMachineRecipes(FoundryMachine.getAllRecipe())
        .setCapacity(30000)
        .setEnergyConsumption(15000)
        .setProcessingSpeed(15)
        .register(plugin);

    new ElectricCrafterMachine(Categories.MACHINES_CATEGORY,
        ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE)
        .setMachineIdentifier(ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe())
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new ElectricCrafterMachine(Categories.MACHINES_CATEGORY,
        ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE_II)
        .setMachineIdentifier(ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe())
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new ElectricCrafterMachine(Categories.MACHINES_CATEGORY,
        ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE_III)
        .setMachineIdentifier(ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe())
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

    new VirtualAquarium(Categories.MACHINES_CATEGORY,
        VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE)
        .setCapacity(1000)
        .setProcessingSpeed(1)
        .setEnergyConsumption(20)
        .register(plugin);

    new VirtualAquarium(Categories.MACHINES_CATEGORY,
        VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_II)
        .setCapacity(5000)
        .setProcessingSpeed(5)
        .setEnergyConsumption(100)
        .register(plugin);

    new VirtualAquarium(Categories.MACHINES_CATEGORY,
        VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_III)
        .setCapacity(15000)
        .setProcessingSpeed(15)
        .setEnergyConsumption(300)
        .register(plugin);

  }

}