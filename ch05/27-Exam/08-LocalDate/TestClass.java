import java.time.LocalDate;
import java.time.Month;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);   // Runtime Exception  (DateTimeException)
    System.out.println(date.getYear() + " " + date.getMonth()
      + " " + date.getDayOfMonth());
  }
}