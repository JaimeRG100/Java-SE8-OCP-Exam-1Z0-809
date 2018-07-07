import java.nio.file.Paths;
import java.nio.file.Files;

public class TestClass {

  public static void main(String[] args) {
    // exists()
    Files.exists(Paths.get("/ostrich/feathers.png"));
  }
}