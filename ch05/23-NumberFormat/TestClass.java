import java.text.NumberFormat;
import java.util.Locale;

public class TestClass {
  
  public static void main(String[] args) {
    
    { // Printing the same number in three different locales
      int attendeesPerYear = 3_200_000;
      int attendeesPerMonth = attendeesPerYear / 12;
      NumberFormat us = NumberFormat.getInstance(Locale.US);
      System.out.println(us.format(attendeesPerMonth));
      NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
      System.out.println(g.format(attendeesPerMonth));
      NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
      System.out.println(ca.format(attendeesPerMonth));
      System.out.println("- - - - - - - - ");
    }
    
    { // Printing large number
      double price = 48;
      NumberFormat us = NumberFormat.getCurrencyInstance();
      System.out.println(us.format(price));
      System.out.println("- - - - - - - - ");
    }
    
    { // Parsing a String Number
      NumberFormat en = NumberFormat.getInstance(Locale.US);
      NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
      String s = "40.45";
      try {
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));  // France doesn't use a decimal point to separate numbers
      }
      catch (Exception e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - - - ");
    }
    
    { // Parsing a String Currency
      String amt = "$92,807.99";
      NumberFormat cf = NumberFormat.getCurrencyInstance();
      try {
        double value = (Double) cf.parse(amt);
        System.out.println(value);
      }
      catch(Exception e) {
        System.out.println(e);
      }
      System.out.println("- - - - - - - - ");
    }
  }
}
