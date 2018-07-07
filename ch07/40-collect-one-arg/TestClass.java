import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {  // Recall that the one-argument version of collect()takes a collector argument
      Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
      Set<String> set = stream.collect(Collectors.toSet());  // [f, w, l, o] 
      System.out.println(set);
    }
    
    { System.out.println("toSet(): " + Collectors.toSet().characteristics()); }
    
    { // collect animals in a Map<k, String> class grouped by their name size
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
      ConcurrentMap<Integer, String> map = ohMy
      .collect(Collectors.toConcurrentMap(String::length, k -> k,
                                          (s1, s2) -> s1 + "," + s2));
      System.out.println(map);            // {5=bears,lions, 6=tigers} 
      System.out.println(map.getClass()); // ConcurrentHashMap 
    }
    
    { // collect animals in a Map<k, List<String>> class grouped by their name size
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
      ConcurrentMap<Integer, List<String>> map = ohMy.collect(
             Collectors.groupingByConcurrent(String::length));
      System.out.println(map);  // {5=[bears, lions], 6=[tigers]} 
    }
  }
}