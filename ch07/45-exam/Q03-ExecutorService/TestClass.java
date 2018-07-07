import java.util.concurrent.*;

public class TestClass {
  public static void main(String[] args) {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();  // code fixed
    try {
      service.scheduleWithFixedDelay(() -> {
        System.out.println("Open Zoo");
        //return null;                                                               // code fixed
      }, 0, 1, TimeUnit.MINUTES);
    } finally {
      if (service != null) service.shutdown();
    }
  }
}