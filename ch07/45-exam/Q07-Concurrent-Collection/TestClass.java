import java.util.*;
import java.util.concurrent.*;

public class TestClass {
  public static void main(String[] args) {
    List<Integer> l1 = Arrays.asList(1, 2, 3);
    List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
    Set<Integer> s3 = new ConcurrentSkipListSet<>();
    s3.addAll(l1);

    for(Integer item: l2) l2.add(4);
    for(Integer item: s3) s3.add(5);
    System.out.println(l1.size() + " " + l2.size() + " " + s3.size());
  }
}