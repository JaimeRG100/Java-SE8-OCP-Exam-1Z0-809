import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class TestClass {

  public static void main(String[] args) {
    
    { // You can turn ZonedDateTime into an Instant
      LocalDate date = LocalDate.of(2015, 5, 25);
      LocalTime time = LocalTime.of(11, 55, 00);
      ZoneId zone = ZoneId.of("US/Eastern");
      ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
      Instant instant = zonedDateTime.toInstant();
      System.out.println(zonedDateTime);
      System.out.println(instant);
      System.out.println("- - - - - - - ");
    }
    
    { // You can create an Instant from a number of Seconds since 1970
      long epochSeconds = 1;
      Instant instant = Instant.ofEpochSecond(epochSeconds);
      System.out.println(instant);
      
      // Instant allows you to add any unit day or smaller
      Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
      System.out.println(nextDay);
      Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
      System.out.println(nextHour);
      //Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);   // throws UnsupportedTemporalTypeException
      
      // test code
      Instant nextMinute = instant.plus(1, ChronoUnit.MINUTES);
      System.out.println(nextMinute);
      Instant nextMilli = instant.plus(1, ChronoUnit.MILLIS);
      System.out.println(nextMilli);
      Instant nextNano = instant.plus(1, ChronoUnit.NANOS);
      System.out.println(nextNano);
    }
  }  
}
