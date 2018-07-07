import java.util.*;

public class TestClass {
  
  public static void printList(List<Object> list) {
    for(Object x: list) System.out.println(x);
  }
  
  public static void main(String[] args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    //printList(keywords);      // Does not compile
                                // Java is trying to protect us from ourselves
    
    
    // Imagine if we could write code like this   
    List<Integer> numbers = new ArrayList<>();
    numbers.add(new Integer(42));
    //List<Object> objects = numbers;   // Does not compile
    //objects.add("forty two");
    //System.out.println(numbers.get(1));
    
    
    //test code
    List<Object> objects = new ArrayList<>();
    objects.add("one");
    objects.add("two");
    System.out.println(objects.get(1));
    objects.add(4);
    System.out.println(objects.get(2));
    objects.add(new TestClass());
    System.out.println(objects.get(3));
  }
  
}