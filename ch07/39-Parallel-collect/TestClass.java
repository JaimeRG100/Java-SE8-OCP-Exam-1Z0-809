import java.util.stream.Stream;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
    
    System.out.println(set);  // [f, l, o, w]   // ConcurrentSkipListSet are a sorted collection
  }
}