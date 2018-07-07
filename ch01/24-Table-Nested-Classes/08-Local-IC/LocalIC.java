class LocalIC {
  int member = 10;
  
  public void method() {
    int local = 15;
    //local++;  // this remove the final value                    
    abstract class AbsInnerClass extends Abs implements Runnable{       // abtract        extends  
    }                                                                   // NOT access modifier
    
    final class InnerClass extends AbsInnerClass{                       // final
      void sum() { System.out.println(member); }                        // member
      public void run() { System.out.println(local); }                  // local
      //static void methodSt(){}                                        // NOT static method
    }    
  }
  
  public static void main(String[] args) {
  }
}


abstract class Abs {
  abstract void sum();
}

interface Runnable {
  void run();
}

/*
 [o] abstract 
 [o] extends
 [o] final
 [o] instance member
 [o] local var (final)
 
 [X] access modifier
 [X] static method
 
 
 
 */