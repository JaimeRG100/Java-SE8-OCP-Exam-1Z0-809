import java.util.*;
import java.util.stream.*;

/* Real World Scenario
-----------------------
Use Concurrent Collection when you are working with a parallel stream.
See the output if we had used a regular ArrayList rather than a synchronized one.
 */

public class TestClass {
  public static void main(String[] args) {
    List<Integer> data = new ArrayList<>();
    Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream()
      .map(i -> {data.add(i); return i;})  // AVOID STATEFUL LAMBDA EXPRESSIONS!
      .forEachOrdered(i -> System.out.print(i + " " ));
    
    System.out.println();
    for(Integer e: data) {
      System.out.print(e + " ");
    }
  }
}