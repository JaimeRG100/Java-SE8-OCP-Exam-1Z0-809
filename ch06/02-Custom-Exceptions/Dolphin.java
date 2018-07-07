class CannotSwimException extends Exception {}               // Checked Exception
class DangerInTheWater extends RuntimeException {}           // Un-Checked Exception
class SharkInTheWaterException extends DangerInTheWater {}   // Un-Checked Exception

public class Dolphin {
  
  public void swim() throws CannotSwimException {
    System.out.println("Logic here");
    throw new CannotSwimException();
  }
  
  public static void main(String[] args) {
    // test code
    Dolphin dolphin = new Dolphin();
    try {
      dolphin.swim();
    } catch (CannotSwimException e) {
      System.out.println(e);
    }
  }
}