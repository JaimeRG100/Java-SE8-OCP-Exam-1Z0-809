import java.util.*;
import java.util.stream.Stream;

// valid ways of creating a parallel stream
public class TestClass {
  public static void main(String[] args) {
    Stream s = Stream.of(1, 2, 3);
    Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3));
    //s.parallelStream();  // c - method doesnt exist
    c.parallelStream();    // d
    s.parallel();          // f
    c.stream().parallel(); // aditional option    
  }
}