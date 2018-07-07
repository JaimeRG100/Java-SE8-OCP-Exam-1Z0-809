// Importing OLD WAY ( Java 7 & earlier)
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
// Importing NEW WAY ( Java 8 & later)
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class TestClass {

  public static void main(String[] args) {
    
    // Creating Dates - OLD WAY ( Java 7 & earlier)
    Date jan1 = new Date(2015, Calendar.JANUARY, 1);  // new Date(2015, 0, 1);
    System.out.println(jan1);                         // Compiler Warning: Date has been deprecated
    
    // Creating Dates - NEW WAY ( Java 8 & later)
    LocalDate jan2 = LocalDate.of(2015, Month.JANUARY, 1);
    System.out.println(jan2);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    
    // Creating an object with the current date - OLD WAY ( Java 7 & earlier)
    Date d1 = new Date();
    System.out.println(d1);
    
    // Creating an object with the current date - NEW WAY ( Java 8 & later)
    LocalDate d2 = LocalDate.now();
    System.out.println(d2);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    
    // Creating an object with the current date and time - OLD WAY ( Java 7 & earlier)
    Date dt1 = new Date();
    System.out.println(dt1);
    
    // Creating an object with the current date and time - NEW WAY ( Java 8 & later)
    LocalDateTime dt2 = LocalDateTime.now();
    System.out.println(dt2);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    
    // Creating an object representing January 1, 2015 - OLD WAY ( Java 7 & earlier)
    Calendar c1 = Calendar.getInstance();
    c1.set(2015, Calendar.JANUARY, 1);
    Date jan3 = c1.getTime();
    System.out.println(jan3);
    // or
    Calendar c2 = new GregorianCalendar(2015, Calendar.JANUARY, 1);
    Date jan4 = c2.getTime();
    System.out.println(jan4);
    
    // Creating an object representing January 1, 2015 - NEW WAY ( Java 8 & later)
    LocalDate jan5 = LocalDate.of(2015, Month.JANUARY, 1);
    System.out.println(jan5);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    
    // Creating January 1, 2015 without the constant - OLD WAY ( Java 7 & earlier)
    Calendar c3 = Calendar.getInstance();
    c3.set(2015, 0, 1);
    Date jan6 = c3.getTime();
    System.out.println(jan6);
    
    // Creating January 1, 2015 without the constant - NEW WAY ( Java 8 & later)
    LocalDate jan7 = LocalDate.of(2015, 1, 1);
    System.out.println(jan7);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - ");
  }
}
