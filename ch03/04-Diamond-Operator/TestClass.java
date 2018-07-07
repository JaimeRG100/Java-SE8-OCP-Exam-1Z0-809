import java.util.*;

public class TestClass {
  public static void main (String args[]) {
    
    // Legacy code (before Java 5)
    List namesJ4 = new ArrayList();
    // namesOld.add(new String("ok"));    // Warning:  unchecked call to add(E) as a member of the raw type 
    
    
    // Generics (Java 5)
    List<String> namesJ5 = new ArrayList<String>();
    
    // Generics (Java 7)
    List<String> namesJ7 = new ArrayList<>();
    
    
    // the diamond operator becomes moe helpful in complex code
    HashMap<String, HashMap<String, String>> mapBefore =
      new HashMap<String, HashMap<String, String>>();
    HashMap<String, HashMap<String, String>> mapAfter = new HashMap<>();    
    
  }
}