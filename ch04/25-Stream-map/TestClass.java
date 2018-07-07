import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(String::length).forEach(System.out::print); // 676
    
    // test code 1
    System.out.println("\n - - - - -");
    s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(x -> {return x.length() + ",";}).forEach(System.out::print); // 6,7,6,
    
    // test code 2
    System.out.println("\n - - - - -");
    s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(x -> x.startsWith("m")).forEach(System.out::print); // truefalsefalse
    
  }
}
