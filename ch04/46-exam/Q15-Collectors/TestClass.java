import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class TestClass {
  public static void main(String[] args) {
    // default List
    Map<Boolean, List<Integer>> map0 = Stream.of(1,2,3,4,5)
      .collect(Collectors.partitioningBy(x -> x % 2 == 0));
    System.out.println(map0);
    
    // toList()
    Map<Boolean, List<Integer>> map1 = Stream.of(1,2,3,4,5)
      .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));
    System.out.println(map1);
    
    // toSet()
    Map<Boolean, Set<Integer>> map2 = Stream.of(1,2,3,4,5)
      .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toSet()));
    System.out.println(map2);
  }
}
