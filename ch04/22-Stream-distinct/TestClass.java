import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

  public static void main(String[] args) {
    Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
    s.distinct().forEach(System.out::print);
    
    // test code 1
    System.out.println("\n- - - - - ");
    s = Stream.of("duck", "duck", "duck", "goose");
    s.distinct().forEach(x -> System.out.print(x + ", "));
    System.out.println();
    
    // test code 2
    List<String> list = new ArrayList<>();
    s = Stream.of("duck", "duck", "duck", "goose");
    s.distinct().forEach(x -> list.add(x));
    System.out.println(list);
  }
}
