package com.github.wiliansantosbr.biotech.tools;

import com.github.wiliansantosbr.biotech.ItemGroups;
import com.github.wiliansantosbr.biotech.resource.BeeTech;
import com.github.wiliansantosbr.biotech.resource.BioTechComponents;
import com.github.wiliansantosbr.biotech.resource.IronGolemTech;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MobCollectorTech extends SlimefunItem implements Rechargeable, NotPlaceable {

    public static final SlimefunItemStack MOB_COLLECTOR_I = new SlimefunItemStack("BIOTECH_MOB_COLLECTOR_I",
            Material.IRON_SHOVEL,
            "&6MobTech Collector I",
            "",
            "&fUsed to capture bees and Iron Golen",
            "",
            LoreBuilder.power(50, " per use"),
            LoreBuilder.powerCharged(0, 500)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_I = new ItemStack[]{
            null, BioTechComponents.TRIPLE_COMPRESSED_WOOL, null,
            null, BioTechComponents.TRIPLE_COMPRESSED_OAK_WOOD, null,
            null, BioTechComponents.TRIPLE_COMPRESSED_OAK_WOOD, null
    };

    public static final SlimefunItemStack MOB_COLLECTOR_II = new SlimefunItemStack("BIOTECH_MOB_COLLECTOR_II",
            Material.DIAMOND_SHOVEL,
            "&6MobTech Collector II",
            "",
            "&fUsed to capture bees and Iron Golen",
            "",
            LoreBuilder.power(50, " per use"),
            LoreBuilder.powerCharged(0, 5000)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_II = new ItemStack[]{
            BioTechComponents.TRIPLE_COMPRESSED_WOOL, SupremeComponents.SYNTHETIC_RUBY, BioTechComponents.TRIPLE_COMPRESSED_WOOL,
            BioTechComponents.TRIPLE_COMPRESSED_LEATHER, MobCollectorTech.MOB_COLLECTOR_I, BioTechComponents.TRIPLE_COMPRESSED_LEATHER,
            BioTechComponents.TRIPLE_COMPRESSED_WOOL, MobCollectorTech.MOB_COLLECTOR_I, BioTechComponents.TRIPLE_COMPRESSED_WOOL
    };

    public static final SlimefunItemStack MOB_COLLECTOR_III = new SlimefunItemStack("BIOTECH_MOB_COLLECTOR_III",
            Material.NETHERITE_SHOVEL,
            "&6MobTech Collector III",
            "",
            "&fUsed to capture bees and Iron Golen",
            "",
            LoreBuilder.power(50, " per use"),
            LoreBuilder.powerCharged(0, 50000)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_III = new ItemStack[]{
            BioTechComponents.TRIPLE_COMPRESSED_MAGMA_CREAM, MobCollectorTech.MOB_COLLECTOR_II, BioTechComponents.TRIPLE_COMPRESSED_MAGMA_CREAM,
            BioTechComponents.TRIPLE_COMPRESSED_SPONGE, MobCollectorTech.MOB_COLLECTOR_II, BioTechComponents.TRIPLE_COMPRESSED_SPONGE,
            BioTechComponents.TRIPLE_COMPRESSED_SLIME_BALL, MobCollectorTech.MOB_COLLECTOR_II, BioTechComponents.TRIPLE_COMPRESSED_SLIME_BALL
    };

    public static void setup(BioTech plugin) {

        new MobCollectorTech(ItemGroups.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_I, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_I).setCharge(50).setMaxCharge(500).register(plugin);

        new MobCollectorTech(ItemGroups.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_II, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_II).setCharge(50).setMaxCharge(5000).register(plugin);

        new MobCollectorTech(ItemGroups.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_III, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_III).setCharge(50).setMaxCharge(5000).register(plugin);

    }

    int charge;
    int maxCharge;

    public final MobCollectorTech setCharge(int value) {
        this.charge = value;
        return this;
    }

    public int getCharge() {
        return this.charge;
    }

    public final MobCollectorTech setMaxCharge(int value) {
        this.maxCharge = value;
        return this;
    }

    public int getMaxCharge() {
        return this.maxCharge;
    }


    public MobCollectorTech(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler(getItemHandler());
    }

    public EntityInteractHandler getItemHandler() {
        return (e, item, offhand) -> {
            if (getItemCharge(item) < getCharge()) {
                return;
            }
            Entity entity = e.getRightClicked();
            if (e.isCancelled() || !Slimefun.getProtectionManager().hasPermission(e.getPlayer(), entity.getLocation(), Interaction.INTERACT_ENTITY)) {
                return;
            }
            Player p = e.getPlayer();
            if (entity instanceof Bee) {
                entity.getWorld().dropItemNaturally(entity.getLocation(), BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
                entity.remove();
                removeItemCharge(item, getCharge());
                p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
            }
            if (entity instanceof Golem) {
                entity.getWorld().dropItemNaturally(entity.getLocation(), BioTech.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0));
                entity.remove();
                removeItemCharge(item, getCharge());
                p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
            }

        };

    }

    @Override
    public float getMaxItemCharge(ItemStack item) {
        return getMaxCharge();
    }

}
