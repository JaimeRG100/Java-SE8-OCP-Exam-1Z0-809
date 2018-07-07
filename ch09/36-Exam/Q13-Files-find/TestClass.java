import java.nio.file.*;
import java.util.stream.*;


public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("/monkeys");
    Files.find(path, 0, (p, a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
      .collect(Collectors.toList())  // y2
      .stream() // y3
      .filter(x -> x.toString().endsWith(".txt")) // y4
    .forEach(System.out::println);
  }
}