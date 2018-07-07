import java.util.List;
import java.util.ArrayList;

public class TestClass {
  
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("one");
    list.add("two");
    list.add(7);
    for(String s: list)       // if we change String with Object, the code runs fine
      System.out.println(s);
  }
}