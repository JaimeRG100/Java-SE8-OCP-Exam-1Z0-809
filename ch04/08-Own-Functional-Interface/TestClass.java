
interface TriFunction<T, U, V, R> {
  R apply(T t, U u, V v);
}

interface QuadFunction<T, U, V, W, R> {
  R apply(T t, U u, V v, W w);
}


public class TestClass {

  public static void main(String[] args) {
    // test Code
    TriFunction<Integer, Double, Long, Double> tf = (a, b, c) -> a + b + c;
    System.out.println(tf.apply(12, 11.3, 24L));
    
    QuadFunction<String, String, String, String, String> qf = (a, b, c, d) -> a + b + c + d;
    System.out.println(qf.apply("hello ", "world ", "of ", "Java."));
    
  }
}
