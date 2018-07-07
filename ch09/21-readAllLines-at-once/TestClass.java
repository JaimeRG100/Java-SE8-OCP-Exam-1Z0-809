import java.nio.file.*;
import java.io.*;
import java.util.List;

public class TestClass {
  
  public static void main(String[] args) {
    //readAllLines(Path)
    Path path = Paths.get("/fish/sharks.log");
    try {
      List<String> lines = Files.readAllLines(path);
      for(String line: lines) 
        System.out.println(line);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}