import java.text.NumberFormat;
import java.util.Locale;

public class TestClass {
  
  public static void main(String[] args) {
    
    {  // Practice 1
      int attendeesPerYear = 3_200_00;
      int attendeesPerMonth = attendeesPerYear / 12;
      NumberFormat us = NumberFormat.getInstance(Locale.US);
      System.out.println(us.format(attendeesPerMonth));
      NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
      System.out.println(g.format(attendeesPerMonth));
      NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
      System.out.println(ca.format(attendeesPerMonth));
      System.out.println("- - - - - - - ");
    }
    
    {  // Practice 2
      NumberFormat en = NumberFormat.getInstance(Locale.US);
      NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
      
      String s = "40.45";
      try {
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));
      }
      catch (Exception e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - - ");
    }
    
    {  // Practice 3
      NumberFormat nf = NumberFormat.getInstance();
      String one = "456abc";
      String two = "-2.5165x10";
      String three = "x85.3";
      try {
        System.out.println(nf.parse(one));
        System.out.println(nf.parse(two));
        System.out.println(nf.parse(three));
      }
      catch(Exception e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - - ");
    }
    
    {  // Practice 4
      String amt = "$92,807.99";
      NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
      try{
        double value = (Double) cf.parse(amt);
      }
      catch(Exception e) {
        System.out.println(e);
      }
    }
    
    
  }
}
