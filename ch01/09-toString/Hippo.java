import java.util.ArrayList;

public class Hippo {
  private String name;
  private double weight;
  
  public Hippo(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }
  
  @Override
  public String toString() {
    //return name;
    return "Name: " + name + ", Weight: " + weight;
  }
  
  public static void main(String[] args) {
    // default toString implementation
    System.out.println(new ArrayList());  // [] 
    System.out.println(new String[0]);    // [Ljava.lang.String;@213d5c87 
    System.out.println("- - - - - - ");
    
    // overriden toString implementation
    Hippo h1 = new Hippo("Harry", 3100);
    System.out.println(h1);
  }
}