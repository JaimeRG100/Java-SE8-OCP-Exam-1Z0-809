import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;
import java.util.TreeMap;

public class TestClass {
  
  public static void main(String[] args) {
    // Create a map from a Stream
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
      System.out.println(map);   // {lions=5, bears=5, tigers=6} 
      ohMy = Stream.of("lions", "tigers", "bears");
      map = ohMy.collect(Collectors.toMap(Function.identity(), String::length));
      System.out.println(map);   // {lions=5, bears=5, tigers=6} 
    }
    
    // First incorrect attempt to do the reverse: map the length of the animal name, to the name itself
    {
      System.out.println("- - - - - ");
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      try {
        Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, k -> k));  // BAD, throws runtime IllegalStateException: 
                                                                                            // Duplicate key (two animals are the same length)
      }
      catch(Exception e) {
        System.out.println(e);
      }
    }
    
    // Second attemp, create a comma-separated String wit the animal names
    {
      System.out.println("- - - - - ");
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Integer, String> map = ohMy.collect(Collectors.toMap(
        String::length, k -> k, (s1, s2) -> s1 + "," + s2));
      System.out.println(map);            // {5=lions,bears, 6=tigers} 
      System.out.println(map.getClass()); // class java.util.HashMap 
    }
    
    // Second attemp improved, specify the returned Map type
    {
      System.out.println("- - - - - ");
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
         String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));      
    }
    
  }
}
