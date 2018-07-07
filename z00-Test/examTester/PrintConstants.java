import java.util.concurrent.*;
import java.util.stream.*;
public class PrintConstants {
  public static void main(String[] args) {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6)
      .forEach(c -> service.submit( () -> System.out.println(10*c)));
    service.execute(() -> System.out.println("Printed"));
    service.scheduleWithFixedDelay(()-> System.out.println("ok"), 0, 2, TimeUnit.SECONDS);
  }
}