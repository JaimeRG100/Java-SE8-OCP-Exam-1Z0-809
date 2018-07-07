import java.nio.file.*;
import java.io.*;

public class TestClass {
  
  public static void main(String[] args) throws IOException {
    // Assume the directories and files referenced here all exist and are accessible 
    Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
    Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
    System.out.print(Files.isSameFile(path1, path2));
    System.out.print(" " + path1.equals(path2));
    System.out.print(" " + path1.normalize().equals(path2.normalize()));   // true false true
  }
}