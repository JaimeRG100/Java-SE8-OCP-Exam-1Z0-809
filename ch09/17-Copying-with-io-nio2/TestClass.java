import java.nio.file.*;
import java.io.*;

public class TestClass {
  
  public static void main(String[] args) {
    // Files.copy(InputStream, Path)   Files.copy(Path, OutputStream)
    try (InputStream is = new FileInputStream("source-data.txt");
         OutputStream out = new FileOutputStream("output-data.txt");
     ) {
       Files.copy(is, Paths.get("c:\\mammals\\wolf.txt")); // copy the file if source exists, and destination doesn't already exists
       Files.copy(Paths.get("c:\\fish\\clown.xlsx"), out); // copy the file if source exists, and destination doesn't already exists
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}