import java.util.Locale;
import java.util.ResourceBundle;

public class ZooOpen {

  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    Locale fr = new Locale("fr", "FR");
    printProperties(us);
    printProperties(fr);
  }
  
  private static void printProperties(Locale locale) {
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));
  }
}
