public class TestOverLR {
  public static void main(String[] args) {
    BobcatKitten bc = new BobcatKitten();
    bc.findDen();
    bc.findDen(true);
    try{
      bc.findden();
    } catch (Exception e) {
      System.out.println("Exception catched()");
    }
    
    // test variable object reference / object type
    System.out.println("- - - - - - - ");
    Bobcat bobc = new BobcatKitten();
    bobc.findDen();
    ((Bobcat)bobc).findDen();
    ((BobcatKitten)bobc).findDen(true);
  }
}


class Bobcat {
  public void findDen() { System.out.println("Parent findDen() method"); }
}


class BobcatKitten extends Bobcat {
  public void findDen() {System.out.println("Subclass findDen() method");}                      // Overriding
  public void findDen(boolean b) { System.out.println("Overloaded findDen(boolean) method");}   // Overloading
  public void findden() throws Exception { System.out.println("Unrelated method"); }            // Unrelated method
}

