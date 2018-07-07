import java.util.Locale;
import java.util.ResourceBundle;

public class ZooOpen {

  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    Locale france = new Locale("fr", "FR");
    printProperties(france);
    System.out.println();
    printProperties(us);
    
    // test code
    Locale englishCanada = new Locale("en", "CA");
    Locale frenchCanada = new Locale("fr", "CA");
    System.out.println();
    printProperties(frenchCanada);
    System.out.println();
    printProperties(englishCanada);
  }
  
  private static void printProperties(Locale locale) {
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));
  }
}
