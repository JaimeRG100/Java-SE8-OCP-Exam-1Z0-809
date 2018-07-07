import java.time.Period;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TestClass {

  public static void main(String[] args) {
    // There are five ways to create a Period
    Period annually = Period.ofYears(1);            // every 1 year
    Period quarterly = Period.ofMonths(3);          // every 3 month
    Period everyThreeWeeks = Period.ofWeeks(3);     // every 3 week
    Period everyOtherDay = Period.ofDays(2);        // every 2 days
    Period everyYearAndAWeek = Period.of(1, 0, 7);  // every 1 year and 7 days
    System.out.println(annually);
    System.out.println(quarterly);
    System.out.println(everyThreeWeeks);
    System.out.println(everyOtherDay);
    System.out.println(everyYearAndAWeek);
    
    // You cannot chain methods when creating a Period
    System.out.println("- - - - - - - - ");
    Period wrong = Period.ofYears(1).ofWeeks(1);    
    // This is like writting the following
    wrong = Period.ofYears(1);
    wrong = Period.ofWeeks(1);
    System.out.println(wrong);
    
    // Displaying a Period (Java displays any non-zero parts of the Period P?Y?M?D)
    System.out.println("- - - - - - - - ");
    System.out.println(Period.of(1, 2, 3));
    System.out.println(Period.ofMonths(3));
    System.out.println(Period.of(0, 20, 47));
    
    // Period can be used with certain objects
    System.out.println("- - - - - - - - ");
    LocalDate date = LocalDate.of(2015, 1, 20);
    LocalTime time = LocalTime.of(6, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    Period period = Period.ofMonths(1);
    System.out.println(date.plus(period));     // 2015-02-20 
    System.out.println(dateTime.plus(period)); // 2015-02-20T06:15 
    //System.out.println(time.plus(period));   // throws UnsupportedTemporalTypeException
    
    //test code
    System.out.println("- - - - - - - - ");
    Period test = Period.parse("P1Y5M3D");
    System.out.println(test);
  }
  
}
