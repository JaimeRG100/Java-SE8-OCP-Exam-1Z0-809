class MemberInnerC {
  private int x = 2;
  private int y = x +3;
  private class Calculate                           // can be public private protected default
    extends Animal implements Runnable {            // can extends class or implements interface
    public void sumXY() {
      System.out.println(x);  // wow
      int x = MemberInnerC.this.x;                  // can access instance members
      int y = MemberInnerC.this.y;
      System.out.println(x + y);
      //System.out.println(z);                      // can NOT access local variables
    }
    //public static void sum(){}                    // Can NOT declare static methods
    public void running(){}
  }
  public abstract class Horse{                     // can be abstract
    abstract void run();
  }
  
  void callInner() {
    //static void callInner() {
    //new MemberInnerC().new Calculate().sumXY();    
    int z = 13;
    new Calculate().sumXY();
  }
  
  public static void main(String[] args) {
    new MemberInnerC().callInner();
  }
  
}


class Animal {
  String name = "None";
  void printName() {
    System.out.println(name);
  }
}

interface Runnable {
  void running();

}