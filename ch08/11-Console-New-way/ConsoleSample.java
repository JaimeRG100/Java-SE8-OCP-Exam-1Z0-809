import java.io.Console;

public class ConsoleSample {
  public static void main(String[] args) {
    Console console = System.console();
    if(console != null) {
      String userInput = console.readLine();
      console.writer().println("You entered the following: " + userInput);
    }
  }
}