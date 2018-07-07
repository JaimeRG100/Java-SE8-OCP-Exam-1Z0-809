import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("/seal");
    if(Files.isDirectory(path))
      System.out.println(Files.deleteIfExists(path) ? "Sucess" : "Try Again");
  }
}