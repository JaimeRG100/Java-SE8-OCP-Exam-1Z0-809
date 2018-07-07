import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> s = Stream.generate(() -> "meow");
    boolean match = s.allMatch(String::isEmpty);
    System.out.println(match);    
  }
}
