import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class TestClass {

  public static void main(String[] args) {
    
    // example 1
    UnaryOperator<String> u1 = String::toUpperCase;        
    UnaryOperator<String> u2 = x -> x.toUpperCase();
    
    System.out.println(u1.apply("chirp"));
    System.out.println(u2.apply("chirp"));
    
    // example 2
    BinaryOperator<String> b1 = String::concat;
    BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
    System.out.println(b1.apply("baby ", "chick"));
    System.out.println(b2.apply("baby ", "chick"));
    
  }
}
