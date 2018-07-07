import java.io.*; 

public class TestClass {
  
  public static void main(String[] args) {
    Console console = System.console();
    String color = console.readLine("What is your favorite color?");
    console.printf("Your favorite color is " + color);
    console.format("Your favorite color is " + color);
    console.writer().println("Your favorite color is " + color);
  }
}