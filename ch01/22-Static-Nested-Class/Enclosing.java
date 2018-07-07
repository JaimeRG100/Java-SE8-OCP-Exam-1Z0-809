public class Enclosing {
  static class Nested {
    private int price = 6;
    public void buy() { System.out.println("method buy()");}
  }
  
  public static void main(String[] args) {
    Nested nested = new Nested();
    System.out.println(nested.price);
  }
}