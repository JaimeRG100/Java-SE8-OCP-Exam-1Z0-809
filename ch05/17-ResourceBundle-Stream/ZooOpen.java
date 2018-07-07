import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Properties;

public class ZooOpen {

  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
    Set<String> keys = rb.keySet();
    keys.stream().map(k -> k + " " + rb.getString(k))
      .forEach(System.out::println);
    System.out.println("- - - - - - ");
    
    Properties props = new Properties();
    rb.keySet().stream()
      .forEach(k -> props.put(k, rb.getString(k)));
    System.out.println(props.getProperty("notReallyAProperty"));          // null
    System.out.println(props.getProperty("notReallyAProperty", "123"));   // 123
    System.out.println(props.getProperty("hello","default"));
  }
  
}
