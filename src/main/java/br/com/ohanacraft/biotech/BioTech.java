package br.com.ohanacraft.biotech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class BioTech extends JavaPlugin implements SlimefunAddon {

    public static BioTech instance = null;

    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
//            new GitHubBuildsUpdater(this, getFile(), "").start();
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


    public static String buildNameTier(String newName, Integer tier) {
        switch (tier) {
            case 1:
                return ChatColor.DARK_GRAY + newName + " I";
            case 2:
                return ChatColor.GRAY + newName + " II";
            case 3:
                return ChatColor.DARK_GREEN + newName + " III";
            case 4:
                return ChatColor.BLUE + newName + " IV";
            case 5:
                return ChatColor.DARK_RED + newName + " V";
            case 6:
                return ChatColor.GOLD + newName + " VI";
            case 7:
                return ChatColor.YELLOW + newName + " VII";
            case 8:
                return ChatColor.WHITE + newName + " VIII";
            default:
                return ChatColor.DARK_GRAY + newName;
        }
    }

    public static String buildIdTier(String newName, Integer tier) {
        switch (tier) {
            case 1:
                return newName + "_I";
            case 2:
                return newName + "_II";
            case 3:
                return newName + "_III";
            case 4:
                return newName + "_IV";
            case 5:
                return newName + "_V";
            case 6:
                return newName + "_VI";
            case 7:
                return newName + "_VII";
            case 8:
                return newName + "_VIII";
            default:
                return newName + "_0";
        }
    }

}
