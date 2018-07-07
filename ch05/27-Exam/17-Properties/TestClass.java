import java.util.Properties;

public class TestClass {
  
  private static void print(Properties props) {
    //System.out.println(props.get("veggies", "none") + " " + props.get("omni", "none"));  // Does not compile
    
    //Should be using getProperty() method
    System.out.println(props.getProperty("veggies", "none") + " " + props.getProperty("omni", "none"));  // Does not compile
  }
  
  public static void main(String[] args) {
    Properties prop = new Properties();
    prop.put("veggies", "brontosaurus");
    prop.put("meat", "velociraptor");
    print(prop);
  }
}