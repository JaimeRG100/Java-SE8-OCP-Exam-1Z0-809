import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TestClass {
  
  public static void main(String[] args) {
   
   Stream<Integer> stream = Stream.of(1, 2, 3);
   IntStream intStream = IntStream.of(1, 2, 3);
    //intStream = IntStream.empty();
    //intStream = stream.mapToInt(x -> x);
   OptionalDouble avg = intStream.average();
   System.out.println(avg.getAsDouble());
   intStream = IntStream.of(1, 2, 3);
   System.out.println(intStream.sum());
   intStream = IntStream.of(1, 2, 3);
   System.out.println(intStream.max());
   intStream = IntStream.of(1, 2, 3);
   System.out.println(intStream.count());
    
    System.out.println(" - - - - - - ");
    DoubleStream oneValue = DoubleStream.of(3.14);
    DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
    oneValue.forEach(System.out::println);
    varargs.forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
    count.forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    IntStream range = IntStream.range(1, 6);
    range.forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    Stream<Integer> rangeObj = IntStream.range(1, 6).mapToObj(x -> x);
    rangeObj.forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    Stream<String> objStream = Stream.of("penguin", "fish");
    IntStream intStream2 = objStream.mapToInt(String::length);
    
    System.out.println(" - - - - - - ");
    IntStream stream2 = IntStream.rangeClosed(1, 10);
    OptionalDouble optional = stream2.average();
    optional.ifPresent(System.out::println);
    System.out.println(optional.getAsDouble());
    System.out.println(optional.orElseGet(() -> Double.NaN));
    
    // Collecting
    System.out.println(" - - - - - - ");
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    String result = ohMy.collect(Collectors.joining(", "));                  // joining(", ");
    System.out.println(result);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Double resultD = ohMy.collect(Collectors.averagingInt(String::length));    // averagingInt(int)
    System.out.println(resultD);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    TreeSet<String> resultTS = ohMy.filter(s -> s.startsWith("t"))            // toCollection(type::new)
       .collect(Collectors.toCollection(TreeSet::new));
    System.out.println(resultTS);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));   // toMap(k, v)
    System.out.println(map);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    //Map<Integer, String> map2 = ohMy.collect(Collectors.toMap(String::length, k -> k));
    Map<Integer, String> map2 = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));    // toMap(k, v, s1+s2)
    System.out.println(map2);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, String> map3 = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));  // toMap(k, v, s1+, type::new)
    
    // Grouping, Partitioning, Mapping
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map4 = ohMy.collect(Collectors.groupingBy(String::length));                // groupingBy(int)
    System.out.println(map4);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map5 = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));   // groupingBy(int, toSet/toList)
    System.out.println(map5);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map6 = ohMy.collect(                                                         // groupingBy(int, MapType:new, toSet/toList)
       Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
    System.out.println(map6);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map7 = ohMy.collect(
      Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));                               // groupingBy(int, MapType, toList)
    System.out.println(map7);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map8 = ohMy.collect(                                                             // Map(T, List) partitioningBy(boolean)
      Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map8);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears"); 
    Map<Boolean, Set<String>> map9 = ohMy.collect(
       Collectors.partitioningBy(s -> s.length() <= 8, Collectors.toSet()));                                   // Map(T, Set) partitioningBy(boolean, toSet())
    System.out.println(map9);
    
    System.out.println(" - - - - - - ");
    ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map10 = ohMy.collect(Collectors.groupingBy(                                             // groupingBy((int, counting)
      String::length, Collectors.counting()));
    System.out.println(map10);
    
  }
}
