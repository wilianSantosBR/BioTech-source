package com.github.wiliansantosbr.biotech.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MobTechDTO {

    public static enum MobTechType {
        SIMPLE,
        ROBOTIC_EFFICIENCY,
        ROBOTIC_CLONING,
        ROBOTIC_ACCELERATION,
        MUTATION_INTELLIGENCE,
        MUTATION_LUCK,
        MUTATION_BERSERK,
    }

    String id;
    String name;
    String texture;
    MobTechType mobTechType;

}
