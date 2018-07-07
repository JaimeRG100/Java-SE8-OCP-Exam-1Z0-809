public class TestInterface  {
  public static void main(String[] args) {
    
  }
}

interface Interface {
  static final int ten = 10;
  static void hello() {}
}

interface ChildInterface extends Interface {
  static void hello() {}
}