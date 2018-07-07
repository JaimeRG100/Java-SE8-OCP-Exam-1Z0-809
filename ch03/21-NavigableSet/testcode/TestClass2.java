import java.util.*;

public class TestClass2 {
  
  public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<>();
    for(int i=1; i<=20; i++) 
      set.add(i);
    
    System.out.println(set.lower(8)); // 7
    System.out.println(set.floor(8)); // 8
    System.out.println(set.ceiling(19)); // 19
    System.out.println(set.higher(19)); // 20

    
  }
}
