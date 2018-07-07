import java.util.*;

/* Let’s say that you have a task that requires processing 4,000 records, with 
 * each record taking a modest 2 milliseconds to complete. The following is a
 * sample implementation that uses Thread.sleep() to simulate processing the data:
 */

public class StreamCalculator {
  
  public int processRecord(int input) {
    try {
      Thread.sleep(2);
    } catch(InterruptedException e) {
      System.out.println(e); //Handle interrupted exception
    }
    return input+1;
  }
  
  public void processAllData(List<Integer> data) {
    data.stream().map(a -> processRecord(a)).count();
  }
  
  public static void main(String[] args) {
    StreamCalculator calculator = new StreamCalculator();
    
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
 * Given that there are 4,000 records, and each record takes 2 milliseconds to process, using
 * a serial stream(), the results will take approximately 8 seconds to complete this task
 */