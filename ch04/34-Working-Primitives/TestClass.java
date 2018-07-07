import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class TestClass {
  
  public static void main(String[] args) {
    // Calculate the sum of numbers in a finite Stream
    {
      Stream<Integer> stream = Stream.of(1, 2, 3);
      System.out.println(stream.reduce(0, (s, n) -> s + n));
    }
    
    // There is anothe way of doing that with Primivite Stream
    {
      Stream<Integer> stream = Stream.of(1, 2, 3);
      System.out.println(stream.mapToInt(x -> x).sum());
    }
    
    // Java provides a method to calculate the average on a Stream classes for primitives
    {
      IntStream intStream = IntStream.of(1, 2, 3);
      OptionalDouble avg = intStream.average();
      System.out.println(avg.getAsDouble());
    }
    
    // test code
    {
      System.out.println("- - - - - -");
      Stream<Integer> stream = Stream.of(1, 2, 3);
      IntStream intStream = stream.mapToInt(x -> x);
      System.out.println(intStream.average());
      System.out.println("- - - - - -");
      stream = Stream.of(1, 2, 3);
      intStream = stream.mapToInt(x -> x + 1);
      intStream.forEach(System.out::print);
      System.out.println("\n- - - - - -");
      stream = Stream.of(1, 2, 3);
      intStream = stream.mapToInt(x -> x * x);
      System.out.println(intStream.sum());
      //System.out.println(intStream.average());   // stream has already been operated upon or closed
      intStream = Stream.of(1, 2, 3).mapToInt(x -> x);
      int s = Stream.of(1, 2, 3).mapToInt(x -> x).sum();
      double a = Stream.of(1, 2, 3).mapToInt(x -> x).average().getAsDouble();
    }
  }
}