import java.util.stream.Stream;
import java.util.Comparator;

public class TestClass {

  public static void main(String[] args) {
    // example 1
    {
      Stream<String> s = Stream.of("brown-", "bear-");
      s.sorted().forEach(System.out::print);  // bear-brown-
    }
    
    // example 2 (with comparator as parameter)
    {
      System.out.println("\n- - - - - - ");
      Stream<String> s = Stream.of("brown bear-","grizzly-");
      s.sorted(Comparator.reverseOrder())
        .forEach(System.out::print);
    }
    
    // example 3 (wrong method reference)
    {
      System.out.println("\n- - - - - - ");
      Stream<String> s = Stream.of("brown bear-","grizzly-");
      //s.sorted(Comparator::reverseOrder);  //incompatible parameter types in method reference
    }
  }
}
