import java.util.stream.Stream;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    UnaryOperator<Integer> u = x -> x * x;
    Function<Integer, Integer> f = x -> x * x;
    
    System.out.println(u.apply(5));
    System.out.println(f.apply(5));
  }
}
