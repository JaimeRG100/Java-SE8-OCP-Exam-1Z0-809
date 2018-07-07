public class LegacyDuck implements java.lang.Comparable {
  private String name;
  
  public int compareTo(Object obj) {
    LegacyDuck d = (LegacyDuck)obj;   // cast because no generics
    return name.compareTo(d.name);
  }
  
  public LegacyDuck(String name) {
    this.name = name;
  }

  // test code
  public static void main(String[] args) {
    LegacyDuck oldDuck = new LegacyDuck("Quack");
    LegacyDuck otherDuck = new LegacyDuck("Puddles");
    System.out.println(oldDuck.compareTo(oldDuck));
    System.out.println(oldDuck.compareTo(otherDuck));
    // System.out.println(oldDuck.compareTo(new String("hello")));  // makes ClassCastException because the code doesnt use Generics 
                                                                    // and also because the compareTo doesnt check if the parameter is an instanceof LegacyDuck
    
    
        
  }
}