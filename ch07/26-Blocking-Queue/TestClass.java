import java.util.concurrent.*; 

public class TestClass {
  
  public static void main(String[] args) {
    try {
      BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
      blockingQueue.offer(39);
      blockingQueue.offer(3, 4, TimeUnit.SECONDS);
      System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
    } catch (InterruptedException e) {
      // Handle interruption
      System.out.println(e);
    }
  }
}