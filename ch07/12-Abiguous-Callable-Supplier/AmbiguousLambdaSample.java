import java.util.function.Supplier;
import java.util.concurrent.Callable;
import java.io.IOException;

public class AmbiguousLambdaSample {
  
  public static void useCallable(Callable<Integer> expression) {}
  public static void useSupplier(Supplier<Integer> expression) {}
  
  public static void use(Supplier<Integer> expression) {}
  public static void use(Callable<Integer> expression) {}
  
  public static void main(String[] args) throws Exception {
    useCallable(() -> {throw new IOException(); } );
  //useSupplier(() -> {throw new IOException(); } );  // Does not compile  // A Supplier can't throw an Exception
  //use(() -> {throw new IOException();} );           // Does not compile  // ambiguous (both overloaded methods returns an Object)
    
    // Resolving ambiguity with explicit cast
    use( (Callable<Integer>) () -> {throw new IOException("");} );    
  }
}