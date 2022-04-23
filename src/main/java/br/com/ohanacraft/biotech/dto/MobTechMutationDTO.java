package br.com.ohanacraft.biotech.dto;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MobTechMutationDTO {

    SlimefunItemStack input1;
    SlimefunItemStack input2;
    int chance;
    SlimefunItemStack output;

}
