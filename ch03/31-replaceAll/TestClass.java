import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestClass {
  
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);
    list.replaceAll(x -> x * 2);
    System.out.println(list);     // [2, 4, 6] 
    
    // test code
    
    //list.add(3); // java.lang.UnsupportedOperationException  //immutable list    
    
    List<String> myList = new ArrayList<>(Arrays.asList("one", "two", "three"));
    myList.add("four");
    myList.replaceAll( s -> s + ".");
    myList.replaceAll( s -> s + s.concat("<"));
    System.out.println(myList);
    

  }
}