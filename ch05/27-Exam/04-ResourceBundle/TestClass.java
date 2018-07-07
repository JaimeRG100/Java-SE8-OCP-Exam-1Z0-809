import java.util.ResourceBundle;
import java.util.Locale;

public class TestClass {
  
  public static void main(String[] args) {
    Locale.setDefault(new Locale("en", "US"));
    ResourceBundle b = ResourceBundle.getBundle("Dolphins");
    System.out.println(b.getString("name"));
    
  }
}
