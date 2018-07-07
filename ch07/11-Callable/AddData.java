import java.util.concurrent.*;

public class AddData {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(() -> 30 + 11);
      System.out.println(result.get());  // throws InterruptedException, ExecutionException
    } finally {
      if (service != null) service.shutdown();
    }
  }
}