import java.util.concurrent.*;

public class TestClass {
  
  public void addAndPrintItems(BlockingDeque<Integer> deque)  {
    try {
      deque.offer(103);
      deque.offerFirst(20, 1, TimeUnit.SECONDS);
      deque.offerLast(85, 7, TimeUnit.HOURS);
      System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
      System.out.println(" " + deque.pollLast(1, TimeUnit.MINUTES));
    } catch (InterruptedException e) {
      System.out.println(e);
    }      
  }
  
  public static void main(String[] args) {   // throws StackOverflowError
    new TestClass().addAndPrintItems(new LinkedBlockingDeque<Integer>());
  }
}