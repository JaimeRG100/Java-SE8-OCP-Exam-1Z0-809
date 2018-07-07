public class TestNestStatCls {
  public static void main(String[] str) {
    Enclosing.Nested nested = new Enclosing.Nested();
    //System.out.println(nested.price);  //Error: price has private access 
    nested.buy();
    new Enclosing.Nested().buy();
  }
}