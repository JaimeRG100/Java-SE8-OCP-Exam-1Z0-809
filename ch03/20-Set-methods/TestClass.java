import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    
    { // HashSet<> -------------------------
      Set<Integer> set = new HashSet<>();
      boolean b1 = set.add(66);     // true
      boolean b2 = set.add(10);     // true
      boolean b3 = set.add(66);     // false
      boolean b4 = set.add(8);      // true
      System.out.println(set);      // [66, 8, 10]
    }
    
    { // TreeSet<> -------------------------
      Set<Integer> set = new TreeSet<>();
      boolean b1 = set.add(66);     // true
      boolean b2 = set.add(10);     // true
      boolean b3 = set.add(66);     // false
      boolean b4 = set.add(8);      // true
      System.out.println(set);      // [8, 10, 66] 
    }
    
  }
}
