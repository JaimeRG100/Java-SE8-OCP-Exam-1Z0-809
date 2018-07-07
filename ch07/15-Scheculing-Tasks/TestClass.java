import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
//import java.lang.Runnable;
  
public class TestClass {
  public static void main(String[] args)  throws InterruptedException {
    ScheduledExecutorService service = null;
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      
      Runnable task1 = () -> System.out.println("Hello Zoo");
      Callable<String> task2 = () -> "Monkey";
      
      Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
      Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);
      Thread.sleep(15000);
      
    } finally {
      if (service != null) service.shutdown();
    }
    
  }
}