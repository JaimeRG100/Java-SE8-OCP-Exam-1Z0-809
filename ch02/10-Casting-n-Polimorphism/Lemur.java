public class Lemur extends Primate implements HasTail {
  public int age = 10;
  
  public boolean isTailStriped() {
    return false;
  }
  
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);
    
    HasTail hasTail = lemur;
    System.out.println(hasTail.isTailStriped());
    
    Primate primate = lemur;
    System.out.println(primate.hasHair());
    
    // test code
    
    System.out.println("- - - - ");
    System.out.println(lemur.age);
    System.out.println(lemur.isTailStriped());
    System.out.println(lemur.hasHair());
    //System.out.println(hasTail.age);              // Not valid, as expected
    //System.out.println(primate.isTailStriped());  // Not valid, as expected
    
    // Casting Object Reference
    
    System.out.println("- - - - ");
    Lemur lemur2 = new Lemur();
    Primate primate2 = lemur2;
    //Lemur lemur3 = primate2;    // Error: Primate cannot be converted to Lemur  (Child = Parent X)
    Lemur lemur3 = (Lemur) primate2;
    System.out.println(lemur3.age);
    
    // more test code
    Primate prim = new Lemur();            // Parent p = new Child();
    Lemur lem1 = (Lemur) prim;             // Child c = (Child) p;
    //Lemur lem2 = (Lemur) new String();   // Child d = (Child) new UnrelatedObject();
    //Lemur lem3 = (Runnable) new Lemur(); // Child e = (UnrelatedInterface) new Child();
    
  } 
}


/*public*/ class Primate {
  public boolean hasHair() {
    return true;
  }
}

/*public*/ interface HasTail {
  public boolean isTailStriped();
}