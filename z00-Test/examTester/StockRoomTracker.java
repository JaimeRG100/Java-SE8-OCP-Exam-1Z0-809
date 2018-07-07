import java.util.concurrent.*;
import java.util.stream.*;
public class StockRoomTracker {
  public static void await(CyclicBarrier cb) { // j1
    try { cb.await(); } catch (InterruptedException |
                               BrokenBarrierException e) {
      // Handle exception
    }
  }
  public static void main(String[] args) {
    CyclicBarrier cb = new CyclicBarrier(10,() -> System.out.println("Stock Room Full!")); // j2

    for(int i=1; i<=10; i++) 
       await(cb);
  }
}