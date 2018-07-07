import java.util.concurrent.*;
import java.util.stream.*;

public class StockRoomTracker {

  public static void await(CyclicBarrier cb) {
    try { cb.await(); 
    } catch (InterruptedException | BrokenBarrierException e) {
      // handle exception
    }
  }
  
  public static void main(String[] args) {
    CyclicBarrier cb = new CyclicBarrier(10,
          () -> System.out.println("Stock Room Full!"));
    IntStream.iterate(1, i -> 1).limit(9)
      .parallel().forEach(i -> await(cb));
  }
}