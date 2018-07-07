import java.util.Arrays;

public class TestClass {
  public static void main(String[] args) {
    
    // On Serial Streams, we can concatenate a string using the reduce() method to get an ordered result
    System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                         .stream()
                         .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));
    
    // On Parallel Streams, the reduce() method create intermediate pair of values and then combine them*
    System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                         .parallelStream()
                         .reduce("",(c, s1) -> c + s1, (s2,s3) -> s2 + s3));
  }
}

// * The identity, accumulator and combiner of reduce() method must adhere to certain principles, so the operations 
//   can be performed using a parallel stream and the results will be ordered as they would be with a serial stream.