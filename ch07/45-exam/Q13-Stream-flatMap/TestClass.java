import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class TestClass {
  
  public static void main(String[] args) {   // throws StackOverflowError
    Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
    Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();
    
    ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears)
      .flatMap(s -> s)
      .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
    System.out.println(data.get(false).size() + " " + data.get(true).size());
  }
}