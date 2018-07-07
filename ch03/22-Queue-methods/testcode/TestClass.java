import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    
    {
      // FIFO -------------------------------------
      Queue<String> queue = new ArrayDeque<>();
      System.out.println(queue.offer("one"));
      System.out.println(queue.offer("two"));
      System.out.println(queue.offer("three"));
      System.out.println(queue);
      System.out.println(queue.peek());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue);
      queue.offer("four");
      queue.offer("five");
      System.out.println(queue);
      //queue.push("zero");
      System.out.println("- - - - - ");
    }
    
    {
      // LIFO -------------------------------------
      ArrayDeque<String> stack = new ArrayDeque<>();
      stack.push("001");
      stack.push("002");
      stack.push("003");
      System.out.println(stack);
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack);
      
      stack.push("002");
      stack.push("003");
      System.out.println(stack);
      stack.offer("000");
      System.out.println(stack);
    }
    
  }
}
