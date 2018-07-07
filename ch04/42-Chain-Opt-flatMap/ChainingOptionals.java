import java.util.Optional;

public class ChainingOptionals {

  public static void main(String[] args) {
    
    // get an Optional<Integer> representing thhe length of the String contained in another Optional
    
    // case 1.- Non empty Optional<String> ------------------------
    {
      Optional<String> optional = Optional.of("hello");
      Optional<Integer> result = optional.map(String::length);
      System.out.println(result);             // Optional[5] 
      result.ifPresent(System.out::println);  // 5
      System.out.println(result.orElse(-1));
      System.out.println(result.orElseGet(() -> new Integer(-2)));
    }
    
    // case 2.- Empty Optional<String> ----------------------------
    {
      System.out.println("- - - - -");
      Optional<String> optional = Optional.empty();
      Optional<Integer> result = optional.map(String::length);
      System.out.println(result);                      // Optional.empty 
      result.ifPresent(System.out::println);
      System.out.println(result.orElse(-1));           // -1
      System.out.println(result.orElseGet(() -> -2));  // -2
    }
    
    // case 3.- Using a helper method  ----------------------------
    System.out.println("- - - - -");
    Optional<String> optional = Optional.of("hello");
    //Optional<Integer> result = optional.map(ChainingOptionals::calculator);  // Does not compile (map methods adds another Optional layer)
                                                                               // giving us <Optional
    
    // case 4.- the solution to case 3, is to call flatMap() instead
    System.out.println("- - - - -");
    Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
    result.ifPresent(System.out::println);
        
    /// test code -------------------------------------------------
    System.out.println("- - - - -");
    //Optional<Integer> result1 = optional.map((x) -> calculator(x));   // Does not compile  (because calculator returns an Optional, not an Integer)
    Optional<Integer> result2 = optional.map((x) -> calc(x));    
    result2.ifPresent(System.out::println);
 }
  
  // helper method with the signature Optional<Integer> calculartor(String s)
  public static Optional<Integer> calculator(String s) {
    Optional<String> opt = Optional.of(s);
    return opt.map(String::length);
  }
  
  public static Integer calc(String s) {
    return s.length();
  }
}
