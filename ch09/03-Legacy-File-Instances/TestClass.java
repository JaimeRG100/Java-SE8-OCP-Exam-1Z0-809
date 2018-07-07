import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.File;

public class TestClass {
  
  public static void main(String[] args) {
    { // java.io.File class was updated with a new method, toPath()
      File file = new File("pandas/cuddly.png");
      Path path = file.toPath();
    }
    
    { // For backward compatibility, the Path interface also contains a method toFile()
      Path path = Paths.get("cuddly.png");
      File file = path.toFile();
    }
  }
}