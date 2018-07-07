import java.util.ResourceBundle;
import java.util.Locale;

public class TestClass {
  public static void main(String[] args) {
    Locale fr = new Locale("fr");
    Locale.setDefault(new Locale("en", "US"));
    ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
    System.out.println(b.getString("name"));
    System.out.println(b.getString("age"));
  }
}