import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.Locale;
import java.time.LocalDateTime;


public class Zoo_en extends ListResourceBundle{
  
  protected Object[][] getContents() {
    return new Object[][] {
      {"hello", "Hello"},
      {"open", "The zoo is open"},
      {"pi", 3.1416},
      {"now", LocalDateTime.now()}
    };
  }
  
  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));
    double pi = (Double) rb.getObject("pi");
    System.out.println("pi value: " + pi + " and we can operate it (pi + 1.1): " + (pi + 1.1));
    LocalDateTime now = (LocalDateTime) rb.getObject("now");
    System.out.println("LocalDateTime through Bundle: " + now);
  }
}
