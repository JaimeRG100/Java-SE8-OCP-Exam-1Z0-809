import java.util.stream.*;
import java.util.Arrays;

public class TestClass {
  
  public static void main(String[] args) {
    { // Creating Basic Parallel Stream ----------------------------
      Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
      Stream<Integer> parallelStream = stream.parallel();
      
      Stream<Integer> parallelStream2 = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();
    }
    
    { // Processing Task in Serial Stream ----------------------------
      Arrays.asList(1, 2, 3, 4, 5, 6)
        .stream()
        .forEach(s -> System.out.print(s + " "));
      System.out.println();
    }
    
    { // Processing Task in Parallel Stream --------------------------
      Arrays.asList(1, 2, 3, 4, 5, 6)
        .parallelStream()
        .forEach(s -> System.out.print(s + " "));  // results are no longer ordered or predictable
      System.out.println();
    }
    
    { // Ordering forEach Results
      Arrays.asList(1, 2, 3, 4, 5, 6)
        .parallelStream()
        .forEachOrdered(s -> System.out.print(s + " "));
      
    }
  }
}