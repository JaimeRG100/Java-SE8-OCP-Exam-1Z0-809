import java.util.ResourceBundle;
import java.util.Locale;

public class TestClass {
  
  public static void main(String[] args) {
    
    Locale us = new Locale("en","US");
    ResourceBundle rb1 = ResourceBundle.getBundle("Zoo");
    ResourceBundle rb2 = ResourceBundle.getBundle("Zoo", us);
    System.out.println(Locale.getDefault());
    System.out.println(rb1.getString("hello"));
    System.out.println("- - - - ");

    Locale.setDefault(new Locale("en", "US"));    
    rb1 = ResourceBundle.getBundle("Zoo");
    System.out.println(Locale.getDefault());
    System.out.println(rb1.getString("hello"));
  }
}
