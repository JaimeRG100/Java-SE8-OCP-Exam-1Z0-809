import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    List<String> list = Arrays.asList("1", "2", "3");
    Iterator iter = list.iterator();
    while(iter.hasNext())
      System.out.println(iter.next());
  }
}