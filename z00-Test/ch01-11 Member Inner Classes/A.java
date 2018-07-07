public class A {
  int x = 1;
  
  public class B {
    int x = 2;
    
    public class C {
      int x = 3;
        
      public void allTheX() {
        System.out.println(A.this.x);
        System.out.println(B.this.x);
        System.out.println(this.x);  // C.this.x
      }
    }
  }
  
  public static void main(String[] args) {
    A.B.C c1 = null;
    B     b1 = null;
    B.C   c2 = null;
    
    A a = new A();
    A.B b = a.new B();
    A.B.C c = b.new C();
    c.allTheX();
  }
}