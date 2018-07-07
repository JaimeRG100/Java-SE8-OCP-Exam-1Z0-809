import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    List<Object> objects = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();
    
    strings.add("one");
    strings.add("two");
    objects.add(new Object());
    objects.add(new Object());
    integers.add(123);
    integers.add(456);
    
    add1(strings);
    //add1(objects);  //Error: incompatible types
    //add1(integers);  //Error: incompatible types
    
    add2(strings);
    add2(objects);
    add2(integers);
    
    add3(strings);
    add3(objects);
    add3(integers);
    
    add4(strings);
    add4(objects);
    //add4(integers);
    
  }
  
  public static void add1(List<String> list) { 
    list.add("quack");
  }
  
  public static void add2(List<?> list) {  // immutable list
    //list.add("quack");
  }
  
  public static void add3(List<? extends Object> list) {  // immutable list
    //list.add("quack");
  }
  
  public static void add4(List<? super String> list) { 
    list.add("quack");
  }
  
}