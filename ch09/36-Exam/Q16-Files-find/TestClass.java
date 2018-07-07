import java.nio.file.*;
import java.util.stream.Stream;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    // Assume /squid/food-schedule.csv exists
    Path path = Paths.get("/squid/food-schedule.csv");
    Files.lines(path)
      .flatMap(p -> Stream.of(p.split(",")))
      .map(s -> s.toUpperCase())
    .forEach(System.out::println);
    
  }
}