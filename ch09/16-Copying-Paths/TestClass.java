import java.nio.file.*;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    // Files.copy(Path, Path)
    try {
      System.out.println(Files.copy(Paths.get("/panda"), Paths.get("/panda-save"))); // Prints "\panda-save" if not already exists, else throws FileAlreadyExistsException
                                                                                     // it doesn't copy the directories and files inside the source directory
      System.out.println(Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"))); // Prints "\panda-save\bamboo.txt" if not already exists, else throws FileAlreadyExistsException
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}