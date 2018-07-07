import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {

  public static void main(String[] args) {
    Path path = Paths.get("/fish/sharks.log");
    try {
      System.out.println(
         Files.lines(path)
            .filter(s -> s.startsWith("WARN "))
            .map(s -> s.substring(5))
            .collect(Collectors.toList()));
  
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}

/*
Path path = Paths.get("/fish/sharks.log");
try {
System.out.println(Files.lines(path)
.filter(s -> s.startsWith("WARN "))
.map(s -> s.substring(5))
.collect(Collectors.toList()));
} catch (IOException e) {
// Handle file I/O exception...
}
*/