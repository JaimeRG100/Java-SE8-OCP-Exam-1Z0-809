import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class TestClass {
  
  private static List<String> sort(List<String> list) {
    List<String> copy = new ArrayList<>(list);
    Collections.sort(copy, (a, b) -> b.compareTo(a));
    return copy;
  }
  
  private static List<String> sort2(List<String> list) {
    return list.stream()
      .sorted((a,b) -> b.compareTo(a))
      .collect(Collectors.toList());
  }
  
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Java", "C#", "PHP");
    System.out.println(list + " : " + sort(list));
    System.out.println(list + " : " + sort2(list));
  }
}
