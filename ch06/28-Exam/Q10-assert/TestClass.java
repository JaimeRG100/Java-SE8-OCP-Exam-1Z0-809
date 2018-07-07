public class TestClass {
  private int addPlusOne(int a, int b) {
    //boolean assert = false;  // Does not compile
    assert a++ > 0;
    assert b > 0;  // appropiate use of assertion
    return a + b;
  }

}