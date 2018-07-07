import java.util.concurrent.*; 

public class TestClass {
  
  public static void main(String[] args) {
    try {
      BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
      blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
      blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
      blockingDeque.offer(3, 4, TimeUnit.SECONDS);
      // [5, 47, 3]
      System.out.println(blockingDeque.poll());
      System.out.println(blockingDeque.pollFirst(200, TimeUnit.MILLISECONDS));
      System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
    } catch (InterruptedException e) {
      // Handle interruption
      System.out.println(e);
    }
  }
}