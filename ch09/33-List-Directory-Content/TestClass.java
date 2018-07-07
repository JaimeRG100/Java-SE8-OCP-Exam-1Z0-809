import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    // Files.list(path)
    try {
      Path path = Paths.get("ducks");
      Files.list(path)
        .filter(p -> !Files.isDirectory(p))
        .map(p -> p.toAbsolutePath())
        .forEach(System.out::println);
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}