import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class TestClass {
  
  // Method to read the first line of one file and write it to another file.
  // In Java 7, it can be rewritten as follows:
  public void newApproach(Path path1, Path path2) throws IOException {
    try (BufferedReader in = Files.newBufferedReader(path1);
        BufferedWriter out = Files.newBufferedWriter(path2)){
      out.write(in.readLine());
    } 
  }

  public static void main(String[] args) {
    
  }
}