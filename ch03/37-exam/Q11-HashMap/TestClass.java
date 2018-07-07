import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    // HashMap();  Constructs an empty HashMap with the default initial capacity (16)
    Map<Integer, Integer> map = new HashMap<>(10);  // empty HashMap with initial capacity (10)
    for (int i=1; i<=10; i++) {
      map.put(i, i*i);
    }
    System.out.println(map.get(4));
  }
}