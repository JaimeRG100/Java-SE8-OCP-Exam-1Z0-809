import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

  public static void main(String[] args) {
    // example 1
    Supplier<LocalDate> s1 = LocalDate::now;
    Supplier<LocalDate> s2 = () -> LocalDate.now();
    
    LocalDate d1 =  s1.get();
    LocalDate d2 =  s2.get();
    
    System.out.println(d1);
    System.out.println(d2);
    
    // example 2
    Supplier<StringBuilder> sb1 = StringBuilder::new;
    Supplier<StringBuilder> sb2 = () -> new StringBuilder();
    
    System.out.println(sb1.get());
    System.out.println(sb1.get());
    
    // example 3
    Supplier<ArrayList<String>> sal1 = ArrayList<String>::new;
    ArrayList<String> a1 = sal1.get();
    System.out.println(a1);
    
    // example 4
    System.out.println(s1);
    
    // test code
    System.out.println("- - - - -");
    Supplier<StringBuilder> sb3 = () -> new StringBuilder("hello");
    System.out.println(sb3.get());
    
  }
}
