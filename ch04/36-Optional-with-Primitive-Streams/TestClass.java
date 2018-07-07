import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.OptionalDouble;

public class TestClass {
  
  public static void main(String[] args) {
    IntStream stream = IntStream.rangeClosed(1, 10);
    OptionalDouble optional = stream.average();
    
    optional.ifPresent(System.out::println);                  // 5.5
    System.out.println(optional.getAsDouble());               // 5.5
    System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5
    
    // test code
    System.out.println("- - - - - -");
    System.out.println(optional);
    System.out.println(IntStream.rangeClosed(1, 10).count());
    long c = IntStream.rangeClosed(1, 10).count();
    System.out.println(c);
    System.out.println("- - - - - -");
    
    LongStream longStream = LongStream.rangeClosed(1, 5);
    IntStream intStream2 = longStream.mapToInt(x -> (int)x);
    long cc = intStream2.count();
    DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
    long ccc = doubleStream.count();
    //OptionalDouble optDb = doubleStream.max();
    //optDb.ifPresent(System.out::println);
    
  }
}