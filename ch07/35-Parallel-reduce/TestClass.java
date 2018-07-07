import java.util.Arrays;

/* Performing Order-Based Tasks: Since order is not guaranteed with 
parallel streams, methods such as findAny() on parallel streams 
may result in unexpected behavior. */

public class TestClass {
  public static void main(String[] args) {
    
    // Using Serial Stream: this code consistently outputs the first value, 1.
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).stream().findAny().get());
    
    // Using Parallel Stream: this code outputs a value retrieved from the first thread to finish the task
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());
    
    // Any stream operation that is based on order, including findFirst(), limit(), or
    // skip(), may actually perform more slowly in a parallel environment.
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().skip(5).limit(2).findFirst().get());
    
    // The results of ordered operations on a parallel stream will be consistent with a serial stream.
    System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findFirst().get());
    
    
  }
}