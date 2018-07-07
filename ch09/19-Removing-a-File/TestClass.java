import java.nio.file.*;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    // delete(Path) deleteIfExists(Path)
    try {
      Files.delete(Paths.get("C:\\test1")); // deletes the file if exists, else throws NoSuchFileException or DirectoryNotEmptyException
      System.out.println(Files.deleteIfExists(Paths.get("C:\\test2"))); // prints true if file was deleted, else returns false or DirectoryNotEmptyException
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}