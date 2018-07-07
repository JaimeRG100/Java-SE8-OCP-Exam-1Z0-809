import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      System.out.println(Stream.of(1,2,3,4,5).map(i -> i * i).count());
      System.out.println("- - - - - ");
    }
    
    {
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "ok");
      map.put(2, "bye");
      map.put(3, "hellow");
      System.out.println(map);
      map.forEach((k,v) -> System.out.println(k + ", " + v));
      map.merge(1, "new", (a,b) -> a.length() > b.length() ? a : b);
      System.out.println(map);
      map.merge(4, "new4", (a,b) -> a.length() > b.length() ? a : b);
      System.out.println(map);
      System.out.println("- - - - - ");
    }
    
    {
      System.out.println(Stream.of(1,2,3,4,5).map(v -> v*v).peek(System.out::println).count());
      System.out.println("- - - - - ");
      
      System.out.println(Stream.of(1,2,3,4,5).peek(System.out::println).map(v -> v*v).peek(System.out::println).count());
      System.out.println("- - - - - ");
    }
    
    
    {
      System.out.println(DoubleStream.of(1.0, 4.0, 9.0).map(Math::sqrt).peek(System.out::println).sum());
    }
    
  }
}