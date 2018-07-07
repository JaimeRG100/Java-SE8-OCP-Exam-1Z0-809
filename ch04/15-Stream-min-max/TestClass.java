import java.util.stream.Stream;
import java.util.Optional;

public class TestClass {

  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "ape", "bonobo");
    Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
    min.ifPresent(System.out::println);
    
    Optional<?> minEmpty = Stream.empty().min((s1,s2) -> 0);
    System.out.println(minEmpty.isPresent());
    
    // test code
    
    Optional<String> minEmpty2 = Stream.<String>of("one", "two", "three").min((s1,s2) -> 0);
    minEmpty2.ifPresent((v) -> System.out.println(v));
    
    // System.out.println(minEmpty.get());  // throws NoSuchElementException
  }
}
