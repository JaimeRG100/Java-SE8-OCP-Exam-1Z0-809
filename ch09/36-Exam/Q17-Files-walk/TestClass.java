import java.nio.file.*;
import java.util.stream.Collectors;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    // Assuming the current directory is /animals/cute
    Files.walk(Paths.get("..").toRealPath().getParent())  // u1
      .map(p -> p.toAbsolutePath().toString()) // u2
      .filter(s -> s.endsWith(".java"))  // u3
      .collect(Collectors.toList())
      .forEach(System.out::println);  // It prints all .java files in the root directory tree.
  }
}