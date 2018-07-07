import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String[] args) {
    List<Integer> l1 = Arrays.asList(1, 2, 3);
    List<Integer> l2 = Arrays.asList(4, 5, 6);
    List<Integer> l3 = Arrays.asList();
    Stream.of(l1, l2, l3)
      //.map(x -> x + 1)          // Does not compile: Function expects an Integer rather than a List<Integer>
      .flatMap(x -> x.stream())
      .map(x -> x + 1)            // map() can be called after flatMap()
      .forEach(System.out::print);
  }
}
