public class TestClass {
  
  public static void main(String[] args) {
    new PrintData().run();              // runs linearly wihtout Thread
    new Thread(new PrintData()).run();  // runs linearly wihtout Thread
    new ReadInventoryThread().run();    // runs linearly wihtout Thread
  }
}