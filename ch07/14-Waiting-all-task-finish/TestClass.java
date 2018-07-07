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
    } finally {
      if (service != null) service.shutdown();
    }
    if (service != null) {
      service.awaitTermination(1, TimeUnit.MINUTES);
      if (service.isTerminated())
        System.out.println("All task finished");
      else
        System.out.println("At least one task is still running");
    }    
  }
}