class StaticNC {
  static int count = 0;
  int c = 10;
                                               // can be final
  public final static class Add                // can be public, protected, privated or default
    extends Animal                             // cand extends classes or implements interfaces
    implements Runnable {                      
    public void addOne() {                     
      //c++;                                   // can NOT access instance members (not directly)
      StaticNC s = new StaticNC();
      s.c++;                                   // <- indirectly instanciating it
      count++;
      //System.out.println(xyz);               // can NOT access local variables
    } 
    public static int currentCount(){          // can have  static methods
      return count;
    }
  }
  
  public void callInnerSM() {
    int xyz = 123;
    new Add().addOne();    
  }
  
  public static void main(String[] args) {
    new StaticNC().callInnerSM();
    new StaticNC().callInnerSM();
    StaticNC snc = new StaticNC();
    snc.callInnerSM();
    snc.callInnerSM();
    snc.callInnerSM();
    System.out.println("- - - -");
    StaticNC.Add snca = new StaticNC.Add();
    snca.addOne();
    snca.addOne();
    snca.addOne();
    snca.addOne();
    snca.addOne();
    //snca.callInnerSM();  // error as expected
    
  }
  
}
class Animal {}
interface Runnable {}
