import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DuckHelper {
  
  public static int compareByWeight(Duck d1, Duck d2) {
    return d1.getWeight() - d2.getWeight();    
  }
  
  public static int compareByName(Duck d1, Duck d2) {
    return d1.getName().compareTo(d2.getName());
  }
  
  public static void main(String[] args) {
    
    // Comparator using lambda
    Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
    
    // Method Reference *** static method *** Consumer
    Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
    Consumer<List<Integer>> methodRef1 = Collections::sort;
    
    // Method Reference *** Instance method on a particular instance *** Predicate
    String str = "abc2";
    Predicate<String> lambda2 = s -> str.startsWith(s);
    Predicate<String> methodRef2 = str::startsWith;
    
    // Method Reference **** Instance method ib ab ubstabce to be determined at runtime ** Predicate
    Predicate <String> lambda3 = s -> s.isEmpty();
    Predicate <String> methodRef3 = String::isEmpty;
    
    // Method Reference *** Constructor *** Supplier
    Supplier<ArrayList> lambda4 = () -> new ArrayList();
    Supplier<ArrayList> methodRef4 = ArrayList::new;
    
  }
}