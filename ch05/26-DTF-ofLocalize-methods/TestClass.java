import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestClass {
  
  public static void main(String[] args) {
    // Testing all ofLocalized methods with FormatStyle.SHORT
    DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    
    LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();
    LocalDateTime dateTime = LocalDateTime.now();
    
    System.out.println(shortDate.format(date));        // ok
    //System.out.println(shortDateTime.format(date));  // throws Exception
    //System.out.println(shortTime.format(date));      // throws Exception
    System.out.println("- - - - - - ");
    
    System.out.println(shortDate.format(dateTime));
    System.out.println(shortDateTime.format(dateTime));
    System.out.println(shortTime.format(dateTime));
    System.out.println("- - - - - - ");
    
    //System.out.println(shortDate.format(time));      // throws Exception
    //System.out.println(shortDateTime.format(time));  // throws Exception
    System.out.println(shortTime.format(time));        // ok
    System.out.println("- - - - - - ");
    
    // Testing all ofLocalized methods with FormatStyle.MEDIUM
    System.out.println("#-#-#-#-#-#-#-#-#-#");
    DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    
    
    System.out.println(mediumDate.format(date));         // ok
    //System.out.println(mediumDateTime.format(date));   // XXXXXX
    //System.out.println(mediumTime.format(date));       // XXXXXX
    System.out.println("- - - - - - ");
    
    System.out.println(mediumDate.format(dateTime));      // ok
    System.out.println(mediumDateTime.format(dateTime));  // ok
    System.out.println(mediumTime.format(dateTime));      // ok
    System.out.println("- - - - - - ");
    
    //System.out.println(mediumDate.format(time));          // XXXXXX
    //System.out.println(mediumDateTime.format(time));      // XXXXXX
    System.out.println(mediumTime.format(time));          // ok
    System.out.println("- - - - - - ");
  }
}
