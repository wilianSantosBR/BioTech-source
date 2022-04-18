package br.com.ohanacraft.biotech.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Entity;

@Setter
@Getter
@AllArgsConstructor
public class CollectorTechDTO {

    Entity entity;
    MobTechDTO mobTechDTO;
    Integer getCharge;
    Integer maxCharge;

}
