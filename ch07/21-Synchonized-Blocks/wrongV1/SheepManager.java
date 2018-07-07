import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class SheepManager {  
  private AtomicInteger sheepCount = new AtomicInteger(0);
  
  private void incrementAndReport() {
    System.out.print(sheepCount.incrementAndGet() + " ");
  }

  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManager manager = new SheepManager();
      synchronized(manager) {
        for (int i = 0; i<10; i++) 
          service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      if (service != null) service.shutdown();
    }
  }
}

/* SOME OUTPUTS
1 3 4 5 6 7 8 2 10 9 > 
1 2 3 4 5 6 7 8 10 9 > 
*/