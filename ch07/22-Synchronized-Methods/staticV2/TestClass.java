import java.util.concurrent.*;

public class TestClass {  
  private static int counter = 0;
  
  private static void printDaysWork() {
    synchronized(TestClass.class){
      System.out.print((++counter) + " ");
    }
  }

  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      for (int i = 0; i<10; i++) 
          service.submit(() -> printDaysWork());
    } finally {
      if (service != null) service.shutdown();
    }
  }
}