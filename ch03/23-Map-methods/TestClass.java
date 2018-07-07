import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("koala", "bamboo");
    map.put("lion", "meat");
    map.put("giraffe", "leaf");
    String food = map.get("koala");      // bamboo
    for(String key: map.keySet())
      System.out.print(key + ", ");      // koala, giraffe, lion,
    System.out.println("\n- - - - - ");
    
    // test code
    for(String key: map.keySet())
      System.out.println("[" + key + "] " + map.get(key) + ",");
    System.out.println("- - - - - ");
    
    for(String values: map.values())
      System.out.println(values + ",");
    System.out.println("- - - - - ");
    
  }
}
