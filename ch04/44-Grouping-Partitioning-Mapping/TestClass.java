import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    // Grouping --------------------------------------------------------------------------
    // get groups of names by their length (grouped in a List by default)
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
      System.out.println(map);  // {5=[lions, bears], 6=[tigers]} 
    }
    
    // get groups of names by their length (grouped in a Set instead of List)
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
      System.out.println(map);  // {5=[lions, bears], 6=[tigers]} 
    }
    
    // get groups of names by their length (grouped in a Set, and specify the Map type)
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
      System.out.println(map);  // {5=[lions, bears], 6=[togers]} 
    }
    
    // What if we want to change the type of Map returned but leave the type of values alone as a List? 
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      TreeMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
      System.out.println(map);  // {5=[lions, bears], 6=[tigers]} 
    }
    
    // Partitioning (only two groups: true | false) ------------------------------------------------
    // Split a list of animals names, one with names <= 5, an the other for the rest    
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <=5));
      System.out.println(map);  // {false=[tigers], true=[lions, bears]} 
    }
    
    // Split a list of animals names, now with names <= 7, an the other for the rest    
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length()<=7));
      System.out.println(map);  // {false=[], true=[lions, tigers, bears]} 
    }
    
    // Split a list of animals names (true|false), but change the type of List to something else
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Boolean, Set<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
      System.out.println(map);  // {false=[tigers], true=[lions, bears]} 
    }
    
    // Grouping, Grouping ----------------------------------------------------------
    // Group by the lengh of the animal name to see how many of each length we have
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
      System.out.println(map);  // {5=2, 6=1}
    }
    
    // Collector(xxx,Collector) ----------------------------------------------------------
    
    // Get the first letter of the first animal alphabetically of each length
    
    /*Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map = ohMy.collect(Collectors.groupingBy(
       String::length, Collectors.mapping(s -> s.charAt(0),Collectors.minBy(Comparator.naturalOrder()))));
    // The minBy example used to compile with earlier versions of Java 8, but no longer does.
    */
    
    // collectors used with a static import to make the code shorter
    
    /* Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map = ohMy.collect(groupingBy(
      String::length, mapping(s -> s.charAt(0), minBy(Comparator.naturalOrder()))));
    System.out.println(map); // {5=Optional[b], 6=Optional[t]} 
    // The minBy example used to compile with earlier versions of Java 8, but no longer does.
    */
    
    
    
    
    
  }
}