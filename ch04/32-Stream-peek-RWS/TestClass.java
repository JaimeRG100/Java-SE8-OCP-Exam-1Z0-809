import java.util.stream.Stream;

public class TestClass {
  
  public static void main(String[] args) {
    // example 1
    {
      Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
        .filter(x -> x % 2 == 1)
        .forEach(System.out::print); // 135
    }
    
    // example 2
    {
      System.out.println();
      Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
        .peek(System.out::print)
        .filter(x -> x % 2 == 1)
        .forEach(System.out::print);  // 11233455
    }
    
    // example 3
    {
      System.out.println();
      Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
      infinite.filter(x -> x % 2 == 1)
        .limit(5)
        .forEach(System.out::print); // 13579
      
    }
    
    // example 4
    {
      System.out.println();
      Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
      infinite.filter(x -> x % 2 == 1)
        .peek(System.out::print)
        .limit(5)
        .forEach(System.out::print);  //1133557799
    }
  }
}