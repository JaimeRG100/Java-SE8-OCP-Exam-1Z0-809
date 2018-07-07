import java.util.Locale;
import java.util.ResourceBundle;

public class Zoo {
  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));
  }
}