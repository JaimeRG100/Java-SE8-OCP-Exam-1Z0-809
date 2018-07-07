import java.util.*;
import java.util.concurrent.*;

// memory consistency error: when two threads have inconsistent views of what should be the same data
public class TestClass {
  
  public static void main(String[] args) {
    { // USING non-concurrent HashMap
      Map<String, Object> foodData = new HashMap<String, Object>();
      foodData.put("penguin", 1);
      foodData.put("flamingo", 2);
      System.out.println("Before: " + foodData);
      try {
        for(String key: foodData.keySet())
          foodData.remove(key);  // throws ConcurrentModificationException
      } catch (ConcurrentModificationException e) {
        System.out.println(e);
      }
      System.out.println("After: " + foodData);
      System.out.println("- - - - - - - - - - - - ");
    }
    
    { // USING ConcurrentHashMap
      Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
      foodData.put("penguin", 1);
      foodData.put("flamingo", 2);
      System.out.println("Before: " + foodData);
      for(String key: foodData.keySet())
        foodData.remove(key);
      System.out.println("After: " + foodData);
      System.out.println("- - - - - - - - - - - - ");
    }

  }
}