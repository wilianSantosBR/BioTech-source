package br.com.ohanacraft.biotech.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RecipeTechMutationDTO {

    MobTechDTO input1;
    MobTechDTO input2;
    int chance;
    MobTechDTO output;


}
