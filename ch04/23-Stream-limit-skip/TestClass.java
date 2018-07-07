import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    Stream<Integer> s = Stream.iterate(1, n -> n + 1);
    s.skip(5).limit(2).forEach(System.out::print); // 67
    
    
    // test code
    System.out.println("\n- - - - - ");
    s = Stream.iterate(1, n-> n + 1);
    s.skip(5).limit(2).forEach(x -> System.out.print(x + ","));
    
    System.out.println("\n- - - - - ");
    Stream<Double> sd = Stream.generate(Math::random);
    sd.skip(4).limit(3).forEach(x -> System.out.print(x + ","));
  }
}
