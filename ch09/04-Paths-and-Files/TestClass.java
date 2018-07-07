import java.nio.file.*;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.FileVisitOption;
import java.nio.file.StandardCopyOption;

public class TestClass {
  
  public static void main(String[] args) {
    { // Path.toRealPath(), requires the file to exist or will throw a checked exception if the file is not available
      Path path = Paths.get("c:/test");
      System.out.println(path);
      try {
        Path realPath = path.toRealPath();
        System.out.println(realPath);
      } catch (IOException e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - ");
    }
    
    { // Optional Arguments
      System.out.println(LinkOption.NOFOLLOW_LINKS);
      System.out.println(FileVisitOption.FOLLOW_LINKS);
      System.out.println(StandardCopyOption.COPY_ATTRIBUTES);
      System.out.println(StandardCopyOption.REPLACE_EXISTING);
      System.out.println(StandardCopyOption.ATOMIC_MOVE);
      System.out.println("- - - - - - ");
    }
    
    
    { // Using Path Objects - Many of the methods in the Path interface can be chained
      Path path1 = Paths.get("/zoo1/zoo2/../home").getParent().normalize().toAbsolutePath();
      System.out.println(path1);
    }
  }
}