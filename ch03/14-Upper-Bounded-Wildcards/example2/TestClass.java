import java.util.*;

public class TestClass {
  
  static class Sparrow extends Bird {}
  static class Bird { }
   
  public static void main(String[] args) {
    // With Upper Bound or Unbound wildcard, the list become logically Immutable list
    List<? extends Bird> birds = new ArrayList<Bird>();
    //birds.add(new Sparrow());    // Does not compile
    //birds.add(new Bird());       // Does not compile
    
    // test code
    List<Bird> myList = new ArrayList<Bird>();
    myList.add(new Sparrow());
    myList.add(new Bird());
    
    birds = new ArrayList<>(myList);   // new immutable list (with Upper Bound wildcard)
    //birds.add(new Bird());           // Does not compile
  }
 
}