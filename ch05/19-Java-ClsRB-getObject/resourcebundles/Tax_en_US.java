package resourcebundles;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.Locale;

public class Tax_en_US extends ListResourceBundle {
  protected Object[][] getContents() {
    return new Object[][] {
      {"tax", new UsTaxCode() }
    };
  }
  
  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle("resourcebundles.Tax", Locale.US);
    // System.out.println(rb.getString("tax"));   // lassCastException: UsTaxCode cannot be cast to String
    System.out.println(rb.getObject("tax"));
  } 
}

class UsTaxCode {
  public String toString() { return "UsTaxCode Object"; }
}