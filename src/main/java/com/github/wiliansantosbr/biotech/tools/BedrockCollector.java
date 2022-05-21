package com.github.wiliansantosbr.biotech.tools;

import com.github.wiliansantosbr.biotech.ItemGroups;
import com.github.wiliansantosbr.biotech.BioTech;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSpawnReason;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.Optional;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BedrockCollector extends SimpleSlimefunItem<ItemUseHandler> implements Rechargeable, NotPlaceable {

    public static final SlimefunItemStack BIOTECH_BEDROCK_COLLECTOR = new SlimefunItemStack("BIOTECH_BEDROCK_COLLECTOR",
            Material.NETHERITE_PICKAXE,
            "&6Bedrock Collector",
            "",
            "&fUsed drop Bedrock",
            "",
            LoreBuilder.power(1000000, " per use"),
            LoreBuilder.powerCharged(0, 1000000)
    );
    public static final ItemStack[] RECIPE_BIOTECH_BEDROCK_COLLECTOR = new ItemStack[]{
        SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.SYNTHETIC_RUBY,
            null, SupremeComponents.CRYSTALLIZER_MACHINE, null,
            null, SupremeComponents.CRYSTALLIZER_MACHINE, null
    };



    public static void setup(BioTech plugin) {

        new BedrockCollector(ItemGroups.TOOLS_CATEGORY, BedrockCollector.BIOTECH_BEDROCK_COLLECTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                BedrockCollector.RECIPE_BIOTECH_BEDROCK_COLLECTOR).setCharge(1000000).setMaxCharge(1000000).register(plugin);


    }

    int charge;
    int maxCharge;

    public final BedrockCollector setCharge(int value) {
        this.charge = value;
        return this;
    }

    public int getCharge() {
        return this.charge;
    }

    public final BedrockCollector setMaxCharge(int value) {
        this.maxCharge = value;
        return this;
    }

    public int getMaxCharge() {
        return this.maxCharge;
    }


    public BedrockCollector(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        this.addItemHandler(this.getItemHandler());
    }


    @Override
    public @Nonnull ItemUseHandler getItemHandler() {
        return e -> {

            BioTech.inst().log(Level.INFO, "inicio validação");
            Optional<Block> block = e.getClickedBlock();

            if (block.isPresent()) {
                Block b = block.get();
                final Player p = e.getPlayer();
                ItemStack item = p.getItemOnCursor();
                if (getItemCharge(item) < getCharge()) {
                    BioTech.inst().log(Level.INFO, "sem carga");
                    return;
                }

                // Check the clicked block type and for protections
                if (Slimefun.getPermissionsService().hasPermission(p, BedrockCollector.this)) {
                    BioTech.inst().log(Level.INFO, "sem permissão");
                    return;
                }

                if (b.getType() == Material.BEDROCK) {

                    b.setType(Material.AIR);
                    removeItemCharge(item, getCharge());
                    p.playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1, 1);
                    SlimefunUtils.spawnItem(b.getLocation(), new ItemStack(Material.BEDROCK), ItemSpawnReason.MISC, true);
                    BioTech.inst().log(Level.INFO, "sucesso!");

                } else {
                    BioTech.inst().log(Level.INFO, "não é BEDROCK");
                }
            }


            BioTech.inst().log(Level.INFO, "terminou validação");
            e.cancel();
        };
    }

    @Override
    public float getMaxItemCharge(ItemStack item) {
        return getMaxCharge();
    }

}