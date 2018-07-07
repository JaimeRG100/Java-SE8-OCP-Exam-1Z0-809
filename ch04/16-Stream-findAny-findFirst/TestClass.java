import java.util.stream.Stream;
import java.util.Optional;

public class TestClass {

  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");
    s.findAny().ifPresent(System.out::println);
    infinite.findAny().ifPresent(System.out::println);
    
    // test code
    //s.findAny().ifPresent(System.out::println);  // throws 'IllegalStateException' (stream has already been operated)
    System.out.println("- - - - -");
    s = Stream.of("monkey", "gorilla", "bonobo");
    infinite = Stream.generate(() -> "chimp");
    Optional<String> opt = s.findFirst();
    opt.ifPresent(System.out::println);
    opt = infinite.findFirst();
    opt.ifPresent(System.out::println);
  }
}
