import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    //HashSet<Number> hs = new HashSet<Integer>();                // incompatible <Number> ~ <Integer>
    HashSet<? super ClassCastException> set = new HashSet<Exception>();
    List<String> list = new Vector<String>();
    //List<Object> values = new HashSet<Object>();                // incompatible List<> ~ HashSet<>
    //List<Objects> objects = new ArrayList<? extends Object>();  // unexpected type
    Map<String, ? extends Number> hm = new HashMap<String, Integer>();
  }
}