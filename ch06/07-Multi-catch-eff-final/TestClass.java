import java.io.IOException;

public class TestClass {

  public static void main(String[] args) {
    
    // This try statement is legal, but it is a bad idea
    try {
      // do some work
      throw new RuntimeException();
    } catch (RuntimeException e) {
      e = new RuntimeException();
    }
    
    // In multi-atch, this pattern is no longer allowed
    try {
      throw new IOException();
    } catch(IOException | RuntimeException e) {
      //e = new RuntimeException();  // Does not compile
    }
  }
}