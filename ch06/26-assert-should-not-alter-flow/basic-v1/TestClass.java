public class TestClass {
 
  public static void main(String[] args) {
    int x = 10;
    assert ++x > 10;  // Not a good design!
    System.out.println(x);   // Without assertions x =10
                             // With assertions    x =11
  }
}


