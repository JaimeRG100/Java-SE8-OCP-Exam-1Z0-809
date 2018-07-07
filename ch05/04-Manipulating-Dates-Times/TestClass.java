import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class TestClass {

  public static void main(String[] args) {
    
    // Adding a date is easy
    {
      LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
      System.out.println(date);    // 2014-01-20 
      date = date.plusDays(2);
      System.out.println(date);    // 2014-01-22 
      date = date.plusWeeks(1);
      System.out.println(date);    // 2014-01-29 
      date = date.plusMonths(1);
      System.out.println(date);    // 2014-02-28 
      date = date.plusYears(5);
      System.out.println(date);    // 2019-02-28 
      System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
    
    // There are easy methods to go backward in time
    {
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(5, 15);
      LocalDateTime dateTime = LocalDateTime.of(date, time);
      System.out.println(dateTime);          // 2020-01-20T05:15 
      dateTime = dateTime.minusDays(1); 
      System.out.println(dateTime);          // 2020-01-19T05:15 
      dateTime = dateTime.minusHours(10);
      System.out.println(dateTime);          // 2020-01-18T19:15 
      dateTime = dateTime.minusSeconds(30); 
      System.out.println(dateTime);          // 2020-01-18T19:14:30  
      System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
    
    // Methods can be chained
    {
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(5, 15);
      LocalDateTime dateTime = LocalDateTime.of(date, time)
        .minusDays(1).minusHours(10).minusSeconds(30);
      System.out.println(dateTime);
      System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
    
    // Ignoring result
    {
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      date.plusDays(10);
      System.out.println(date);
      System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
    
    // Testing what methods each of the date and time objects includes
    {
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      //date = date.plusMinutes(1);  // Does not compile ~ Error: cannot find symbol method plusMinutes(int)
      System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
    
    
  }
}
