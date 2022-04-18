package br.com.ohanacraft.biotech.tools;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.resource.BeeTech;
import br.com.ohanacraft.biotech.resource.Components;
import br.com.ohanacraft.biotech.resource.IronGolemTech;
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
import lombok.Getter;
import lombok.Setter;
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
            LoreBuilder.powerCharged(0, 500)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_I = new ItemStack[]{
            null, Components.TRIPLE_COMPRESSED_WOOL, null,
            null, Components.TRIPLE_COMPRESSED_OAK_WOOD, null,
            null, Components.TRIPLE_COMPRESSED_OAK_WOOD, null
    };

    public static final SlimefunItemStack MOB_COLLECTOR_II = new SlimefunItemStack("BIOTECH_MOB_COLLECTOR_II",
            Material.DIAMOND_SHOVEL,
            "&6MobTech Collector II",
            "",
            "&fUsed to capture bees and Iron Golen",
            "",
            LoreBuilder.powerCharged(0, 5000)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_II = new ItemStack[]{
            Components.TRIPLE_COMPRESSED_WOOL, Components.SYNTHETIC_RUBY, Components.TRIPLE_COMPRESSED_WOOL,
            Components.TRIPLE_COMPRESSED_LEATHER, MobCollectorTech.MOB_COLLECTOR_I, Components.TRIPLE_COMPRESSED_LEATHER,
            Components.TRIPLE_COMPRESSED_WOOL, MobCollectorTech.MOB_COLLECTOR_I, Components.TRIPLE_COMPRESSED_WOOL
    };

    public static final SlimefunItemStack MOB_COLLECTOR_III = new SlimefunItemStack("BIOTECH_MOB_COLLECTOR_III",
            Material.NETHERITE_SHOVEL,
            "&6MobTech Collector III",
            "",
            "&fUsed to capture bees and Iron Golen",
            "",
            LoreBuilder.powerCharged(0, 50000)
    );
    public static final ItemStack[] RECIPE_MOB_COLLECTOR_III = new ItemStack[]{
            Components.TRIPLE_COMPRESSED_MAGMA_CREAM, MobCollectorTech.MOB_COLLECTOR_II, Components.TRIPLE_COMPRESSED_MAGMA_CREAM,
            Components.TRIPLE_COMPRESSED_SPONGE, MobCollectorTech.MOB_COLLECTOR_II, Components.TRIPLE_COMPRESSED_SPONGE,
            Components.TRIPLE_COMPRESSED_SLIME_BALL, MobCollectorTech.MOB_COLLECTOR_II, Components.TRIPLE_COMPRESSED_SLIME_BALL
    };

    public static void setup(BioTech plugin) {

        new MobCollectorTech(Categories.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_I, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_I).register(plugin);

        new MobCollectorTech(Categories.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_II, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_II).register(plugin);

        new MobCollectorTech(Categories.TOOLS_CATEGORY, MobCollectorTech.MOB_COLLECTOR_III, RecipeType.ENHANCED_CRAFTING_TABLE,
                MobCollectorTech.RECIPE_MOB_COLLECTOR_III).register(plugin);

    }

    @Getter
    @Setter
    int charge;
    @Getter
    @Setter
    int maxCharge;


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
