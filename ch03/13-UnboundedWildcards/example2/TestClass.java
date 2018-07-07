import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    
    //List<Object> l = new ArrayList<String>();    // Does not compile
    // Java is trying to protect us from a runtime exception
    
    // In arrays is allowed what in ArrayList is not allowed, but it give us Runtime Exceptions
    Integer[] numbers = { new Integer(42)};
    Object[] objects = numbers;
    objects[0] = new Integer(23);
    //objects[0] = "forty two";      // throws ArrayStoreException
    

    // test code
    List<Object> obj = new ArrayList<>();
    obj.add(new Integer(42));
    obj.add(new String("hello"));
    System.out.println(obj);
    obj.set(0,23);
    obj.set(0,"forty two");
    System.out.println(obj);
    
  }
  
}