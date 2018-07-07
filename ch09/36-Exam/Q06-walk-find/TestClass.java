import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("/animals");
    /*boolean myBoolean = Files.walk(path)
      .filter((p,a) -> a.isDirectory() && !path.equals(p)) // w1
      .findFirst().isPresent();  // w2  */      
    boolean myBoolean = Files.find(path, 5, 
      (p, a) -> a.isDirectory() && !path.equals(p))
      .findFirst().isPresent();
    System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");
  }
}