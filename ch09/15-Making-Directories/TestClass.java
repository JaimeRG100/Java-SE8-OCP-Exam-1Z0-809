import java.nio.file.*;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    // createDirectory(Path)  createDirectories(Path)
    try {
      System.out.println(Files.createDirectory(Paths.get("/bison/field")));  // Prints "\bison\field" if not already exists, else throws FileAlreadyExistsException
      System.out.println(Files.createDirectories(Paths.get("/bison/field/pasture/green"))); // Prints "C:\bison\field\pasture\green" if not already exists, else throws FileAlreadyExistsException
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}