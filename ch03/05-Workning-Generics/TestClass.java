import java.util.*;

public class TestClass {
  
  // Legacy Code  
  static void printNames(List list) {             // No diamond operator <>
    for(int i = 0; i < list.size(); i++) {
      String name = (String) list.get(i);         // ClassCastException with String Builder
      System.out.println(name);
    }
  }
  
  public static void main (String args[]) {
    List names = new ArrayList();
    names.add(new StringBuilder("Fluffy").toString());  // String Object
    names.add(new StringBuilder("Webby"));
    printNames(names);
    
    List<String> names2 = new ArrayList<String>();
    //names2.add(new StringBuilder("Webby"));           // Compiler Error 
    
    
  }
  
}