public class TestEnum {
  public static void main(String[] args) {
    OnlyOne firstCall = OnlyOne.ONCE;
    
  }
}

enum OnlyOne {
  ONCE(true), TWICE(true), TRIPLE(false), FOURTH("hello");
  private OnlyOne(boolean b) {
    System.out.println("constructing ... " + this.name() + " ... " + b );
  }
  
  private OnlyOne(String str) {
    System.out.println("string Constructor ... " + this.name() + " ... " + str );
  }
  
  // this constructor aren't called
  private OnlyOne(int i) {
    System.out.println("string Constructor ... " + this.name() + " ... " + i );
  }
}