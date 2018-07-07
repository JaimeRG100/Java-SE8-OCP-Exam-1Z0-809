import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class TestClass {

  public static void main(String[] args) {
    List<String> zero = Arrays.asList();
    List<String> one = Arrays.asList("Bonobo");
    List<String> two = Arrays.asList("Mama Goilla", "Baby Gorilla");
    Stream<List<String>> animals = Stream.of(zero, one, two);
    
    animals.flatMap(l -> l.stream()).forEach(System.out::println);
  }
}
