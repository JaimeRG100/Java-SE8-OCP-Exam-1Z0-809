import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import java.time.ZoneId;
import java.time.Duration;
import java.time.Month;
//import java.time.temporal.ChronoUnit;

public class TestClass {

  public static void main(String[] args) {
    
    // Java 8 Date and Times classes
    System.out.println(LocalDate.now());       // 2018-01-17 
    System.out.println(LocalTime.now());       //            13:42:38.260 
    System.out.println(LocalDateTime.now());   // 2018-01-17T13:42:38.262 
    System.out.println(ZonedDateTime.now());   // 2018-01-17T13:42:38.265-06:00[America/Mexico_City] 
    System.out.println("- - - - - ");
    
    // Calculating difference between time zones
    LocalDate date = LocalDate.of(2015, 06, 20);
    LocalTime time = LocalTime.of(7, 50);
    ZoneId zone = ZoneId.of("Europe/Paris");
    ZonedDateTime zoneTime1 = ZonedDateTime.of(date, time, zone);
    date = LocalDate.of(2015, 06, 20);
    time = LocalTime.of(6, 50);
    zone = ZoneId.of("Asia/Kolkata");
    ZonedDateTime zoneTime2 = ZonedDateTime.of(date, time, zone);    
    System.out.println(zoneTime1);
    System.out.println(zoneTime2);
    Duration duration = Duration.between(zoneTime2, zoneTime1);
    System.out.println("Duration.between(z2,z1): " + duration);
    System.out.println("- - - - - ");
    
    // Calculating difference between time zones
    date = LocalDate.of(2015, 06, 20);
    time = LocalTime.of(7, 50);
    zone = ZoneId.of("GMT-04:00");
    zoneTime1 = ZonedDateTime.of(date, time, zone);
    date = LocalDate.of(2015, 06, 20);
    time = LocalTime.of(4, 50);
    zone = ZoneId.of("GMT-07:00");
    zoneTime2 = ZonedDateTime.of(date, time, zone);
    System.out.println(zoneTime1);
    System.out.println(zoneTime2);
    duration = Duration.between(zoneTime2, zoneTime1);
    System.out.println("Duration.between(z2,z1): " + duration);
    System.out.println("- - - - - ");
    
    // Calculating difference between time zones
    date = LocalDate.of(2015, 06, 20);
    time = LocalTime.of(07, 50);
    zone = ZoneId.of("US/Pacific");
    zoneTime1 = ZonedDateTime.of(date, time, zone);
    date = LocalDate.of(2015, 06, 20);
    time = LocalTime.of(07, 50);
    zone = ZoneId.of("Asia/Kolkata");
    zoneTime2 = ZonedDateTime.of(date, time, zone);
    System.out.println(zoneTime1);
    System.out.println(zoneTime2);
    duration = Duration.between(zoneTime2, zoneTime1);
    System.out.println("Duration.between(z2,z1): " + duration);
    System.out.println("- - - - - ");
    
    // LocalDate Class
    LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
    LocalDate date2 = LocalDate.of(2015, 1, 20);
    System.out.println(date1);
    System.out.println(date2);
    System.out.println("- - - - - ");
    
    // Month Enum
    Month month = Month.JANUARY;
    //boolean b1 = month == 1;          // Does not compile
    boolean b2 = month == Month.APRIL;  // false
    System.out.println(b2);
    System.out.println("- - - - - ");
    
    // LocalTime Class
    LocalTime time1 = LocalTime.of(6, 15);
    LocalTime time2 = LocalTime.of(6, 15, 30);
    LocalTime time3 = LocalTime.of(6, 15, 30, 200);
    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);
    System.out.println("- - - - - ");
    
    // LocalDateTime Class
    LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
    LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    System.out.println(dateTime1);
    System.out.println(dateTime2);
    System.out.println("- - - - - ");
    
    // ZonedDateTime Class  (also ZoneId Class helper)
    /*ZoneId*/ zone = ZoneId.of("US/Eastern");
                //zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30,      zone);  // Error: no suitable method found
    ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
    ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
    ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
    System.out.println(zoned1);          // 2015-01-20T06:15:30.000000200-05:00[US/Eastern] 
    System.out.println(zoned2);          // 2015-01-20T06:15             -05:00[US/Eastern] 
    System.out.println(zoned3);          // 2015-01-20T06:15:30          -05:00[US/Eastern] 
    System.out.println("- - - - - ");
    
    // More examples
    // LocalDate d = new LocalDate(); // Does not compile ~ LocalDate Constructor has private access
    //LocalDate.of(2915, Month.JANUARY, 32);  // throws DateTimeException
  }
}
