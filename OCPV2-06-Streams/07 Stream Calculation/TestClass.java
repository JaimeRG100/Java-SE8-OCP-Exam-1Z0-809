import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      String[] string = "you never know what you have until you clean your room".split(" ");
      System.out.println(Arrays.stream(string).min(String::compareTo).get());
      
      Comparator<String> lengthCompare = (s1, s2) -> s1.length() - s2.length();
      System.out.println(Arrays.stream(string).min(lengthCompare));
      System.out.println("- - - - - - ");
      
      String limerick = "There was a young lady named Bright " +
      "who traveled much faster than light " +
      "She set out one day " +
      "in a relative way " +
      "and came back the previous night ";
      IntSummaryStatistics ss = 
      Stream.of(limerick.split(" "))
                  .mapToInt(word -> word.length())
                  .summaryStatistics();
      System.out.println(ss.getCount());
      System.out.println(ss.getMax());
      System.out.println(ss.getMin());
      System.out.println(ss.getAverage());
      System.out.println(ss.getSum());
      System.out.println("- - - - - - ");
      System.out.println(Stream.of(limerick.split(" "))
                           .mapToInt(word -> word.length())
                           .count());
      System.out.println(Stream.of(limerick.split(" "))
                           .mapToInt(word -> word.length())
                           .max().getAsInt());
      System.out.println(Stream.of(limerick.split(" "))
                           .mapToInt(word -> word.length())
                           .min().getAsInt());
      System.out.println(Stream.of(limerick.split(" "))
                           .mapToInt(word -> word.length())
                           .average().getAsDouble());
            System.out.println(Stream.of(limerick.split(" "))
                           .mapToInt(word -> word.length())
                           .sum());
      System.out.println("- - - - - - ");
      System.out.println(Stream.of(limerick.split(" "))
                           .max(String::compareTo)
                            .get());
      System.out.println(Stream.of(limerick.split(" "))
                           .min(String::compareTo)
                           .get());
      System.out.println(Stream.of(limerick.split(" "))
                           .count());
      System.out.println(Stream.of(limerick.split(" "))
                           .map(s -> s.length())
                           .reduce(0, (v1, v2) -> v1 + v2));
      System.out.println("- - - - - - ");
    }
    
    {
      Stream<Integer> stream = Stream.of(1,2,3,4,5);
      System.out.println(stream.max(Integer::compareTo).get());
      System.out.println("- - - - - - ");
    }
    
    {
      System.out.println(IntStream.of(10, 20, 30, 40).sum());
      System.out.println(IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val)));
      System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
    }
  }
}
/*

*/