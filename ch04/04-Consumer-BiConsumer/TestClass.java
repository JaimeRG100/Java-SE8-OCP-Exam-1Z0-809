import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.Map;
import java.util.HashMap;

public class TestClass {

  public static void main(String[] args) {
    
    // example 1
    Consumer<String> c1 = System.out::println;
    Consumer<String> c2 = (x) -> System.out.println(x);
    
    c1.accept("Annie");
    c2.accept("Annie");
    
    // example 2
    Map<String, Integer> map = new HashMap<>();
    BiConsumer<String, Integer> b1 = map::put;
    BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
    
    b1.accept("chicken", 7);
    b2.accept("chick", 1);
    
    System.out.println(map);
    
    // example 3
    Map<String, String> map2 = new HashMap<>();
    BiConsumer<String, String> bc1 = map2::put;
    BiConsumer<String, String> bc2 = (k, v) -> map2.put(k, v);
    
    bc1.accept("chicken", "Cluck");
    bc2.accept("chick", "Tweep");
    
    System.out.println(map2);
  }
}
