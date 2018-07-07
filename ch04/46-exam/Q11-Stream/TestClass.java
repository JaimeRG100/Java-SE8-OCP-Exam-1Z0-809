import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(Stream
      .iterate(1, x -> ++x)
      .limit(5)
      .map(x -> "" + x)
      .collect(Collectors.joining("")));
  }
}
