import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
//import java.lang.Runnable;
  
public class TestClass {
  public static void main(String[] args)  throws InterruptedException, ExecutionException {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    
    Runnable task1 = () -> System.out.println("Hello Zoo");
    Callable<String> task2 = () -> "Monkey";
    
    Future<?> result1 = service.schedule(task1, 3, TimeUnit.SECONDS);
    Future<?> result2 = service.schedule(task2, 10, TimeUnit.SECONDS);
    System.out.println(result2.get());
    
  }
}