import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Instant;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    ZoneId zoneId = ZoneId.systemDefault();
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
    long epochSeconds = 0;
    { 
      Instant instant = Instant.now(); 
      System.out.println(instant);
    }
    { 
      Instant instant = Instant.ofEpochSecond(epochSeconds); 
      System.out.println(instant);
    }
    { 
      Instant instant = zonedDateTime.toInstant(); 
      System.out.println(instant);
    }
  }
}