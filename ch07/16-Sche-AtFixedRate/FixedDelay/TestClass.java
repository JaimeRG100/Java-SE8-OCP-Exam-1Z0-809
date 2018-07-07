import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.time.LocalTime;

public class TestClass {
  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService service = null;
    System.out.println("Start: " + LocalTime.now());
    try {
      Runnable task1 = () -> System.out.println("The times is " + LocalTime.now()); 
      service = Executors.newSingleThreadScheduledExecutor();
      
      // new code
      //service.scheduleAtFixedRate(task1, 3, 1, TimeUnit.SECONDS);
      service.scheduleWithFixedDelay(task1,3,1,TimeUnit.SECONDS);
      Thread.sleep(6000);
    } finally {
      if (service != null) service.shutdown();
    }
  }
}