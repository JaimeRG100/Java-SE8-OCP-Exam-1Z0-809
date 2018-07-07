package cat.species;

import cat.*;

public class Lynx extends BigCat {
  
  public static void main(String[] args) {
    BigCat cat = new BigCat();
    System.out.println(cat.name);       // Ok -
    //System.out.println(cat.hasFur);   // No X
    //System.out.println(cat.hasPaws);  // No X
    //System.out.println(cat.id);       // No X
    
    //test code
    System.out.println("- - - - - -");
    Lynx cat2 = new Lynx();
    System.out.println(cat2.name);      // Ok -
    System.out.println(cat2.hasFur);    // Ok -
    //System.out.println(cat2.hasPaws); // No X
    //System.out.println(cat2.id);      // No X
  }
  
  //test code
  public void testVar() {
    System.out.println(name);           // Ok -
    System.out.println(hasFur);         // Ok -
    //System.out.println(hasPaws);      // No X
    //System.out.println(id);           // No X
    
  }
  
    
}