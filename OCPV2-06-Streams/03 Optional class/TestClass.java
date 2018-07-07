import java.lang.reflect.Method;
import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      Stream<Double> temperatures = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
      System.out.println(temperatures.max(Double::compareTo));
      temperatures = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
      
      System.out.println(temperatures.max(
        new Comparator<Double>() {
        public int compare(Double o1, Double o2) {
          return (int)((o1*100) - (o2*100));
        }
      }
      ));
      System.out.println("- - - - - - ");
    }
    
    
    {
      Stream<Double> temperatures = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
      Optional<Double> max = temperatures.max(Double::compareTo);
      if(max.isPresent()) 
        System.out.println(max.get());
      max.ifPresent(System.out::println);
      System.out.println("- - - - - - ");
    }
    
  }
}

interface Dummy  {
  public int compare(Double d);
}