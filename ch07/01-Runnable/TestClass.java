public class TestClass {
  public static void main(String[] args) {
    // valid lambda expressions
    Runnable r1 = () -> System.out.println("Hello World");
    Runnable r2 = () -> { int i=10; i++; };
    Runnable r3 = () -> { return; };
    Runnable r4 = () -> {};
    
    // invalid Runnable expressions
    //Runnable r5 = () -> "";                       // incompatible: bad return type (String)
    //Runnable r6 = () -> 5;                        // incompatible: bad return type (int)
    //Runnable r7 = () -> { return new Object(); }; // incompatible: bad return type (Object)
  }
}