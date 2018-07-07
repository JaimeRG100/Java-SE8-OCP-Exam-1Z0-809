import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    
    List<? super String> list1 = new ArrayList<String>();
    List<? super String> list2 = new ArrayList<Object>();
    
    List<String> strings = new ArrayList<String>();
    List<Objects> objects = new ArrayList<>();
    
    list2.add("hello");
    //list2.add(new Object());
  }  
}

