public class TestClass {
  public static void main(String[] args) {
    int n = 0;
    assert n < 0: "OhNo";
    assert(n < 0): "OhNo";
    
    //test code
    assert n < 0: ("OhNo");
  }

}