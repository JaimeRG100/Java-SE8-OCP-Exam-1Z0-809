public interface CanClimb {
  public abstract void climb();
}
/*public*/ interface CanClimbTrees extends CanClimb {
}
/*public*/ abstract class Chipmunk implements CanClimbTrees {
  public abstract void chew();
}
/*public*/ class EasternChipmunk extends Chipmunk {    // Error: EasternChipmunk ... does not override abstract method climb() in CanClimb
  public void chew() {
    System.out.println("Easter Chipmunk is Chewing");
  }
}