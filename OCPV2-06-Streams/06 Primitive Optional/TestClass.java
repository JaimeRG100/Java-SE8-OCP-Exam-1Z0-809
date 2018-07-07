import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      Stream<Double> temperatures = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
      Optional<Double> max = temperatures.max(Double::compareTo);
      if(max.isPresent())
        System.out.println(max.get());
      
      DoubleStream temp = DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3);
      OptionalDouble mx = temp.max();
      System.out.println(mx.getAsDouble());
    }
  }
}
/*

*/