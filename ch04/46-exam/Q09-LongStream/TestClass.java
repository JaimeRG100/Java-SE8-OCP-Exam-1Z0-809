import java.util.stream.LongStream;
import java.util.Optional;
import java.util.OptionalLong;

public class TestClass {
  
  
  public static void main(String[] args) {
    LongStream ls = LongStream.of(1, 2, 3);
    OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
    if(opt.isPresent()) System.out.println(opt.getAsLong());
    ls = LongStream.of(1, 2, 3);
    opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
    opt.ifPresent(System.out::println);
  }
}
