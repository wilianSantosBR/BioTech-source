package com.github.wiliansantosbr.biotech.resource;

import com.github.wiliansantosbr.biotech.dto.MobTechDTO;
import com.github.wiliansantosbr.biotech.dto.MobTechDTO.MobTechType;
import com.github.wiliansantosbr.biotech.BioTech;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BeeTech {

  public static final MobTechDTO SIMPLE_BEE = new MobTechDTO("BIOTECH_SIMPLE_BEE", "Bee Ordinary",
      "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d", MobTechType.SIMPLE);

  public static final MobTechDTO MUTATION_BERSERK_BEE = new MobTechDTO("BIOTECH_BERSERK_BEE", "Bee Mutant Berserk",
      "d8916ea1ffb39f13dbbf4e62449dd2cbd5d2812f414e97608af0609e139d6115", MobTechType.MUTATION_BERSERK);

  public static final MobTechDTO ROBOTIC_ACCELERATION_BEE = new MobTechDTO("BIOTECH_ACCELERATION_BEE",
      "Bee Robótica Accelerator", "725926d73f6f9480efad9e930e8a4a2566c115287a5b40ec0f50d58afab1a72a",
      MobTechType.ROBOTIC_ACCELERATION);

  public static final MobTechDTO MUTATION_INTELLIGENCE_BEE = new MobTechDTO("BIOTECH_INTELLIGENCE_BEE",
      "Bee Mutant Intelligent", "1445c3def689427fd8df8cad824c0a6b553d4f847eb03705196a69c7eed946af",
      MobTechType.MUTATION_INTELLIGENCE);

  public static final MobTechDTO ROBOTIC_EFFICIENCY_BEE = new MobTechDTO("BIOTECH_EFFICIENCY_BEE",
      "Bee Robótica Efficient", "fb7a761d715d2c3c73a7d01411e61f4237e4f7633cc9f4db2cf05f66d2030a17",
      MobTechType.ROBOTIC_EFFICIENCY);

  public static final MobTechDTO MUTATION_LUCK_BEE = new MobTechDTO("BIOTECH_LUCK_BEE", "Bee Mutant Lucky",
      "929fa8cd84ac125021d6201a148a9e862c0b772c48477b06c19145c4a673aa24", MobTechType.MUTATION_LUCK);

  public static final MobTechDTO ROBOTIC_CLONING_BEE = new MobTechDTO("BIOTECH_CLONING_BEE",
      "Bee Robótica Cloner", "2ea2ba84c8c91dcb28af56a36dd49a1e51c3557e853f5d3777877758737b5557",
      MobTechType.ROBOTIC_CLONING);


  public static void setup(BioTech plugin) {

    MobTech.preSetup(plugin, BeeTech.SIMPLE_BEE);

    MobTech.preSetup(plugin, BeeTech.ROBOTIC_EFFICIENCY_BEE);
    MobTech.preSetup(plugin, BeeTech.ROBOTIC_CLONING_BEE);
    MobTech.preSetup(plugin, BeeTech.ROBOTIC_ACCELERATION_BEE);

    MobTech.preSetup(plugin, BeeTech.MUTATION_INTELLIGENCE_BEE);
    MobTech.preSetup(plugin, BeeTech.MUTATION_LUCK_BEE);
    MobTech.preSetup(plugin, BeeTech.MUTATION_BERSERK_BEE);

  }


}