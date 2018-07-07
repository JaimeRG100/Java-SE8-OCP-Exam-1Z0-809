import java.util.*;

public class TestClass {
   
  public static void main(String[] args) {
    
    //ArrayList<Number> list = new ArrayList<Integer>();   // Does Not Compile
    
    // Instead, we need to use a wildcard
    List<? extends Number> list = new ArrayList<Integer>();   
    
    // test code
    Number n = new Integer(3);
    
    ArrayList<Number> myList = new ArrayList<>();
    myList.add(new Integer(3));
    myList.add(new Long(323));
    myList.add(new Double(39.23));
    System.out.println(myList);
    
    System.out.println(total(myList));
  }
  
  public static double total(List<? extends Number> list) {
    double count = 0;
    for(Number number: list) 
      count += number.doubleValue();
    return count;
  }
  
}