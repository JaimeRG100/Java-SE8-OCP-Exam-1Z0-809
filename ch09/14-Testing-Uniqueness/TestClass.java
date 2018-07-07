import java.nio.file.*;
import java.io.IOException;

/* Let’s assume that all of the fi les in the following examples exist within 
 * the file system and that cobra is a symbolic link to the snake file.*/

public class TestClass {
  
  public static void main(String[] args) {
    // isSameFile(Path, Path)
    try {
      System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")));  // true if cobra is a symbolic link to snake, else false if both Paths exists, else throws NoSuchFileException
      System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("/user/monkey")));  // true if the Path exists, else throws NoSuchFileException
      System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"), Paths.get("/leaves/giraffe.exe")));  // true if the Path exists, else throws NoSuchFileException
      System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"), Paths.get("/cardinal/tail.data"))); // false if both Paths exists, else throws NoSuchFileException
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}