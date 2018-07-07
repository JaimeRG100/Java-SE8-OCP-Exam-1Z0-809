import java.time.LocalDate;
import java.time.Month;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
  }
}