import java.nio.file.*;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    try {
      System.out.println(Files.size(Paths.get("/zoo/c/animals.txt")));  // outputs the number of bytes in the file
      System.out.println(Files.size(Paths.get("/zoo/c/animals.txt"))/1024 + " kb");
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}