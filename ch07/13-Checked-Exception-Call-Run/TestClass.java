import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      service.submit(() -> {Thread.sleep(1000); return null;} );   // Callable
      //service.submit(() -> {Thread.sleep(1000);} );              // Runnable - Does not compile - sleep() throws a checked InterruptedException
    } finally {
      if (service != null) service.shutdown();
      System.out.println("bye"); 
    }
  }
}