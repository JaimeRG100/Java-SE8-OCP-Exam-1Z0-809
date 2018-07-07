import java.util.*;

public class TestClass2 {
  
  public static void main(String[] args) {
    Map<String, String> map = new TreeMap<>();
    map.put("koala", "bamboo");
    map.put("lion", "meat");
    map.put("giraffe", "leaf");
    String food = map.get("koala");  // bamboo
    for(String key: map.keySet())
      System.out.print(key + ", ");  // giraffe, koala, lion,
    System.out.println("\n");
   
    // System.out.println(map.contains("lion"));   // Doesn't compile  (contains() method doesn't exist on Map)
    System.out.println(map.containsKey("lion"));   // true
    System.out.println(map.containsValue("lion")); // false
    System.out.println(map.size());                // 3
    
    // test code
    map.put("elephant", "leaf");
    map.put("lion", "rabbit");   // this replace the value of the key "lion"
    System.out.println(map);
    System.out.println(map.containsValue("leaf")); // true
    map.remove("lion");
    System.out.println(map);
  }
}
