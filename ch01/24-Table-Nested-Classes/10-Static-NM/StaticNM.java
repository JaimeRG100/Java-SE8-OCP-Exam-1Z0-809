class StaticNM {
  int member = 5;
  public abstract static class ClassX     // access modifier        abstract 
    extends Abs implements Runnable {     // extends
  }
  
  public static final class ClassXXX            // final        static
    extends ClassX {
    void method() {
      int local = 10;
      //System.out.println(member);                // NOT instance member
      System.out.println(new StaticNM().member);   
      System.out.println(local);                   // local variable
    }
    public void run() {}
  }
  
  public static void main(String[] args) {
    StaticNM.ClassXXX snmc = new StaticNM.ClassXXX();
    snmc.method();
    
  }
}

abstract class Abs {
    abstract void method();
}

abstract interface Runnable {
 void run(); 
}



/*
[o] access modifier
[o] abstract
[o] final
[o] extends
[X] instance member
[X] local variables
[o] static methods
 */