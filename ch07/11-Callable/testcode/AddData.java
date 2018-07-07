import java.util.concurrent.*;

public class AddData {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Long> result = service.submit(() -> {
        long sum = 0;
        for(int i = 0; i < 100000000; i++)
          sum+=(i*i);
        return sum;
      });
      System.out.println(result.get());
    } finally {
      if (service != null) service.shutdown();
    }
  }
}
