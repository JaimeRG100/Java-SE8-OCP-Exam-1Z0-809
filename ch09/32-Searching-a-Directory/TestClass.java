import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    // Files.find(Path,int,BiPredicate)
    // (Path, BasicFileAttributes) -> boolean
    Path path = Paths.get("/test");
    long dateFilter = 1420070400000l;
    try {
      Stream<Path> stream = Files.find(path, 10, 
         (p, a) -> p.toString().endsWith(".java")
         && a.lastModifiedTime().toMillis() > dateFilter);
      stream.forEach(System.out::println);
    } catch (IOException e) {}
  }
}