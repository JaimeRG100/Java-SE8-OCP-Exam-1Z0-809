import java.util.stream.Stream;
import java.util.function.Predicate;

public class TestClass {
  
  public static void main(String[] args) {
    Predicate<? super String> predicate = s -> s.startsWith("g");
    Stream<String> stream1 = Stream.generate(() -> "growl! ");
    Stream<String> stream2 = Stream.generate(() -> "growl! ");
    boolean b1 = stream1.anyMatch(predicate);
    boolean b2 = stream2.allMatch(predicate); // the code hangs here
    System.out.println(b1 + " " + b2);
    
  }
}
