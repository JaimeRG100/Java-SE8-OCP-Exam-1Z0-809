import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 

import java.util.Map;
import java.util.HashMap;


public class TestClass {
  
  public static void main(String[] args) {
    { // Synchronized Collection methods are used when you have an already created non-concurrent Collection 
      List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52)));
      synchronized(list) {
        for(int data: list)
          System.out.println(data + " ");
      }
      System.out.println("- - - - - - - - ");
    }
      
    { // Synchronized Collection methods throw an exception if they are modified within an iterator by a single thread.
      Map<String, Object> foodData = new HashMap<String, Object>();
      foodData.put("penguin", 1);
      foodData.put("flamingo", 2);
      Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
      for(String key: synchronizedFoodData.keySet())
        synchronizedFoodData.remove(key);   // throws ConcurrentModificationException
    }
  }
}