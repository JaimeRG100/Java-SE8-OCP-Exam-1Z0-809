import java.util.stream.*;
import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class TestClass {
  
  public static void main(String args[]) {
    
    Stream<LocalDate> s = Stream.of(LocalDate.now());
    UnaryOperator<LocalDate> u = l -> l;
    s.filter(l -> l != null).map(u).peek(System.out::println);
    
    // test code
    s = Stream.of(LocalDate.now());
    s.filter(l -> l != null).map(u).peek(System.out::println).forEach(System.out::println);
  }
}