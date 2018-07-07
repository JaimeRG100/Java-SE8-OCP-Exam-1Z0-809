public class TestInterface {
  public static void main(String[] args) {
    // test code
    Fly f = new Eagle();
    // test abstract method
    try {
      System.out.println(f.getWingSpan());
    } catch (Exception e) {
      System.out.println(e);
    }
    // test static variable
    System.out.println(Fly.MAX_SPEED);
    System.out.println(f.MAX_SPEED);
    // test default method
    f.land();
    // test static method
    System.out.println(Fly.calculateSpeed(12.3f, 23.4f));    
  }
}

interface Fly {
  // public abstract method
  public int getWingSpan() throws Exception;
  // public static final variables
  public static final int MAX_SPEED = 100;
  // public default methods
  public default void land() {
    System.out.println("Animal is landing");
  }
  // public static method
  public static double calculateSpeed(float distance, double time) {
    return distance / time;
  }
}

class Eagle implements Fly {
  public int getWingSpan() {
    return 15;
  }
  public void land() {
    System.out.println("Eagle is diving fast");
  }
}