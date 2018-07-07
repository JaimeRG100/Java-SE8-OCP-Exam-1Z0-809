import java.util.stream.Stream;
import java.util.function.BinaryOperator;

public class TestClass {

  public static void main(String[] args) {
    
    // -----------------------------------------------------
    // Reduction without functional programming
    {
      String[] array = new String[] {"w", "o", "l", "f"};
      String result = "";
      for (String s: array)
        result = result + s;
      System.out.println(result);
    }
    
    // Reduction with lambda
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      String word = stream.reduce("",(s, c) -> s + c);
      System.out.println(word);
    }
    
    // Reduction with lambda + method reference
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      String word = stream.reduce("", String::concat);
      System.out.println(word);
    }
    
    // -----------------------------------------------------
    // Reduction to multiply all of the Integer objects in a stream
    {
      System.out.println("- - - - - ");
      Stream<Integer> stream = Stream.of(3, 5, 6);
      Integer number = stream.reduce(1, (a, b) -> a*b);
      System.out.println(number);
    }
    // -----------------------------------------------------
    // When you dont specify the identity, an Optional is returned
    System.out.println("- - - - - ");
    BinaryOperator<Integer> op = (a, b) -> a * b;
    // if the stream is empty, an empty Optional is returned
    Stream<Integer> empty = Stream.empty();
    empty.reduce(op).ifPresent(System.out::println);  // no output
    // if the stream has one element, it is returned
    Stream<Integer> oneElement = Stream.of(3);
    oneElement.reduce(op).ifPresent(System.out::println);
    // if the stream has multiple elements, the accumulator is applied
    Stream<Integer> threeElements = Stream.of(3, 5, 6);
    threeElements.reduce(op).ifPresent(System.out::println);
    
    // -----------------------------------------------------
    // test code
    {
      System.out.println("- - - - - ");
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      String word = stream.reduce("Reduction: ", String::concat);
      System.out.println(word);
    }
    
  }
  
}
