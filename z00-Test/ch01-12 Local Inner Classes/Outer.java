public class Outer {
  private int out = 5;
  public void calculate() {
    int in;
    if (out % 2 == 0)
      in = 10;
    else
      in  = 15;
    //java.util.concurrent.atomic.AtomicInteger in = new java.util.concurrent.atomic.AtomicInteger(10);   // VALID
    //in.set(20);  // VALID
    //in = 15;   // NOT VALID
    class Inner {
      public void multiply() {
        System.out.println(out * in);  //in.get()
      }
    };
    Inner inner = new Inner();
    inner.multiply();
  }
  
  public static void main(String[] args) {
    Outer outer = new Outer();
    
    outer.calculate();
  }
}