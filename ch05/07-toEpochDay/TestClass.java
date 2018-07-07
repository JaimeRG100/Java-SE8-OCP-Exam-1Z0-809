import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestClass {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date.toEpochDay());
    
    LocalDateTime dateTime = LocalDateTime.now();
    //System.out.println(dateTime.toEpochSecond());
    
    
  }
  
}
