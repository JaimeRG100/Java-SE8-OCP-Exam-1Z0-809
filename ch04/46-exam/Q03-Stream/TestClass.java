import java.util.stream.Stream;
import java.util.function.Predicate;

public class TestClass {
  
  public static void main(String[] args) {
    Predicate<? super String> predicate = s -> s.length() > 3;
    Stream<String> stream = Stream.iterate("-", (s) -> s + s);
    boolean b1 = stream.noneMatch(predicate);
    boolean b2 = stream.anyMatch(predicate);    // stream has already been operated upon or closed
    System.out.println(b1 + " " + b2);
    
  }
}
