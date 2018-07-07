import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args) {
    try { 
      throw new IOException();
    } catch (IOException | RuntimeException e) { }      
  }
}