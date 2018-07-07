import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;

public class TestClass {
  public static void main(String[] args) {
    List<Integer> l = IntStream.range(1, 6)
      .mapToObj(i -> i).collect(Collectors.toList());
    l.forEach(System.out::println);
    
    // Simples way of rewriting this code:
    IntStream.range(1, 6)
     .forEach(System.out::println);
  }
}
