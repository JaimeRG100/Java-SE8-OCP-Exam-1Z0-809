import java.util.concurrent.*;

public class TestExecutorService {
  
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    //SingleThread
    try {
      service = Executors.newSingleThreadExecutor();
      service.execute(() -> {
        for(int i=0; i<10; i++)
          System.out.print(i + " ");
        System.out.println();});
      service.submit(()-> {System.out.println("Call Thread"); return "Called";});
    } finally {
      if (service!=null) service.shutdown();
    }
    
    //SingleThreadScheduled
    ScheduledExecutorService servSched = null;
    try {
      servSched = Executors.newSingleThreadScheduledExecutor();
      Runnable run = () -> System.out.println("Runnable Thread scheduleded");
      Callable<String> call = () -> {System.out.println("Callable thread"); return "called";};
      servSched.schedule(run, 3, TimeUnit.SECONDS);
      Future<String> result = servSched.schedule(call, 2, TimeUnit.SECONDS);
      Thread.sleep(3000);
      System.out.println(result.get());
    } finally {
      if (servSched!=null) servSched.shutdown();
    }
    
  }
}