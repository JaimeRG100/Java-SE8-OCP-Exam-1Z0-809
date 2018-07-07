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
      for (int i = 0; i<10; i++) 
        synchronized(manager) {
          service.submit(() -> manager.incrementAndReport());
      }      
    } finally {
      if (service != null) service.shutdown();
    }
  }
}

/* SOME OUTPUTS
2 1 3 4 5 6 7 8 9 10 >
1 3 4 5 6 7 9 10 2 8 > 
*/