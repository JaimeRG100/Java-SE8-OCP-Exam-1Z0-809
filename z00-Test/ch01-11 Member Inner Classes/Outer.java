public class Outer {
  int o = 1;
  
  private class Inner {
    private int i = 2;
    
    public int multiply() {
      return o * i;
    }
  }
  
  public int callIner() {
    return new Inner().multiply();
  }
  
  public static void main(String[] args) {
    Outer outer = new Outer();
    System.out.println(outer.callIner());
    
    
    Inner inner1 = new Outer().new Inner();
    Inner inner2 = outer.new Inner();
    Outer.Inner inner3 = outer.new Inner();
    
    outer.o = 5;
    System.out.println(inner3.multiply());
    
    inner3.i = 6;
    System.out.println(inner3.multiply());
    
    
    Inner inner4 = outer.new Inner();
    Inner inner5 = new Outer().new Inner();
    Outer.Inner inner6 = outer.new Inner();
  }
  
}