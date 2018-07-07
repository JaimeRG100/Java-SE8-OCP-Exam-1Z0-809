import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

public class TestClass {

  public static void main(String[] args) {
    // toRealPath()
    try {
      System.out.println(Paths.get("/zebra/food.source").toRealPath());
      System.out.println(Paths.get(".././food.txt").toRealPath());
    } catch(IOException e) {
      System.out.println(e);
    }
    
    // curent working directory
    try {
      System.out.println(Paths.get(".").toRealPath());
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}