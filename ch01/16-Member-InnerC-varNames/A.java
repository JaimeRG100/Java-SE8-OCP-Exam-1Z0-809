public class A {
  private int x = 10;
  class B {
    private int x = 20;
    class C {
      private int x = 30;
      public void allTheX() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(A.this.x);
        System.out.println(B.this.x);
        System.out.println(C.this.x);
      }
    }
  }
  
  public static void main(String[] args) {
    A a = new A();
    A.B b = a.new B();
    // B b = a.new B();    // <- VALID
    A.B.C c = b.new C();
    // B.C c = b.new C();  // <- VALID
    c.allTheX();
    System.out.println("- - - - - -");
    
    new A().new B().new C().allTheX();
  }
}