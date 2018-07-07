import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;

public class TestClass {

  public static void main(String[] args) {
    // it is commong to log the error and convert it to a different exception type
    try {
      Path path = Paths.get("dolphinsBorn.txt");      
      String text = new String(Files.readAllBytes(path));
      LocalDate date = LocalDate.parse(text);
      System.out.println(date);
    } catch (Exception e) {
      // duplicate code is gone
      // Not a good approach, because it catches other exceptions too
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}