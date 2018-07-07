import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("monkey", "2", "chimp");
    Stream<String> infinite = Stream.generate(() -> "chimp");
    Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
    
    System.out.println(list.stream().anyMatch(pred));  // true
    System.out.println(list.stream().allMatch(pred));  // false
    System.out.println(list.stream().noneMatch(pred)); // false
    System.out.println(infinite.anyMatch(pred));       // true
    
    // test code
    System.out.println("- - - - ");
    Stream<String> str = list.stream();
    System.out.println(str.anyMatch(pred));     // true
    //System.out.println(str.allMatch(pred));   // IllegalStateException: stream has already been operated 
    //System.out.println(str.noneMatch(pred));  // We can't reuse a Stream variable this way
    
    System.out.println("- - - - ");
    Supplier<String> sup = () -> "chimp";
    System.out.println(Stream.generate(sup).anyMatch(pred));     // true
    //System.out.println(Stream.generate(sup).allMatch(pred));   // infinite call
    System.out.println(Stream.generate(sup).noneMatch(pred));    // false
    
    System.out.println("- - - - ");
    sup = () -> "123";
    //System.out.println(Stream.generate(sup).anyMatch(pred));  // infinite call
    System.out.println(Stream.generate(sup).allMatch(pred));    // false
    //System.out.println(Stream.generate(sup).noneMatch(pred)); // infinite call
  }
}
