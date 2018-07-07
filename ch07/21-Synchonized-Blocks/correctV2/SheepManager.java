import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class SheepManager {  
  private final Object lock = new Object();
  private AtomicInteger sheepCount = new AtomicInteger(0);
  
  private void incrementAndReport() {
    synchronized(lock) {
      System.out.print(sheepCount.incrementAndGet() + " ");
    }
  }

  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManager manager = new SheepManager();
      for (int i = 0; i<10; i++) 
          service.submit(() -> manager.incrementAndReport());
    } finally {
      if (service != null) service.shutdown();
    }
  }
}

/* SOME OUTPUTS
1 2 3 4 5 6 7 8 9 10 > 
1 2 3 4 5 6 7 8 9 10 > 
1 2 3 4 5 6 7 8 9 10 > 
*/