import java.util.Queue;
import java.util.ArrayDeque;


public class TestClass3 {
  
  public static void main(String[] args) {
    
    {
      // FIFO -------------------------------------
      Queue<Integer> queue = new ArrayDeque<>();
      System.out.println(queue.offer(1));
      System.out.println(queue.offer(2));
      System.out.println(queue.offer(3));
      System.out.println(queue);
      System.out.println(queue.peek());
      System.out.println(queue.poll());
      System.out.println(queue);
      System.out.println("- - - - ");
    }
    
    {
      // LIFO -------------------------------------
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println(stack);
      stack.offer(0);
      System.out.println(stack);
      System.out.println(stack.peek());
      System.out.println(stack.pop());
      System.out.println(stack);
    }

    
  }
}


