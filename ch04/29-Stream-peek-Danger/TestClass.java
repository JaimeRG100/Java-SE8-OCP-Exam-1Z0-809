import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class TestClass {

  public static void main(String[] args) {
    
    // example 1 - basic peek() usage
    List<Integer> numbers = new ArrayList<>();
    List<Character> letters = new ArrayList<>();
    numbers.add(1);
    letters.add('a');
    Stream<List<?>> stream = Stream.of(numbers, letters);
    stream.map(List::size).forEach(System.out::print); // 11
    
    // example 2 - propper peek() operation
    System.out.println("\n- - - - - -");
    StringBuilder builder = new StringBuilder();
    Stream<List<?>> good = Stream.of(numbers, letters);
    good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
    System.out.println();
    System.out.println(builder);
    
    // example 3 - bad peek() usage
    System.out.println("- - - - - -");
    Stream<List<?>> bad = Stream.of(numbers, letters);
    bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print); //00
  }
}
