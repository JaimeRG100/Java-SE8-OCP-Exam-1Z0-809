import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<>();
    for(int i=1; i<=20; i++) 
      set.add(i);
    System.out.println(set.lower(10));     // 9
    System.out.println(set.floor(10));     // 10
    System.out.println(set.ceiling(20));   // 20
    System.out.println(set.higher(20));    // null
    
  }
}
