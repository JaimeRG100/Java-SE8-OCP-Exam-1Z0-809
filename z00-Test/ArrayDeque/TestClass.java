import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    stack.push(10);
    stack.push(4);
    System.out.println(stack.peek()); // 4
    System.out.println(stack.poll()); // 4
    System.out.println(stack.poll()); // 10
    System.out.println(stack.peek()); // null
    stack.push(3);
    stack.push(2);
    stack.push(1);
    System.out.println(stack);
    stack.offer(4);
    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack);
  }
}

