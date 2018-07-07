import java.util.Properties;

public class TestClass {
  
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("1k", "one");
    props.put("2k", "two");
    props.put("3k", "three");
    
    props.keySet().stream().map(k -> props.get(k)).forEach(System.out::println);
  }
}