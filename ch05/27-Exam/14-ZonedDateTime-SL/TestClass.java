import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TestClass {
  public static void main(String[] args) {
    { // option a)
      ZoneId zone = ZoneId.of("US/Eastern");
      LocalDate date =  LocalDate.of(2016, 3, 13);
      LocalTime time = LocalTime.of(2, 15);
      ZonedDateTime a = ZonedDateTime.of(date, time, zone);
      System.out.println(a);
    }
    
    { // option c)
      ZoneId zone = ZoneId.of("US/Eastern");
      LocalDate date =  LocalDate.of(2016, 11, 6);
      LocalTime time = LocalTime.of(2, 15);
      ZonedDateTime a = ZonedDateTime.of(date, time, zone);
      System.out.println(a);
    }
    
    { // option d)
      ZoneId zone = ZoneId.of("US/Eastern");
      LocalDate date =  LocalDate.of(2016, 11, 7);
      LocalTime time = LocalTime.of(2, 15);
      ZonedDateTime a = ZonedDateTime.of(date, time, zone);
      System.out.println(a);
    }
    
    
    
  }
}