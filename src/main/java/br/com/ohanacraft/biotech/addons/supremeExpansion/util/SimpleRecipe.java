package br.com.ohanacraft.biotech.addons.supremeExpansion.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.inventory.ItemStack;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class SimpleRecipe {

    private ItemStack item;
    private ItemStack[] recipe;

    public ItemStack getItem(){
        return this.item;
    }

    public ItemStack[] getRecipe(){
        return recipe;
    }

}