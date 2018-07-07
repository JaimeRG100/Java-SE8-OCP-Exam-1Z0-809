import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {    
    Set<String> s = new HashSet<>();
    s.add("lion");
    s.add("tiger");
    s.add("bear");
    s.forEach(System.out::println);
  }
}