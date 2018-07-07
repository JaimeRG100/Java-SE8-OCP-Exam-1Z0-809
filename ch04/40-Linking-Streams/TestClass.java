import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    List<String> cats = new ArrayList<>();
    cats.add("Annie");
    cats.add("Ripley");
    Stream<String> stream = cats.stream();
    cats.add("KC");
    System.out.println(stream.count());
    
    System.out.println("- - - - - ");
    String[] s = new String[3];
    s[0] = "one";
    s[1] = "two";
    stream = Stream.of(s);
    s[2] = "three";
    stream.forEach(System.out::println);    
 }
}
