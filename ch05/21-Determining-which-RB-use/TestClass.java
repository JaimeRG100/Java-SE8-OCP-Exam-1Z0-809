import java.util.Locale;
import java.util.ResourceBundle;

public class TestClass {
  
  public static void main(String[] args) {
    Locale.setDefault(new Locale("fr", "CA"));
    Locale locale = new Locale("en", "CA");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.print(rb.getString("hello"));
    System.out.print(". ");
    System.out.print(rb.getString("name"));
    System.out.print(" ");
    System.out.print(rb.getString("open"));
    System.out.print(" ");
    System.out.print(rb.getString("visitor"));
  }
}
