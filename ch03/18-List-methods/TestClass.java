import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("SD");      // [SD]
    list.add(0,"NY");    // [NY, SD]
    list.set(1,"FL");    // [SD, FL]
    list.remove("NY");   // [SD]
    list.remove(0);      // []
    
    list.add("OH");                 // [OH]
    list.add("CO");                 // [OH, CO]
    list.add("NJ");                 // [OH, CO, NJ]
    String state = list.get(0);     // OH
    int index = list.indexOf("NJ"); // 2
    
    // test code
    System.out.println(list.indexOf("XY"));     // -1
    System.out.println(list.indexOf("NJ"));     // 2
    list.add("NJ");                             // [OH, CO, NJ, NJ]
    System.out.println(list.lastIndexOf("NJ")); // 3
    
    List<Integer> myList = new ArrayList<>();
    myList.add(5);
    myList.add(4);
    myList.add(3);
    myList.add(2);
    myList.add(1);
    System.out.println(myList);    // [5, 4, 3, 2, 1] 
    myList.remove(1);
    System.out.println(myList);    // [5, 3, 2, 1] 
    myList.remove(new Integer(1));
    System.out.println(myList);    // [5, 3, 2] 

  }
}
