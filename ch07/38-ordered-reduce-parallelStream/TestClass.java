import java.util.Arrays;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                         .parallelStream()
                         .reduce(0, (a, b) -> (a-b)));     // Not an associative accumulator
    
    System.out.println(Arrays.asList("w","o","l","f")
                         .parallelStream()
                         .reduce("X", String::concat));   // bad identity value
    
    // test code
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                         .parallelStream()
                         .reduce(0, (a, b) -> (a + b)));  // Right associative accumulator
    
    System.out.println(Arrays.asList("w","o","l","f")
                         .parallelStream()
                         .reduce("", String::concat));    // Right identity value
  }
}