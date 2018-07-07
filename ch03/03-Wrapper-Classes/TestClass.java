import java.util.*;

public class TestClass {
  public static void main (String args[]) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(new Integer(3));
    numbers.add(new Integer(5));
    System.out.println(numbers);
    numbers.remove(1);               // remove index 1
    numbers.remove(new Integer(5));  // remove object Integer(5)
    System.out.println(numbers);    
    
  }
  
}