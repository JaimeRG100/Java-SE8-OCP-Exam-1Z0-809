import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      Optional<String> empty = Optional.empty();
      Optional<String> nonEmpty = Optional.of("abracadabra");
      
      //Optional<String> nullStr = Optional.of(null);    // throws NullPointerException
      Optional<String> nullable = Optional.ofNullable(null);
      System.out.println(empty);
      System.out.println(nonEmpty);
      System.out.println(nonEmpty.get());
      System.out.println(nullable);

      System.out.println("- - - - - - ");
      OptionalDouble dOpt = OptionalDouble.of(23.1);
      System.out.println(dOpt.getAsDouble());
      dOpt = OptionalDouble.empty();
      System.out.println(dOpt.orElse(Double.NaN));
    }
  }
}
/*

*/