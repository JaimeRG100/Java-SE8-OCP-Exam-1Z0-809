import java.nio.file.*;
import java.util.stream.Stream;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    // Assume /squid/food-schedule.csv exists
    Path path = Paths.get("/squid/food-schedule.csv");
    Files.lines(path)
      .map(p -> p.split(","))
      .flatMap(s -> Stream.of(s))
      .map(s -> s.toUpperCase())
    .forEach(System.out::println);
    
  }
}