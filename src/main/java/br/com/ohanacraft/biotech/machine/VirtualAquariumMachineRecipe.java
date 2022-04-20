package br.com.ohanacraft.biotech.machine;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VirtualAquariumMachineRecipe extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public VirtualAquariumMachineRecipe(ItemStack input, ItemStack[] result) {
    super(15, new ItemStack[]{input}, result);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bCod &f20%"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bSalmon &f20%"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(
        new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bTropical Fish &f20%"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bInk Sac &f20%"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bStick &f5%"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(
        new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bRotten Flesh &f5%"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bString &f5%"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&fGive &bBone &f5%"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bCod &f5%"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bSalmon &f5%"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bTropical Fish &f5%"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bInk Sac &f5%"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bStick &f20%"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bRotten Flesh &f20%"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bString &f20%"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&fGive &bBone &f20%"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bCod &f3%"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bSalmon &f3%"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(
        new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bTropical Fish &f2%"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bInk Sac &f2%"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bStick &f30%"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(
        new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bRotten Flesh &f15%"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bString &f30%"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&fGive &bBone &f15%"));
    displayRecipes.add(new ItemStack(Material.BONE));
    return displayRecipes;
  }

}
