import java.nio.file.*;
import java.nio.file.attribute.*;

public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("sloth.schedule");
    BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
    System.out.println(attributes.creationTime());
    if(attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
      //attributes.setTimes(null, null, null);   // Does not compile, setTimes is for BasicFileAttributeView class
      System.out.println(attributes.creationTime().toMillis());
    }
  }
}