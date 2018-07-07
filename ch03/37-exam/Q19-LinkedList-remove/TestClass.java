import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    List<Integer> lst = new LinkedList<>();
    lst.add(10);
    lst.add(12);
    lst.remove(1);
    System.out.println(lst);
    
    Queue<Integer> que = new LinkedList<>();
    que.add(10);
    que.add(12);
    que.remove(1);
    System.out.println(que);
  }
}