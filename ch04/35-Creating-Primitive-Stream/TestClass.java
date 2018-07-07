import java.util.stream.Stream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
  
  public static void main(String[] args) {
    // IntStream  |  LongStream  |  DoubleStream
    
    // Creating an empty primitive stream
    DoubleStream empty = DoubleStream.empty();
    
    // Creating a primitive stream with of() factory method
    DoubleStream oneValue = DoubleStream.of(3);
    DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
    oneValue.forEach(System.out::println);
    System.out.println("- - - - - ");
    varargs.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // Creating an infinite primitive stream
    DoubleStream random = DoubleStream.generate(Math::random);
    DoubleStream fractions = DoubleStream.iterate(0.5, d -> d / 2);
    random.limit(3).forEach(System.out::println);
    System.out.println("- - - - - ");
    fractions.limit(3).forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // - > Suppose that we canted a stream with the numbers from 1 through 5
    IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
    count.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // Java provides a method that can generate a range of numbers
    IntStream range = IntStream.range(1, 6);
    range.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // Java also provides a method that can generate a closed (inclusive) range of numbers
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // The final way to create a primitive stream is by mapping from another stream type
    Stream<String> objStream = Stream.of("penguin", "fish");
    IntStream intStream = objStream.mapToInt(s -> s.length());
    intStream.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    // test code
    objStream = Stream.of("penguin", "fish");
    intStream = objStream.mapToInt(String::length);
    intStream.forEach(System.out::println);
    System.out.println("- - - - - ");
    
    List<Double> list = new ArrayList<>();
    list.add(3.3);
    list.add(2.2);
    DoubleStream doubleStream2 = list.stream().mapToDouble(x -> x);
    doubleStream2.forEach(System.out::println);
    System.out.println("- - - - - ");
    DoubleStream doubleStream3 = Arrays.asList(3.1, 2.3).stream().mapToDouble(x -> x);
    doubleStream3.forEach(System.out::println);
    System.out.println("- - - - - ");
    IntStream intStream2 = IntStream.iterate(1, (n) -> n + 1).limit(4);
    DoubleStream doubleStream4 = intStream2.mapToDouble( x -> (double) x);
    doubleStream4.forEach(System.out::println);
    
  }
}