import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    System.out.println(s.count());
    System.out.println(s.count());
    
    // test code
    Stream<Integer> si = Stream.iterate(1, n -> n +1);
    //System.out.println(si.count());  // Does not terminate (infinite stream)   
    
    s = Stream.of("monkey", "gorilla", "bonobo");   // if this line is commented, the next line throws an IllegalStateException
    s.forEach(System.out::println);
  }
}
