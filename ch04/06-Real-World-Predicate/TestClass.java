import java.util.function.Predicate;

public class TestClass {

  public static void main(String[] args) {
    
    // simple Predicate interface usage
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");
    
    // this works, but it is long to read and it contains duplication    
    Predicate<String> brownEgg = s -> s.contains("egg") && s.contains("brown");
    Predicate<String> otherEgg = s -> s.contains("egg") && ! s.contains("brown");
    
    // a better way to deal with this situation
    Predicate<String> brownEggs = egg.and(brown);
    Predicate<String> otherEggs = egg.and(brown.negate());
    
    // test code
    System.out.println(brownEggs.test("brown eggs"));
    System.out.println(brownEggs.test("white eggs"));
    System.out.println(otherEggs.test("white eggs"));
  }
}
