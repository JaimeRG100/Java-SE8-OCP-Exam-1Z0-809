import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    Map m = new HashMap();
    m.put(123, "456");
    m.put("abc", "def");
    System.out.println(m.contains("123")); // should be containsKey() or containsValue()
  }
}