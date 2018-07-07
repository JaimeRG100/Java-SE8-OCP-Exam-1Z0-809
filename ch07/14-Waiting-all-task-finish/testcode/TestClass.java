import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestClass {
  public static void main(String[] args)  throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      // Add task to the thead executor
      // ...
      service.submit(() -> {Thread.sleep(6000); return null;});
    } finally {
      if (service != null) service.shutdown();
    }
    if (service != null) {
      service.awaitTermination(1, TimeUnit.SECONDS);
      if (service.isTerminated())
        System.out.println("All task finished");
      else
        System.out.println("At least one task is still running");
    }    
  }
}