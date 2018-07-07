import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    Set<Number> numbers = new HashSet<>();
    numbers.add(new Integer(86));
    numbers.add(75);
    numbers.add(new Integer(86));
    numbers.add(null);
    numbers.add(309L);
    Iterator iter = numbers.iterator();
    while (iter.hasNext())
      System.out.print(iter.next());
  }
}