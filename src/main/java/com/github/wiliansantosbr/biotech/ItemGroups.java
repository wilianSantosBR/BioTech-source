package com.github.wiliansantosbr.biotech;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class ItemGroups {

    public static NestedItemGroup MULTI_CATEGORY = new NestedItemGroup(new NamespacedKey(BioTech.inst(), "MAIN_BIOTECH"),
            new CustomItemStack(new SlimefunItemStack("MAIN_BIOTECH_ITEM", "2fb82dc0c82536964a523e4aeae235fa2656d5c87d062dc6539a245732fcde6e", "Main item"), "&5Bio&dTech"));

    public static ItemGroup RESOURCE_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "RESOURCE_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(Material.HONEYCOMB_BLOCK, "&4Resource"));

    public static ItemGroup TOOLS_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "TOOLS_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(Material.IRON_SHOVEL, "&4Tools"));

    public static ItemGroup TECHMOB_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "TECHMOB_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(Material.HONEYCOMB, "&4TechMob"));

    public static ItemGroup MACHINES_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "MACHINES_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(Material.LOOM, "&4Machines"));

    public static ItemGroup CARDS_RESOURCE_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "CARDS_RESOURCE_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(Material.MUSIC_DISC_PIGSTEP, "&4Resource Cards"));

    public static ItemGroup ELETRIC_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "ELETRIC_CATEGORY"), MULTI_CATEGORY,
            new CustomItemStack(new SlimefunItemStack("ELECTRIC_ITEM",
                    "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422", "Eletric Item"),
                    "&4Electric"));

}
