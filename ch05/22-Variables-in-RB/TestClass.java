import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class TestClass {
  
  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    Locale.setDefault(us);
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
    String format = rb.getString("helloByName");
    String formatted = MessageFormat.format(format, "Tammy");
    System.out.println(formatted);
  }
}
