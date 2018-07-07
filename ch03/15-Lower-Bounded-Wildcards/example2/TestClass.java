import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    List<Object> objects = new ArrayList<>();
    
    addSound_Unbounded(strings);
    addSound_Unbounded(objects);
    
    addSound_UpperBound(strings);
    addSound_UpperBound(objects);
    
    //addSound_Fixed(strings);         // Generics must pass the exact match
    addSound_Fixed(objects); 
    
    addSound_LowerBound(strings);
    addSound_LowerBound(objects);
    
    System.out.println(strings);
    System.out.println(objects);
    
  }
  
  public static void addSound_Unbounded(List<?> list) {
    //list.add("quack");   // Immutable list
  }
  
  public static void addSound_UpperBound(List<? extends Object> list) {
    //list.add("quack");   // Immutable list
  }
  
  public static void addSound_Fixed(List<Object> list) {
    list.add("quack");
  }
  
  public static void addSound_LowerBound(List<? super String> list) {
    list.add("quack");
  }
}