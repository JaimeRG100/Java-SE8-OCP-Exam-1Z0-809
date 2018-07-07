public class Crate<T> {
  
  public static <T> Crate<T> ship(T t) {
    System.out.println("Preparing " + t);
    return new Crate<T>();
  }
  
  public static <T> void sink(T t){ }
  
  public static <T> T identity (T t) { return t; }
  
  // public static T noGood(T t) { return t; }   // Does not compile
  
  
  // test code
  public static void main(String[] args) {
    String s = "Java 8 OCP";
    sink(s);
    String str = identity(s);
    System.out.println(str);

  }
  
}
