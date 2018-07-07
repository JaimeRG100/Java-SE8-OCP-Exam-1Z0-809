import java.util.stream.Stream;

public class TestClass {
  
  public static void main(String[] args) {
    Stream<String> stream = Stream.iterate("", (s) -> s + "1");
    System.out.println(stream.limit(2).map(x -> x + "2"));         // java.util.stream.ReferencePipeline$3@d9d202 
    
    stream = Stream.iterate("", (s) -> s + "1");
    stream.limit(2).map(x -> x + "2").forEach(System.out::print);   // 212
  }
}
