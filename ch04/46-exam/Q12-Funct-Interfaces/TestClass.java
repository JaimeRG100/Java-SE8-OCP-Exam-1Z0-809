import java.util.stream.Stream;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    Supplier<String> x = String::new; 
    BiConsumer<String, String> y = (a, b) -> System.out.println();
    UnaryOperator<String> z = a -> a + a;
  }
}
