import java.util.*;
import java.util.stream.*;

public class ParallelStream {
  
  public static void main(String[] args) {
    { // Question 1 - - - - - - - - - - - - - - - - - - - - - - - - 
      Stream stream1 = Stream.of(1, 2, 3);
      Collection collect1 = Arrays.asList(1, 2, 3);
      
      //stream1.stream();
      stream1.parallel();
      //stream1.parallelStream();
      
      collect1.stream();
      collect1.parallelStream();
      //collect1.parallel();
    }
    
    { // Question 2 - - - - - - - - - - - - - - - - - - - - - - - - 
      
    }
  }
}