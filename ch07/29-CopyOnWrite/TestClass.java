import java.util.*; 
import java.util.concurrent.*; 

public class TestClass {
  
  public static void main(String[] args) {
    { // using non-concurrent collection
      List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 52));
      try {
        for(Integer item: list) {
          System.out.print(item + " ");
          list.add(9);
        }
      } catch(ConcurrentModificationException e) {
          System.out.print(e);
      }
      System.out.println();
      System.out.println("Size: " + list.size() + " : " + list);
      System.out.println("- - - - - ");
    }
    
    {
      List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
      for(Integer item: list) {
        System.out.print(item + " ");
        list.add(9);
      }
      System.out.println();
      System.out.println("Size: " + list.size() + " : " + list);
    }
  }
}