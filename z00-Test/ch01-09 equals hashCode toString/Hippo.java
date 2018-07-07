public class Hippo {
  private String name;
  private double weight;
  public Hippo(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }
  
  @Override
  public String toString() {
    return "name: " + name + ", weight: " + weight;
  }
  
  @Override
  public boolean equals(Object obj) {
    return obj instanceof Hippo ? this.name.equals(((Hippo)obj).name): false;
  }
  
  @Override
  public int hashCode() {
    return name.hashCode();
  }

  
  public static void main(String[] args) {
    Hippo h1 = new Hippo("Harry", 3100);
    System.out.println(h1); // Harry
    Hippo h2 = new Hippo("Jay", 230.2);
    System.out.println(h2);
    
    Hippo h3 = new Hippo("Harry", 3100);
    
    System.out.println(h1.equals(h2));
    System.out.println(h1.equals(h3));
    
    System.out.println(h1.hashCode());
    System.out.println(h2.hashCode());
  } 
}