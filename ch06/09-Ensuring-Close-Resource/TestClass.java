import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;


public class TestClass {
  
  public void oldApproach(Path path1, Path path2) throws IOException {
    // Sometimes a code appears to guarantee resource closure, but in fact it does not. 
    // If in.close() throws an exception, then out.close() will never be executed.
    BufferedReader in = null;
    BufferedWriter out = null;
    try {
      in = Files.newBufferedReader(path1);
      out = Files.newBufferedWriter(path2);
      out.write(in.readLine());      
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }  
}