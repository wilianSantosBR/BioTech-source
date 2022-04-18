package br.com.ohanacraft.biotech.resource;

import br.com.ohanacraft.biotech.BioTech;
import br.com.ohanacraft.biotech.Categories;
import br.com.ohanacraft.biotech.dto.MobTechDTO;
import br.com.ohanacraft.biotech.dto.MobTechDTO.MobTechType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class MobTech extends SlimefunItem implements Radioactive, NotPlaceable {

    public MobTech(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public static void preSetup(BioTech plugin, MobTechDTO item) {
        if (MobTechType.SIMPLE == item.getMobTechType()) {
            new MobTech(Categories.TECHMOB_CATEGORY, BioTech.buildItemFromMobTechDTO(item, 0),
                    RecipeType.NULL, new ItemStack[]{})
                    .setMobTechType(item.getMobTechType())
                    .setMobTechTier(0)
                    .register(plugin);
        } else {
            for (int i = 1; i <= 8; i++) {
                new MobTech(Categories.TECHMOB_CATEGORY, BioTech.buildItemFromMobTechDTO(item, i),
                        RecipeType.NULL, new ItemStack[]{})
                        .setMobTechType(item.getMobTechType())
                        .setMobTechTier(i)
                        .register(plugin);
            }
        }
    }

    private Integer mobTechTier;
    private MobTechType mobTechType;

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
