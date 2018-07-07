import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    //Path path = Path.get("/user/.././root", "../kodiacbear.txt");
    Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
    //path.normalize().relativize("/lion");   // Does not compile
    System.out.println(path.normalize().relativize(Paths.get("/lion")));   // Java takes the /kodiacbear.txt path as a Directory
    System.out.println(path);
  }
}