public class TestClass {

  public static void main(String[] args) {
    //This try statement is legal, but it is a bad idea
    try {
      // do some work
      throw new RuntimeException();
    } catch (RuntimeException e) {
      e = new RuntimeException("new RuntimeException thrown");
      System.out.println(e.getMessage());
      throw e;
    }
  }
}