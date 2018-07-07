import java.util.*;
import java.util.concurrent.*;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")
                         .parallelStream().parallel()
                         .reduce(0,
                                 (c1, c2) -> c1 + c2.length(),        // code fixed
                                 (s1, s2) -> s1 + s2));
  }
}