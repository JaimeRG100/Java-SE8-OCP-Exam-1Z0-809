import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

public class TestClass {
  public static void main(String[] args) {
    Stream<Integer> s = Stream.of(4);
    IntStream is = s.mapToInt(x -> x);
    DoubleStream ds = is.mapToDouble(x -> x);
    Stream<Integer> s2 = ds.mapToInt(x -> x);      // Error: incompatible types: possible lossy conversion from double to int
    ds.forEach(System.out::println);
  }
}
