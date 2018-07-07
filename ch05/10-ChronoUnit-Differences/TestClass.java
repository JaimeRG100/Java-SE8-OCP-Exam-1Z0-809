import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
import java.time.LocalDate;

public class TestClass {

  public static void main(String[] args) {
    LocalTime one = LocalTime.of(5, 15);
    LocalTime two = LocalTime.of(6, 30);
    LocalDate date = LocalDate.of(2016, 1, 20);
    
    System.out.println(ChronoUnit.HOURS.between(one, two));        // 1
    System.out.println(ChronoUnit.MINUTES.between(one, two));      // 75
    // System.out.println(ChronoUnit.MINUTES.between(one, date));  // throws DateTimeExceptio
    
    // test code
    System.out.println("- - - - - - ");
    System.out.println(ChronoUnit.HOURS.between(two, one));
    System.out.println(two.getHour() - one.getHour());
    System.out.println(one.getHour() - two.getHour());
  }
}
