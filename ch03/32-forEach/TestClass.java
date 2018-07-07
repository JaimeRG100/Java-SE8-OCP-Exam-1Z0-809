import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
  
  public static void main(String[] args) {
    List<String> cats = Arrays.asList("Annie", "Rippley");
    for(String cat: cats) 
      System.out.println(cat);
    System.out.println("- - - - - ");
    
    cats.forEach(c -> System.out.println(c));
    System.out.println("- - - - - ");
    
    cats.forEach(System.out::println);
    System.out.println("- - - - - ");
    
  }
}