import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;

public class TestClass {

  public static void main(String[] args) {
    { // The US change their clocks in March, time springs forward from 1:59 a.m. to 3:00 a.m.
      LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
      LocalTime time = LocalTime.of(1, 30);
      ZoneId zone = ZoneId.of("US/Eastern");
      ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
      System.out.println(dateTime);      // 2016-03-13T01:30-05:00[US/Eastern] 
      
      dateTime = dateTime.plusHours(1);
      System.out.println(dateTime);      // 2016-03-13T03:30-04:00[US/Eastern] 
      System.out.println("- - - - - - - -");
    }
    
    
    { // In November, time falls back and The US experience the hour from 1:59 a.m. to 1:00 a.m.
      LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
      LocalTime time = LocalTime.of(1, 30);
      ZoneId zone = ZoneId.of("US/Eastern");
      ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
      System.out.println(dateTime);      // 2016-11-06T01:30-04:00[US/Eastern] 
      
      dateTime = dateTime.plusHours(1);
      System.out.println(dateTime);      // 2016-11-06T01:30-05:00[US/Eastern] 
      System.out.println("- - - - - - - -");
    }
    
    {  // trying to create a time that doesn’t exist just rolls forward:
      LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
      LocalTime time = LocalTime.of(2, 30);
      ZoneId zone = ZoneId.of("US/Eastern");
      ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
      System.out.println(dateTime);  // Java is smart enough to know that there is no 2:30 a.m.
                                     // that night and switches over to the appropriate GMT offset.
      System.out.println("- - - - - - - -");
    }
    
    {  // test code November 01:30
      LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
      LocalTime time = LocalTime.of(1, 30);
      ZoneId zone = ZoneId.of("US/Eastern");
      ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
      System.out.println(dateTime);               // 2016-11-06T01:30-04:00[US/Eastern] 
      System.out.println(dateTime.plusHours(1));  // 2016-11-06T01:30-05:00[US/Eastern] 
      System.out.println("- - - - - - - -");
    }
    
  }  
}
