import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class TestClass {
  
  public static void main(String[] args) {
    // Collectors.joining(
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      String result = ohMy.collect(Collectors.joining(", "));
      System.out.println(result);
    }
    
    // Collectors.averageInt()
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      Double result = ohMy.collect(Collectors.averagingInt(String::length));
      System.out.println(result); // 5.333333333333333 
    }
    
    // Collectors.toCollection()
    {
      Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
      TreeSet<String> result = ohMy.filter(s -> s.startsWith("t"))
        .collect(Collectors.toCollection(TreeSet::new));
      System.out.println(result);  //  [tigers] 
    }
  }
}
