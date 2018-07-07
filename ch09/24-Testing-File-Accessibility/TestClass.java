import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    System.out.println(Files.isReadable(Paths.get("/seal/baby.png")));   // returns true if baby.png exists and its readable
    System.out.println(Files.isExecutable(Paths.get("/seal/baby.png"))); // returns true if baby.png is marked executable 
  }
}