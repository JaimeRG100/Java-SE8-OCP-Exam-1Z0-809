import java.util.concurrent.*;
/*
Imagine that there is a lion pen that needs to be emptied, cleaned, and 
then filled back up with the lions, using four zoo workers.
Sample code without CyclicBarrier
 */
public class LionPenManager {
  
  private void removeAnimals() { System.out.println("Removing animals"); }
  private void cleanPen() { System.out.println("Cleaning the pen"); }
  private void addAnimals() { System.out.println("Adding animals"); }
  
  public void performTask() {
    removeAnimals();
    cleanPen();
    addAnimals();
  }
  
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(4);
      LionPenManager manager = new LionPenManager();
      for(int i=0; i<4; i++)
        service.submit(() -> manager.performTask());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}

/* SAMPLE OUTPUT
----------------
Removing animals 
Removing animals 
Cleaning the pen 
Adding animals 
Removing animals 
Cleaning the pen 
Adding animals 
Removing animals 
Cleaning the pen 
Adding animals 
Cleaning the pen 
Adding animals 
 */