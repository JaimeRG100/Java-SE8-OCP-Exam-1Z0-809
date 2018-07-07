import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    Comparator<Integer> c = (o1, o2) -> o2 - o1;
    List<Integer> list = Arrays.asList(5, 4, 7, 1);
    Collections.sort(list, c);
    System.out.println(Collections.binarySearch(list, 1));
  }
}