import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.List;

public class TestClass {

  public static void main(String[] args) {
    
    // Test Part 1
    // - - - - - - 
    // Returs a String without taking any parameter (Supplier)
    Supplier<String> s = String::new;
    System.out.println(s.get());
    
    // Returns a Boolean and takes a String (Predicate)
    Predicate<String> p = String::isEmpty;
    System.out.println(p.test(""));
    
    // Returns an Integer and takes two Integer (BinaryOperator)
    BinaryOperator<Integer> b = Integer::compare;
    System.out.println(b.apply(2,3));
    
    // Test Part 2
    // - - - - - - 
    Predicate<List> ex1 = x -> "".equals(x.get(0));
    Consumer<Long> ex2 = (Long l) -> System.out.println(l);
    BiPredicate<String, String> ex3 = (s1, s2) -> false;
    
    // Test Part 3
    // - - - - - - 
    //Function<List<String>> exx1 = x -> x.get(0);  // Does not compile (Function needs to specify two Generics)
    //UnaryOperator<Long> exx2 = (Long l) -> 3.14;  // Does not compile (UnaryOperator needs to return the same Generics)
    // Predicate exx4 = String::isEmpty;  // Does not compile (Missing the Generic)
    
  }
}
