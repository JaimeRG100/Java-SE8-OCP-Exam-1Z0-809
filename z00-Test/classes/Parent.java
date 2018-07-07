class Parent {
  static void hello() {
    System.out.println("Parent");
  }
  
  public static void main(String[] args) {
    Parent.hello();
    Child.hello();
  }
}

class Child extends Parent {
  static void hello() {
    System.out.println("child");
  }
}