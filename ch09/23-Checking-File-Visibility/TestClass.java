import java.nio.file.*;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    // isHidden(Path)
    try {
      System.out.println(Files.isHidden(Paths.get("/walrus")));    // if files doesn't exists, throws NoSuchFileException
    } catch (IOException e) {
      System.out.println(e);
    }    
  }
}