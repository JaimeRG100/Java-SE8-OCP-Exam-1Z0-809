import java.io.*;
import java.util.Arrays;

public class PasswordCompareSample {
  public static void main(String[] args) {
    Console console = System.console();
    if(console==null)
      throw new RuntimeException("Console not available");
    else {
      char[] password = console.readPassword("Enter your password: ");
      console.format("Enter your password again: ");
      console.flush();
      char[] verify = console.readPassword();
      boolean match = Arrays.equals(password, verify);
      // Inmeadiately clear 
    }
  } 
}