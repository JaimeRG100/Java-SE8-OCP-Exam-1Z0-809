import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class TestClass {
  
  public static void main(String[] args) {
    { // Files.newBufferedReader(Path,Charset)
      Path path = Paths.get("/animals/gopher.txt");
      try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("US-ASCII"))) {
        String currentLine = null;
        while((currentLine = reader.readLine()) != null) {
          System.out.println(currentLine);
        }
      } catch(IOException e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - - -");
    }
    
    
    {// Files.newBufferedWriter(Path,Charset)
      Path path = Paths.get("/animals/gopher2.txt");
      try(BufferedWriter writer = Files.newBufferedWriter(path)) {
        writer.write("Hello World");
        writer.newLine();
      } catch (IOException e) {
        System.out.println(e);
      }
    }
    
  }
}