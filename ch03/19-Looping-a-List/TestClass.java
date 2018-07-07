import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    
    for(String string: list) {
      System.out.println(string);
    }
    System.out.println("- - - - -");
    
    
    Iterator iter = list.iterator();
    while(iter.hasNext()) {
      String string = (String) iter.next();
      System.out.println(string);
    }
    System.out.println("- - - - -");
    
    
    Iterator<String> iter2 = list.iterator();
    while(iter2.hasNext()) {
      String string = iter2.next();
      System.out.println(string);
    }
    System.out.println("- - - - -");

  }
}
