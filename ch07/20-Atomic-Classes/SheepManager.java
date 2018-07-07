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
        service.submit(() -> manager.incrementAndReport());
    } finally {
      if (service != null) service.shutdown();
    }
  }
}

/* SOME OUTPUTS
1 10 9 8 7 6 5 4 3 2 >  
1 2 10 9 8 7 6 4 5 3 > 
1 2 3 10 9 8 7 6 5 4 > 
*/