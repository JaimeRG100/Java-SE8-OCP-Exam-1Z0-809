import java.util.*;
import java.util.concurrent.*;

public class TestClass {
  
  public static void main(String[] args) {
    // MAP
    Map<String, Integer> map = new ConcurrentHashMap<>();
    map.put("zebra", 52);
    map.put("elephant", 10);
    System.out.println(map.get("elephant"));
    System.out.println("- - - - - - - - - -");
    
    // FIFO
    Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    queue.offer(31);
    queue.offer(32);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println("- - - - - - - - - -");
    
    // LIFO
    Deque<Integer> deque= new ConcurrentLinkedDeque<>();
    deque.offer(10); // [10]
    deque.push(4);   // [4, 10]
    System.out.println(deque.peek());
    System.out.println(deque.pop());
    System.out.println("- - - - - - - - - -");
  }
}