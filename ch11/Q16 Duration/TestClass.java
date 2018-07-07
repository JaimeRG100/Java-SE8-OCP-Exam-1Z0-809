import java.time.Period;
import java.time.Duration;

public class TestClass {
  
  public static void main(String args[]) {
    String d = Duration.ofDays(1).toString();
    String p = Period.ofDays(1).toString();
    
    boolean b1 = d == p;
    boolean b2 = d.equals(p);
    
    System.out.println(b1 + " " + b2);
    System.out.println("p: " + p);
    System.out.println("d: " + d);
  }
}