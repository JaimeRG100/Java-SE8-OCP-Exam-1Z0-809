import java.nio.file.*;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.FileVisitOption;
import java.nio.file.StandardCopyOption;

public class TestClass {
  
  public static void main(String[] args) {
    { // toString(), getNameCount() and getName(int) methods
      Path path = Paths.get("/land/hippo/harry.happy");
      System.out.println("The Path Name is: " + path);
      for(int i=0; i < path.getNameCount(); i++) {
        System.out.println(" Element " + i + " is: " + path.getName(i));
      }
      System.out.println("\n");
    }
    
    { // What if we ran the preceding code using the relative path land/hippo/harry.happy
      Path path = Paths.get("land/hippo/harry.happy");
      System.out.println("The Path Name is: " + path);
      for(int i=0; i < path.getNameCount(); i++) {
        System.out.println(" Element " + i + " is: " + path.getName(i));
      }
    }
  }
}