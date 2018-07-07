import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class TestClass2 {
  
  public static void main(String[] args) throws java.io.IOException {
    Files.deleteIfExists(Paths.get("C:/jammm/test7"));
  }
}