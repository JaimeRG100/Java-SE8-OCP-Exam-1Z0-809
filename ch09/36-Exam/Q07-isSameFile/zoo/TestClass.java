import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException{
    Path path = Paths.get("turkey");
    //System.out.println(path);
    //System.out.println(path.resolve("info"));
    if(Files.isSameFile(path, Paths.get("/zoo/turkey")))
      Files.createDirectory(path.resolve("info"));
  }
}