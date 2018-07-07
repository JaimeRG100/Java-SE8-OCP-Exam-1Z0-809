import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {

  public static void main(String[] args) {
    { // resolve() an absolute path and a relative path
      final Path path1 = Paths.get("/cats/../panther");
      final Path path2 = Paths.get("food");
      System.out.println(path1.resolve(path2));
    }
    
    { // resolve() two absolute 
      final Path path1 = Paths.get("/turkey/food");
      final Path path2 = Paths.get("/tiger/cage");
      System.out.println(path1.resolve(path2));
    }
    
    { // resolve() two relative path
      final Path path1 = Paths.get("turkey/food");
      final Path path2 = Paths.get("tiger/cage");
      System.out.println(path1.resolve(path2));
    }
  }
}