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
    Stream<Double> randoms = Stream.generate(Math::random);
    Stream<Integer> oddNumbers = Stream.iterate(1, n -> n * 2);
    
    // (if you call the next line of code, the program will run until you kill it)
    //oddNumbers.forEach(System.out::println);
    System.out.println("Stream.Of(Array)");
    fromArray.forEach(System.out::print);
    System.out.println("\nlist.stream()");
    fromList.forEach(System.out::print);
    System.out.println("\nlist.parallelStream()");
    fromListParallel.forEach(System.out::print);
    System.out.println();
    
    // print a stream variable reference: 
    System.out.println(oddNumbers);
    
  }
}
