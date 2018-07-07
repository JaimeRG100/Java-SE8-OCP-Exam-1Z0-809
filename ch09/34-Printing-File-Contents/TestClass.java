import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    Path path = Paths.get("/fish/sharks.log");
    try {
      Files.lines(path).forEach(System.out::println);
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}

/*
Path path = Paths.get("/fish/sharks.log");
try {
Files.lines(path).forEach(System.out::println);
} catch (IOException e) {
// Handle file I/O exception...
}
 */