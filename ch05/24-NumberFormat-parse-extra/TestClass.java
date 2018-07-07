import java.text.NumberFormat;

public class TestClass {
  
  public static void main(String[] args) {
    NumberFormat nf = NumberFormat.getInstance();
    String one = "456abc";        // 456
    String two = "-2.5165x10";    // -2.5165 
    String three = "x85.3";       // throws ParseException
    try {
      System.out.println(nf.parse(one));
      System.out.println(nf.parse(two));
      System.out.println(nf.parse(three));
    } 
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
