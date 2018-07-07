import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    { // isDirectory(Path)   isRegularFile(Path)   isSymbolicLink(Path)
      System.out.println(Files.isDirectory(Paths.get("/canine/coyote/fur.jpg")));  // true if exists as Directory
      System.out.println(Files.isRegularFile(Paths.get("/canine/types.txt")));     // true if exists as File
      System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));       // true if exists as Symbolic Link
      System.out.println("- - - - - - - ");
    }
    
    { // isDirectory(), isRegularFile(), and isSymbolicLink() do not throw an exception 
      // if the path does not exist, so the following code is redundant:
      Path path = Paths.get("/");
      System.out.println((Files.exists(path) && Files.isDirectory(path)));
      // This code could be replaced with a single Files.isDirectory() method call 
      // since the exists() call is unnecessary:
      System.out.println(Files.isDirectory(path));
      
    }
  }
}