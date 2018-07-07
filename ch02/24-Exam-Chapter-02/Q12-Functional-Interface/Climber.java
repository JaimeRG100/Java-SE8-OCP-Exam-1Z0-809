/*public*/ interface Climb {
  boolean isTooHigh(int heigth, int limit);
}
public class Climber {
  public static void main(String[] args) {
    check((h,l) -> h.toString(), 5);     // Error: int cannot be dereferenced
  }
  
  private static void check(Climb climb, int height) {
    if(climb.isTooHigh(height, 10))
      System.out.println("too high");
    else System.out.println("ok");
  }
}