import java.util.*;
public class Box<T> {
  
  public static<T> void ship(T t) {
    System.out.println("ship()");
  }
  
  public static void main(String[] args) {
    
    Box.<String>ship("package");
    Box.<String[]>ship(args);
    
    // test code
    List<String> list = new ArrayList<>();
    list.<String>add("one");
    list.<String>add("two");
    list.<String>add("three");
  }
}