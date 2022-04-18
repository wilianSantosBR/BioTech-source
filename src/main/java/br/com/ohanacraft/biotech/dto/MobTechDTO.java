package br.com.ohanacraft.biotech.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MobTechDTO {

    public static enum MobTechType {
        SIMPLE,
        INTELLIGENCE,
        LUCK,
        BERSERK,
        EFFICIENCY,
        CLONING,
        ACCELERATION,
    }

    String id;
    String name;
    String texture;
    MobTechType mobTechType;

}
