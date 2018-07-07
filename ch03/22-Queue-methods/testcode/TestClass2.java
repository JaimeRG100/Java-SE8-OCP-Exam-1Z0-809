import java.util.*;

public class TestClass2 {
  
  public static void main(String[] args) {
    
    {
      // FIFO -------------------------------------
      Queue<String> queue = new ArrayDeque<>();
      queue.offer("one");
      queue.offer("two");
      queue.offer("three");
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
      stack.offer("000");
      System.out.println(stack);
      stack.pop();
      System.out.println(stack);
    }
    
  }
}
