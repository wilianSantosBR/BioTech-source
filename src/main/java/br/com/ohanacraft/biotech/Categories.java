package br.com.ohanacraft.biotech;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Categories {

    public static NestedItemGroup MULTI_CATEGORY = new NestedItemGroup(new NamespacedKey(BioTech.inst(), "MAIN_BIOTECH"),
            new CustomItemStack(new SlimefunItemStack("MAIN_BIOTECH_ITEM", "2fb82dc0c82536964a523e4aeae235fa2656d5c87d062dc6539a245732fcde6e", "Main item"), "&5Bio&dTech"));

    public static ItemGroup RESOURCE_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "RESOURCE"), MULTI_CATEGORY,
            new CustomItemStack(Material.HONEYCOMB_BLOCK, "&4Resource"));

    public static ItemGroup MACHINES_CATEGORY = new SubItemGroup(new NamespacedKey(BioTech.inst(), "MACHINES"), MULTI_CATEGORY,
            new CustomItemStack(Material.LOOM, "&4Machines"));

}
