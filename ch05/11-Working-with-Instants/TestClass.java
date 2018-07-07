import java.time.Instant;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestClass {

  public static void main(String[] args) {
    {// The Instant class represents a specific moment in time in the GMT time zone.
      Instant now = Instant.now();
      // do something time consuming 
      {
        java.time.ZoneId.getAvailableZoneIds().stream()
          .filter(z -> z.contains("US") || z.contains("America")).sorted().forEach((x) -> {return;});
      }
      Instant  later = Instant.now();
      System.out.println(now + "\n" + later);
      Duration duration = Duration.between(now, later);
      System.out.println(duration.toMillis());
      System.out.println(duration.toNanos());
      System.out.println("- - - - - - - -");
    }
    
    {// testCode with LocalDateTime
      LocalDateTime now = LocalDateTime.now();
      {
        java.time.ZoneId.getAvailableZoneIds().stream()
          .filter(z -> z.contains("US") || z.contains("America")).sorted().forEach((x) -> {return;});
      }      
      LocalDateTime later = LocalDateTime.now();
      System.out.println(now + "\n" + later);
      Duration duration = Duration.between(now, later);
      System.out.println(duration.toMillis());
      System.out.println(duration.toNanos());
      System.out.println("- - - - - - - -");
    }
    
    {// testCode with ZonedDateTime
      ZonedDateTime now = ZonedDateTime.now();
      {
        java.time.ZoneId.getAvailableZoneIds().stream()
          .filter(z -> z.contains("US") || z.contains("America")).sorted().forEach((x) -> {return;});
      }      
      ZonedDateTime later = ZonedDateTime.now();
      System.out.println(now + "\n" + later);
      Duration duration = Duration.between(now, later);
      System.out.println(duration.toMillis());
      System.out.println(duration.toNanos());
      System.out.println("- - - - - - - -");
    }
  }  
}
