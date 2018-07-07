import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      System.out.println("hello"); 
      service = Executors.newSingleThreadExecutor();
      service.execute(() -> {System.out.println("thread 1"); } );
      service.submit(() -> System.out.println("submit"));
      service.submit(() -> {throw new RuntimeException("RTE from submit 1");});
      service.submit(() -> {throw new RuntimeException("RTE from submit 2");});
      service.execute(() -> {throw new RuntimeException("RTE from execute 1");});
      service.execute(() -> {throw new RuntimeException("RTE from execute 2");});
      service.submit(() -> {Thread.sleep(1000); return null;} );   // Callable
      service.execute(() -> {System.out.println("thread 2"); } );
      //service.submit(() -> {Thread.sleep(1000);} );              // Runnable - Does not compile - sleep() throws a checked InterruptedException
    } catch(Exception e) {
      System.out.println("Err: " +  e.getMessage());
    }finally {
      if (service != null) service.shutdown();
      System.out.println("bye"); 
    }
  }
}