import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass {

  public static void main(String[] args) {
    { // We can create a Duration using a number of different granularities:
      Duration daily = Duration.ofDays(1);
      Duration hourly = Duration.ofHours(1);
      Duration everyMinute = Duration.ofMinutes(1);
      Duration everyTenSeconds = Duration.ofSeconds(10);
      Duration everMilli = Duration.ofMillis(1);
      Duration everyNano = Duration.ofNanos(1);
      System.out.println(daily);
      System.out.println(hourly);
      System.out.println(everyMinute);
      System.out.println(everyTenSeconds);
      System.out.println(everMilli);
      System.out.println(everyNano);
      System.out.println("- - - - - - - - ");
    }
    
    { // Using ChronoUnit, the previous code can be rewritten as this:
      System.out.println(Duration.of(1, ChronoUnit.DAYS));
      System.out.println(Duration.of(1, ChronoUnit.HOURS));
      System.out.println(Duration.of(1, ChronoUnit.MINUTES));
      System.out.println(Duration.of(10, ChronoUnit.SECONDS));
      System.out.println(Duration.of(1, ChronoUnit.MILLIS));
      System.out.println(Duration.of(1, ChronoUnit.NANOS));
      System.out.println("- - - - - - - - ");
    }
    
    // Duration works the same way as using a Period, for example:
    {
      LocalDate date = LocalDate.of(2015, 1, 20);
      LocalTime time = LocalTime.of(6, 15);
      LocalDateTime dateTime = LocalDateTime.of(date, time);
      Duration duration = Duration.ofHours(6);
      System.out.println(dateTime.plus(duration));   // 2015-01-20T12:15 
      System.out.println(time.plus(duration));       // 2015-01-20T12:15 
      //System.out.println(date.plus(duration));     // throws UnsupportedTemporalTypeException
      System.out.println("- - - - - - - - ");
    }
    
    // Let's try again, but add 23 hours:
    {
      LocalDate date = LocalDate.of(2015, 1, 20);
      LocalTime time = LocalTime.of(6, 15);
      LocalDateTime dateTime = LocalDateTime.of(date, time);
      Duration duration = Duration.ofHours(23);
      System.out.println(dateTime.plus(duration));    // 2015-01-21T05:15 
      System.out.println(time.plus(duration));        // 05:15
      //System.out.println(date.plus(duration));      // throws UnsupportedTemporalTypeException
      System.out.println("- - - - - - - - ");
    }
    
    // Period and Duration are not the equivalent
    {
      LocalDate date = LocalDate.of(2015, 5, 25);
      Period period = Period.ofDays(1);
      Duration duration = Duration.ofDays(1);
      System.out.println(date.plus(period));
      //System.out.println(date.plus(duration));     // throws UnsupportedTemporalTypeException
    }
  }
  
}
