import java.lang.reflect.Method;
import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      IntSummaryStatistics result = IntStream.iterate(1, n -> n +2).limit(10).summaryStatistics();
      System.out.println("getSum: " + result.getSum());
      System.out.println("getMax: " + result.getMax());
      System.out.println("getMin: " + result.getMin());
      System.out.println("getAverage: " + result.getAverage());
      System.out.println("getCount: " + result.getCount());
      
      System.out.println(IntStream.rangeClosed(1,5).max().getAsInt());
      System.out.println(IntStream.range(1,5).sum());
      System.out.println("- - - - - - ");
    }
    
    
    {
      System.out.println(IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(t -> t > 0));  // false
      System.out.println(IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(t -> t > 0)); // true
      System.out.println(IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(t -> t > 0));  // false
      System.out.println("- - - - - - ");
    }
    
    {
      Method[] methods = Stream.class.getMethods();
      //for(int i =0; i<methods.length; i++) 
      //  System.out.println(methods[i].getName());
      Optional<String> methodName = Arrays.stream(methods)
        .map(method -> method.getName())
        .sorted()
        .findFirst();
      System.out.println(methodName.orElse("Not found"));
      System.out.println("- - - - - - ");
    }
    
    {
      OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
        .filter(temp -> temp > 0)
        .findFirst();
      System.out.println("First matching temp > 0 " + temperature.getAsDouble());
      System.out.println("- - - - - - ");
    }
    
  }
}