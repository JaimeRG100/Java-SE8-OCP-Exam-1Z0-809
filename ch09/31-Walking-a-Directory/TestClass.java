import java.nio.file.*;
import java.io.IOException;

public class TestClass {

  public static void main(String[] args) {
    // Files.walk(path)
    Path path = Paths.get("/test");
    try {
      Files.walk(path)
        .filter(p -> p.toString().startsWith(".java"))
        .forEach(System.out::println);
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}