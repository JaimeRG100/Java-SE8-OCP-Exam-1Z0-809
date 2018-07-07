import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.List;
import java.util.ArrayList;

public class TestClass {

  public static void main(String[] args) {
    
    // example 1
    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();
    
    System.out.println(p1.test(""));
    System.out.println(p2.test(""));
    
    // example 2
    BiPredicate<String, String> b1 = String::startsWith;
    BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
    
    System.out.println(b1.test("chicken", "chick"));
    System.out.println(b2.test("chicken", "chick"));
    
    // testcode
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    System.out.println(list.contains("two"));
    
    BiPredicate<List<String>, String> bi1 = List::contains;
    System.out.println(bi1.test(list, "two"));
    
    
  }
}
