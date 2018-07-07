import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.time.LocalTime;


public class TestClass {
  public static void main(String[] args) throws InterruptedException {
    Runnable task1 = () -> System.out.println("Runnable " + LocalTime.now());
    //Callable<String> task2 = () -> {System.out.println("Callable"); return "ok";};
    ScheduledExecutorService service = null;
    try {
      System.out.println("Start");
      service = Executors.newSingleThreadScheduledExecutor();
      service.scheduleWithFixedDelay(task1, 0, 2, TimeUnit.SECONDS);
      Thread.sleep(6000);
      System.out.println("End");
    } finally {
      if (service != null) service.shutdown();
    }
    
  }
}