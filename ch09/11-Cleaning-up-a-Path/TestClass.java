import java.nio.file.Paths;
import java.nio.file.Path;

public class TestClass {

  public static void main(String[] args) {
    // normalize()
    Path path3 = Paths.get("E:\\data");
    Path path4 = Paths.get("E:\\user\\home");
    
    Path relativePath = path3.relativize(path4);
    System.out.println(relativePath);                             // ..\ user\home 
    System.out.println(path3.resolve(relativePath));              // E:\data\..\ user\home 
    System.out.println(path3.resolve(relativePath).normalize());  // E:\ user\home 
  }
}