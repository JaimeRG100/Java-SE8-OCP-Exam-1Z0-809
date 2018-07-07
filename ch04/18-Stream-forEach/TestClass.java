import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class TestClass {

  public static void main(String[] args) {
    //void forEach(Consumer<? super T> action)
    Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
    s.forEach(System.out::println);
    
    Stream str = Stream.of(1);   // You can't use a traditional for loop on a  stream
    //for(Integer i: s) {}       // Does not compile
    
    // test code 1
    int c = 0;
    //s.forEach(System.out::println); // IllegalStateException: stream has already been operated upon or closed
    s = Stream.of("Monkey", "Gorilla", "Bonono");
    s.forEach((v) -> {/* c+=1; */ System.out.println(v + ": " +c);});
    
    s = Stream.generate(() -> "monkey");
    //s.forEach(System.out::println);  // infinite loop
    
    
    // test code 2
    System.out.println("\n - - - - -");
    final List<Integer> i = new ArrayList<>();
    i.add(1);
    s = Stream.iterate("", x -> { i.set(0, i.get(0) * 5); return "monkey " + i.get(0) + ", "; });
    s.limit(5).forEach(System.out::print);
    
  }
  
}
