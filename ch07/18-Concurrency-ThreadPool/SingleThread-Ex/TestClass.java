import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;


public class TestClass {
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Runnable taskRun = () -> System.out.println("Hello Threads");
      service.execute(taskRun);
      Callable<String> taskCall = () -> {System.out.println("Bye Threads"); return "bye";};
      Future<?> result = service.submit(taskCall);
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