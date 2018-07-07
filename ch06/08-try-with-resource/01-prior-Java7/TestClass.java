import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class TestClass {
  
  // Method to read the first line of one file and write it to another file.
  // Prior to Java 7, your code would look like the following:
  public void oldApproach(Path path1, Path path2) throws IOException {
    BufferedReader in = null;
    BufferedWriter out = null;
    try {
      in = Files.newBufferedReader(path1);
      out = Files.newBufferedWriter(path1);
      out.write(in.readLine());
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }

  public static void main(String[] args) {
    
  }
}