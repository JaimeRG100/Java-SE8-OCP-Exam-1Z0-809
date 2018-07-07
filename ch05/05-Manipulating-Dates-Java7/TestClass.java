// Java 7 Date Class 
import java.util.Date;
import java.util.Calendar;
// Java 8 LocalDate Class 
import java.time.LocalDate;

public class TestClass {
  
  // Adding a day - OLD WAY Java <= 7
  public static Date addDay(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DATE, 1);    
    return cal.getTime();
  }
  
  // Adding a day - NEW WAY Java >= 8
  public static LocalDate addDay(LocalDate date) {
    return date.plusDays(1);
  }
  
  // Substracting a day - OLD WAY Java <= 7
  public static Date substractDay(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DATE, -1);
    return cal.getTime();
  }
  
  // Substracting a day - NEW WAY Java >= 8
  public static LocalDate substractDay(LocalDate date) {
    return date.minusDays(1);
  }

  public static void main(String[] args) {
    Date oldDate = new Date();
    System.out.println(oldDate);
    System.out.println(addDay(oldDate));
    System.out.println(substractDay(oldDate));
    System.out.println("- - - - - - -");
    LocalDate newDate = LocalDate.now();
    System.out.println(newDate);
    System.out.println(addDay(newDate));
    System.out.println(substractDay(newDate));
    
  }
}
