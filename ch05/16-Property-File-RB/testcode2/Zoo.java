import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;
import java.text.MessageFormat;

public class Zoo {
  
  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    Locale fr = new Locale("fr", "FR");
    Locale mx = new Locale("mx", "MX");
    
    printContent(us);
    printContent(fr);
    printContent(mx);
    System.out.println("- - - - - - ");
    
    Properties prop = new Properties();
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
    rb.keySet().stream().forEach(k -> prop.put(k, rb.getString(k)));
    System.out.println(prop);
    System.out.println(prop.getProperty("hello","[hello] not found"));
    System.out.println(prop.getProperty("open","[open] not found"));
    System.out.println(prop.getProperty("bye","[bye] not found"));
    System.out.println("- - - - - - ");
    
    ResourceBundle rb2 = ResourceBundle.getBundle("Zoo", us);
    String format = rb2.getString("helloByName");
    String formatted = MessageFormat.format(format, "Jimmy");
    System.out.println(formatted);
    
    rb2 = ResourceBundle.getBundle("Zoo", mx);
    format = rb2.getString("helloByName");
    formatted = MessageFormat.format(format, "Jaime");
    System.out.println(formatted);
    
    rb2 = ResourceBundle.getBundle("Zoo", fr);
    format = rb2.getString("helloByName");
    formatted = MessageFormat.format(format, "James");
    System.out.println(formatted);
    
  }
  
  private static void printContent(Locale locale) {
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));    
  }
}
