import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    
    addSound(strings);
    addSound(objects);
    
  }
  
  
  public static void addSound(List<? super String> list){ }
  
}