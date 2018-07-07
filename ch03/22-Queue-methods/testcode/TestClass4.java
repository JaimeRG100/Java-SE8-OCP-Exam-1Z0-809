import java.util.*;

public class TestClass4 {
  
  public static void main(String[] args) {
    
    {
      Queue<Integer> queue = new ArrayDeque<>();
      System.out.println(queue.offer(1));  // [1]
      System.out.println(queue.offer(2));  // [1, 2]
      System.out.println(queue.offer(3));  // [1, 2, 3]
      System.out.println(queue.peek());
      System.out.println(queue.poll());    // [2, 3]
      System.out.println(queue.peek());
      System.out.println(queue.poll());    // [3]
      System.out.println(queue.poll());    // []
      System.out.println(queue);
      System.out.println(queue.poll());
      System.out.println("- - - - -");
    }
    
    {
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      stack.push(1);                       // [1]
      stack.push(2);                       // [2, 1]
      stack.push(3);                       // [3, 2, 1]
      System.out.println(stack.peek());
      System.out.println(stack.pop());     // [2, 1]
      System.out.println(stack.offer(0));  // [2, 1, 0]
      System.out.println(stack);
      System.out.println(stack.poll());    // [1]           <- poll() same as pop, but should use pop()
      System.out.println(stack.pop());     // []
    }
    
  }
}