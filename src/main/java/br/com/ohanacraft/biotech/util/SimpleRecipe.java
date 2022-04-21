package br.com.ohanacraft.biotech.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@Setter
@Getter
@AllArgsConstructor
public final class SimpleRecipe {

    private ItemStack item;
    private ItemStack[] recipe;

}