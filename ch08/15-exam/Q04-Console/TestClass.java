import java.io.*; 

public class TestClass {
  
  public static void main(String[] args) {
    Console console = System.console();
    String s = console.readLine();
    // readPassword returns a char array, not a String
    char[] c = console.readPassword();
  }
}