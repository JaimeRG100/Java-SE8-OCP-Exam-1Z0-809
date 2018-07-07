public class MemberIC{
  
  public int c = 5;
  public abstract class X extends A implements Runnable{   // access, abstract, extends, implements
    abstract void method();
    public void run() {System.out.println("run");}
  }
  public final class Y extends X {                         // final
    void method() { 
      System.out.println("ok" + c);                        // instance Member
      //System.out.println("ok" + d);                      // NOT local Var
    }
    
    //static void staticMethod() {}                        // not static methods
  }
  
  public void testLocalVar() {
    int d = 7;
    Y yClass = new Y();    
  }
  
    
  

}

abstract class A {
  abstract void method();
}
interface Runnable {
  void run();
}

/*
[o] Access modifier
[o] abstract
[o] extend
[o] final
[o] Instance member

[X] local variables
[X] static methods
*/