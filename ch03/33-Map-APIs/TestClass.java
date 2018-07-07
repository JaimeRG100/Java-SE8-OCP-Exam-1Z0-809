import java.util.Map;
import java.util.HashMap;

public class TestClass {
  
  public static void main(String[] args) {
    {
      Map<String, String> favorites = new HashMap<>();
      favorites.put("Jenny", "Bus Tour");
      favorites.put("Jenny", "Tram");
      System.out.println(favorites);           // {Jenny=Tram}
      System.out.println("- - - - - ");
    }
    
    {
      Map<String, String> favorites = new HashMap<>();
      favorites.put("Jenny", "Bus Tour");      // {Jenny=BusTour}
      favorites.put("Tom", null);              // {Jenny=BusTour, Tom=null}
      favorites.putIfAbsent("Jenny", "Tram");  // {Jenny=BusTour, Tom=null}
      favorites.putIfAbsent("Sam", "Tram");    // {Jenny=BusTour, Tom=null, Sam=Tram}
      favorites.putIfAbsent("Tom", "Tram");    // {Jenny=BusTour, Tom=Tram, Sam=Tram}
      System.out.println(favorites);           // {Tom=Tram, Jenny=Bus Tour, Sam=Tram} 
    }
  }
}