@FunctionalInterface
public interface Climb {
  public int climb();
}

//@FunctionalInterface            // Swim is not a functional interface
/*public*/ abstract class Swim {
  public abstract Object swim(double speed, int duration);
}

//@FunctionalInterface            // this interface doesn't compile
/*public*/ interface ArticMountainCLimb extends MountainClimb {
  public default int getSpeed();  // Error: missing method body, or declare abstract
}

@FunctionalInterface
/*public*/ interface MountainClimb extends Climb {
}

