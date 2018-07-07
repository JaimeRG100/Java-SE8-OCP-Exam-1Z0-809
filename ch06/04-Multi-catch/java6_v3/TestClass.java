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
    } catch (DateTimeParseException | IOException e) {
      // This is much better, no duplicate code, logic is all in one place
      // using multi-catch
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
}