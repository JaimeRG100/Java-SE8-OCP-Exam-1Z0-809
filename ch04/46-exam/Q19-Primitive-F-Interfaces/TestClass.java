import java.util.stream.Stream;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class TestClass {
  public static void main(String[] args) {
    BooleanSupplier bs = () -> true;
    System.out.println(bs.getAsBoolean());
    
    DoubleSupplier ds = () -> 12.3;
    System.out.println(ds.getAsDouble());
    
    IntSupplier is = () -> 10;
    System.out.println(is.getAsInt());
    
  }
}
