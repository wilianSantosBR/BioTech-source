package br.com.ohanacraft.biotech.machine;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobCollectorMachineRecipe(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(15, new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(
        new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(Material.HONEY_BOTTLE));
    displayRecipes.add(
        new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bSquid &fnearby"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(
        new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(new ItemStack(Material.EXPERIENCE_BOTTLE));
    displayRecipes.add(
        new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bEnderDragon &fnearby"));
    displayRecipes.add(new ItemStack(Material.DRAGON_BREATH));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(Material.HONEYCOMB));
    displayRecipes.add(
        new CustomItemStack(Material.SHEARS, null, "&fRequires &bSheep &fnearby (with color)"));
    displayRecipes.add(new ItemStack(Material.WHITE_WOOL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(Material.LEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(Material.FEATHER));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bZombie &fnearby"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSkeleton &fnearby"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bCreeper &fnearby"));
    displayRecipes.add(new ItemStack(Material.GUNPOWDER));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSlime &fnearby"));
    displayRecipes.add(new ItemStack(Material.SLIME_BALL));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSpider &fnearby"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bWither Skeleton &fnearby"));
    displayRecipes.add(new ItemStack(Material.WITHER_SKELETON_SKULL));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bEnderman &fnearby"));
    displayRecipes.add(new ItemStack(Material.ENDER_PEARL));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bBlaze &fnearby"));
    displayRecipes.add(new ItemStack(Material.BLAZE_ROD));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bMagmaCube &fnearby"));
    displayRecipes.add(new ItemStack(Material.MAGMA_CREAM));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(new ItemStack(Material.NETHER_STAR));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bGhast &fnearby"));
    displayRecipes.add(new ItemStack(Material.GHAST_TEAR));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bRavager &fnearby"));
    displayRecipes.add(new ItemStack(Material.TOTEM_OF_UNDYING));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(Material.BEEF));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bPig &fnearby"));
    displayRecipes.add(new ItemStack(Material.PORKCHOP));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(Material.CHICKEN));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSheep &fnearby"));
    displayRecipes.add(new ItemStack(Material.MUTTON));
    displayRecipes.add(
        new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSnowman &fnearby"));
    displayRecipes.add(new ItemStack(Material.SNOWBALL));
    return displayRecipes;
  }

}
