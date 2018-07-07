public class TestSprint {
  
  public static void main(String[] args) {
    Sprint s = new Sprint() {
      public boolean sprint(int b) {
        return b % 2 == 0;
      }
    };
    
    System.out.println(s.sprint(2));
    System.out.println(s.sprint(3));
    s.run();
    s.run2();
    s.run3();
    System.out.println(Sprint.walk());
    System.out.println(Sprint.walk2());
    System.out.println(Sprint.walk3());
    System.out.println(s.x);
    System.out.println(Sprint.y);
  }
}


@FunctionalInterface
interface Sprint {
  public abstract boolean sprint(int a);
  default void run() { System.out.println("run 1"); }
  static int walk() { return 1; }
  
  default void run2() { System.out.println("run 2"); }
  static int walk2() { return 2; }
  
  default void run3() { System.out.println("run 3"); }
  static int walk3() { return 3; }
  
  public int x = 0;
  int y = 5;
}