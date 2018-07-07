import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class TestClass {

  public static void main(String[] args) {
    
    // There are few ways to create a finite Stream:
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1, 2, 3);
    
    // Java provides a conveniente way to convert from a List to a Stream:
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> fromList = list.stream();
    Stream<String> fromListParallel = list.parallelStream();
    
    // We can create an Infinite Stream (which makes stream more powerful)
    Stream<Double> randoms = Stream.generate(Math::random);  // generate(Supplier<T> s)
    Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);  // iterate(T seed, UnaryOperator<T> f)
    
    // (if you call this code, the program will run until you kill it)
    // randoms.forEach(System.out::println);
    
    // print a stream variable reference: 
    System.out.println(fromArray);
  }
}
