import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestList {

  public static void main(String[] args) {    
    String[] array = {"one","two"};
    List<String> list = Arrays.asList(array);
    array[1] = "three";
    System.out.println(list);
    //list.add("ok");   // Runtime Exception: UnsupportedOperationException  // asList() make the list not resizable
    
    
    // List<String> list1 = Arrays.asList("one", "two");                // ok
    // List<String> list2 = Arrays.asList(new String[]{"111","222"});   // ok
  }
}