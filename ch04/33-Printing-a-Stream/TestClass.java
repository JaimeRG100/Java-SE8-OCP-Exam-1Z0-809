import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.*;

public class TestClass {
  
  public static void main(String[] args) {
    UnaryOperator<Integer> unaryOp = x -> x + 1;
    //Stream<Integer> infinite = Stream.iterate(1, unaryOp);
    
    // Option 1.- s.forEach()           Works for Infinite [No]  Destructive [Yes]
    {
      //Stream.iterate(1, unaryOp).forEach(System.out::println);
    }
    
    // Option 2.- s.collect()           Works for Infinite [No]   Destructive [Yes]
    {
      //System.out.println(Stream.iterate(1, unaryOp).collect(Collectors.toList()));
    }
    
    // Option 3.- s.peek()              Works for Infinite [No]   Destructive [No]
    {
      //Stream.iterate(1, unaryOp).peek(System.out::println).count();
    }
    
    // Option 4.- s.limit().forEach()   Works for Infinite [Yes]  Destructive [Yes]
    {
      Stream.iterate(1, unaryOp).limit(5).forEach(System.out::println);
    }
    
  }
}