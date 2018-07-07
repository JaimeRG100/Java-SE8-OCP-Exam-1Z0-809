import java.util.*;
import java.util.function.Function;

public class TestClass {
  
  public static void main(String[] args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 15);
    counts.put("Tom", null);
    
    Function<String, Integer> mapper = (k) -> 1;
    Integer jenny = counts.computeIfAbsent("Jenny", mapper);
    Integer sam = counts.computeIfAbsent("Sam", mapper);
    Integer tom = counts.computeIfAbsent("Tom", mapper);
    System.out.println(counts);  // {Tom=1, Jenny=15, Sam=1} 
    System.out.println(jenny);   // 15
    System.out.println(sam);     // 1
    System.out.println(tom);     // 1
  }
}

