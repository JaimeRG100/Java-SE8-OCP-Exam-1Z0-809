import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.Month;

public class TestClass {
  
  public static void main(String[] args) {
    
    { // date and time classes support many methods to get data out of them
      LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 20);
      System.out.println(date.getDayOfWeek());
      System.out.println(date.getMonth());
      System.out.println(date.getYear());
      System.out.println(date.getDayOfYear());
      System.out.println(date.getDayOfMonth());
      System.out.println(date.getMonthValue());
      // we could use this information to display information about date
      System.out.println("- - - - - - -");
    }
    
    
    { // Java provides a DateTimeFormatter to format dates
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(11, 12, 34);
      LocalDateTime dateTime = LocalDateTime.of(date, time);
      System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
      System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
      System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
      System.out.println("- - - - - - -");
      
    
      // There are some predefined formats that are more useful
      DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
      System.out.println(shortDateTime.format(dateTime));
      System.out.println(shortDateTime.format(date));
      // System.out.println(shortDateTime.format(time));  // throws UnsupportedTemporalTypeException
      System.out.println("- - - - - - -");
      
      // The following code print exactly the same thing as the previous code
      DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
      System.out.println(dateTime.format(shortDateTime2));
      System.out.println(date.format(shortDateTime2));
      //System.out.println(time.format(shortDateTime2));  // throws UnsupportedTemporalTypeException
      System.out.println("- - - - - - -");
    }
    
    
    { // There are two predefined formats that can show up on the exam
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(11, 12, 34);
      LocalDateTime dateTime = LocalDateTime.of(date, time);
      DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
      DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
      System.out.println(shortF.format(dateTime));
      System.out.println(mediumF.format(dateTime));
      System.out.println("- - - - - - -");    
      
    
    // which of these lines will throw an exception?
      DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
      System.out.println(f.format(dateTime));
      //System.out.println(f.format(date));     // throws Exception
      System.out.println(f.format(time));
      System.out.println("- - - - - - -");
    }
    
    { // the parse() method takes a formatter as optional parameter
      DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
      LocalDate date = LocalDate.parse("01 02 2015", f);
      LocalTime time = LocalTime.parse("11:22");
      System.out.println(date);
      System.out.println(time);
      System.out.println("- - - - - - -");      
    }
    
    
  }
}
