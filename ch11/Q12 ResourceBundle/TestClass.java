import java.util.*;

public class TestClass {
  
  public static void main(String args[]) {
    Locale fr = new Locale("fr");
    //Locale fr = new Locale("fr","CA");
    ResourceBundle rb = ResourceBundle.getBundle("Dolphins", fr);
    System.out.println(rb.getString("name"));
    System.out.println(rb.getString("age"));
  }
}