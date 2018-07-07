import java.util.Arrays;
import java.util.stream.Stream;

/*
Many common streams including map() , forEach() , and filter() can be 
processed independently, although order is NEVER guaranteed.
 */

public class TestClass {
  public static void main(String[] args) {
    
    // Example 1
    Arrays.asList("jackal", "kangoroo", "lemur")
      .parallelStream()
      .map(s -> s.toUpperCase())
      .forEach(System.out::println);
    
    // Example 2
    System.out.println("- - - - - - - ");
    Arrays.asList("jackal", "kangoroo", "lemur")
      .parallelStream()
      .map(s -> {System.out.println(s); return s.toUpperCase();})
      .forEach(System.out::println);
  }
}

/*
When using streams, you should avoid any lambda expressions that 
can produce side effects.
 */