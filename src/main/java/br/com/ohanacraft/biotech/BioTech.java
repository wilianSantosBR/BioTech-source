package br.com.ohanacraft.biotech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class BioTech extends JavaPlugin implements SlimefunAddon {

    public static BioTech instance = null;

    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
//            new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/BioTech/master").start();
        }

        instance = this;

        BioTech.inst().log(Level.INFO, "#####################");
        BioTech.inst().log(Level.INFO, "START SETUP BIOTECH");
        BioTech.inst().log(Level.INFO, "#####################");

        // build items supreme expansion
        Setup.setup(this);

        BioTech.inst().log(Level.INFO, "#####################");
        BioTech.inst().log(Level.INFO, "END SETUP BIOTECH");
        BioTech.inst().log(Level.INFO, "#####################");


    }

    public static BioTech inst() {
        return instance;
    }

    @Override
    public String getBugTrackerURL() {
        return "";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public final void log(String messages) {
        this.log(Level.INFO, messages);
    }
    public final void log(Level level, String messages) {
        this.getLogger().log(level, messages);
    }

}
