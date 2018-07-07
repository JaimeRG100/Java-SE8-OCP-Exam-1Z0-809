import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Fluffy", "Hoppy");
    Comparator<String> c = Comparator.reverseOrder();
    int index = Collections.binarySearch(names, "Hoppy", c);
    System.out.println(index);
  }
}