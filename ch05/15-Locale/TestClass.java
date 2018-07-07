import java.util.Locale;

public class TestClass {

  public static void main(String[] args) {
    
    Locale locale = Locale.getDefault();
    System.out.println(locale);
    System.out.println("- - - - - -");
    
    System.out.println(Locale.GERMAN);
    System.out.println(Locale.GERMANY);
    System.out.println("- - - - - -");
    
    System.out.println(new Locale("fr"));
    System.out.println(new Locale("hi", "IN"));
    System.out.println("- - - - - -");
    
    Locale locale1 = new Locale.Builder()
      .setLanguage("en")
      .setRegion("US")
      .build();
    Locale locale2 = new Locale.Builder()
      .setRegion("US")
      .setLanguage("en")
      .build();
    System.out.println(locale1);
    System.out.println(locale2);
    System.out.println("- - - - - -");
    
  }
}
