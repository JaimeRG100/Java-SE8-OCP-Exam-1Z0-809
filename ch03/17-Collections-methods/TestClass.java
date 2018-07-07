import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class TestClass {
  
  public static void main(String[] args) {
    
    { // add() --------------------------------------- 
      List<String> list = new ArrayList<>();
      System.out.println(list.add("Sparrow")); // true
      System.out.println(list.add("Sparrow")); // true
      
      Set<String> set = new HashSet<>();
      System.out.println(set.add("Sparrow"));  // true
      System.out.println(set.add("Sparrow"));  // false   (a Set doesn't allow duplicates)
      System.out.println("- - - - -");
    }
    
    { // remove() ------------------------------------
      List<String> birds = new ArrayList<>();
      birds.add("hawk");
      birds.add("hawk");
      System.out.println(birds.remove("cardinal"));  // false
      System.out.println(birds.remove("hawk"));      // true
      System.out.println(birds);                     // [hawk]
      System.out.println("- - - - -");
    }
    
    { // isEmpty()  size() --------------------------- 
      List<String> birds = new ArrayList<>();
      System.out.println(birds.isEmpty());    // true
      System.out.println(birds.size());       // 0
      birds.add("hawk");                      // [hawk]
      birds.add("hawk");                      // [hawk, hawk]
      System.out.println(birds.isEmpty());    // false
      System.out.println(birds.size());       // 2
      System.out.println("- - - - -");
    }
    
    { // clear() ------------------------------------
      List<String> birds = new ArrayList<>();
      birds.add("hawk");                      // [hawk]
      birds.add("hawk");                      // [hawk, hawk]
      System.out.println(birds.isEmpty());    // false
      System.out.println(birds.size());       // 2
      birds.clear();                          // []
      System.out.println(birds.isEmpty());    // true
      System.out.println(birds.size());       // 0
      System.out.println("- - - - -");
    }
    
    { // contains() ----------------------------------
      List<String> birds = new ArrayList<>();
      birds.add("hawk");                           // [hawk]
      System.out.println(birds.contains("hawk"));  // true
      System.out.println(birds.contains("robin")); // false
      System.out.println("- - - - -");
      
    }
  }
}
