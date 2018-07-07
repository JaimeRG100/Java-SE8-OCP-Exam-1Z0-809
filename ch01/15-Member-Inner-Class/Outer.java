public class Outer {
  
  public String greeting = "Hi";
  
  protected class Inner {
    public int repeat = 3;
    public void go() {
      for (int i = 0; i < repeat; i++) 
        System.out.println(greeting);
    }
  }
    
    public void callInner() {
      Inner inner = new Inner();
      inner.go();
    }
    
    public static void main(String[] args) {
      Outer outer = new Outer();
      outer.callInner();
      System.out.println("- - - - - -");
      
      Outer outer2 = new Outer();
      Inner inner = outer2.new Inner();
      inner.go();
      System.out.println("- - - - - -");
      
      new Outer().new Inner().go();
      System.out.println("- - - - - -");
      
      Inner in3 = new Outer().new Inner();
    }
  
}