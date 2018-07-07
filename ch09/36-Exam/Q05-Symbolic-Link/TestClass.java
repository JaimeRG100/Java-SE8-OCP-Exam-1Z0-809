import java.nio.file.*;

/* Assume /kang exists as a symbolic link to the directory /mammal/kangaroo within the file system.
 * Which of the following statements are correct about this code snippet? (Choose all that apply.)*/
public class TestClass {
  
  public static void main(String[] args) throws java.io.IOException {
    Path path = Paths.get("/kang");
    if(Files.isDirectory(path) && Files.isSymbolicLink(path))
      Files.createDirectory(path.resolve("joey"));
  }
}
/* ANSWERS
----------
B. A new directory will be created only if /mammal/kangaroo exists.
C. If the code creates a directory, it will be reachable at /kang/joey.
D. If the code creates a directory, it will be reachable at /mammal/kangaroo/joey.
*/