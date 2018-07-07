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
    } catch (DateTimeParseException e) {
      handleException(e);
    } catch (IOException e) {
      handleException(e);
    }
  }
  
  // We still have a little duplication. 
  // code is longr and a bit hard to read
  public static void handleException(Exception e) {
    e.printStackTrace();
    throw new RuntimeException();
  }
}