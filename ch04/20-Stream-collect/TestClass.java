import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayDeque;


public class TestClass {

  public static void main(String[] args) {
    // example 1
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
      System.out.println(word);  // wolf
    }
    
    // example 2
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
      System.out.println(set); // [f, l, o, w]
    }
    
    // example 3
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
      System.out.println(set); // [f, l, o, w]
    }
    
    // example 4
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      Set<String> set = stream.collect(Collectors.toSet());   // to set() makes no guarantees to which implementarion of Set you'll get
      System.out.println(set);  // [f, w, l, o] 
      System.out.println(set instanceof HashSet);  // true
    }
    
    // test code 1
    {
      Stream<String> stream = Stream.of("a", "e", "d", "c", "c");
      TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
      System.out.println(set);  // [a, c, d, e] 
    }
  }  
}
