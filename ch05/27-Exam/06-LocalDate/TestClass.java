import java.time.LocalDate;
import java.time.Month;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(LocalDate.of(2014, 6, 21));
    System.out.println(LocalDate.of(2014, Month.JUNE, 21));
  }
}