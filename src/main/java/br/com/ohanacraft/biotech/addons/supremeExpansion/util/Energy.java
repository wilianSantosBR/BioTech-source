package br.com.ohanacraft.biotech.addons.supremeExpansion.util;

import javax.annotation.Nonnull;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Energy {

    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,##0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

    @Nonnull
    public static String format(double number) {
        return FORMAT.format(number);
    }

    @Nonnull
    public static String energyCapacity(Integer energy) {
        return "&8⇨ &e⚡ &7" + ((energy == null) ? "Infinite" : format((double) energy)) + " J Capacity";
    }

    @Nonnull
    public static String energyBuffer(Integer energy) {
        return "&8⇨ &e⚡ &7" + ((energy == null) ? "Infinite" : format((double) energy)) + " J Buffer";
    }

    @Nonnull
    public static String energyPowerPerSecond(int energy) {
        return "&8⇨ &b⚡ &7" + format((double) energy) + " J/s";
    }

    @Nonnull
    public static String energyPowerPerItem(int energy) {
        return "&8⇨ &b⚡ &7" + format((double) energy) + " J/item";
    }

    @Nonnull
    public static String timePerItem(double time) {
        return "&8⇨ &b⚡ &7" + (int) time + " seconds/item";
    }

    @Nonnull
    public static String chancePerItem(double energy) {
        return "&8⇨ &b⚡ &7Chance: " + format((double) energy) + " %";
    }

}
