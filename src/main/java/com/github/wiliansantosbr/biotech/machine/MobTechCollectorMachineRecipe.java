package com.github.wiliansantosbr.biotech.machine;

import com.github.wiliansantosbr.biotech.resource.BeeTech;
import com.github.wiliansantosbr.biotech.BioTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.apache.commons.lang.Validate;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobTechCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobTechCollectorMachineRecipe(SlimefunItemStack input, SlimefunItemStack result, Predicate<LivingEntity> predicate) {
    super(15, new SlimefunItemStack[]{input}, new SlimefunItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(
        new CustomItemStack(MobTechCollectorMachine.TOOL_RUN_MACHINE.getType(), MobTechCollectorMachine.TOOL_RUN_MACHINE.getDisplayName(), "", "&fRequires &bBee &fnearby",""));
    displayRecipes.add(BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
    displayRecipes.add(
        new CustomItemStack(MobTechCollectorMachine.TOOL_RUN_MACHINE.getType(), MobTechCollectorMachine.TOOL_RUN_MACHINE.getDisplayName(), "", "&fRequires &bIronGolen &fnearby",""));
    displayRecipes.add(BioTech.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
    return displayRecipes;
  }

}
