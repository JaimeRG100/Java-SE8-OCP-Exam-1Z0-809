import java.util.*;

/* Let’s say that you have a task that requires processing 4,000 records, with 
 * each record taking a modest 2 milliseconds to complete. The following is a
 * sample implementation that uses Thread.sleep() to simulate processing the data:
 */

public class ParallelStreamCalculator {
  
  public int processRecord(int input) {
    try {
      Thread.sleep(2);
    } catch(InterruptedException e) {
      System.out.println(e); //Handle interrupted exception
    }
    return input+1;
  }
  
  public void processAllData(List<Integer> data) {
    data.parallelStream().map(a -> processRecord(a)).count();
  }
  
  public static void main(String[] args) {
    ParallelStreamCalculator calculator = new ParallelStreamCalculator();
    
    // Define the data
    List<Integer> data = new ArrayList<Integer>();
    for(int i=0; i<4000; i++) 
      data.add(i);
    
    //Process the data
    long start = System.currentTimeMillis();
    calculator.processAllData(data);
    double time = (System.currentTimeMillis()-start)/1000.0;
    
    //Report results
    System.out.println("Tasks completed in: " + time + " seconds");
  }
}

/*
 * Depending on the number of CPUs available in your environment, the following is a
 * possible output of the code using a parallel stream:
 * Tasks completed in: 2.227 seconds 
 */