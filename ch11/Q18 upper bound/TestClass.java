import java.util.Set;
import java.util.TreeSet;

public class TestClass {
  
  public static void main(String args[]) {
    Set<? extends RuntimeException> set = null;
    set = new TreeSet<RuntimeException>();
    set = new TreeSet<NullPointerException>();    

    // C. new TreeSet<RuntimeException>();
    // D. new TreeSet<NullPointerException>();
  }
}