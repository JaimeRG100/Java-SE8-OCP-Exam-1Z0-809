import java.util.concurrent.*;

public class SheepManager {
  private int sheepCount = 0;
  private void incrementAndReport() {
    System.out.print((++sheepCount) + " ");   // ++ not Thread Safe
  }
  
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManager manager = new SheepManager();
      for (int i=0; i<10; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      if (service != null) service.shutdown();
    }
  }
}

/* SOME OUTPUTS:
1 2 3 4 5 6 7 8 10 9 > 
1 1 2 3 4 5 6 7 8 9 >
1 2 3 4 5 6 7 8 9 10 > 
1 2 3 4 5 10 9 8 6 7 > 
*/