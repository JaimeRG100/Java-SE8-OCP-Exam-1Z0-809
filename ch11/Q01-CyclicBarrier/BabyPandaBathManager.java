import java.util.concurrent.*;
import java.util.stream.*;

/* What is the result of executing the following application? (Choose all that apply.)
H. It compiles but waits forever at runtime. */

public class BabyPandaBathManager {
  public static void await(CyclicBarrier cb) {
    try {
      cb.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      // Handle exception
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    final CyclicBarrier cb = new CyclicBarrier(3,()-> System.out.
                                                 println("Clean!"));// u1
    ExecutorService service = Executors.newScheduledThreadPool(2);
    IntStream.iterate(1, i-> 1) // u2
      .limit(12)
      .forEach(i-> service.submit( // u3
                                  ()-> await(cb))); // u4
    service.shutdown();
  }
}