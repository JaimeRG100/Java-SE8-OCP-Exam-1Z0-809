import java.util.*;
import java.util.function.Function;

public class TestClass {
  
  public static void main(String[] args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);
    
    counts.computeIfPresent("Jenny", (k,v) -> null);   // if computeIfPresent() returns null, the key is remove
    counts.computeIfAbsent("Sam", k -> null);          // if computeIfAbsent() returns null, the key is not added
    System.out.println(counts);   // {} 
  }
}

