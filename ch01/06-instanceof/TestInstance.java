public class TestInstance {
  public static void main(String[] args) {
    HeavyAnimal hippo = new Hippo();
    boolean b1 = hippo instanceof Hippo;        // true
    boolean b2 = hippo instanceof HeavyAnimal;  // true
    boolean b3 = hippo instanceof Elephant;     // false
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println("- - - - - ");
    
    HeavyAnimal hippo2 = new Hippo();
    boolean b4 = hippo2 instanceof Object;     // true
    Hippo nullHippo = null;
    boolean b5 = nullHippo instanceof Object;  // false
    System.out.println(b4);
    System.out.println(b5);
    System.out.println("- - - - - ");
    
    Hippo anotherHippo = new Hippo();
    //boolean b6 = anotherHippo instanceof Elephant;  // DOES NOT COMPILE
    // Error: incompatible types: Hippo cannot be converted to Elephant
    
    HeavyAnimal hippo3 = new Hippo();
    boolean b7 = hippo3 instanceof Mother;      
    System.out.println(b7);
    
    //test code 
    MotherHippo hippo4 = new MotherHippo();
    boolean b8 = hippo4 instanceof MotherHippo;
    System.out.println(b8);
  }
}

class HeavyAnimal {}
class Hippo extends HeavyAnimal {}
class Elephant extends HeavyAnimal {}

interface Mother {}

class MotherHippo extends Hippo implements Mother { }