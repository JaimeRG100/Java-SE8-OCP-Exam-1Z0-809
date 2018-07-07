public class LocalInnerC {
  public int count = 123;
  
  public void method() {
    int x = 3;
    int y = 8;
    int z = x + y;                               // Can be final 
    final class Sum                              // Can NOT have Access modifier
      extends Animal implements Runnable {       // Can extend classes or implements interfaces
      public void sumXY() {                     
        System.out.println(x+y);                 // Can access local variables (final)
        System.out.println(count);               // Can access instance members 
        System.out.println(z);
      }
      //public static void method2(){}           // can not declare static methods
      public void run() {}
    }
    new Sum().sumXY();
    
  }
  
  public static void main(String[] args) {
    new LocalInnerC().method();
    
  }
}

class Animal {
  String name = "none";
  public String getName() { return name;} 
}

interface Runnable {
  void run();
}
