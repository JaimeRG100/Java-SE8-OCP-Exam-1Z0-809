import java.nio.file.*;
import java.io.File;

public class TestClass {
  public static void main(String[] args) throws java.io.IOException {
    Path path1 = Paths.get("/bats/night","../").resolve(Paths.get(
                                                                  "./sleep.txt")).normalize();
    Path path2 = new File("../sleep.txt").toPath().toRealPath();
    System.out.print(Files.isSameFile(path1,path2));
    System.out.print(" "+path1.equals(path2));
    //System.out.print(path1 + ":" + path2); // Output on Windows: true false    \bats\sleep.txt:C:\bats\sleep.txt> 
  }
}