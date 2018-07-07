package cat;

import cat.*;

public class CatAdmirer{
  
  public static void main(String[] args) {
    BigCat cat = new BigCat();
    System.out.println(cat.name);      // Ok -
    System.out.println(cat.hasFur);    // Ok -
    System.out.println(cat.hasPaws);   // Ok -
    //System.out.println(cat.id);      // No X
  }
  
    
}