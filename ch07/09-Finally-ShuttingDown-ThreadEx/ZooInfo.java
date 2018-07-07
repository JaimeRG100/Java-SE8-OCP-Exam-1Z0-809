import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ExecutorService interface does not implement AutoCloseable, so you cannot use a try-with-resources statement.

public class ZooInfo { 
  public static void main(String[] args){
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      // add tasks to thread executor 
      // . . . 
    } finally {
      if (service != null) service.shutdown();
    }

  }  
}