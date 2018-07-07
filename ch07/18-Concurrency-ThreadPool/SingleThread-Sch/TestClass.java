import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class TestClass {
  public static void main(String[] args) {
    ScheduledExecutorService service = null;
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Runnable taskRun = () -> System.out.println("Hello Threads");
      service.schedule(taskRun, 3, TimeUnit.SECONDS);
      Callable<String> taskCall = () -> {System.out.println("Bye Threads"); return "bye";};
      Future<?> result = service.schedule(taskCall, 4, TimeUnit.SECONDS);
      try {
        System.out.println("future.get(): " + result.get());
      } catch (InterruptedException | ExecutionException e) {
        System.out.println(e);
      }
    } finally {
      if (service != null) service.shutdown();
    }
  }
}