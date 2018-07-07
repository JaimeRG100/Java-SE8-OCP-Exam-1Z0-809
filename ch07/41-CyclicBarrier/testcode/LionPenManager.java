import java.util.concurrent.*;
/*
Imagine that there is a lion pen that needs to be emptied, cleaned, and 
then filled back up with the lions, using four zoo workers.
Sample code using only 1 CyclicBarrier
 */
public class LionPenManager {
  
  private void removeAnimals() { System.out.println("Removing animals"); }
  private void cleanPen() { System.out.println("Cleaning the pen"); }
  private void addAnimals() { System.out.println("Adding animals"); }
  
  public void performTask(CyclicBarrier c1) {
    try {
      removeAnimals();
      c1.await();
      cleanPen();
      c1.await();
      addAnimals();
    } catch (InterruptedException | BrokenBarrierException e) {
      System.out.println(e); // Handle checked Exception
    }
  }
  
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(4);
      LionPenManager manager = new LionPenManager();
      CyclicBarrier c1 = new CyclicBarrier(4, () -> System.out.println("**Finished step!!"));
      for(int i=0; i<4; i++)
        service.submit(() -> manager.performTask(c1));
    } finally {
      if(service != null) service.shutdown();
    }
  }
}

/* SAMPLE OUTPUT
----------------
Removing animals 
Removing animals 
Removing animals 
Removing animals 
Cleaning the pen 
Cleaning the pen 
Cleaning the pen 
Cleaning the pen 
Adding animals 
Adding animals 
Adding animals 
Adding animals 
*/