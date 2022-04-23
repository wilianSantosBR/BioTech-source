package br.com.ohanacraft.biotech;

import br.com.ohanacraft.biotech.dto.MobTechDTO;
import br.com.ohanacraft.biotech.dto.MobTechDTO.MobTechType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
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
                return ChatColor.GRAY + newName + " I";
            case 2:
                return ChatColor.DARK_GREEN + newName + " II";
            case 3:
                return ChatColor.GREEN + newName + " III";
            case 4:
                return ChatColor.DARK_BLUE + newName + " IV";
            case 5:
                return ChatColor.BLUE + newName + " V";
            case 6:
                return ChatColor.GOLD + newName + " VI";
            case 7:
                return ChatColor.YELLOW + newName + " VII";
            case 8:
                return ChatColor.DARK_RED + newName + " VIII";
            case 9:
                return ChatColor.DARK_PURPLE + newName + " IX";
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
            case 9:
                return newName + "_IX";
            default:
                return newName + "_0";
        }
    }

    public static String buildLoreRadioactivityType(MobTechType mobTechType) {
        Radioactivity radioactivity;
        switch (mobTechType) {
            case MUTATION_INTELLIGENCE:
            case MUTATION_BERSERK:
            case MUTATION_LUCK:
                radioactivity = Radioactivity.VERY_DEADLY;
                break;
            case ROBOTIC_CLONING:
            case ROBOTIC_ACCELERATION:
            case ROBOTIC_EFFICIENCY:
                radioactivity = Radioactivity.HIGH;
                break;
            case SIMPLE:
            default:
                radioactivity = Radioactivity.LOW;
        }
        return radioactivity.getLore();
    }

    public static String buildLoreType(MobTechType mobTechType, Integer tier) {
        switch (mobTechType) {
            case MUTATION_BERSERK:
            case ROBOTIC_ACCELERATION:
                return ChatColor.YELLOW + String.valueOf(tier + 1) + "x "
                        + ChatColor.GRAY + "increase speed and increase energy";
            case MUTATION_LUCK:
            case ROBOTIC_CLONING:
                return buildLoreTypeLuckAndCloning(tier);
            case MUTATION_INTELLIGENCE:
            case ROBOTIC_EFFICIENCY:
                return ChatColor.YELLOW + String.valueOf(tier + 1) + "x "
                        + ChatColor.GRAY + " decrease energy";
            case SIMPLE:
            default:
                return ChatColor.GRAY + "Aumenta Velocidade de processamento";
        }
    }

    private static String buildLoreTypeLuckAndCloning(Integer tier){

        if (tier >= 1) {
            return ChatColor.YELLOW + "2x "
                + ChatColor.GRAY + "Stack clone";
        } else if (tier >= 4) {
            return ChatColor.YELLOW + "3x "
                + ChatColor.GRAY + "Stack clone";
        } else if(tier >= 6){
            return ChatColor.YELLOW + "4x "
                + ChatColor.GRAY + "Stack clone";
        } else if(tier >= 8){
            return ChatColor.YELLOW + "5x "
                + ChatColor.GRAY + "Stack clone";
        }
        return "";
    }

    private static String buildLoreTypeAmount(MobTechType mobTechType, Integer tier){
        switch (mobTechType) {
            case MUTATION_BERSERK:
            case ROBOTIC_ACCELERATION:
                return ChatColor.YELLOW + "(" + String.valueOf(tier + 1) + "x amount stack / 32) speed "
                    + ChatColor.GRAY + " value process";
            case MUTATION_INTELLIGENCE:
            case ROBOTIC_EFFICIENCY:
                return ChatColor.YELLOW + "(" + String.valueOf(tier + 1) + " amount stack) J/s "
                    + ChatColor.GRAY + " value process";
            case MUTATION_LUCK:
            case ROBOTIC_CLONING:
                return ChatColor.YELLOW + "(" + String.valueOf(tier + 1) + "x amount stack)"
                    + ChatColor.GRAY + " value process (limit 64x)";
            case SIMPLE:
            default:
                return ChatColor.YELLOW + "1x amount stack"
                    + ChatColor.GRAY + " value process";
        }
    }

    public static SlimefunItemStack buildItemFromMobTechDTO(MobTechDTO mobTechDTO, Integer tier) {
        return new SlimefunItemStack(buildIdTier(mobTechDTO.getId(), tier),
                mobTechDTO.getTexture(),
                buildNameTier(mobTechDTO.getName(), tier),
                "",
                buildLoreRadioactivityType(mobTechDTO.getMobTechType()),
                buildLoreType(mobTechDTO.getMobTechType(), tier),
                buildLoreTypeAmount(mobTechDTO.getMobTechType(), tier),
                "");
    }


}
