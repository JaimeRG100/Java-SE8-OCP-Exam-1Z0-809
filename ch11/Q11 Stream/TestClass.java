import java.util.stream.*;
import java.util.Optional;

public class TestClass {
  private static void magic(Stream<Integer> s) {
    Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x-y);
    System.out.println(o.get());
  }
  
  public static void main(String[] args) {
    //magic(Stream.empty());  // throws NoSuchElementException: No value present
    //magic(Stream.of(5, 10)); // throws NoSuchElementException: No value present
    magic(Stream.iterate(1, x -> x++));
  }
}