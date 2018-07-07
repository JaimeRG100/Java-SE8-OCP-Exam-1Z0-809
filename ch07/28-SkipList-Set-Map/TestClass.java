import java.util.*; 
import java.util.concurrent.*; 

public class TestClass {
  
  public static void main(String[] args) {
    Set<Integer> set = new ConcurrentSkipListSet<>();
    set.add(34);
    set.add(23);
    System.out.println(set);
    
    Map<String, Integer> map = new ConcurrentSkipListMap<>();
    map.put("b", 1);
    map.put("a", 2);
    System.out.println(map);
  }
}