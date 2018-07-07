import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    // terminal operations ------------------------------------------------
    
    // count
    Stream<String> stream = Stream.of("monkey", "lion", "bear");
    System.out.println(stream.count());
    
    // max
    System.out.println(" - - - - - - ");
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    stream.max((s1, s2) -> s1.length() - s2.length())
     .ifPresent(System.out::println);
    
    // min
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    Optional<String> opt = stream.min((s1, s2) -> s1.length() - s2.length());
    opt.ifPresent(System.out::println);
    
    // findFirst()
    System.out.println(" - - - - - - ");
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    opt = stream.findFirst();
    opt.ifPresent(System.out::println);
    
    // findAny()
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    opt = stream.findAny();
    opt.ifPresent(System.out::println);
    
    // allmatch()
    System.out.println(" - - - - - - ");
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    System.out.println(stream.allMatch(x -> x.length() >4));
    
    // anyMatch()
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    System.out.println(stream.anyMatch(x -> x.length() > 4));
    
    // noneMatch()
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    System.out.println(stream.noneMatch(x -> x.length() > 4 ));
    
    //forEach()
    System.out.println(" - - - - - - ");
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    //stream.forEach(System.out::println);
    stream.forEach(x -> System.out.println("--> " + x));
    
    // reduce
    System.out.println(" - - - - - - ");
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    String word = stream.reduce("starting v1:",(s,c) -> s + c);
    System.out.println(word);
    
    stream = Stream.of("monkey", "lion", "bear", "zebra", "elephant");
    word = stream.reduce("starting v2:", String::concat);
    System.out.println(word);
    
    Stream<Integer> stream2 = Stream.of(3, 5,6);
    int result = stream2.reduce(1, (a, b) -> a * b);
    System.out.println(result);
    
    System.out.println(" - - - - - - ");
    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> oneElem = Stream.of(5);
    Stream<Integer> threeEl = Stream.of(3, 5, 6);
    oneElem.reduce(op).ifPresent(System.out::println);
    threeEl.reduce(op).ifPresent(System.out::println);
    op = (a, b) -> a * b;
    stream2 = Stream.of(3, 5, 6);
    stream2.reduce(1, op, op);
    
    // collect
    System.out.println(" - - - - - - ");
    stream = Stream.of("w", "o", "l", "f");
    StringBuilder word2 = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(word2);
    
    stream = Stream.of("d", "c", "b", "a");
    TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    System.out.println(set);
    
    stream = Stream.of("d", "c", "b", "a");
    set = stream.collect(Collectors.toCollection(TreeSet::new));
    System.out.println(set);
    
    
    // intermediate operations ------------------------------------------------
    
    // filter
    System.out.println(" - - - - - - ");
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    s.filter(x -> x.startsWith("m")).forEach(System.out::println);
    
    
    // distinct
    System.out.println(" - - - - - - ");
    s = Stream.of("duck", "duck", "duck", "goose");
    s.distinct().forEach(System.out::println);
    
    //map
    System.out.println(" - - - - - - ");
    s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(String::length).forEach(System.out::println);
    
    // limit
    // skip
    System.out.println(" - - - - - - ");
    stream2 = Stream.iterate(1, n -> n + 1);
    stream2.skip(5).limit(2).forEach(System.out::println);
    
    // flatMap
    System.out.println(" - - - - - - ");
    List<String> zero = Arrays.asList();
    List<String> one= Arrays.asList("Bonobo");
    List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
    Stream<List<String>> animals = Stream.of(zero, one, two);
    animals.flatMap(l -> l.stream()).forEach(System.out::println);
    
    // sorted
    System.out.println(" - - - - - - ");
    s = Stream.of("zebra", "bear");
    s.sorted().forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    s = Stream.of("zebra", "eagle");
    s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    System.out.println(" - - - - - - ");
    s = Stream.of("brown bear", "grizzly");
    s.sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
    
    // peek
    System.out.println(" - - - - - - ");
    stream = Stream.of("black bear", "brown bear", "grizzly");
    stream.peek(System.out::println)
      .limit(2)
      .skip(1)
      .forEach(System.out::println);
    
    
    // putting all together
    System.out.println(" - - - - - - ");
    List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    list.stream().filter(n -> n.length() == 4)
      .sorted()
      .limit(2)
    .forEach(System.out::println);    
  }
}
