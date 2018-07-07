import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestClass {

  public static void main(String[] args) {
    
    // Get the first two names alphabetically.- in Java 7
    {
      List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
      List<String> filtered = new ArrayList<>();
      for (String name: list) {
        if(name.length() == 4)
          filtered.add(name);
      }
      Collections.sort(filtered);
      Iterator<String> iter = filtered.iterator();
      if (iter.hasNext()) System.out.println(iter.next());
      if (iter.hasNext()) System.out.println(iter.next());
    }
    
    // Get the first two names alphabetically.- in Java 8 
    {
      System.out.println("- - - - -");
      List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
      list.stream().filter(n -> n.length() == 4).sorted()
        .limit(2).forEach(System.out::println);
      
      // more easy to read:
      System.out.println("- - - - -");
      list.stream().filter(n -> n.length() == 4)
        .sorted()
        .limit(2)
        .forEach(System.out::println);
    }
    
    // Get the first two names alphabetically.- in Java 8
    {
      System.out.println("- - - - -");
    }

  }
}
