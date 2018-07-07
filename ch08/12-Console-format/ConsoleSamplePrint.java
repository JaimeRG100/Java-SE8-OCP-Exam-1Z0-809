import java.io.Console;

public class ConsoleSamplePrint {
  public static void main(String[] args) {
    Console console = System.console();
    if (console == null) {
      throw new RuntimeException("Console not available");
    } else {  
      console.writer().println("Welcome to Our Zoo!");
      console.format("Our zoo has 391 animals and employs 25 people.");
      console.printf("The zoo spans %.2f acres", 128.91);
    }
  }
}