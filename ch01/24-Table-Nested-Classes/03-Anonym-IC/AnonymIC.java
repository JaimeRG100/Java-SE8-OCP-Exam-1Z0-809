class AnonymIC {
  
  abstract class Discount {
    double d = 0.20;
    abstract double getDiscount(double price);
  }
  
  public double applyDiscount(double price) {
    int localVar = 32;
    return new Discount() {                            // None Acces Modifier
      double getDiscount(double prince) {              // Can extend class or implement interface (only one)
        System.out.println("<" + localVar + ">");      // Can access local variables
        return price - (price * d);                    // Can access instance member
      }                                                // Can NOT be abstract
    }.getDiscount(price);                              // Can NOT be final
  }                                                    // Can NOT declare static methods
  
  
  public static void main(String args[]) {
    AnonymIC aic = new AnonymIC();
    System.out.println(aic.applyDiscount(128.23));
  }  
}

interface Runnable {
  void run();
}
