import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    
    // Unbounded wildcard
    List<?> unbounded = new ArrayList<String>();
    
    // Wildcard with Upper bound
    List<? extends Exception> upper = new ArrayList<RuntimeException>();
    
    // Wildcard with Lower bound
    List<? super Exception> lower = new ArrayList<Object>();
  }
}