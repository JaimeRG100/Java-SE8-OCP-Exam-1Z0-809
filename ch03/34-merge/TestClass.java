import java.util.function.BiFunction; 
import java.util.Map;
import java.util.HashMap;

public class TestClass {
  
  public static void main(String[] args) {
    {  // example 1.- merge 
      BiFunction<String, String, String> mapper = 
        (v1, v2) -> v1.length() > v2.length() ? v1: v2;
    
      Map<String, String> favorites = new HashMap<>();
      favorites.put("Jenny", "Bus Tour");
      favorites.put("Tom", "Tram");
      
      String jenny = favorites.merge("Jenny", "Skyride", mapper);
      String tom = favorites.merge("Tom", "Skyride", mapper);
      
      System.out.println(favorites);  // {Tom=Skyride, Jenny=Bus Tour} 
      System.out.println(jenny);      // Bus Tour 
      System.out.println(tom);        // Skyride
      System.out.println("- - - -");
    }
    
    { // example 2.- merge() with null
      BiFunction<String, String, String> mapper = 
        (v1, v2) -> v1.length() > v2.length() ? v1: v2;
      
      Map<String, String> favorites = new HashMap<>();
      favorites.put("Sam", null);
      
      favorites.merge("Tom", "Skyride", mapper);
      favorites.merge("Sam", "Skyride", mapper);
      
      System.out.println(favorites);   // {Tom=Skyride, Sam=Skyride} 
      System.out.println("- - - -");
    }
    
    { // example 3.- merge() returning null
      BiFunction<String, String, String> mapper = (v1, v2) -> null;
      
      Map<String, String> favorites = new HashMap<>();
      favorites.put("Jenny", "Bus Tour");
      favorites.put("Tom", "Bus Tour");
      
      favorites.merge("Jenny", "Skyride", mapper);
      favorites.merge("Sam", "Skyride", mapper);
      System.out.println(favorites);
      System.out.println("- - - -");      
    }
  }
}

