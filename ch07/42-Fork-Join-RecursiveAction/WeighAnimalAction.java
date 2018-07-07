import java.util.*;
import java.util.concurrent.*;

public class WeighAnimalAction extends RecursiveAction{  
  
  private int start;
  private int end;
  private Double[] weights;
  
  public WeighAnimalAction(Double[] weights, int start, int end) {
    this.start = start;
    this.end = end;
    this.weights = weights;
  }
  
  protected void compute() {
    if(end-start <= 3)
      for(int i=start; i<end; i++) {
        weights[i] = (double) new Random().nextInt(100);
        System.out.println("Animal Weighed: " + i);
      }
    else {
      int middle = start + ((end-start) /2);
      System.out.println("[start= " + start + ", middle= " + middle + ", end= " + end +"]");
      invokeAll(new WeighAnimalAction(weights, start, middle), 
                new WeighAnimalAction(weights, middle, end));
    }
  }
  
  public static void main(String[] args) {
    Double[] weights = new Double[10];
    
    ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);  // 1. Create a ForkJoinTask
    ForkJoinPool pool = new ForkJoinPool();                                    // 2. Create the ForkJoinPool
    pool.invoke(task);                                                         // 3. Start the ForkJoinTask
    
  }
}

/* OUTPUT SAMPLE
--------------------------------
[start= 0, middle= 5, end= 10] 
[start= 0, middle= 2, end= 5] 
Animal Weighed: 0 
Animal Weighed: 1 
Animal Weighed: 2 
Animal Weighed: 3 
Animal Weighed: 4 
[start= 5, middle= 7, end= 10] 
Animal Weighed: 5 
Animal Weighed: 6 
Animal Weighed: 7 
Animal Weighed: 8 
Animal Weighed: 9 
*/