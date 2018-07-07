import java.nio.file.*;
import java.nio.file.StandardCopyOption;
import java.io.*;

public class TestClass {
  
  public static void main(String[] args) throws IOException {
    // Assume that the source exists as regular file and that the target does not
    Path path1 = Paths.get("./goat.txt");
    Path path2 = Paths.get("mule.png");
    Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);
    System.out.println(Files.isSameFile(path1, path2));  // It will output false.
  }
}