import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo { 
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      System.out.println("begin");
      service.execute(() -> System.out.println("Printing zoo inventory"));
      service.execute(() -> { for(int i=0; i<300; i++)
        System.out.print(i + ", ");
      });
      service.shutdown();
      System.out.println("isShutdown(): " + service.isShutdown());
      System.out.println("isTerminated(): " + service.isTerminated());
      //service.execute(() -> System.out.println("Printing zoo inventory"));   // RejectedExecutionException      
      System.out.println("end");
      while(!service.isTerminated()) {
        Thread.sleep(1000);
      }
    } finally {
      System.out.println("finally isTerminated(): " + service.isTerminated());
      if (service != null) service.shutdown();
    }
    
  }  
}