public class Box<T> {
  T value;
  
  public Box(T value) {
    this.value = value;    
  }
  
  public T getBox() {
    return value;
  }
  //public static <T> T hello(T t) {return t; }  // test code
  
  public static void main(String[] args) {
    Box<String> one = new Box<String>("a string");
    Box<Integer> two = new Box<>(123);
    System.out.println(one.getBox());
    System.out.println(two.getBox());
  }
}