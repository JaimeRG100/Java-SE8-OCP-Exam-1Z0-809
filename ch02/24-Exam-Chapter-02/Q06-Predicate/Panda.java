import java.util.function.Predicate;

public class Panda {
  int age;
  
  public static void main(String[] args) {
    Panda p1 = new Panda();
    p1.age = 1;
    check(p1, p -> p.age < 5);
    // Predicate<Panda> pp = p -> p.age < 5;                       // another way without aditional method
    // System.out.println((pp.test(p1) ? "match" : "not match"));
  }
  
  private static void check(Panda panda, Predicate<Panda> pred) {
    String result = pred.test(panda) ? "match" : "not match";
    System.out.println(result);
  }
  
}