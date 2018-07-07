import java.util.*;

public class TestClass {
  public static void main (String args[]) {
    List<String> list = new ArrayList<>();    // [] 
    list.add("Fluffy");                       // [Fluffy] 
    list.add("Webby");                        // [Fluffy, Webby] 
    System.out.println(list);
    System.out.println("- - - - - ");
    
    
    String[] array = new String[list.size()];
    array[0] = list.get(1);                   // [Webby]
    array[1] = list.get(0);                   // [Webby, Fluffy]
    for(int i=0; i < array.length; i++) {
      System.out.print(array[i] + ",");
    }
    System.out.println("\n- - - - - ");

    
    String[] array2 = {"gerbil", "mouse"};       // [gerbil, mouse]
    List<String> list2 = Arrays.asList(array);   // [gerbil, mouse]  // fixed size list
    list2.set(1, "test");                        // [gerbil, test]
    array2[0] = "new";                           // [new, test]
    String[] array3 = (String[]) list2.toArray();// [new, test]
    //list2.remove(1);                           // java.lang.UnsupportedOperationException
    System.out.println(list2);
    System.out.println("- - - - - ");
    
    
    // test code
    
    String[] array4 = {"one", "two"};
    List<String> list4 = Arrays.asList(array4);
    array4[0] = "red";
    array4[1] = "blue";
    System.out.println(list4);                    // changes in array4 affect list4 values
    System.out.println("- - - - - ");
    
    
    List<String> list5 = new ArrayList<>();
    list5.add("dog");
    list5.add("cat");                               // Dynamic list CANNOT be converted to fixed array
    //String[] array5 = (String[]) list5.toArray(); // ClassCastException: cannot be cast to String
    System.out.println(list5);
    System.out.println("- - - - - ");
    
    
    List<String> list6 = new ArrayList<>();
    String[] array6 = new String[] {"black", "white"};
    list6 = new ArrayList<>(Arrays.asList(array6));     // this way, the list won't become fixed size
    list6.add("orange");
    System.out.println(list6);
    System.out.println("- - - - - ");
  }
}