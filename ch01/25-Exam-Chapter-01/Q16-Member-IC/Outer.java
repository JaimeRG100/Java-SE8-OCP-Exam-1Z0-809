public class Outer {
  class Inner { }
  static class StaticClass { }
  
  public static void main(String[] args) {
    //INSERT CODE HERE
    Outer.Inner in = new Outer().new Inner();
    
    //test code
    Outer.StaticClass inStatic = new Outer.StaticClass();
  }
}