import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      Optional<String> str = Optional.of("   abracadabra       ");
      str.map(String::trim).ifPresent(System.out::println);
      System.out.println("- - - - - - ");
      
      str = Optional.ofNullable(null);
      System.out.println(str.map(String::length).orElse(-1));
      System.out.println("- - - - - - ");
      
      str = Optional.ofNullable(null);
      //System.out.println(str.map(String::length).orElseThrow(IllegalArgumentException::new));  // throws IllegalArgumentException
      System.out.println(str.map(String::length));
      String s = null;
      //System.out.println(s.length());
      System.out.println("- - - - - - ");

    }
  }
}
/*

*/