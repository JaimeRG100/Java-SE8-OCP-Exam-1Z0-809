import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
// Checked Exceptions
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

// if we change Line 20 with "result.get(1, TimeUnit.NANOSECONDS);", the output is "Not reached in time"

public class CheckResults { 
  public static int counter = 0;
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<?> result = service.submit(() -> {
        for(int i=0; i<500; i++) CheckResults.counter++;
      });
      result.get(10, TimeUnit.SECONDS);  // throws InterruptedException, ExecutionException, TimeoutException
      System.out.println("Reached!");
    } catch (TimeoutException e) {
      System.out.println("Not reached in time");
    }finally {
      if (service != null) service.shutdown();
    }
  }
}