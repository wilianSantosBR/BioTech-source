package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;

public class MobTech extends SlimefunItem implements Radioactive, NotPlaceable {

    public MobTech(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public static void preSetup(BioTech plugin, SlimefunItemStack item, MobTechType type) {

        buildLoreItemMobTech(item, type);

        if (MobTechType.SIMPLE == type) {
            buildNameMobTech(item, 0);
            new MobTech(Categories.RESOURCE_CATEGORY, item, RecipeType.NULL, new ItemStack[]{})
                    .setMobTechType(type)
                    .setMobTechTier(0)
                    .register(plugin);

        } else {

            for (int i = 1; i <= 8; i++) {
                buildNameMobTech(item, i);
                new MobTech(Categories.RESOURCE_CATEGORY, item, RecipeType.NULL, new ItemStack[]{})
                        .setMobTechType(type)
                        .setMobTechTier(i)
                        .register(plugin);
            }

        }
    }

    private static void buildLoreItemMobTech(SlimefunItemStack item, MobTechType type) {

        // check ItemMeta null pointer
        if (item.getItemMeta() != null) {

            // check Lore null pointer
            if (item.getItemMeta().getLore() == null) {
                item.getItemMeta().setLore(new ArrayList<>());
                item.getItemMeta().getLore().add("");
            }

            // build Radioactivity
            if (MobTechType.BERSERK == type
                    || MobTechType.LUCK == type
                    || MobTechType.INTELLIGENCE == type) {
                item.getItemMeta().getLore().add(Radioactivity.VERY_DEADLY.getLore());
            } else if (MobTechType.CLONING == type
                    || MobTechType.ACCELERATION == type
                    || MobTechType.EFFICIENCY == type) {
                item.getItemMeta().getLore().add(Radioactivity.HIGH.getLore());
            } else {
                item.getItemMeta().getLore().add(Radioactivity.LOW.getLore());
            }
            item.getItemMeta().getLore().add("");
        }
    }

    private static void buildNameMobTech(SlimefunItemStack item, Integer tier) {
        // check ItemMeta null pointer
        if (item.getItemMeta() != null) {
            item.getItemMeta().setDisplayName(BioTech.buildNameTier(item.getItemMeta().getDisplayName(), tier));
            item.getItemMeta().setLocalizedName(BioTech.buildIdTier(item.getItemMeta().getLocalizedName(), tier));
        }
    }

    private String name;
    private MobTechType mobTechType;
    private Integer mobTechTier;

    public enum MobTechType {
        SIMPLE,
        INTELLIGENCE,
        LUCK,
        BERSERK,
        EFFICIENCY,
        CLONING,
        ACCELERATION,
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public final MobTech setName(String value) {
        this.name = value;
        return this;
    }

    public MobTechType getMobTechType() {
        return mobTechType;
    }

    @Nonnull
    public final MobTech setMobTechType(MobTechType value) {
        this.mobTechType = value;
        return this;
    }

    public Integer getMobTechTier() {
        return mobTechTier;
    }

    @Nonnull
    public final MobTech setMobTechTier(int value) {
        this.mobTechTier = value;
        return this;
    }

    @Nonnull
    @Override
    public Radioactivity getRadioactivity() {
        Radioactivity radioactivity;
        switch (this.mobTechType) {
            case INTELLIGENCE:
            case BERSERK:
            case LUCK:
                radioactivity = Radioactivity.VERY_DEADLY;
                break;
            case CLONING:
            case ACCELERATION:
            case EFFICIENCY:
                radioactivity = Radioactivity.HIGH;
                break;
            case SIMPLE:
            default:
                radioactivity = Radioactivity.LOW;
        }
        return radioactivity;
    }

}
