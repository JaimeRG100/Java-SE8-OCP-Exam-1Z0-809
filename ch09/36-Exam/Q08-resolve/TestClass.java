import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    Path path1 = Paths.get("/pets/../cats.txt");
    Path path2 = Paths.get("./doc.txt");
    System.out.println(path1.resolve(path2));  // Outputs   \pets\..\cats.txt\.\doc.txt 
    System.out.println(path2.resolve(path1));  // Outputs   \pets\..\cats.txt 
  }
}