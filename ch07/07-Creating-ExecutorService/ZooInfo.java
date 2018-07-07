import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
This example (with newSingleThreadExecutor()) uses only one thread, which means that the threads will
order their results. For example, the possibles outputs are at the end of the code:
 */

public class ZooInfo { 
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      System.out.println("begin");
      service.execute(() -> System.out.println("Printing zoo inventory"));
      service.execute(() -> { for(int i=0; i<3; i++)
        System.out.println("Printing record: " + i);
      });
      service.execute(() -> System.out.println("Printing zoo inventory"));
      System.out.println("end");
    } finally {
      if (service != null) service.shutdown();
    }
  }  
}

/* 
------------------------
begin 
Printing zoo inventory 
end 
Printing record: 0 
Printing record: 1 
Printing record: 2 
Printing zoo inventory 
------------------------
begin 
end 
Printing zoo inventory 
Printing record: 0 
Printing record: 1 
Printing record: 2 
Printing zoo inventory 
*/