import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream.generate(() -> "1")
      .limit(10)
      .peek(System.out::println);
  }
}
