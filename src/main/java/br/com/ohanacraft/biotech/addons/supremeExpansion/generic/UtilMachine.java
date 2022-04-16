package br.com.ohanacraft.biotech.addons.supremeExpansion.generic;

import org.bukkit.inventory.ItemStack;

import java.util.concurrent.atomic.AtomicInteger;

public class UtilMachine {

    public static int getRandomInt() {
        return (int)(Math.random() * ((100 - 1) + 1)) + 1;
    }

    public static ItemStack getMaterial(ItemStack[] output, int randomInt) {
        AtomicInteger startValue = new AtomicInteger(0);
        AtomicInteger nextValue = new AtomicInteger(0);
        ItemStack item = null;
        for (ItemStack itemStack : output) {
            nextValue.set(startValue.get() + itemStack.getAmount());
            if(startValue.get() <= randomInt && nextValue.get() >= randomInt){
                item = itemStack;
                break;
            }
            startValue.set(nextValue.get());
        }
        return item;
    }

}
