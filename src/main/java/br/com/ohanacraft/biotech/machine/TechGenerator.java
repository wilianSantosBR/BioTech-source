package br.com.ohanacraft.biotech.machine;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.addons.supremeExpansion.util.Energy;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.MobTech;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class TechGenerator extends AMachine implements RecipeDisplayItem, Radioactive {

    public static final SlimefunItemStack TECH_GENERATOR = new SlimefunItemStack("BIOTECH_TECH_GENERATOR",
            Material.LOOM, "&aTech &bGenerator", "",
            "&fUsing power and bees/golem, slowly generates materials.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            Energy.energyPowerPerSecond(2000),
            "");
    public static final ItemStack[] RECIPE_TECH_GENERATOR = {
            Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST, Components.SYNTHETIC_AMETHYST,
            SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.LOOM), SlimefunItems.REINFORCED_ALLOY_INGOT,
            Components.TRIPLE_COMPRESSED_OAK_WOOD, SlimefunItems.ELECTRIC_MOTOR, Components.TRIPLE_COMPRESSED_OAK_WOOD
    };

    public static void setup(BioTech plugin) {
        preSetup(plugin, TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR);
    }

    private static void preSetup(BioTech plugin, SlimefunItemStack item, ItemStack[] recipe) {
        new TechGenerator(Categories.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe)
                .setEnergyCapacity(10000)
                .setEnergyConsumption(2000)
                .setProcessingSpeed(1)
                .register(plugin);
    }

    private static final int[] BORDER = new int[] {0,1,2,6,7,8,31,36,37,38,39,40,41,42,43,44};
    private static final int[] BORDER_IN = new int[] {9,10,11,12,18,21,27,28,29,30};
    private static final int[] BORDER_OUT = new int[] {14,15,16,17,23,26,32,33,34,35};

    private static final int[] BORDER_KEY = new int[] {3,5,13};
    private static final SlimefunItemStack UI_KEY = new SlimefunItemStack("_UI_KEY", Material.LIGHT_BLUE_STAINED_GLASS_PANE, " ");

    private static final int[] INPUT_SLOTS = new int[] {19,20,4};

    public final List<String> vanillaItemsAccepted = getDefaultAllowedVanillaItems();
    public final List<String> slimefunItemsAccepted = getDefaultAllowedSlimefunItems();

    public TechGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }


    @Override
    public MachineRecipe findNextRecipe(BlockMenu inv) {
        if(inv != null) {
            ItemStack key = inv.getItemInSlot(getInputSlots()[2]);
            if(key != null){
                for (MachineRecipe recipe : recipes) {
                    ItemStack input = recipe.getInput()[0];
                    if (input != null && SlimefunUtils.isItemSimilar(key, input, true) && key.getAmount() == 64) {
                        int seconds = 1800;
                        ItemStack b1 = inv.getItemInSlot(getInputSlots()[0]);
                        ItemStack b2 = inv.getItemInSlot(getInputSlots()[1]);
                        if (b1 != null) {
                            SlimefunItem mob1 = SlimefunItem.getByItem(b1);
                            if (mob1 instanceof MobTech) {
                                seconds -= (((MobTech) mob1).getMobTechTier() + 1) * b1.getAmount();
                            }
                        }
                        if (b2 != null) {
                            SlimefunItem mob2 = SlimefunItem.getByItem(b2);
                            if (mob2 instanceof MobTech) {
                                seconds -= (((MobTech) mob2).getMobTechTier() + 1) * b2.getAmount();
                            }
                        }
                        return new MachineRecipe(seconds, new ItemStack[]{input}, new ItemStack[]{input.clone()});
                    }
                }
            }
        }
        return null;
    }

    public void registerDefaultHiveRecipes() {
        for (String slimefunItem : slimefunItemsAccepted) {
            SlimefunItem sfItem = SlimefunItem.getById(slimefunItem);
            if (sfItem != null) {
                ItemStack item = sfItem.getItem().clone();
                item.setAmount(64);
                registerRecipe(new MachineRecipe(1800, new ItemStack[] { item }, new ItemStack[] { SlimefunItem.getById(slimefunItem).getItem() }));

            }
        }
        for (String material : vanillaItemsAccepted) {
            ItemStack item = new ItemStack(Material.matchMaterial(material), 64);
            registerRecipe(new MachineRecipe(1800, new ItemStack[] { item }, new ItemStack[] { new ItemStack(Material.matchMaterial(material)) }));
        }
    }

    @Override
    public void postRegister() {
        super.postRegister();
        registerDefaultHiveRecipes();
    }

    @Override
    public void constructMenu(BlockMenuPreset preset) {
        super.constructMenu(preset);
        preset.drawBackground(UI_KEY, BORDER_KEY);
    }

    @Override
    public List<int[]> getBorders() {
        List<int[]> borders = new ArrayList<>();
        borders.add(BORDER);
        borders.add(BORDER_IN);
        borders.add(BORDER_OUT);

        return borders;
    }

    @Override
    public int[] getInputSlots() {
        return INPUT_SLOTS;
    }

    @Nonnull
    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.HIGH;
    }

    @Override
    public String getMachineIdentifier() {
        return "TECH_GENERATOR";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHERITE_HOE);
    }

    @Override
    public boolean isInputConsumed() {
        return false;
    }

    private static List<String> getDefaultAllowedVanillaItems() {
        List<String> materialsAllowed = new ArrayList<>();

        materialsAllowed.add("IRON_INGOT");
        materialsAllowed.add("GOLD_INGOT");
        materialsAllowed.add("NETHERITE_INGOT");
        materialsAllowed.add("DIAMOND");
        materialsAllowed.add("EMERALD");
        materialsAllowed.add("LAPIS_LAZULI");
        materialsAllowed.add("QUARTZ");
        materialsAllowed.add("REDSTONE");
        materialsAllowed.add("COAL");

        return materialsAllowed;
    }

    private static List<String> getDefaultAllowedSlimefunItems() {
        List<String> sfItemsAllowed = new ArrayList<>();

        //Ingots
        sfItemsAllowed.add("COPPER_INGOT");
        sfItemsAllowed.add("TIN_INGOT");
        sfItemsAllowed.add("SILVER_INGOT");
        sfItemsAllowed.add("ALUMINUM_INGOT");
        sfItemsAllowed.add("LEAD_INGOT");
        sfItemsAllowed.add("ZINC_INGOT");
        sfItemsAllowed.add("MAGNESIUM_INGOT");

        //Alloys
        sfItemsAllowed.add("STEEL_INGOT");
        sfItemsAllowed.add("DURALUMIN_INGOT");
        sfItemsAllowed.add("BILLON_INGOT");
        sfItemsAllowed.add("BRASS_INGOT");
        sfItemsAllowed.add("ALUMINUM_BRASS_INGOT");
        sfItemsAllowed.add("ALUMINUM_BRONZE_INGOT");
        sfItemsAllowed.add("CORINTHIAN_BRONZE_INGOT");
        sfItemsAllowed.add("SOLDER_INGOT");
        sfItemsAllowed.add("DAMASCUS_STEEL_INGOT");
        sfItemsAllowed.add("HARDENED_METAL_INGOT");
        sfItemsAllowed.add("REINFORCED_ALLOY_INGOT");
        sfItemsAllowed.add("FERROSILICON");
        sfItemsAllowed.add("GILDED_IRON");
        sfItemsAllowed.add("NICKEL_INGOT");
        sfItemsAllowed.add("COBALT_INGOT");

        //Gems
        sfItemsAllowed.add("SYNTHETIC_DIAMOND");
        sfItemsAllowed.add("SYNTHETIC_EMERALD");
        sfItemsAllowed.add("SYNTHETIC_SAPPHIRE");
        sfItemsAllowed.add("CARBONADO");

        return sfItemsAllowed;
    }

}