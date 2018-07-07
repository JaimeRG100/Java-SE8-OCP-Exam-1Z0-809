import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo { 
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      service.execute(() -> System.out.println("Zoo info"));
      service.execute(() -> {for(int i = 9; i<18; i++) System.out.println(i + ":00 am service ___");});
    } finally {
      if (service != null) service.shutdown();
    }
    
  }  
}