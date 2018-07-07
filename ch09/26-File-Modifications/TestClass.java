import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
  
public class TestClass {
  
  public static void main(String[] args) {
    try {
      Path path = Paths.get("/rabbit/food.jpg");
      System.out.println(Files.getLastModifiedTime(path));             // reads and outputs the LastModifiedTime
      System.out.println(Files.getLastModifiedTime(path).toMillis());  // reads and outputs the LastModifiedTime in millis since epoch time
      Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));  // update the LastModifiedTime to the current time system
      System.out.println(Files.getLastModifiedTime(path));             // reads and outputs (again) the LastModifiedTime
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}