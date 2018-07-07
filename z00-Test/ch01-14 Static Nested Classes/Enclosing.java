public class Enclosing {
  class Inner{
    void printOk() {}
  }
  public static class Nested {
    private int x = 1;
    public int y = 2;
    public static int s = 5;
    
    public static void printHello() { System.out.println("Hello"); }
    public void printBye()  { System.out.println("Bye"); }
  }
  
  public static void main(String[] args) {
    Nested n1 = new Nested();
    Nested n2 = new Enclosing.Nested();
    Enclosing.Nested n3 = new Nested();
    
    System.out.println(n1.x);
    System.out.println(n2.y);
    System.out.println(n3.s);
    n3.printBye();
    n1.printHello();
    
    Nested.printHello();
    //System.out.println(Nested.x);   // non-static variable
    //System.out.println(Nested.y);   // non-static variable
    System.out.println(Nested.s); 
    //Nested.printBye();              // non-static method
  }
}