import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.stream.Collectors;

public class TestClass {
  
  public static void main(String args[]) throws java.io.IOException {
    Path path = Paths.get("C:/gorilla/signed-words.txt");
    
    Files.find(path.getParent(),10, // fixed
               (Path p, BasicFileAttributes a) -> p.toString().endsWith(".txt")) // k2
      .collect(Collectors.toList())
    .forEach(System.out::println);
    
    Files.readAllLines(path) // k3
      /*.flatMap(p -> Stream.of(p.split(" "))) // k4
      .map(s -> s.toLowerCase()) */ // k5 
    .forEach(System.out::println);
  }
}