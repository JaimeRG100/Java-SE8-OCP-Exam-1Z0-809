public class AssertDemo {
  public static void main(String [] args) {
    Integer x = 10;
    x++;
    assert x == null && x >= 0;  // ignored without proper command line enabling it
    System.out.println(x);
  }
}