package br.com.ohanacraft.biotech.eletric;

import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.apache.commons.lang.Validate;
import org.bukkit.entity.LivingEntity;

public class GeneratorMobMachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public GeneratorMobMachineRecipe(Predicate<LivingEntity> predicate) {
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
